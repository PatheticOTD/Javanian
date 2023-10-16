public class Persona {
    private String name;
    private int food;

    Persona(int food, String name){
        this.food = food;
        this.name = name;
    }

    public StringBuilder feed(Cat cat){
        StringBuilder ans = new StringBuilder();

        if (cat.getHunger() == true & this.food >= cat.getFn()){
            cat.setHunger(false);
            this.food = this.food - cat.getFn();

            ans.append(this.name).append(" fed ").append(cat.getName()).append("\n");
            System.out.println(ans);


        }
        else if (cat.getHunger() == false){
            ans.append(cat.getName()).append(" is not hungry").append("\n");
            System.out.println(ans);
        }
        else if (this.food < cat.getFn()){
            ans.append(this.name).append(" does not have enough food for ").append(cat.getName()).append("\n");

        }
        return ans;
    }
    public int getFood(){
        return food;
    }
    public String addfood(int i){
        this.food += i;
        String ans = this.name +"got food + "+ i;
        System.out.println(this.name +"got food + "+ i);
        return ans
    }
    
}
