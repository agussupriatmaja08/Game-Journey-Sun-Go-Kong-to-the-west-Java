import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class helpp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class helpp extends tombol
{
    public static GreenfootSound bgingame = new GreenfootSound ("bg0.mp3");
    /**
     * Act - do whatever the helpp wants to do. This method is called whenever
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
            Greenfoot.setWorld(new help());
            menu.myMusic.stop();
            bgingame.setVolume(80);
            bgingame.playLoop();
        }
    }

    public helpp(){
        getImage().scale(getImage().getWidth()/3, getImage().getHeight()/3);
    }
}
