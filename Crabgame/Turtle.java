import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Turtle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Turtle extends Animal implements Freezable
{
    /**
     * Act - do whatever the Turtle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int counter;

    public Turtle()
    {
        counter = 400;
    }
    
    public void lookForLobster()
    {
        if ( isTouching(Lobster.class) )
        {
            removeTouching(Lobster.class);   
        }
    }
    
    public void act(){
        lookForLobster();
        counter --;
        if ( counter <= 50 )
        {
            turnAtEdge();
            randomTurn();
            move(1);
            if (counter <= 0) 
            counter = 400;
        }
        else
            counter--;
    }
    
    public void freeze(int count)
    {
        counter = count;
    }
    
        public void turnAtEdge()
    {
        if ( isAtEdge() )
        {
            turn(17);
        }
    }
    
    public void randomTurn()
    {
        if ( Greenfoot.getRandomNumber(100) < 10 )
        {
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
    }
}
