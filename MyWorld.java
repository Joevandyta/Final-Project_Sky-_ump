import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(550, 700, 1); 
        prepare();
    }
    public void act(){
 
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private int spawntime=0;

    
    private void prepare()
    {
        Ground ground = new Ground();
        addObject(ground,275,698);

        addObject(new GroundTile(),50 + Greenfoot.getRandomNumber(450),580);
        addObject(new GroundTile(),50 + Greenfoot.getRandomNumber(450),440);
        addObject(new GroundTile(),50 + Greenfoot.getRandomNumber(450),300);
        addObject(new GroundTile(),50 + Greenfoot.getRandomNumber(450),160);
        addObject(new GroundTile(),50 + Greenfoot.getRandomNumber(450),0);

        Mc mc = new Mc();
        addObject(mc,297,649);

    }

    public void tilespawn()
    {
        //spawntime++;
        //addObject(new Enemy(),1080,sY);  
        if (spawntime == 60){
        }
    }
}
