import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ground here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Softcloud extends Ground

{
    /**
     * Act - do whatever the Ground wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int spawn = Greenfoot.getRandomNumber(400);
    public int item = Greenfoot.getRandomNumber(100);
    public int flag = 0;
    public int time = 40;
    public Softcloud(){
        GreenfootImage image = getImage();
        image.scale(180,21);
        image.setTransparency(150);
    }
     public void act()
    {
        
        super.act();
        
        if(this.getWorld() != null){
            Mc mc = (Mc)getWorld().getObjects(Mc.class).get(0);
            
            if (this.isTouching(Mc.class) && getY() >70) {
                flag=1;
            }
            if(flag == 1){
                time--;
            }
            if(time == 0){
                getWorld().removeObject(this);
                flag=0;
            }
        }
    }
    
}
