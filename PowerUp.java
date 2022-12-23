import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PowerUp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PowerUp extends Actor
{
    /**
     * Act - do whatever the PowerUp wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    /*
    private int PSpeed;
    private int flag2;
    public PowerUp(){
        GreenfootImage image = getImage();
        image.scale(21,21);
     
    }
    public void act()
    {
        if(this.getWorld() != null){
            flag2--;
            PowerUpFall();
        } 

    }
    //public boolean onGround(){
        
    //}
       public boolean onGround()
        {
            Object touch = getOneObjectAtOffset(0, getImage().getHeight()/2 + 2, Mc.class);
            return touch != null;
        }
    

    public void PowerUpFall(){

        setLocation (getX(), getY() + PSpeed);
        if (((Mc)getWorld().getObjects(Mc.class).get(0)).onGround() && PSpeed==0) {
            fal();
            
        }
        else if(flag2==0){
            PSpeed=0;
            
        }
        
    }
    public void fal(){
        PSpeed = +20;
        flag2=10;
            
    }
    */
}
