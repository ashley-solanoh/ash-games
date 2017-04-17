import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MagicBullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MagicBullet extends AbstractBullets
{
     
    public void act()  {
      move();
      exitWorld();
    }
    
    public MagicBullet() {
      super (10);
    }
}
