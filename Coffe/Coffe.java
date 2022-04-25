package SecondTermWeek3.Coffe;

public class Coffe {
    double weight;
    double unit_price;
    public Coffe(double weight,double unit_price){
        this.weight=weight;
        this.unit_price=unit_price;

    }
    public void calculate_price(){
         double total =weight*unit_price;
        System.out.println(" Total price is :"+ total);
    }
    public String getName(String name){
        return name;
    }
}
