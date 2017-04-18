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
    private AbstractHero currentHero;
    private boolean gameInProgress = false;
    private double lastSpawnTime = System.currentTimeMillis();
    private double spawnRate = 450;//in milliseconds
    private int score;
    private GreenfootSound music = new GreenfootSound("Bizet.wav");

    private GreenfootImage img;
    private Random randomGenerator;
    private Random randomYGenerator;
    
    public void updateScore() {
     if (this.gameInProgress) {
       this.img = new GreenfootImage (200, 20);
       this.img.drawString ("Life: " + this.currentHero.getHealth() + "      Score: " + this.score ,2,20);
       setImage(this.img);
     }
    }
    public void increaseScore(int points) {
        this.score = this.score + points;
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
        if("s".equals(Greenfoot.getKey()) && !this.gameInProgress) 
        {
          spawnHero();
          spawnEnemies();
          this.gameInProgress = true;
          this.randomGenerator = new Random();
          this.randomYGenerator = new Random();
          music.setVolume(80);
          music.play();
          this.score = 0;
          getWorld().setBackground("background0172.jpg");
        }
    }
    
    public void stop() {
        this.gameInProgress = false;
        this.music.stop();
        getWorld().setBackground("desert.png");
        this.img = new GreenfootImage (1000,600);
        
        this.img.drawString ("GAME OVER! ",500,300);
        this.img.drawString ("Try again! ",500,320);
        setImage(this.img);
        
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
      
          if (randomEnemyType > 10) {
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
