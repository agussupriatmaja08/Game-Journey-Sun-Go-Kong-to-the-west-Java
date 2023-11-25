import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lvl2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lvl2 extends play
{

    /**
     * Constructor for objects of class lvl2.
     * 
     */
    public static Counter score = new Counter("Score : ");
    public static Counter nyawa = new Counter("Nyawa : ");
    public lvl2()
    {
        prepare();
    }

    public static GreenfootSound bgingame = new GreenfootSound ("bg01.mp3");
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        gunung gunung = new gunung();
        addObject(gunung,350,382);
        for(int i = 0; i<=2; i++){
            addObject(new musuh(), getWidth(), Greenfoot.getRandomNumber(getHeight()-250));
        }
        for(int i = 0; i<=3; i++){
            addObject(new musuh2(), getWidth(), Greenfoot.getRandomNumber(getHeight()-250));
        }
        hero hero = new hero();
        addObject(hero,46,199);

        gunung.setLocation(640,485);
        
   
        gunung.setLocation(325,395);
        sun sun = new sun();
        addObject(sun,564,46);
        addObject(score,584,26);
        score.setValue(lvl1.score.getValue());

        addObject(nyawa,69,21);
        nyawa.setValue(10);
        awan1 awan1 = new awan1();
        addObject(awan1,484,125);
        awan1 awan12 = new awan1();
        addObject(awan12,134,93);
        awan1 awan13 = new awan1();
        addObject(awan13,312,160);
        hero.setLocation(60,215);

        removeObject(hero);
        hero hero2 = new hero();
        addObject(hero2,114,190);
        land land = new land();
        addObject(land,450,315);

        land land2 = new land();
        addObject(land2,100,315);

    }
    int timer;
    boolean condition = true;
    int boss = 0;
    public void act(){
        timer--;
        if(condition)
        {
            showText("STAGE 2",330,100);
            timer = 50;
            condition = false;
        }

        if(timer == 1)
        {
            showText("",330,100);
        }

        if(score.getValue() >= 100){
            showText("KAMU MENANG!", getWidth()/2, getHeight()/2);
            Greenfoot.delay(100);
            showText("NEXT STAGE 3",getWidth()/2, getHeight()/2);
            addObject(new next2(), 610, 450);   
        }
        if(lvl2.nyawa.getValue() <= 0){
            Greenfoot.setWorld(new gameOver2());
            addObject(new restart(), getWidth()/2, getHeight()-100);

        }
        boss ++;
        if(boss == 500){
            addObject(new boss1(), getWidth(), getHeight()/2);
        }

        lvl1.bgingame.stop();
        bgingame.setVolume(80);
        bgingame.playLoop();
    }
}
