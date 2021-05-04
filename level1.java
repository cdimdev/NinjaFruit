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
        Barrel barrel = new Barrel();
        addObject(barrel,40,485);
        Barrel barrel2 = new Barrel();
        addObject(barrel2,68,364);
        Barrel barrel3 = new Barrel();
        addObject(barrel3,52,180);
        Barrel barrel4 = new Barrel();
        addObject(barrel4,136,69);
        Barrel barrel5 = new Barrel();
        addObject(barrel5,140,227);
        Barrel barrel6 = new Barrel();
        addObject(barrel6,44,260);
        Barrel barrel7 = new Barrel();
        addObject(barrel7,322,252);
        Barrel barrel8 = new Barrel();
        addObject(barrel8,210,328);
        Barrel barrel9 = new Barrel();
        addObject(barrel9,165,289);
        Barrel barrel10 = new Barrel();
        addObject(barrel10,189,463);
        Barrel barrel11 = new Barrel();
        addObject(barrel11,126,403);
        Barrel barrel12 = new Barrel();
        addObject(barrel12,386,455);
        Barrel barrel13 = new Barrel();
        addObject(barrel13,295,366);
        Barrel barrel14 = new Barrel();
        addObject(barrel14,290,443);
        Barrel barrel15 = new Barrel();
        addObject(barrel15,503,296);
        Barrel barrel16 = new Barrel();
        addObject(barrel16,211,147);
        Barrel barrel17 = new Barrel();
        addObject(barrel17,333,48);
        Barrel barrel18 = new Barrel();
        addObject(barrel18,195,57);
        Barrel barrel19 = new Barrel();
        addObject(barrel19,377,152);
        Barrel barrel20 = new Barrel();
        addObject(barrel20,299,134);
        Barrel barrel21 = new Barrel();
        addObject(barrel21,429,302);
        Barrel barrel22 = new Barrel();
        addObject(barrel22,555,524);
        Barrel barrel23 = new Barrel();
        addObject(barrel23,456,363);
        Barrel barrel24 = new Barrel();
        addObject(barrel24,456,543);
        Barrel barrel25 = new Barrel();
        addObject(barrel25,208,556);
        Barrel barrel26 = new Barrel();
        addObject(barrel26,491,184);
        Barrel barrel27 = new Barrel();
        addObject(barrel27,471,85);
        Barrel barrel28 = new Barrel();
        addObject(barrel28,416,72);
        Barrel barrel29 = new Barrel();
        addObject(barrel29,230,229);
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
        barrel27.setLocation(449,134);
        ExtraLife extraLife = new ExtraLife();
        addObject(extraLife,105,508);
        ExtraLife extraLife2 = new ExtraLife();
        addObject(extraLife2,262,64);
    }
}
