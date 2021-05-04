import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class Weird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Weird extends Actor
{
    private int cherryEaten = 0;
    private int level =1;
    private static final int WALKING_SPEED = 5;
    private int lifes;
    private int currentImage = 0 ;
    private int currentImageShowCounter = 0;
    private List<GreenfootImage> images = Arrays.asList(
        new GreenfootImage("Run__000.png"),
        new GreenfootImage("Run__001.png"),
        new GreenfootImage("Run__002.png"),
        new GreenfootImage("Run__003.png"),
        new GreenfootImage("Run__004.png"),
        new GreenfootImage("Run__005.png"),
        new GreenfootImage("Run__006.png"),
        new GreenfootImage("Run__007.png"),
        new GreenfootImage("Run__008.png"),
        new GreenfootImage("Run__009.png")
    );
    
    public Weird(int lifesOfPlayer, int currentLevel) {
        lifes = lifesOfPlayer;
        level = currentLevel;
    }
    /**
     * Act - do whatever the Weird wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        switchImage();
        checkKeyPress();
        eatCherryOnSight();
        eatStrawberryOnSight();
        showLifesLeft();
        loseOnTouchingBomb();
        takeExtraLife();
        move();
        checkForCompletedLevel();
        while(cantMove()) {
            move(-WALKING_SPEED);
            checkKeyPress();
            switchImage();
            showLifesLeft();
        }
    }    
    
    private void switchImage()
    {
        currentImage = currentImage > (images.size() - 1)  
            ? 0 
            : currentImage;
        setImage(images.get(currentImage));
        currentImageShowCounter++;
        if(currentImageShowCounter == 5) {
            currentImage++; 
            currentImageShowCounter = 0;
        }
    }
    
    private void loseOnTouchingBomb()
    {
        Actor Bomb;
        Bomb = getOneObjectAtOffset(0, 0, Bomb.class);
        if (Bomb != null) {
            Greenfoot.playSound("bomb.wav");
            lifes--;
         if(lifes > 0) {
           this.setLocation(27,585);
         } else {
           Greenfoot.setWorld(new GameOverScreen(getScore()));
         }
       }
    }

    /**
     * Move forward in the current direction.
     */
    public void move()
    {
        move(WALKING_SPEED);
    }

    
    /**
     * Test if we are close to one of the edges of the world. Return true if we are.
     */
    public boolean atWorldEdge()
    {
        if(getX() < 20 || getX() > getWorld().getWidth() - 20)
            return true;
        if(getY() < 20 || getY() > getWorld().getHeight() - 20)
            return true;
        else
            return false;
    }

    
    public void checkKeyPress()
    {
        if(Greenfoot.isKeyDown("left")){
            turn(-6);
        } 
        if(Greenfoot.isKeyDown("right"))
            turn(+6);
    }
    
    public void eatCherryOnSight()
    {
        Actor Cherry;
        Cherry = getOneObjectAtOffset(0, 0, Cherry.class);
        if (Cherry != null)
        {
            Greenfoot.playSound("gather.wav");
            cherryEaten++;
            World world = getWorld(); 
            world.removeObject(Cherry);
            updateTotalScore(10);
        }
    }
    
    public void takeExtraLife()
    {
        Actor ExtraLife;
        ExtraLife = getOneObjectAtOffset(0, 0, ExtraLife.class);
        if (ExtraLife != null)
        {
            Greenfoot.playSound("gather.wav");
            World world = getWorld(); 
            world.removeObject(ExtraLife);
            lifes++;
       }
    }
    
    public void eatStrawberryOnSight()
    {
        Actor straberry= getOneObjectAtOffset(0, 0, Strawberry.class);
        if (straberry != null)
        {
            Greenfoot.playSound("gather.wav");
            World world = getWorld(); 
            world.removeObject(straberry);
            updateTotalScore(40);
        }
    }
    
    public void updateTotalScore(int incrementValue)
    {
       PlayerTotalScore totalScore = getWorld().getObjects(PlayerTotalScore.class).get(0);
       totalScore.incrementScore(incrementValue);
    }
    
    private int getScore()
    {
       PlayerTotalScore totalScore = getWorld().getObjects(PlayerTotalScore.class).get(0);
       return totalScore.getScore();
    }
    
    
    public boolean cantMove()
    {
      return getOneObjectAtOffset(0, 0, Barrel.class) != null;
    }
    
    public void showLifesLeft()
    {
       PlayerLifes playerLifeText = getWorld().getObjects(PlayerLifes.class).get(0);
       playerLifeText.setImageText("Lifes left:"+lifes);
    }
   
    
    public void checkForCompletedLevel()
    {
        List<Cherry> cherries = new ArrayList<Cherry>();
        cherries = getWorld().getObjects(Cherry.class);
        if(level == 1 && cherries.size() == 0) {
          Greenfoot.playSound("level1complete.mp3");
          cherryEaten = 0;
          Greenfoot.setWorld(new level2(lifes, getScore()));
        }
        if(level == 2 && cherries.size() == 0) {
           Greenfoot.playSound("champion.mp3");
           Greenfoot.setWorld(new WinScreen(getScore()));
        }
        
    }
}
