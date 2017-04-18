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
    protected GreenfootSound heroSpawn = new GreenfootSound("Hero-ok.wav");
    protected GreenfootSound heroDeath = new GreenfootSound("Hero-death.wav");

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
        actor = getOneObjectAtOffset(10,10, AbstractEnemies.class);
        if (actor != null)
        {
            AbstractEnemies enemy = (AbstractEnemies) actor; 
            this.health = this.health - enemy.getDamage();    
            getWorld().removeObject(enemy);
            die();
        }
    }
    
     public void die() {
        if (health < 0) {
           java.util.List gameList = getWorld().getObjects(Game.class);
           Game game = (Game)gameList.get(0);
           heroDeath.setVolume(100);
           heroDeath.play();
           game.stop();
           getWorld().removeObject(this);
        }
        
    }
}
