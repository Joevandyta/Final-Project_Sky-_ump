import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Star here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartWorld extends Actor
{
    private static final Color transparent = new Color(0,0,0,0);
    /**
     * Act - do whatever the Star wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage img = new GreenfootImage(330, 120);
    private int str = 0;
    public StartWorld()
    {

        Font Arcade =  new Font("Courier New", true, false, 30);
        img.setColor(transparent);
        img.fill();
        img.setColor(Color.BLACK);
        img.setFont(Arcade);
        img.drawString("   CLICK ENTER \n\nTO START THE GAME", 0, 45);

        setImage(img);
    }

    public void act(){
        Startw();
        ImgChange();
    }
    public void ImgChange(){
        str++;
        Start hehe = (Start)getWorld();
        if(str == 120){
            str = 0;
        }
        else if(str>60){
            Font Arcade =  new Font("Courier New", true, false, 30);
            img.setColor(transparent);
            img.fill();
            img.setColor(Color.BLACK);
            img.setFont(Arcade);
            img.drawString("   CLICK ENTER \n\nTO START THE GAME", 0, 45);
            
            
            setImage(img);
            GreenfootImage surface = hehe.getSurface();
            getWorld().setBackground(surface);
            
        }else if(str > 0){
            Font Arcade =  new Font("Courier New", true, false, 30);
            img.setColor(transparent);
            img.fill();
            img.setColor(Color.WHITE);
            img.setFont(Arcade);
            img.drawString("   CLICK ENTER \n\nTO START THE GAME", 0, 45);
            
            
            setImage(img);
            GreenfootImage space = hehe.getSpace();
            getWorld().setBackground(space);
        }
    }
    public void Startw(){
        if(Greenfoot.isKeyDown("enter")){
            Greenfoot.setWorld(new InGame());
        }
    }
}
