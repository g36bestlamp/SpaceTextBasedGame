import javax.swing.*;
/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Setup
{
    public Setup()
    {
    }
    // instance variables - replace the example below with your own
    private static void wait(int milliseconds)
    {
        try {
            Thread.sleep(milliseconds);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public static void printSlow(String input,int period)
    {
        for(int i = 0; i < input.length(); i++)
        {
            System.out.print(input.substring(i,(i+1)));
            wait(period);
        }
        System.out.println("");
    }
    
    
    
    
    
        
   
}
