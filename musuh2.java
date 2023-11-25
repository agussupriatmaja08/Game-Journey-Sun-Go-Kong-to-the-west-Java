import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class musuh2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class musuh2 extends Actor
{
    /**
     * Act - do whatever the musuh2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int delay=0;

    public void act()
    {
        setLocation(getX()-1, getY());
        delay++;
       
        if(delay == 100){
            getWorld().addObject(new tembakMusuh(), getX()+5,getY() );  
            delay =0;

            if(isAtEdge()){
                
                setLocation(getWorld().getWidth(), Greenfoot.getRandomNumber(getWorld().getHeight()-250));
            }
            if(isTouching(tembak.class)){
                removeTouching(tembak.class);
                getWorld().addObject(new musuh2(), getWorld().getWidth(), Greenfoot.getRandomNumber(getWorld().getHeight()-250));
                lvl2.score.add(1);
                lvl3.score.add(1);
                getWorld().addObject(new ledakan(), getX(), getY());
                getWorld().removeObject(this);
            }
        
        }
        

    }
}
