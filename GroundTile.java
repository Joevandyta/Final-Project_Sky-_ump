import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ground here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GroundTile extends Actor

{
    /**
     * Act - do whatever the Ground wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int platformspd=2;
    private int FSpeed;
    int flag;
    public GroundTile(){
        GreenfootImage image = getImage();
        image.scale(110,21);
     
    }
    public void act()
    {
        faling();
        flag--;
        goup();

    }
    private void goup(){
        if(getY() == 699)
        {
            //getWorld().removeObject(this);
            setLocation (20+ Greenfoot.getRandomNumber(530), 0);
        }
    }
    public void faling(){
        setLocation (getX(), getY() + FSpeed);
        if (((Mc)getWorld().getObjects(Mc.class).get(0)).onGround() && FSpeed==0) {
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
