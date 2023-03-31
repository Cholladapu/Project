
import java.util.ArrayList;

public class CoffeeMachine {
    enum Coffee { ESPRESSO, LATTE, CAPPUCCINO }
    static final int ESPRESSO_WATER_ML_PER_CUP = 250;
    static final int ESPRESSO_MILK_ML_PER_CUP = 0;
    static final int ESPRESSO_BEANS_G_PER_CUP = 16;
    static final int ESPRESSO_PRICE = 4;
    static final int LATTE_WATER_ML_PER_CUP = 350;
    static final int LATTE_MILK_ML_PER_CUP = 75;
    static final int LATTE_BEANS_G_PER_CUP = 20;
    static final int LATTE_PRICE = 7;
    static final int CAPPUCCINO_WATER_ML_PER_CUP = 200;
    static final int CAPPUCCINO_MILK_ML_PER_CUP = 100;
    static final int CAPPUCCINO_BEANS_G_PER_CUP = 12;
    static final int CAPPUCCINO_PRICE = 6;
    private int water;
    private int milk;
    private int beans;
    private int cups;
    private int cash;
    private String check;
    StringBuilder sb;
    String a ;
    
    
    CoffeeMachine(int water, int milk, int beans, int cups, int cash) {
        this.water = water;
        this.milk = milk;
        this.beans = beans;
        this.cups = cups;
        this.cash = cash;
    }

    public ArrayList<Integer> printState() {
        ArrayList<Integer> thing = new ArrayList<Integer>();
        thing.add(water);
        thing.add(milk);
        thing.add(beans);
        thing.add(cups);
        thing.add(cash);
        return thing;

    }

    boolean canMakeCoffee(int waterNeeded, int milkNeeded, int beansNeeded) {
        return water >= waterNeeded &&
                milk >= milkNeeded &&
                beans >= beansNeeded &&
                cups >= 1;
    }
    public String makeCoffee(int waterNeed, int milkNeed, int beansNeed, int price) {
        if (canMakeCoffee(waterNeed, milkNeed, beansNeed)) {
            sb = new StringBuilder();
            a = "Thank you for Buy Tao LOi see ya!! \n";

            water -= waterNeed;
            milk -= milkNeed;
            beans -= beansNeed;
            cups--;
            cash += price;
        } else {
             
            if (water < waterNeed) {
                sb.append("water");
                a = "Sorry! Cannot make Tao LOi Drink(not enough coffee water\n)";
            } else if (milk < milkNeed) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append("milk");
               a = "Sorry! Cannot make Tao LOi Drink(not enough coffee milk\n)";
            } else if (beans < beansNeed) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append("coffee beans");
                a = "Sorry! Cannot make Tao LOi Drink(not enough coffee beans\n)";
            } else if (cups == 0) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append("disposable cups");
                a = "Sorry! Cannot make Tao LOi Drink(not enough cups\n)";
            }
            
            
        }
        return check;
    }
    public String checkCoffe(String a ){
        return a;

    }
    public void checkCoffereal(){

    }

    public void makeEspresso() {
        makeCoffee(ESPRESSO_WATER_ML_PER_CUP,
                ESPRESSO_MILK_ML_PER_CUP,
                ESPRESSO_BEANS_G_PER_CUP,
                ESPRESSO_PRICE);
    }

    public void makeLatte() {
        makeCoffee(LATTE_WATER_ML_PER_CUP,
                LATTE_MILK_ML_PER_CUP,
                LATTE_BEANS_G_PER_CUP,
                LATTE_PRICE);
    }

    public void makeCappuccino() {
        makeCoffee(CAPPUCCINO_WATER_ML_PER_CUP,
                CAPPUCCINO_MILK_ML_PER_CUP,
                CAPPUCCINO_BEANS_G_PER_CUP,
                CAPPUCCINO_PRICE);
    }

    public void doBuyCoffee(String option) {
       
        if (option.equals("back")) {
        } else {
            int coffeeType = Integer.parseInt(option);
            Coffee coffee = Coffee.values()[coffeeType - 1];

            switch (coffee) {
                case ESPRESSO -> makeEspresso();
                case LATTE -> makeLatte();
                case CAPPUCCINO -> makeCappuccino();
                default -> {
                }
                // do nothing
            }
        }
    }

    public void doFilling(int addedWater,int addedMilk,int addedBeans,int addedCups ) 
    {
        
        water += addedWater;
        milk += addedMilk;
        beans += addedBeans;
        cups += addedCups;
    }
 
    
    public int getRealmoney() {
        int vrealcash = cash;
        cash=0;
        return vrealcash;
    }

}