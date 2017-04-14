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
        super(600,600,1); 
        start();
    }
    public void start()
    {
      addObject(new Game(), 100, 250);
    }

}
