import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tank here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tank extends AbstractHero
{
    public Tank (){
      super ();
      this.health = 100;
      this.speed = 3;
      this.currentWeapon = new Shotgun();
    }    

}
