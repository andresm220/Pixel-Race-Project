import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Barril here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class barril extends Actor
{
    /**
     * Act - do whatever the Barril wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed;
    
   
    public barril(int v){
        speed=v;
        GreenfootImage Imagen= getImage();
        Imagen.scale(80,80);
        
    }
    public void act(){
        setLocation(getX(),getY() + speed);
       
        if(getY()>= getWorld().getHeight()-1){
            pista juego= (pista) getWorld();
            juego.removeObject(this);
            
    }
    if (isTouching(Carro.class)){
        
        Greenfoot.stop();
        getWorld().addObject(new GameOverActor(), getWorld().getWidth() / 2, getWorld().getHeight() / 2);
    
    }

    }
}

