import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class win here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class win extends World
{

    public static GreenfootSound bgingame = new GreenfootSound ("win.mp3");
    /**
     * Constructor for objects of class win.
     * 
     */
    public win()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(new menang(), getWidth()/2, getHeight()-300);
        addObject(new land(), getWidth()/2, getHeight()/2);

        addObject(new home(), (getWidth()/2)-60, getHeight()-150);
        addObject(new restart(), (getWidth()/2)+60, getHeight()-150);
        
    }
    
    public void act()
    {
        lvl3.bgingame.stop();
        bgingame.setVolume(80);
        bgingame.playLoop();
        Greenfoot.delay(100);
        Greenfoot.setWorld(new credit());
        
    }
}
