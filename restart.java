import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class restart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class restart extends tombol
{
    /**
     * Act - do whatever the restart wants to do. This method is called whenever
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
            Greenfoot.setWorld(new lvl1());
            win.bgingame.stop();
            gameOver2.bgingame.stop();
            lvl1.bgingame.stop();
            lvl2.bgingame.stop();
            lvl3.bgingame.stop();
        }
    }
    public restart(){
        getImage().scale(getImage().getWidth()/4, getImage().getHeight()/4);
    }
}
