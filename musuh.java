import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class musuh here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class musuh extends Actor
{
    /**
     * Act - do whatever the musuh wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX()-1, getY());
        if(isAtEdge()){
            setLocation(getWorld().getWidth(), Greenfoot.getRandomNumber(getWorld().getHeight()-250));
        }
        if(isTouching(tembak.class)){
            removeTouching(tembak.class);
            lvl1.score.add(1);
            lvl2.score.add(1);
            lvl3.score.add(1);
            getWorld().addObject(new ledakan(), getX(), getY());
            getWorld().addObject(new musuh(),getWorld().getWidth(), Greenfoot.getRandomNumber(getWorld().getHeight()-250) );
            getWorld().removeObject(this);
 
        }

        
    }
}
