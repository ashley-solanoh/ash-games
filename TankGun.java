import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TankGun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TankGun extends bullet
{
    public TankGun() {
        speed = 10;
    }
    
    /**
     * Act - do whatever the TankGun wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       move();
       destroy();
    }   
}
