import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayerTotalScore here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerTotalScore extends Actor
{
    private int score;
    public PlayerTotalScore(int score) 
    {
        this.score = score;
        refreshScore();
    }
    /**
     * Act - do whatever the PlayerTotalScore wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }  
    
    public void incrementScore(int incrementValue)
    {
        score += incrementValue;
        refreshScore();
    }
    
    public int getScore()
    {
        return score;
    }
    
    public void refreshScore() 
    {
       setImage(new GreenfootImage("Score : "+ score, 18, Color.RED, new Color(0, 0, 0, 0)));
    }
}
