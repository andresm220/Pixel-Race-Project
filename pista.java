import greenfoot.*;
import java.util.List;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.GreenfootSound;
/**
 * Write a description of class pista here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pista extends World
{
    private contador puntuacion;
    private contador nivel;
    
    private int velo;
    private int num_carros_rebasados;
    private int rebaso_requerido;
    private Carro rojo;
    private int obstaculos;
    private int timer = 0;
    
    
    

    /**
     * Constructor for objects of class pista.
     * 
     */
    public pista()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 700, 1); 
        prepare();
        num_carros_rebasados= 0;
        rebaso_requerido= 2;
        velo= 3;
        puntuacion= new contador("Puntos: ");
        nivel= new contador("Nivel: ");
        nivel.add(1);
        rojo= new Carro(velo);
        addObject(rojo,300,600);
        addObject(puntuacion,80,90);
        addObject(nivel,80,60);
        
        
        
        
        
    }
    public void act(){
        subir_nivel();
        añadir_obstaculos();
        
    }
    public int numeroRandom(int inicio,int fin){
      int norm= Greenfoot.getRandomNumber(fin-inicio + 1);
      return norm + inicio;
    }
    public void subir_puntos(int num){
        puntuacion.add(num);
    }
    public void subir_rebasos(){
        num_carros_rebasados++;
    }
    public void reducir_rivales(){
        obstaculos--;
    }
    public void subir_nivel(){
        if(num_carros_rebasados == rebaso_requerido){
            num_carros_rebasados=0;
            rebaso_requerido= rebaso_requerido + 2;
            velo++;
            nivel.add(1);
            rojo.subir_velo();
            
        }
    }
    
    public void añadir_obstaculos(){
        if (obstaculos == 0){
            int carril = numeroRandom(0,3);
            if (carril ==0){
                addObject(new barril (velo),180,80);
                   

                
            }
            else if (carril==1){
                addObject(new barril (velo),290,80);  
             
            }
            else{
                addObject(new barril (velo),410,80);
                   
                     
            }
            carril++;
            carril = carril %3;
            
            if (carril ==0){
                addObject(new barril(velo),180,80);
                   

                
            }
            else if (carril==1){
                addObject(new barril (velo),290,80); 
    
             
            }
            else{
                addObject(new barril (velo),410,80);
                   
                     
            }
            
            
            obstaculos = 2;
            timer++;
            if (timer % 4 == 0) {
                if (obstaculos != 0) {
                    carril = numeroRandom(0,3);
                    if (carril == 0) {
                        addObject(new PowerUp(velo),180,142);
                    } else if (carril == 1) {
                        addObject(new PowerUp(velo),290,142);  
                    } else {
                        addObject(new PowerUp(velo),410,142);
                    }
                }
    
        timer = 0;
    }
            carril++;
            carril= carril %3;
            
          
            
            
            
        }
        
        
        
    }
    
    
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
