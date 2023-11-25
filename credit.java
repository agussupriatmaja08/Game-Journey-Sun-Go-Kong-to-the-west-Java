import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class credit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class credit extends World
{

    /**
     * Constructor for objects of class credit.
     * 
     */
    public credit()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(650, 500, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        back back = new back();
        addObject(back,43,35);
        awan0 awan0 = new awan0();
        addObject(awan0,586,438);
        awan0 awan02 = new awan0();
        addObject(awan02,370,444);
        awan0 awan03 = new awan0();
        addObject(awan03,162,437);
        sun sun = new sun();
        addObject(sun,594,51);
        back.setLocation(38,48);
        back.setLocation(42,56);
        removeObject(back);
        awan0.setLocation(583,68);
        awan02.setLocation(335,55);
        awan03.setLocation(134,134);
        back back2 = new back();
        addObject(back2,40,39);
    }
}
