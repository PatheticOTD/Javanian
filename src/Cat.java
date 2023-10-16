public class Cat {
    private String name;
    private boolean hungry = true;
    private int food_need;

    Cat(String name, int food_need){
        this.name = name ;
        this.food_need = food_need;

    }
    public boolean getHunger(){
        return hungry;
    }
    public void setHunger(boolean b){
        this.hungry = b;
    }
    public String getName(){
        return this.name;
    }
    public int getFn(){
        return this.food_need;
    }

}
