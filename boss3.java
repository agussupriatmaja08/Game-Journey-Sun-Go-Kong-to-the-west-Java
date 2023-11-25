import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class boss3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class boss3 extends Actor
{
    /**
     * Act - do whatever the boss3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int x =2;
    int delay = 0;
    int nyawa = 15;
    public void act()
    {
        
        setLocation(getX(), getY()+x);
        getWorld().showText("Nyawa Boss 2: " +nyawa, getWorld().getWidth()/2, 10);
        if(getY()>490 || getY()<50){
            x=-x;
        }
        
        delay ++;
        if(delay == 50){
            getWorld().addObject(new tembakBoss(), getX()+5,getY()-50 ); 
            getWorld().addObject(new tembakBoss(), getX()+5,getY()+50 ); 

            delay =0;
        }
        if(isTouching(tembak.class)){
            removeTouching(tembak.class);
            nyawa-=1;
        }
        if(nyawa == 0){
            lvl3.score.add(30);
            lvl3.nyawa.add(1);
            getWorld().addObject(new ledakan2(), getX(), getY());
            getWorld().showText("", getWorld().getWidth()/2, 10);
            getWorld().removeObject(this);
        }

        
    }
}
