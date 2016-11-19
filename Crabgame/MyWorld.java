import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 500, 1);
        addObject(new Crab(), 300, 300);
        addObject(new Lobster(), 100, 100);
        addObject(new Turtle(), 200, 200);
        prepare();
    }
    
        private void prepare()
    {
        int x,y;
        for (int i = 0 ; i < 5; i++)
        {
            x = Greenfoot.getRandomNumber(500);
            y = Greenfoot.getRandomNumber(500);
            addObject(new Worm(),x,y);
        }
    }
}
