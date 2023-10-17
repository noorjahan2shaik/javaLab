import java.util.Random;
import java.util.*;
public class TvChannel{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int channel = rand.nextInt(40);
        int volume = rand.nextInt(7);
        Tv tv = new Tv(channel,volume,true);
        tv.turnOn();
        System.out.println("enter the channel no to set: ");
        int ch = sc.nextInt();
        tv.setChannel(ch);
        System.out.println("enter the volume no to set: ");
        int vl = sc.nextInt();
        tv.setVolume(vl);
        System.out.println("channel up");
        tv.setChannelUp();
        tv.setChannelUp();
        System.out.println("channel down");
        tv.setChannelDown();
        System.out.println("volume up");
        tv.setVolumeUp();
        tv.setVolumeUp();
        tv.setVolumeUp();
        System.out.println("volume down");
        tv.setVolumeDown();
        tv.presentState();
        tv.turnOff();
        
    }
}
class Tv{
    static int channel;
    static int volume;
    static boolean tvState;
    Tv(int x,int y,boolean z)
    {
        this.channel = x;
        this.volume = y;
        this.tvState = z;
    }
    void turnOn()
    {
        if(tvState)
        {
            System.out.println("tv is already on and the channel " + channel + " volume " + volume);
        }
        else
        {
            this.tvState = true;
            System.out.println("tv is turned on");
        }
    }
  
    void setChannel(int ch)
    {
        this.channel = ch;
    }
    void setVolume(int vl)
    {
        this.volume = vl;
    }
    void setChannelUp()
    {
        if(channel < 40)
        {
            this.channel++;
        }
    }
    void setChannelDown()
    {
        if(channel > 1)
        {
            this.channel--;
        }
        
    }
    void setVolumeUp()
    {
        if(volume < 7)
        {
            this.volume++;
        }
    }
    void setVolumeDown()
    {
        if(volume > 1)
        {
            this.volume--;
        }
    }
    
    void presentState()
    {
        System.out.println("tv is " + tvState + " channel is" + channel + " volume is" + volume);
    }
    void turnOff()
    {
        if(!tvState)
        {
            System.out.println("tv is already off");
        }
        else
        {
            this.tvState = false;
            System.out.println("tv is turned off");
        }
    }
    
} 
