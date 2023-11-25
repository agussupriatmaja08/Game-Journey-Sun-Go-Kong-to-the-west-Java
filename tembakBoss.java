import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tembakBoss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tembakBoss extends Actor
{
    /**
     * Act - do whatever the tembakBoss wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX()-3, getY());
        if(isAtEdge() || isTouching(tembak.class)){
            getWorld().removeObject(this);
        }
    }
    public tembakBoss(){
        getImage().scale(getImage().getWidth()/7, getImage().getHeight()/7);
    }
}
