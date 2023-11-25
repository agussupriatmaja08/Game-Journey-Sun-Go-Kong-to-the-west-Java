import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tembak here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tembak extends Actor
{
    /**
     * Act - do whatever the tembak wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX()+5, getY());
        if(isAtEdge()||isTouching(tembakBoss.class)){
       
            getWorld().removeObject(this);

        }
        
    }
}
