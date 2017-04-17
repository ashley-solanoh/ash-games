import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game extends Actor
{
    private int worldEdge = 595;
    private AbstractHero currentHero;
    private boolean gameInProgress = false;
    private double lastSpawnTime = System.currentTimeMillis();
    private double spawnRate = 450;//in milliseconds
    
    private Random randomGenerator;
    private Random randomYGenerator;
    
    public void updateScore() {
     if (this.gameInProgress) {
      GreenfootImage img = new GreenfootImage (100, 20);
        //img.drawString ("Life: " ,2,20);
       img.drawString ("Life: " + this.currentHero.getHealth(),2,20);
       setImage(img);
     }
    }
    
    /**
     * Act - do whatever the Game wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        start();
        updateScore();
        spawnEnemies();
       }  
    
    private void start() {
 
        if("s".equals(Greenfoot.getKey())) 
        {
          spawnHero();
          spawnEnemies();
          this.gameInProgress = true;
          this.randomGenerator = new Random();
          this.randomYGenerator = new Random();
        }
    }
    
        public int getWorldEdge()
    {
        return this.worldEdge;
    }    
    
    private void spawnHero()
    {
        this.currentHero = new Zoom();
        getWorld().addObject(this.currentHero, 100, 250);
     }
     
    private void spawnEnemies() {
      double currentSpawnTime = System.currentTimeMillis();
      double timeElapsed = currentSpawnTime - this.lastSpawnTime;
 
      if ((this.gameInProgress) && (timeElapsed >= this.spawnRate)) {
          
      int randomEnemyType = 1 + this.randomGenerator.nextInt(100 - 1 + 1);
      int randomY = 10 + this.randomGenerator.nextInt(590 - 10 + 1);
      
          if (randomEnemyType > 20) {
           getWorld().addObject(new Enemy(), 1000, randomY);
           this.lastSpawnTime = System.currentTimeMillis();
        }
        else {
           getWorld().addObject(new HomingEnemy(), 1000, randomY);
           this.lastSpawnTime = System.currentTimeMillis();
        }
      }
    } 
    
    
    
}
