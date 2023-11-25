import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ledakan2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ledakan2 extends Actor
{
    /**
     * Act - do whatever the ledakan2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int delay;
    public void act()
    {
        delay ++;
        if(delay == 20){
            getWorld().removeObject(this);
        }
    }
}
