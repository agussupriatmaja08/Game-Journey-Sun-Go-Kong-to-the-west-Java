import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gameOver2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gameOver2 extends World
{
    public static GreenfootSound bgingame = new GreenfootSound ("GameOver.mp3");
    /**
     * Constructor for objects of class gameOver2.
     * 
     */
    public gameOver2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    public void act()
    {
        //mematikan lagu di lvl 1
        lvl1.bgingame.stop();
        
        //mematikan lagu di lvl 2
        lvl2.bgingame.stop();
        
        //mematikan lagu di lvl3
        lvl3.bgingame.stop();
        
        //memutar lagu di game over
        bgingame.setVolume(80);
        bgingame.playLoop();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        restart restart = new restart();
        addObject(restart,345,303);
        restart.setLocation(299,335);
        awan2 awan2 = new awan2();
        addObject(awan2,459,76);
        awan2 awan22 = new awan2();
        addObject(awan22,168,79);
        getCellSize();
    }
}
