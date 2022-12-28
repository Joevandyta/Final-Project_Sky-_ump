import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends World
{
    private int BGchange = 180;
    /**
     * Constructor for objects of class Start.
     * 
     */
    private GreenfootImage Surface;
    private GreenfootImage Space;
    public Start()
    {    
        super(550, 700, 1); 
        prepare();
        
        Surface = new GreenfootImage("surface.jpg");
        Space = new GreenfootImage("Space.jpg");
    }
    public GreenfootImage getSurface(){
        return Surface;
    }

    public GreenfootImage getSpace(){
        return Space;
    }
    private void prepare(){

        StartWorld startWorld = new StartWorld();
        addObject(startWorld,277,348);
    }
}
