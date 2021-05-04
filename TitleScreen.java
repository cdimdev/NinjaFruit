import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
 
/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{

    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        showText("To finish this game you need to avoid bombs \n and gather all cherries available in each level \n gathering a strawberry is not required \n but will give extra points\n By gathering a heart you increase \n your lifes left by 1 \nPress space to start", 300, 300);
        prepare();
    }

    public void act()
    {
        if (Greenfoot.isKeyDown("space")) Greenfoot.setWorld(new level1(2, 0));
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}