import greenfoot.*;

public class Grieta extends Actor
{
    private int speed;
    
    public Grieta(int v) {
        speed = v;
        GreenfootImage imagen = getImage();
        imagen.scale(80, 80);
    }
    
    public void act() {
        setLocation(getX(), getY() + speed);
       
        if (getY() >= getWorld().getHeight() - 1) {
            pista juego = (pista) getWorld();
            juego.removeObject(this);
        }
        
        if (isTouching(Carro.class)) {
            Greenfoot.stop();
            getWorld().addObject(new GameOverActor(), getWorld().getWidth() / 2, getWorld().getHeight() / 2);
        }
    }
}

