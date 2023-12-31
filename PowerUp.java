import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PowerUp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PowerUp extends Actor
{
    private int velocidad;
    public PowerUp(int v){
        velocidad = v;
        GreenfootImage Imagen= getImage();
        Imagen.scale(60,60);
        
    }
    /**
     * Act - do whatever the PowerUp wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(),getY() + velocidad);
        
        
        Actor carro = getOneIntersectingObject(Carro.class);
         if(carro != null){
            ((Carro)carro).ActivarInmunidad();
            getWorld().removeObject(this);
        }
        else if (getY()>= getWorld().getHeight()-1){
            pista juego= (pista) getWorld();
            juego.removeObject(this);
        }
        // Add your action code here.
    
}
}
