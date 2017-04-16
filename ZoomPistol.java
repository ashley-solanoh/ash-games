import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ZoomPistol here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ZoomPistol extends bullet
{
    public ZoomPistol() {
        speed = 30;
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

