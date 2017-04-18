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
    protected boolean active;
    protected int points;

    public AbstractEnemies() {
        this.active = true;
    }
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       move();
       collide();
       exitWorld();
    }   
    
    public int getDamage(){
       return this.damage;
    }
    
    private void move()
    {
        move(-speed);
    
    }
    
    private void exitWorld()
    {
       if ( this.active && getX()<=1) {
                this.active = false;
               getWorld().removeObject(this);
   
        }   
    }
    
     public void collide()
    {
        Actor actor;
        actor = getOneObjectAtOffset(0,0, AbstractBullets.class);
        if (actor != null)
        {
            AbstractBullets bullets = (AbstractBullets) actor; 
            this.health = this.health - bullets.getDamage();    
            die();
            bullets.collision();
        }
    }
    
     public void die() {
        
        java.util.List gameList = getObjects(Game.class);
        Game game = (Game)gameList[1];
        if (this.active &&this.health < 0 ) {
              this.active = false;
              World world;
              world = getWorld();
              world.removeObject(this);
              game.increaseScore(this.points);
        }
        
    }
}
