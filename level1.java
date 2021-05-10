import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level1 extends World
{
    /**
     * Constructor for objects of class level1.
     * 
     */
    public level1(int lifesOfPlayer, int score)
    {    
        super(600, 600, 1); 
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        prepare(lifesOfPlayer, score);
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare(int lifesOfPlayer, int score)
    {
        Weird weird = new Weird(lifesOfPlayer > 0 ? lifesOfPlayer : 2, 1);
        addObject(weird,141,298);
        weird.setLocation(29,564);
        Brick Brick = new Brick();
        addObject(Brick,40,485);
        Brick Brick2 = new Brick();
        addObject(Brick2,68,364);
        Brick Brick3 = new Brick();
        addObject(Brick3,52,180);
        Brick Brick4 = new Brick();
        addObject(Brick4,136,69);
        Brick Brick5 = new Brick();
        addObject(Brick5,140,227);
        Brick Brick6 = new Brick();
        addObject(Brick6,44,260);
        Brick Brick7 = new Brick();
        addObject(Brick7,322,252);
        Brick Brick8 = new Brick();
        addObject(Brick8,210,328);
        Brick Brick9 = new Brick();
        addObject(Brick9,165,289);
        Brick Brick10 = new Brick();
        addObject(Brick10,189,463);
        Brick Brick11 = new Brick();
        addObject(Brick11,126,403);
        Brick Brick12 = new Brick();
        addObject(Brick12,386,455);
        Brick Brick13 = new Brick();
        addObject(Brick13,295,366);
        Brick Brick14 = new Brick();
        addObject(Brick14,290,443);
        Brick Brick15 = new Brick();
        addObject(Brick15,503,296);
        Brick Brick16 = new Brick();
        addObject(Brick16,211,147);
        Brick Brick17 = new Brick();
        addObject(Brick17,333,48);
        Brick Brick18 = new Brick();
        addObject(Brick18,195,57);
        Brick Brick19 = new Brick();
        addObject(Brick19,377,152);
        Brick Brick20 = new Brick();
        addObject(Brick20,299,134);
        Brick Brick21 = new Brick();
        addObject(Brick21,429,302);
        Brick Brick22 = new Brick();
        addObject(Brick22,555,524);
        Brick Brick23 = new Brick();
        addObject(Brick23,456,363);
        Brick Brick24 = new Brick();
        addObject(Brick24,456,543);
        Brick Brick25 = new Brick();
        addObject(Brick25,208,556);
        Brick Brick26 = new Brick();
        addObject(Brick26,491,184);
        Brick Brick27 = new Brick();
        addObject(Brick27,471,85);
        Brick Brick28 = new Brick();
        addObject(Brick28,416,72);
        Brick Brick29 = new Brick();
        addObject(Brick29,230,229);
        Cherry cherry = new Cherry();
        addObject(cherry,63,114);
        Cherry cherry2 = new Cherry();
        addObject(cherry2,354,204);
        Cherry cherry3 = new Cherry();
        addObject(cherry3,439,22);
        Cherry cherry4 = new Cherry();
        addObject(cherry4,160,21);
        Cherry cherry5 = new Cherry();
        addObject(cherry5,248,497);
        Cherry cherry6 = new Cherry();
        addObject(cherry6,19,354);
        Cherry cherry7 = new Cherry();
        addObject(cherry7,559,284);
        Cherry cherry8 = new Cherry();
        addObject(cherry8,319,310);
        Cherry cherry9 = new Cherry();
        addObject(cherry9,217,270);
        Cherry cherry10 = new Cherry();
        addObject(cherry10,169,163);
        Cherry cherry11 = new Cherry();
        addObject(cherry11,476,457);
        Bomb bomb = new Bomb();
        addObject(bomb,99,180);
        Bomb bomb2 = new Bomb();
        addObject(bomb2,546,125);
        Bomb bomb3 = new Bomb();
        addObject(bomb3,235,387);
        PlayerLifes playerlife = new PlayerLifes();
        addObject(playerlife,40, 585);
        PlayerTotalScore totalScore = new PlayerTotalScore(score);
        addObject(totalScore,560, 585);
        Strawberry strawberry = new Strawberry();
        addObject(strawberry,546,82);
        Bomb bomb4 = new Bomb();
        addObject(bomb4,546,38);
        bomb2.setLocation(543,135);
        bomb4.setLocation(544,23);
        bomb2.setLocation(545,140);
        weird.setLocation(27,585);
        bomb2.setLocation(543,137);
        bomb4.setLocation(550,46);
        Brick27.setLocation(449,134);
        ExtraLife extraLife = new ExtraLife();
        addObject(extraLife,105,508);
        ExtraLife extraLife2 = new ExtraLife();
        addObject(extraLife2,262,64);
    }
}
