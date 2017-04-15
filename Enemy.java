import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Enemies
{
    private int health;
    private int speed;
    
    public Enemy (){
      health = 2;
      speed = 7;
    }
    
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
        move(-speed);
        exitWorld();
    }
    
    private void exitWorld()
    {
        Actor bullet;
        bullet = getOneObjectAtOffset(0,0, bullet.class);
       if (getX()<=1) {
            getWorld().removeObject(this);
        }   
       if (bullet != null)
        {
            health = health -   1;    
        }
    }
}
