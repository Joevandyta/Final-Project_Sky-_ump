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
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private int spawntime=0;
    public GroundTile groundTile = new GroundTile();
    private void prepare()
    {
        Ground ground = new Ground();
        addObject(ground,275,698);

        GroundTile groundTile = new GroundTile();
        addObject(groundTile,452,480);
        GroundTile groundTile2 = new GroundTile();
        addObject(groundTile2,115,350);
        GroundTile groundTile3 = new GroundTile();
        addObject(groundTile3,144,550);
        GroundTile groundTile4 = new GroundTile();
        addObject(groundTile4,452,215);
        GroundTile groundTile5 = new GroundTile();
        addObject(groundTile5,138,90);
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
