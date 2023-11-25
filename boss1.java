import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class boss1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class boss1 extends Actor
{
    /**
     * Act - do whatever the boss1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int delay = 0;
    int x = 2;
    int nyawa = 10;
    public void act()
    {
        delay ++;
      
        setLocation(getX(), getY()+x);
        getWorld().showText("Nyawa Boss:" +nyawa, getWorld().getWidth()/2, 10);
        if(getY()>350 || getY()<100){
            x=-x;
        }
        
        if(isTouching(tembak.class)){
            removeTouching(tembak.class);
            nyawa-=1;
        }
     
        if(nyawa == 0){
            lvl2.score.add(5);
            lvl2.nyawa.add(1);
            getWorld().addObject(new ledakan2(), getX(), getY());
            getWorld().showText("", getWorld().getWidth()/2, 10);
            getWorld().removeObject(this);
        }
    
        if(delay == 50){

            getWorld().addObject(new tembakMusuh(), getX()+5,getY()-40 ); 
            getWorld().addObject(new tembakMusuh(), getX()+5,getY()+40); 
            delay =0;
        }
    }
}
