import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game extends Actor
{
    private int worldEdge = 595;
    /**
     * Act - do whatever the Game wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        start();
    }  
    
    private void start() {
 
        if("s".equals(Greenfoot.getKey())) {
          getWorld().addObject(new Hero(), 100, 250);
          getWorld().addObject(new Enemy(), 600, 200);
        }
    }
    
        public int getWorldEdge()
    {
        return this.worldEdge;
    }    
    
    
}
