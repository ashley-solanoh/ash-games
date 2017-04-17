import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AbstractHero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class AbstractHero extends Actor
{
    protected int health;
    protected int speed;
    protected Weapon currentWeapon;

    public void act() {
        move();
        shoot();
        collide();
    }
    
        public int getHealth() {
        return this.health;
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
              getWorld().addObject((Actor)this.currentWeapon, 0, 0);
              this.currentWeapon.shoot(getX(),getY());
          }
    }
    
     public void collide()
    {
        Actor actor;
        actor = getOneObjectAtOffset(0,0, AbstractEnemies.class);
        if (actor != null)
        {
            AbstractEnemies enemy = (AbstractEnemies) actor; 
            this.health = this.health -   enemy.getDamage();    
            //getWorld().getObject((Actor));
            getWorld().removeObject(enemy);
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
