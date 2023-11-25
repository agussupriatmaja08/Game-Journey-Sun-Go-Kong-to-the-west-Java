import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class awan0 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class awan0 extends awan
{
    /**
     * Act - do whatever the awan0 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX()-2, getY());
        if(isAtEdge()){
            setLocation(getWorld().getWidth(), Greenfoot.getRandomNumber((getWorld().getHeight()/2)-175));
        }
    }
}
