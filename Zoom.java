import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Zoom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zoom extends Hero
{
    public Zoom (){
      health = 15;
      speed = 20;
      bulletType = ZoomPistol;
      firingRate = 50;
    }
    
    /**
     * Act - do whatever the Zoom wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       move();
       shoot();
    }    
}
