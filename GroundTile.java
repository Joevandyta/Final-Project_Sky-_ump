import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ground here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GroundTile extends Ground

{
    /**
     * Act - do whatever the Ground wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int spawn = Greenfoot.getRandomNumber(400);
    
    public GroundTile(){
        GreenfootImage image = getImage();
        image.scale(180,21);
     
    }
     public void act()
    {
        super.act();
        spawnGroundTile();
        
        
    }
    protected void spawnGroundTile(){
        
        if(this.getWorld() != null){            
            if(getY() == 140){
                if(spawn >100){
                    getWorld().addObject(new GroundTile(),50 + Greenfoot.getRandomNumber(450),0);   
                }
                else if(spawn < 100){
                    getWorld().addObject(new Cloud(),50 + Greenfoot.getRandomNumber(450),0);
                }
            }
        }
    }
}
