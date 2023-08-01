import greenfoot.*;
import greenfoot.GreenfootSound;
  
public class GameOverActor extends Actor {
    private GreenfootSound soundMuerte;
    public GameOverActor() {
        GreenfootImage gameOverImage = new GreenfootImage("Game_over.png");
        setImage(gameOverImage);
        soundMuerte = new GreenfootSound("muerte.mp3");
    }
}
