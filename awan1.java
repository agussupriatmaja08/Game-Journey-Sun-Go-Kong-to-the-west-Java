import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class awan1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class awan1 extends awan
{
    /**
     * Act - do whatever the awan1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
         setLocation(getX()-2, getY());
        if(isAtEdge()){
            setLocation(getWorld().getWidth(), Greenfoot.getRandomNumber(getWorld().getHeight()-250));
        }
        
    }
}
