import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Carro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Carro extends Actor
{
    private int velocidad;
    public Carro(int v){
        velocidad = 4;
        GreenfootImage Imagen= getImage();
        Imagen.scale(115,115);
        
    }
    /**
     * Act - do whatever the Carro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("right")){
           if (getX()< 460)
               setLocation(getX()+3,getY());
           
        }
        if(Greenfoot.isKeyDown("left")){ 
           if(getX() > 140)
               setLocation(getX()-3,getY() ); 
        }
        if(Greenfoot.isKeyDown("down")){
            if(getY() < 640)
                setLocation(getX(),getY()+ velocidad); 
        }
        if(Greenfoot.isKeyDown("up")){
            if(getY() > 300)
               setLocation(getX(),getY()- velocidad); 
        }
        if(CheckChoque()){
            Greenfoot.stop();
        getWorld().addObject(new GameOverActor(), getWorld().getWidth() / 2, getWorld().getHeight() / 2);
    
        }
        
        
    }
    private boolean CheckChoque(){
        List<barril> barriles = getObjectsAtOffset(0,0,barril.class);
        return !barriles.isEmpty();
    }
     public void subir_velo(){
        velocidad++;
    }
       
    }
    
   
    

