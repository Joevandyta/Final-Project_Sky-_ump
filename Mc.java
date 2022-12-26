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
    GreenfootImage image = getImage();
    public boolean flag = false;
    private boolean change = true;
    private boolean jumpflag= false;
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
            if(change == true){
                getImage().mirrorHorizontally();
                change = false;
            }
        }
        if (Greenfoot.isKeyDown("d"))
        {
            setLocation(getX()+speed,getY());
            
            if(change == false){
                getImage().mirrorHorizontally();
                change = true;
            }
            
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
        //setLocation (getX(), getY() + gSpeed);
        if (onGround() && gSpeed>=0) {
            gSpeed = -23;
            jump();
            flag = true;
            
            
        }
        else{
            if(gSpeed <24){
                flag =false;
                gSpeed += gravity;
            }
        }
    }

    public void jump(){
                
        if(jumpflag==true){
            setImage("fish.png");
            change = true;
            jumpflag = false;

        }else if(jumpflag == false){
            setImage("turtle.png");
            change = true;
            jumpflag = true;
        }
        Greenfoot.playSound("amongus kill.mp3");
    }

    private void edge(){

        if(getX()==549){
            setLocation(1,getY());

        }
        if(getX()==0){
            setLocation(549,getY());

        }
    }

    public boolean getGSpeed(){
        return flag;
    }
}
