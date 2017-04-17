import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AbstractBullets here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AbstractBullets extends Actor implements Ammo
{
    private int speed;
     
    public void act()  {
      move();
      exitWorld();
    }
    
    public AbstractBullets(int pSpeed) {
        speed = pSpeed;
    }
    
    public void move() {
        move(speed);
    }
    
    public void exitWorld()  {
       if (getX() >= 995) {
            getWorld().removeObject(this);
        }
    }
}
