import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class back here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class back extends tombol
{
    /**
     * Act - do whatever the back wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.mousePressed(this))
        {
            getImage().scale((int)Math.round(getImage().getWidth()*0.9),
            (int)Math.round(getImage().getHeight()*0.9));
            
        }
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new menu());
            helpp.bgingame.stop();
            creditt.bgingame.stop();
        }
    }
}
