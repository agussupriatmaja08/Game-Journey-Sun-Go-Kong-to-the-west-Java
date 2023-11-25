import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tembakMusuh here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tembakMusuh extends Actor
{
    /**
     * Act - do whatever the tembakMusuh wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX()-5, getY());
        
         if(isTouching(tembak.class) || getX() == 0){
            removeTouching(tembak.class);
          
            getWorld().removeObject(this);  
        }
        
        
        
    }
}
