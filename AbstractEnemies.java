import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AbstractEnemies here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AbstractEnemies extends Actor
{
    protected int health;
    protected int speed;
    protected int damage;
    

    
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       move();
    }   
    
    public int getDamage(){
       return this.damage;
    }
    
    private void move()
    {
        move(-speed);
        exitWorld();
    }
    
    private void exitWorld()
    {
       Actor xx;
       xx = getOneObjectAtOffset(0,0, MagicBullet.class);
       if (getX()<=1) {
            getWorld().removeObject(this);
        }   
       if (xx != null)
        {
            health = health -   1;    
        }
    }
    
     public void collide()
    {
        Actor actor;
        actor = getOneObjectAtOffset(0,0, AbstractBullets.class);
        if (actor != null)
        {
            AbstractBullets bullets = (AbstractBullets) actor; 
            this.health = this.health -   bullets.getDamage();    
            die();
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
