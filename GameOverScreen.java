import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOverScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOverScreen extends World
{

    /**
     * Constructor for objects of class GameOverScreen.
     * 
     */
    public GameOverScreen(int score)
    {    
        super(600, 600, 1); 
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        prepare(score);
    }
    
    public void prepare(int score)
    {
        showText("Game over \n Total Score "+score + "\n To restart press space", 300, 300);
    }
    
    public void act()
    {   
      if (Greenfoot.isKeyDown("space")) Greenfoot.setWorld(new level1(2, 0));
    }
}
