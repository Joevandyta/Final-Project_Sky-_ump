import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class Tanah here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ground extends Actor
{
    /**
     * Act - do whatever the Tanah wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int platformspd=2;
    protected int FSpeed;
    int flag;
    protected boolean step= false;
    public Ground(){
        GreenfootImage image = getImage();
        image.scale(555,51);
        
    }
    public void act()
    {
        faling();
        flag--;
        die();
    }
    protected void die(){
        if(getY() == 699)getWorld().removeObject(this);
    }

    public void faling(){
        
        setLocation (getX(), getY() + FSpeed);
        if (((Mc)getWorld().getObjects(Mc.class).get(0)).onGround() && FSpeed==0 ) {
            fal();
            
        }
        else if(flag==0){
            FSpeed=0;
            
        }
        
    }
    public void fal(){
        FSpeed = +20;
        flag=10;
            
    }
}
