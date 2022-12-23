import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MC here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mc extends Actor
{
    /**
     * Act - do whatever the MC wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int gSpeed;
    private int speed = 8;
    private final int gravity =1;
    private boolean check;
    public Mc(){
        gSpeed =0;
    }
    public void act()
    {
        edge();
        fall();
        heromove();
    }
    public void heromove(){
       if (Greenfoot.isKeyDown("a"))
        {
            setLocation(getX()-speed,getY());
        }
       if (Greenfoot.isKeyDown("d"))
        {
            setLocation(getX()+speed,getY());

        }

    }

    public boolean onGround()
    {
        Object under = getOneObjectAtOffset(0, getImage().getHeight()/2 + 2, Ground.class);
        return under != null;
    }

    public void fall()
    {
        setLocation (getX(), getY() + gSpeed);
        if (onGround() && gSpeed>=0) {
            jump();
        }
        else {
            if(gSpeed <24){
                
                gSpeed += gravity;
            }
        }
    }
    public void jump(){
        gSpeed = -23;
        
    }
    private void edge(){
        if(getX()==549){
            setLocation(1,getY());
        }
        if(getX()==0){
            setLocation(549,getY());
        }

    }
}
