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
    public int spawn = Greenfoot.getRandomNumber(100);
    public int soft = Greenfoot.getRandomNumber(100);    
    protected int FSpeed;
    public int scoretemp;
    public boolean end = false;

    int flag;

    public Ground(){
        GreenfootImage image = getImage();
        image.scale(555,51);

    }

    public int getScoretemp(){
        return scoretemp;
    }

    public void act()
    {
        faling();
        flag--;
        GroundRemove();
        SpawnGroundTile();

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

    protected void GroundRemove(){
        if(getY() == 699 && this.getWorld() != null){
            Score score = (Score)getWorld().getObjects(Score.class).get(0);            
            score.setPrefix("Score : ");
            score.add(1);
            getWorld().removeObject(this);
        }

    }

    public void fal(){
        FSpeed =  +20;
        flag=10;

    }

    public void SpawnGroundTile(){
        if(this.getWorld() != null){            
            int scoretemp = getWorld().getObjects(Score.class).get(0).getValue();
            InGame mw = (InGame)getWorld();
            int height = mw.getHigh();

            if(getY() == 160){
                if(scoretemp >= height * 75/100){
                    GreenfootImage lvl4 = mw.getLevel4();
                    getWorld().setBackground(lvl4);
                    if(spawn >50){
                        getWorld().addObject(new Spaceship(),50 + Greenfoot.getRandomNumber(450),0);
                        //if(item == 1)getWorld().addObject(new PowerUp(),this.getX(),this.getY());
                    }
                    else if(spawn > 20){
                        getWorld().addObject(new SpaceRocket(),50 + Greenfoot.getRandomNumber(450),0);
                    }else{
                        getWorld().addObject(new Spacesurface(),50 + Greenfoot.getRandomNumber(450),0);
                    }
                }else if(scoretemp >= height * 50/100){
                    GreenfootImage lvl3 = mw.getLevel3();
                    getWorld().setBackground(lvl3);
                    if(spawn >40){
                        getWorld().addObject(new Cloud(),50 + Greenfoot.getRandomNumber(450),0);
                        //if(item == 1)getWorld().addObject(new PowerUp(),this.getX(),this.getY());
                    }
                    else if(spawn > 10){
                        getWorld().addObject(new SlideCloud(),50 + Greenfoot.getRandomNumber(450),0);
                    }else{
                        getWorld().addObject(new Softcloud(),50 + Greenfoot.getRandomNumber(450),0);
                    }
                }else if(scoretemp >= height * 25/100 ){
                    GreenfootImage lvl2 = mw.getLevel2();
                    getWorld().setBackground(lvl2);
                    if(spawn >50){
                        getWorld().addObject(new Surface(),50 + Greenfoot.getRandomNumber(450),0);
                        //if(item == 1)getWorld().addObject(new PowerUp(),this.getX(),this.getY());
                    }
                    else{
                        getWorld().addObject(new SlideSurface(),50 + Greenfoot.getRandomNumber(450),0);
                    }
                }else{
                    GreenfootImage lvl1 = mw.getLevel1();
                    getWorld().setBackground(lvl1);
                    if(spawn >25){
                        getWorld().addObject(new Underground(),50 + Greenfoot.getRandomNumber(450),0);
                        //if(item == 1)getWorld().addObject(new PowerUp(),this.getX(),this.getY());
                    }
                    else{
                        getWorld().addObject(new SlideUnderground(),50 + Greenfoot.getRandomNumber(450),0);
                    }
                }
            }
        }
    }
}
