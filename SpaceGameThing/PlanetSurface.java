
/**
 * Write a description of class PlanetSurface here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PlanetSurface
{
    public static boolean FirstSite(){
    String input = UserInput.getValidInput("inspect plant","inspect crash","walk","analyze plant","shoot plant","analyze crash","shoot crash");
    if(input.equals("inspect plant")){
      Setup.printSlow("It appears to be an equivalent of grass. There is a slight silverish luster to the ink black plant. Maybe it is slightly different in composition?",30);
      System.out.println("(analyze plant)(shoot plant)");
    }else if(input.equals("analyze plant")){
      Setup.printSlow("Analyzing",30);
      Setup.printSlow("...",500);
      Setup.printSlow("Analysis Complete. High abundance in silicon found. ",30);
      System.out.println("(inspect plant)(inspect crash)(walk)");
    }else if(input.equals("shoot plant")){
      Setup.printSlow("You draw your weapon and fire a laser at the “plant”. I mean, who knows if that “plant” was an alien right? Nothing is left in its place except for",30);
      Setup.printSlow("...",500);
      Setup.printSlow("Sand?",30);
      System.out.println("(inspect plant)(inspect crash)(walk)");
    }else if(input.equals("inspect crash")){
      Setup.printSlow("Not much of the ship is left except for the right engine and cockpit. There’s a strange fizzling sound coming from the engine, or what’s left of it",30);
      System.out.println("(anaylze crash)(shoot crash)");
    }else if(input.equals("analyze crash")){
      Setup.printSlow("As you peer into the engine you look for the source of the fizzing sound. While it sounds like soda, it definitely does not smell like soda. As you peel back the warning sticker of warranty, you discover the rubber engine gasket to be full of holes and slowly being eaten?",30);
      System.out.println("(inspect plant)(inspect crash)(walk)");
    }else if(input.equals("shoot crash")){
      Setup.printSlow("You shoot into the engine and it makes a neat sound",30);
      System.out.println("(inspect plant)(inspect crash)(walk)");
    }else if(input.equals("walk")){
      Setup.printSlow("You decide you seen enough and start to walk in the direction of the radio signal",30);
      System.out.println("=========================");
      return false;
    }
    return true;
   }
   public static void SecondSite(){
    System.out.println("(cave)(path)");
    String input = UserInput.getValidInput("cave","path");
    if(input.equals("cave")){
      Setup.printSlow("You decide to be unusually brave and enter the cave. You scream “ECHO” in obligatory tradition.",30);
    wait(2000);
    }else if(input.equals("path")){
      Setup.printSlow("You decide to be smart and ignore the cave. Your mission is to find the lost crew, not go spelunking. ",30);
      Path.path();
    }
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
