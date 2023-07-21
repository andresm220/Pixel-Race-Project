import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
        velocidad = v;
        
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
               setLocation(getX()+1,getY());
           
        }
        if(Greenfoot.isKeyDown("left")){ 
           if(getX() > 140)
               setLocation(getX()-1,getY()); 
        }
        if(Greenfoot.isKeyDown("down")){
            if(getY() < 640)
                setLocation(getX(),getY()+ velocidad); 
        }
        if(Greenfoot.isKeyDown("up")){
            if(getY() > 300)
               setLocation(getX(),getY()- velocidad); 
        }
        
        
        
    }
    public void checkChoque(){
         Actor choque= getOneIntersectingObject(barril.class);
        if(choque != null){
            getWorld().removeObject(choque);
            getWorld().removeObject(this);
            Greenfoot.stop();
            System.out.print("GAME OVER");
            
        }
        
    }
       
    
}
