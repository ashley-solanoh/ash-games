import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Beachworld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Beachworld extends World
{
  
    /**
     * Constructor for objects of class Beachworld.
     * 
     */
    public Beachworld()
    {    
        super(1000,600,1); 
        start();
    }
    private void start()
    {
      addObject(new Game(), 250, 25);
    }
 }
