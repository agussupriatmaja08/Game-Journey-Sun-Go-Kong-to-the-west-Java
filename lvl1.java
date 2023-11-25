import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lvl1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lvl1 extends play
{

    /**
     * Constructor for objects of class lvl1.
     * 
     */

    public static Counter score = new Counter("Score : ");
    public static Counter nyawa = new Counter("Nyawa : ");
    public lvl1()
    {
        prepare();
    }

    public static GreenfootSound bgingame = new GreenfootSound ("intro.mp3");
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    int timer;
    boolean condition = true;
    public void act(){
        timer--;
        if(condition)
        {
            showText("STAGE 1",330,100);
            timer = 50;
            condition = false;
        }

        if(timer == 1)
        {
            showText("",330,100);
        }

        //Untuk ke level berikutnya
        if(score.getValue() == 30){
            showText("KAMU MENANG!", getWidth()/2, getHeight()/2);
            Greenfoot.delay(100);

            showText("NEXT STAGE 2",getWidth()/2, getHeight()/2);
            addObject(new next(), 610, 450); 

        }
        
        if(lvl1.nyawa.getValue() <= 0){
            Greenfoot.setWorld(new gameOver2());
            addObject(new restart(), getWidth()/2, getHeight()-100);

        }


        menu.myMusic.stop();
        bgingame.setVolume(80);
        bgingame.playLoop();
        

    }

    private void prepare()
    {
        gunung gunung = new gunung();
        addObject(gunung,323,411);

        //hero
        hero hero = new hero();
        addObject(hero,86,189);

        //musuh
        for(int i = 0; i<=3; i++){
            addObject(new musuh(), getWidth(), Greenfoot.getRandomNumber(getHeight()-250));
        }

        //scroe
        addObject(score,584,26);
        score.setValue(0);

        //nyawa
        addObject(nyawa,69,21);
        nyawa.setValue(10);

        awan1 awan1 = new awan1();
        addObject(awan1,512,107);
        awan1 awan12 = new awan1();
        addObject(awan12,242,72);
        awan1 awan13 = new awan1();
        addObject(awan13,319,261);
        awan13.setLocation(294,219);
        hero.setLocation(112,192);
        hero.setLocation(103,181);
        removeObject(hero);
        hero hero2 = new hero();
        addObject(hero2,88,190);

        land land = new land();
        addObject(land,450,315);

        land land2 = new land();
        addObject(land2,100,315);

    }
}
