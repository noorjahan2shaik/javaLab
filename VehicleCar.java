public class VehicleCar{
    public static void main(String args[])
    {
        car ford = new car("tata",23.5,40,"red");
        car toyota = new car("tata",32.5,23.65,"blue");
        car volkswagon = new car("tata",13.5,53.65,"black");
    }
}
class car{
    static String company;
    static double mileage;
    static double speed;
    static String color;
    car (String a,double b,double c,String d)
    {
        this.company = a;
        this.mileage = b;
        this.speed = c;
        this.color = d;
    } 
    
}
