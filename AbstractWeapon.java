import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AbstractWeapon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class AbstractWeapon extends Actor implements Weapon
{ 
   
    private double lastShotTime = System.currentTimeMillis();
    private double firingRate;//in milliseconds
    
    private Ammo ammo;  
    private int ammoSpeed;
    
    public AbstractWeapon(double pFiringRate, Ammo pAmmo, int pSpeed) {
        this.firingRate = pFiringRate;
        this.ammo = pAmmo;
        this.ammoSpeed = pSpeed;

    }
    
    public void shoot(int pX, int pY) {
        
        double currentShotTime = System.currentTimeMillis();
        double timeElapsed = currentShotTime - this.lastShotTime;
          
        if (timeElapsed >= this.firingRate) {
            try {
            String className = ammo.getClass().getSimpleName();
            Actor ammoActor = (Actor) Class.forName(className).getConstructors()[0].newInstance();;
            
            getWorld().addObject(ammoActor, pX, pY);
            this.lastShotTime = System.currentTimeMillis();
            GreenfootSound music = new GreenfootSound("Fireball.wav");
            music.setVolume(90);
            music.play();
            } catch (Exception e) {
            }
            
        }
        getImage().setTransparency(0);
    }
    
}
