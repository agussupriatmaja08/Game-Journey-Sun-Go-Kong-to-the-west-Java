import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class land here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class land extends bac
{
    /**
     * Act - do whatever the land wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int a =0;
    public void act()
    {
        setLocation(getX()-1, getY());
        
          
        
        if(isAtEdge()){
            setLocation(getWorld().getWidth(), getWorld().getHeight()-190);
        }
            
        
        
    }
}
