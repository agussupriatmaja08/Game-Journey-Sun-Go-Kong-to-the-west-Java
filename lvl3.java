import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lvl3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lvl3 extends play
{

    /**
     * Constructor for objects of class lvl3.
     * 
     */
    public static GreenfootSound bgingame = new GreenfootSound ("bg03.mp3");
    public static Counter score = new Counter("Score : ");
    public static Counter nyawa = new Counter("Nyawa : ");
    public lvl3()
    {
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        gunung gunung = new gunung();
        addObject(gunung,324,379);
        gunung.setLocation(323,391);
        gunung.setLocation(323,391);
        gunung.setLocation(480,401);
        removeObject(gunung);
        gunung gunung2 = new gunung();
        addObject(gunung2,326,385);
        bulan bulan = new bulan();
        addObject(bulan,590,49);
        hero hero = new hero();
        addObject(hero,66,195);
        for(int i = 0; i<=3; i++){
            addObject(new musuh(), getWidth(), Greenfoot.getRandomNumber(getHeight()-250));
        }
        for(int i = 0; i<=4; i++){
            addObject(new musuh2(), getWidth(), Greenfoot.getRandomNumber(getHeight()-250));
        }
        addObject(score,584,26);
        score.setValue(lvl2.score.getValue());

        addObject(nyawa,69,21);
        nyawa.setValue(10);
        land land = new land();
        addObject(land,450,315);

        land land2 = new land();
        addObject(land2,100,315);
    }
    int timer;
    boolean condition = true;
    int boss =0;
    public void act(){
        timer--;
        if(condition)
        {
            showText("STAGE 3",330,100);
            timer = 50;
            condition = false;
        }

        if(timer == 1)
        {
            showText("",330,100);
        }

        if(score.getValue() >= 200){
            Greenfoot.setWorld(new win());
        }
        if(lvl3.nyawa.getValue() <= 0){
            Greenfoot.setWorld(new gameOver2());

        }
        boss++;

        if(boss == 400){
            addObject(new boss2(), getWidth()-20, getHeight()/2);
        }
        if(boss == 1000){
            addObject(new boss3(), getWidth()-20, getHeight()/2);
        }

        lvl2.bgingame.stop();
        bgingame.setVolume(80);
        bgingame.playLoop();
    }
}
