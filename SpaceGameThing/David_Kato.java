
/**
 * Write a description of class David_Kato here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class David_Kato
{
    public static boolean FirstChoice(){
    System.out.println("(Name)(Redaction)(None)");
    String input = UserInput.getValidInput("name","redaction","none");
    if(input.equals("name")){
      Setup.printSlow("Why is it named Onziema?",30);
      wait(500);
      System.out.print("David Kato: ");
      Setup.printSlow("It’s named after Pepe Julian Onziema. He was a human rights activist in Uganda in 2014.",30);
    }else if(input.equals("redaction")){
      Setup.printSlow("Why is the main portion redacted?",30);
      wait(500);
      System.out.print("David Kato: ");
      Setup.printSlow("I’m afraid I can’t tell you that. But it shouldn’t be crucial to your mission.",30);
    }else if(input.equals("none")){
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
