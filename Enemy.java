import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Enemies
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       move();
    }    
    private void move()
    {
        move(-10);
        exitWorld();
    }
    private void exitWorld()
    {
        if (getX()<=1)
        {
            getWorld().removeObject(this);
        }   
    }
}
