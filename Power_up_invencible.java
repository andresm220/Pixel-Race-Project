import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Power_up_invencible here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Power_up_invencible extends Actor
{
    private int speed;
    public Power_up_invencible(int v){
        speed= v;
        GreenfootImage Imagen= getImage();
        Imagen.scale(40,40);
        
    }
    /**
     * Act - do whatever the Power_up_invencible wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(),getY()+ speed);
        if(getY()>= getWorld().getHeight()-1){
            pista juego= (pista) getWorld();
            juego.removeObject(this);
            
        }
        // Add your action code here.
    }
}
