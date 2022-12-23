import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ground here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Underground extends Ground

{
    /**
     * Act - do whatever the Ground wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int spawn = Greenfoot.getRandomNumber(400);
    public int item = Greenfoot.getRandomNumber(100);    
    public Underground(){
        GreenfootImage image = getImage();
        image.scale(180,21);
     
    }
     public void act()
    {
        super.act();

        
        
    }
}
