import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import greenfoot.GreenfootSound;
/**
 * Write a description of class Carro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Carro extends Actor
{
    private int velocidad;
    private boolean inmunidad;
    private int temporizador;
    private boolean parpadeando = false;
    private GreenfootSound carroSonido;
    private boolean upPresionadaAnteriormente = false;
    private boolean leftPresionadaAnteriormente = false;
    private boolean rightPresionadaAnteriormente = false;
    private GreenfootSound soundMuerte;
    private GreenfootSound soundFondo;


    
    public Carro(int v){
        velocidad = 4;
        GreenfootImage Imagen= getImage();
        Imagen.scale(120,120);
        inmunidad = false;
        temporizador = 0;
        carroSonido = new GreenfootSound("carrosonidox.mp3");
        soundMuerte = new GreenfootSound("muerte.mp3");
        
    }
    public void ActivarInmunidad(){
        inmunidad= true;
        temporizador = 300;
        
    }
    public void DesactivarInmunidad(){
        inmunidad = false;
    }
    public boolean Inmune(){
        return inmunidad;
    }
    /**
     * Act - do whatever the Carro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    
{

        if (inmunidad){
            
            if(temporizador>0){
                temporizador--;
                if (parpadeando) {
                    GreenfootImage blanco = new GreenfootImage(getImage().getWidth(), getImage().getHeight());
                    setImage(blanco);
                    
                } else {
                   GreenfootImage original = new GreenfootImage("carro.png");
                   original.scale(120, 120);
                   setImage(original);
                }
                
            } else {
                DesactivarInmunidad();
                GreenfootImage original = new GreenfootImage("a07e43c30c7bf218fe156dcbaadc8e48-vehiculo-coche-pixel-rojo.png");
                original.scale(120, 120);
                setImage(original);
            }
        }
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
        if(CheckChoque() && !Inmune()){
            Greenfoot.stop();
        getWorld().addObject(new GameOverActor(), getWorld().getWidth() / 2, getWorld().getHeight() / 2);
        soundMuerte.play();
        carroSonido.stop();

    
        }  
        boolean upPresionadaActualmente = Greenfoot.isKeyDown("up");
        boolean leftPresionadaActualmente = Greenfoot.isKeyDown("left");
        boolean rightPresionadaActualmente = Greenfoot.isKeyDown("right");

        if (upPresionadaActualmente && !upPresionadaAnteriormente) {
            carroSonido.play();
        } else if (!upPresionadaActualmente && upPresionadaAnteriormente) {
            carroSonido.pause(); 
        }
        
        if (leftPresionadaActualmente && !leftPresionadaAnteriormente) {
            carroSonido.play(); 
        } else if (!leftPresionadaActualmente && leftPresionadaAnteriormente) {
            carroSonido.pause(); 
        }
    
        if (rightPresionadaActualmente && !rightPresionadaAnteriormente) {
            carroSonido.play(); 
        } else if (!rightPresionadaActualmente && rightPresionadaAnteriormente) {
            carroSonido.pause(); 
        }


        upPresionadaAnteriormente = upPresionadaActualmente;
        leftPresionadaAnteriormente = leftPresionadaActualmente;
        rightPresionadaAnteriormente = rightPresionadaActualmente;
            
        
    }
    private boolean CheckChoque(){
        List<barril> barriles = getObjectsAtOffset(0,0,barril.class);
        return !barriles.isEmpty();
    }
     public void subir_velo(){
        velocidad++;
    }
       
    }
    
   
    

