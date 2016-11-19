import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Crab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Crab extends Animal
{
    private int Speed;
    public int Score;
    private int lobster;
    /**
     * Act - do whatever the Crab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Crab()
    {
        Speed = 100;
        Score = 0;
        lobster = 0;
    }
    public void act() 
    {
        // Add your action code here.
        Move();
        lookForWorm();
        addLobster();
    }
    public void Move()
    {
        
        int xpos = getX();
        int ypos = getY();
        
        if(Greenfoot.isKeyDown("up")){
            turn(-5);
        }
        if(Greenfoot.isKeyDown("down")){
            turn(5);
        }
        if(Greenfoot.isKeyDown("left")){
            move(-2);
        }
        if(Greenfoot.isKeyDown("right")){
            move(2);
        }
    }
    
    public void lookForWorm(){
        if(isTouching(Worm.class)){
            removeTouching(Worm.class);
            Score += 10;
            lobster += 10;
            getWorld().showText("Score : "+Score, 50, 10);
        }
    }

    public void addLobster(){
        int x,y;
        if(lobster % 100 == 0 && lobster > 0){
            x = Greenfoot.getRandomNumber(500);
            y = Greenfoot.getRandomNumber(500);
            getWorld().addObject(new Lobster(), x,y);
            lobster = 0;
        }
    }
}
