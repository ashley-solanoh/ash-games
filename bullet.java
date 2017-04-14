import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bullet extends Actor
{
    /**
     * Act - do whatever the bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       move(10);
       boom();
    }    
    public void boom()
    {
        Actor Enemy;
        Enemy = getOneObjectAtOffset(0,0, Enemy.class);
        if (Enemy !=null)
        {
           World world;
           world = getWorld();
           world.removeObject(Enemy);

        }
    }
}
