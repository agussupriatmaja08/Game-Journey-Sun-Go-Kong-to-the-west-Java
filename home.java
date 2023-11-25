import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class home here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class home extends tombol
{
    /**
     * Act - do whatever the home wants to do. This method is called whenever
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
            win.bgingame.stop();
        }
       
    }
    public  home(){
        getImage().scale(getImage().getWidth()/10, getImage().getHeight()/10);
    }
}
