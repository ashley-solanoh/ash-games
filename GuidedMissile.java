import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GuidedMissile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GuidedMissile extends AbstractBullets
{
     
    public void act()  {
      move();
      exitWorld();
    }
    
    public GuidedMissile() {
      super (25);
      damage = 2;
    }
}
