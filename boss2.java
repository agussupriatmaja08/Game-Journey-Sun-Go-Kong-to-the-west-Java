import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class boss2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class boss2 extends Actor
{
    /**
     * Act - do whatever the boss2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int x =2;
    int delay = 0;
    int nyawa = 10;
    public void act()
    {
        

        setLocation(getX(), getY()+x);
        getWorld().showText("Nyawa Boss 1: " +nyawa, getWorld().getWidth()/2, 40);

        if(getY()>490 || getY()<10){
            x=-x;
        }
        
        delay ++;
        if(delay == 50){
            getWorld().addObject(new tembakBoss(), getX()+5,getY() ); 
           
            delay =0;
        }
         if(isTouching(tembak.class)){
            removeTouching(tembak.class);
            nyawa-=1;
        }
        if(nyawa == 0){
            lvl3.score.add(15);
            lvl3.nyawa.add(1);
            getWorld().addObject(new ledakan2(), getX(), getY());
            getWorld().showText("", getWorld().getWidth()/2, 40);
            getWorld().removeObject(this);
        }

    
    }
}
