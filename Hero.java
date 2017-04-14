import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nana here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    
    /**
     * Act - do whatever the Nana wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private double timer=0.25;
    public void act() 
    {
       movement();
       shoot();
    }    
    
    public void movement()
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
    
     public void shoot()
   
    {

          {if(Greenfoot.isKeyDown("space"))
           {
              getWorld().addObject(new bullet(), getX(), getY());
              timer=0.25;
            }
          }
        }

    }

