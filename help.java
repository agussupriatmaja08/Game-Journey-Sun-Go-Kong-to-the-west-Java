import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class help here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class help extends World
{

    /**
     * Constructor for objects of class help.
     * 
     */
    public help()
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
        gunung gunung = new gunung();
        addObject(gunung,299,285);
        gunung.setLocation(300,335);

        back back = new back();
        addObject(back,42,40);
        
        space space = new space();
        addObject(space,319,214);
        
        row row = new row();
        addObject(row,329,116);
        row.setLocation(451,120);
        
        space.setLocation(188,120);
        
        row.setLocation(449,121);
        
        showText("Menembak", 190, 150);
        showText("Arah", 450, 150);

        addObject(new pisang2(), getWidth()/2, getHeight()-200);
        showText("Menambahkan kekuatan dan nyawa", getWidth()/2, getHeight()-160);
    }
}
