import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bullet extends Actor

{
    public int speed;
    
    /**
     * Act - do whatever the bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       move();
       destroy();
    }  
    
    public void destroy()
    {
        Actor enemy;
        enemy = getOneObjectAtOffset(0,0, Enemy.class);
        if (enemy != null)
        {
           World world;
           world = getWorld();
           world.removeObject(enemy);

        }
    }
    
    public void move()
    {
        move(speed);
    }    
    
   
}
