import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Worm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Worm extends Animal 
{
    private int count;
    private int any;
    int xpos;
    int ypos;
    
/**
 * Act - do whatever the Worm wants to do. This method is called whenever
* the 'Act' or 'Run' button gets pressed in the environment.
*/
public Worm()
{
    count = Greenfoot.getRandomNumber(300);
}
public void act() 
{
        count --;
        if(count <= 0)
        {
            World w = getWorld();
            xpos = Greenfoot.getRandomNumber(400)+100;
            ypos = Greenfoot.getRandomNumber(400)+100;
                w.addObject(new Worm(), xpos, ypos);
                w.addObject(new Worm(), xpos, ypos);
                w.removeObject(this);
                count += 500;
}
        
}
}
