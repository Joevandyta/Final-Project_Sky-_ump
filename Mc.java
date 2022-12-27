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
        DeerImage();
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

        return under != null    ;
    }
    public void DeerImage(){
        if(gSpeed >0){
            
            setImage("deerdown.png");
            change = true; 
        }else if(gSpeed ==0){
            
            setImage("deerair.png");
            change = true;  
        }else if(gSpeed <0){
            
            setImage("deerup.png");
            change = true;
        }
        
    }
    public void fall()
    {
        setLocation (getX(), getY() + gSpeed);
        //setLocation (getX(), getY() + gSpeed);
        if (onGround() && gSpeed>=-1) {
            gSpeed = -23;
            jump();
        }
        else{
            if(gSpeed <15){
                
                gSpeed += gravity;
            }
        }        

    }

    public void jump(){
      int scoretemp = getWorld().getObjects(Score.class).get(0).getValue();
            MyWorld mw = (MyWorld)getWorld();
            int height = mw.getHigh();  

        if(this.isTouching(Underground.class)){
            Greenfoot.playSound("Step dirt.mp3");
        }else if(this.isTouching(Surface.class)){
            Greenfoot.playSound("Step Surface.mp3");
        }else if(this.isTouching(Cloud.class)){
            Greenfoot.playSound("Step Cloud.mp3");
        }else if(this.isTouching(Spaceship.class)){
            Greenfoot.playSound("Step Metal.mp3");
        }else if(this.isTouching(Spacesurface.class)){
            Greenfoot.playSound("Step Rock.mp3");
        }else if(this.isTouching(Softcloud.class)){
            Greenfoot.playSound("Step Cloud.mp3");
        }else if(this.isTouching(Ground.class)){
            Greenfoot.playSound("Step dirt.mp3");
        }
        
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
