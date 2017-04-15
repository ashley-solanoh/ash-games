import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nana here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    public int health;
    public int speed;
    public String bulletType;
  
    

    /**
     * Act - do whatever the Nana wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public double lastShotTime = System.currentTimeMillis();
    public double firingRate;//in milliseconds
    
     public void act() 
    {
       move();
       shoot();
    }    
    
     public void move()
    {
       if(Greenfoot.isKeyDown("up"))
       {
         setLocation(getX(),getY()-speed);
       }
       if(Greenfoot.isKeyDown("down"))
       {
         setLocation(getX(),getY()+speed);
       }
       if(Greenfoot.isKeyDown("right"))
       {
         move(speed);
       }
       if(Greenfoot.isKeyDown("left"))
        {
          move(-speed);
        }
    }   
    
     public void shoot()
    {

        if(Greenfoot.isKeyDown("space"))
          {
              double currentShotTime = System.currentTimeMillis();
              double timeElapsed = currentShotTime - this.lastShotTime;
              
            if (timeElapsed >= firingRate)
            {
              getWorld().addObject(Zoompistol(), getX(), getY());
              this.lastShotTime = System.currentTimeMillis();
            }
          }
    }
    
    public void collision()
    {
        Actor enemy;
        enemy = getOneObjectAtOffset(0,0, Enemy.class);
        if (enemy != null)
        {
            health = health -   2;    
        }
    }
    
    public void die() {
        if (health < 0) {
           World world;
           world = getWorld();
           world.removeObject(this);
        }
        
    }
}

    

