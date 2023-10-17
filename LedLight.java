public class LedLight{
    public static void main(String args[])
    {
        Lamp led = new Lamp(true,"Led");
        led.turnOn();
        led.turnOff();
        
        Lamp halogen = new Lamp(false,"halogen");
        halogen.turnOn();
        halogen.turnOff();
        
        
    } 
}
class Lamp{
    static boolean isOn;
    static String lampType;
    Lamp(boolean x,String y)
    {
        this.isOn = x;
        this.lampType = y;
    }
    void turnOn()
    {
        if(isOn)
        {
            System.out.println(lampType + " is already on");
        }
        else
        {
            this.isOn = true;
            System.out.println(lampType + " is turned on");
        }
    }
    void turnOff()
    {
        if(!isOn)
        {
            System.out.println(lampType + " is already off");
        }
        else
        {
            this.isOn = true;
            System.out.println(lampType + " is turned off");
        }
    }
    
    
}
