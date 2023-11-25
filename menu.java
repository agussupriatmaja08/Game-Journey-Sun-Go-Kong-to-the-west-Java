import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class menu extends World
{
    public static GreenfootSound myMusic = new GreenfootSound("bg02.mp3");
    /**
     * Constructor for objects of class menu.
     * 
     */
    public menu()
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
        start start = new start();
        addObject(start,539,72);
        start.setLocation(541,94);

        start.setLocation(335,168);
        
        helpp helpp = new helpp();
        addObject(helpp,50,59);
        helpp.setLocation(39,46);
        
        creditt creditt = new creditt();
        addObject(creditt,156,299);
        creditt.setLocation(311,270);
    }
    
    public void act()
    {
        myMusic.playLoop();
        myMusic.setVolume(80);
    }
}
