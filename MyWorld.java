import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(550, 700, 1); 
        prepare();
        setPaintOrder(LoseOverlay.class);
        showscore();
        timesec();
        clockt = 0;

    }
    private int spawntime=0;
    private int pause=0;
    private int life = 3;
    private int clockt;
    private int second;
    public int getPoint;

    private void prepare()
    {
        Ground ground = new Ground();
        addObject(ground,275,698);

        addObject(new Underground(),50 + Greenfoot.getRandomNumber(450),480);
        addObject(new Underground(),50 + Greenfoot.getRandomNumber(450),330);
        addObject(new Underground(),50 + Greenfoot.getRandomNumber(450),165);
        addObject(new Underground(),50 + Greenfoot.getRandomNumber(450),0); 
        Mc mc = new Mc();
        addObject(mc,297,500);

    }
    public void act(){
        timesec();

        //DieScreen();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */

    public void addscore(int point){
        getPoint += point;
        showscore();
    }

    private void showscore(){ 
        showText("Score\n" + getPoint,550/2 ,30);
    }

    public void DieScreen(){

        if(getObjects(Mc.class).get(0).getY() == 699){
            Greenfoot.stop();
            addObject(new LoseOverlay(),540,300); 
        }
    }
    public int getScore(){
        return getPoint;
    }
    private void timesec(){
        clockt++;
        if(clockt % 60 == 0){
            second = clockt / 60;
        }
        showText("Time : "+second ,540 ,30);
    }   
    
}
