import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class obstaculo_1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class obstaculo_1 extends Actor
{
    private int speed;
    public obstaculo_1(int v){
        GreenfootImage Imagen= getImage();
        Imagen.scale(70,70);
        speed= v;
        
    }
    public void act(){
    setLocation(getX(),getY() + speed);
    if(getY()>= getWorld().getHeight()-1){
        pista juego= (pista) getWorld();
        juego.removeObject(this);
        }
}
    /**
     * Act - do whatever the obstaculo_1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    }

    
    
        // Add your action code here.
