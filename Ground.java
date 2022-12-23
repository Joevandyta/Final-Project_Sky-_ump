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
    public int spawn = Greenfoot.getRandomNumber(400);
    public int item = Greenfoot.getRandomNumber(100);    
    protected int FSpeed;
    public int scoretemp;
    public int height = 100;
    int flag;
    public Ground(){
        GreenfootImage image = getImage();
        image.scale(555,51);

    }

    public void act()
    {
        faling();
        flag--;
        GroundRemove();
        spawnGroundTile();
    }

    protected void GroundRemove(){
        if(getY() == 699){
            MyWorld m = (MyWorld)getWorld();
            m.addscore(1);        
            getWorld().removeObject(this);
        }

    }

    private int score(int point){
        scoretemp += point;

        return scoretemp;
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

        FSpeed =  +20;
        flag=10;

    }

    protected void spawnGroundTile(){
       
        if(this.getWorld() != null){            
            int scoretemp = ((MyWorld)getWorld()).getScore();
            if(getY() == 160){
                if(scoretemp >= height * 75/100){
                    if(spawn >100){
                        getWorld().addObject(new SpaceRock(),50 + Greenfoot.getRandomNumber(450),0);
                        //if(item == 1)getWorld().addObject(new PowerUp(),this.getX(),this.getY());
                    }
                    else if(spawn < 100){
                        getWorld().addObject(new SpaceRocket(),50 + Greenfoot.getRandomNumber(450),0);
                    }
                }else if(scoretemp >= height * 50/100){
                    if(spawn >100){
                        getWorld().addObject(new Cloud(),50 + Greenfoot.getRandomNumber(450),0);
                        //if(item == 1)getWorld().addObject(new PowerUp(),this.getX(),this.getY());
                    }
                    else if(spawn < 100){
                        getWorld().addObject(new SlideCloud(),50 + Greenfoot.getRandomNumber(450),0);
                    }
                }else if(scoretemp >= height * 25/100 ){
                    if(spawn >100){
                        getWorld().addObject(new GroundTile(),50 + Greenfoot.getRandomNumber(450),0);
                        //if(item == 1)getWorld().addObject(new PowerUp(),this.getX(),this.getY());
                    }
                    else if(spawn < 100){
                        getWorld().addObject(new SlideGround(),50 + Greenfoot.getRandomNumber(450),0);
                    }
                }else{
                    if(spawn >100){
                        getWorld().addObject(new Underground(),50 + Greenfoot.getRandomNumber(450),0);
                        //if(item == 1)getWorld().addObject(new PowerUp(),this.getX(),this.getY());
                    }
                    else if(spawn < 100){
                        getWorld().addObject(new SlideUnderground(),50 + Greenfoot.getRandomNumber(450),0);
                    }
                }
            }
        }
    }
}
