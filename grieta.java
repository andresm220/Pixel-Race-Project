import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class grieta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class grieta extends Actor
{
    private int speed;
    public grieta(int v){
        GreenfootImage Imagen= getImage();
        Imagen.scale(80,80);
        speed= v;
        
    }
    public void act(){
    setLocation(getX(),getY() + speed);
    if(getY()>= getWorld().getHeight()-1){
        pista juego= (pista) getWorld();
        juego.removeObject(this);
        }
}
}
