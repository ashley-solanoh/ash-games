import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nana here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    public int health = 10;
    
    /**
     * Act - do whatever the Nana wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private double lastShotTime = System.currentTimeMillis();
    private double firingRate = 250;//in milliseconds
	
    public void act() 
    {
       move();
       shoot();
    }    
    
    private void move()
    {
      if(Greenfoot.isKeyDown("up"))
      {
        setLocation(getX(),getY()-6);
      }
       if(Greenfoot.isKeyDown("down"))
      {
        setLocation(getX(),getY()+6);
      }
       if(Greenfoot.isKeyDown("right"))
      {
        move(7);
      }
       if(Greenfoot.isKeyDown("left"))
      {
        move(-7);
      }
    }   
    
     private void shoot()
    {

          if(Greenfoot.isKeyDown("space"))
          {
              double currentShotTime = System.currentTimeMillis();
              double timeElapsed = currentShotTime - this.lastShotTime;
              
            if (timeElapsed >= firingRate)
            {
              getWorld().addObject(new bullet(), getX(), getY());
              this.lastShotTime = System.currentTimeMillis();
            }
          }
    }
}

    

