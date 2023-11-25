import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hero extends Actor
{
    /**
     * Act - do whatever the hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int delayTembak =0;
    int power=1;
    int dPower =0;

    public void act()
    {
        if(Greenfoot.isKeyDown("up")){
            setLocation(getX(), getY()-3);    
        }
        if(Greenfoot.isKeyDown("down")){
            setLocation(getX(), getY()+3);    
        }
        if(Greenfoot.isKeyDown("left")){
            setLocation(getX()-3, getY());    
        }
        if(Greenfoot.isKeyDown("right")){
            setLocation(getX()+3, getY());    
        }
        if(isTouching(power.class)){
            power =2;
            lvl1.nyawa.add(2);
            lvl2.nyawa.add(2);
            lvl3.nyawa.add(2);
            removeTouching(power.class);
        }
        if(isTouching(tembakBoss.class)){
            removeTouching(tembakBoss.class);
            lvl2.nyawa.add(-2);
            lvl3.nyawa.add(-2);

        }
        if(isTouching(musuh.class)){
            removeTouching(musuh.class);
            lvl1.nyawa.add(-1);
            lvl2.nyawa.add(-1);
            lvl3.nyawa.add(-1);
            getWorld().addObject(new musuh(),getWorld().getWidth(), Greenfoot.getRandomNumber(getWorld().getHeight()-250) );
            
        }
         delayTembak++;
        if(delayTembak >= 25){
            if(Greenfoot.isKeyDown("space")){
                if(power == 1 ){
                    power1();  
                }
                if(power == 2){
                    power2();
                }
            }
            delayTembak =0;

        }
        dPower++;
        if(dPower == 400){
            getWorld().addObject(new power(), getWorld().getWidth()/2, 0);
        }
        if(isTouching(tembakMusuh.class)){
            removeTouching(tembakMusuh.class);
            lvl2.nyawa.add(-1);
            lvl3.nyawa.add(-1);

        }
    }

    public void power1(){
        getWorld().addObject(new tembak(), getX(),getY() );
        Greenfoot.playSound("hit.mp3");
    }

    public  void power2(){
        getWorld().addObject(new tembak(), getX(),getY() ); 
        getWorld().addObject(new tembak(), getX(),getY()-40 ); 
        getWorld().addObject(new tembak(), getX(),getY()+40 );
        Greenfoot.playSound("hit.mp3");
    }
}
