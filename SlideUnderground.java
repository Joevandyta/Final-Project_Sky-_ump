import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ground here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SlideUnderground extends Underground

{
    private int slide = 4;
    /**
     * Act - do whatever the Ground wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public SlideUnderground(){
        GreenfootImage image = getImage();
        image.scale(180,21);
     
    }
     public void act()
    {
        super.act();
        
        if(this.getWorld() != null){
            setLocation (getX()+slide, getY());
            if(getX() >= 500){
                slide = -4;
            }
            else if(getX() <= 50){
                slide =4;
            }
        }
    }
    
}
