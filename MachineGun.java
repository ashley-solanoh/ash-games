import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MachineGun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MachineGun extends AbstractWeapon
{
    
    /**
     * Act - do whatever the MachineGun wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    } 
    //AbstractWeapon(double pFiringRate, Ammo pAmmo, int pSpeed) {
    public MachineGun() {
      super (40, new MagicBullet(), 10);
    }
    
}
