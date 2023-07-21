import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
        rebaso_requerido= 3;
        velo= 2;
        puntuacion= new contador("Puntos: ");
        nivel= new contador("Nivel: ");
        nivel.add(1);
        rojo= new Carro(velo);
        addObject(rojo,300,600);
        addObject(puntuacion,80,90);
        addObject(nivel,80,60);
        
        
        
        
        
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
