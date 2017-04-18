import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AbstractBullets here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AbstractBullets extends Actor implements Ammo
{
    protected int speed;
    protected int damage; 
   
    public void act()  {
      move();
      exitWorld();
    }
    
    public int getDamage(){
       return this.damage;
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
