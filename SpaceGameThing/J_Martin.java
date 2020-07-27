
/**
 * Write a description of class J_Martin here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class J_Martin
{
    public static void Hangar(){
     System.out.print("J.Martin: ");
     wait(300);
     Setup.printSlow("So chief, you’re gonna find the old Onziema crew huh? If you do end up finding them, give them a nice slap on the head for all the trouble they caused.",30);
     wait(500);
     System.out.print("J.Martin: ");
     wait(300);
     Setup.printSlow("Anyways, let me load your ship up onto the lightshot so you can be on your way.",30);
     wait(500);
    }
    public static boolean FirstChoice(){
    System.out.print("J.Martin: ");
    wait(300);
    Setup.printSlow("Okay, you’re loaded in. Any questions before we sling you into the great big unknown?",30);
    System.out.println("(Lightshot)(Ready)");
    String input = UserInput.getValidInput("lightshot","ready");
    if(input.equals("lightshot")){
      Setup.printSlow("What is Lightshot?",30);
      wait(500);
      System.out.print("J. Martin: ");
      wait(300);
      Setup.printSlow("It’s a proprietary launching system meant to accurately deliver smaller crafts. We’re going to be using it to send you to the Onziema star system. It was designed by Elon Tusk back in 2024. ",30);
    }else if(input.equals("ready")){
    return false;
    }
    return true;
   }
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
}
