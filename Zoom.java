import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Zoom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zoom extends AbstractHero
{
    public Zoom (){
      super ();
      this.health = 15;
      this.speed = 20;
      this.currentWeapon = new MachineGun();
    }
}
