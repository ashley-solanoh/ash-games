import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FireBall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FireBall extends AbstractBullets
{
     
    public void act()  {
      move();
      exitWorld();
    }
    
    public FireBall() {
      super (20);
    }
}
