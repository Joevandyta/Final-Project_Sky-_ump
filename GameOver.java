import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends Actor
{
    private static final Color transparent = new Color(0,0,0,0);
    /**
     * Act - do whatever the GameOver wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public GameOver()
    {

        
        Font Arcade =  new Font("Courier New", true, false, 58);
        GreenfootImage img = new GreenfootImage(330, 120);
        img.setColor(transparent);
        img.fill();
        img.setColor(Color.BLACK);
        img.setFont(Arcade);
        img.drawString(" YOU DIE \nGAME OVER", 0, 45);

        setImage(img);
    }
    
}