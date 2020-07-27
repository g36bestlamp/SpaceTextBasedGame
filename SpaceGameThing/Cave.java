
/**
 * Write a description of class Cave here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cave
{
    public static boolean FirstSite(){
    System.out.println("(touch wall),(touch fluid),(walk)");
    String input = UserInput.getValidInput("touch wall", "touch fluid", "walk");
    if(input.equals("touch wall")){
      Setup.printSlow("You reach out to the wall and gently lay your hand on the surface. As your hands touch the surface, it makes a light cling. The surface is rather warm, similar to a dog.",30);
    }else if(input.equals("touch fluid")){
      Setup.printSlow("You dip your hand into the yellow liquid. It’s cold, similar to snow.",30);
    }else if(input.equals("walk")){
      Setup.printSlow("You decide to walk further into the cave. Your hands feel unusually breezy.",30);
      return false;
    }
    return true;
   }
   public static void Hand(){
    System.out.println("(analyze hands)");
    String input = UserInput.getValidInput("analyze hands");
    if(input.equals("analyze hands")){
      Setup.printSlow("You raise your hands to discover that your hands are partly coated in a metal substance. \nYou try to dust them off, but you can’t seem to get it off. It’s almost if it’s embedded on your skin. ",30);
    }
 }
 public static void SecondSite(){
    Setup.printSlow("As you walk further into the cave, you discover a shiny pile of objects.\nAs you approach it, you realize that those objects closely resemble parts of an artificially crafted machine, only that they have been given a silvery theme.",30);
    System.out.println("(inspect)(ignore)");
    String input = UserInput.getValidInput("inspect","ignore");
    if(input.equals("inspect")){
      Setup.printSlow("Quite surprisingly, these are parts of a communication device, possibly from the ship from Juliate 2, only that they have been corroded by unknown substances, and turn out to be rich in silicon.\nHowever, you do not know if the device was originally made with lots of silicon. ",30);
    }else if(input.equals("ignore")){
      Setup.printSlow("You decide to ignore the pile and keep walking.",30);
    }
   }
  public static void ThirdSite(){
    Setup.printSlow("As you walk furtherer into the cave, you discover a metallic object slumped on the wall. As you approach it, you realize that it resembles a human corpse, just disturbingly metallic.\nIt reminds you of the “silver surfer” you saw in an ancient “marvel” comic. ",30);
    System.out.println("(inspect)(ignore)");
    String input = UserInput.getValidInput("inspect","ignore");
    if(input.equals("inspect")){
      Setup.printSlow("On a closer inspection, it looks like a statue of a man who committed suicide. A pistol at its side and a hole in its head. It is disturbingly realistic. ",30);
    }else if(input.equals("ignore")){
      Setup.printSlow("You decide to ignore it and keep walking.",30);
    }
   }
    public static void FourthSite(){
    System.out.println("kɨ hæt wɔɟ beˈflap send ləm kɨ earth po ˈkemu ˈlədo bubˈtə fɔ");
    System.out.println("(press)");
    String input = UserInput.getValidInput("press");
}
public static void EndSite(){
    Setup.printSlow("There's only enough time to either start the attack or transmit the universal map you discovered.",30);
    System.out.println("(attack)(transmit)");
    String input = UserInput.getValidInput("attack","transmit");
    if(input.equals("attack")){
      Setup.printSlow("What great fireworks! No one, no one alive, at least, have seen the kind of fireworks that you were supposed to be seeing. But you cannot.\nYour eyes, your legs, your fingernails, have all solidified into parts of a silver statue.\nYour last sight was yourself falling into the crest of Onziema - 7, getting swallowed by angry, merciless lava. ",60);
      wait(1000);
      System.out.print('\u000C'); 
      wait(5000);
      Setup.printSlow("Like getting water thrown on you, you're flooded by a cold sense.",60);
      wait(900);
      Setup.printSlow("As your eyes adjust to the bright light, you hear a familiar voice.",60);
      wait(500);
      Setup.printSlow("David Kato: Welcome back to the Living World. It's been 30 years, but are you ready for another mission?",120);
      wait(5000);
      System.out.print('\u000C'); 
      Setup.printSlow("Story written and coded by Alex Ha and Nick Tu",60);
      wait(4000);
      System.exit(1);
    }else if(input.equals("transmit")){
      Setup.printSlow("You successfully transmit the map of the universe, the most valuable object known to man.",60);
      wait(900);
      Setup.printSlow("As the upload completes, a large boom is heard all throughout the planet",60);
      wait(900);
      Setup.printSlow("Was the map worth the sacrifice of earth?",120);
      wait(2000);
      System.out.print('\u000C');
      wait(5000);
      Setup.printSlow("30 years later",80);
      Setup.printSlow("...",300);
      Setup.printSlow("A reputed professor walks into a classroom full of college freshmen. He is one of the most respected people of the New Frontier, which is home to the only known existing humans.",60);
      wait(500);
      Setup.printSlow("“The purpose of a man’s existence is to sacrifice for the greater good. I expect you young people to understand that.” His voice is stern and somewhat metallic.",60);
      wait(300);
      Setup.printSlow(" “Professor?” ",60);
      wait(300);
      Setup.printSlow("A tall boy in the front raises his hand,",60);
      wait(300);
      Setup.printSlow("“to what degree shall we sacrifice?”",60);
      wait(300);
      Setup.printSlow(" “...Everything,",120);
      wait(1000);
      Setup.printSlow("and I have.”",120);
      wait(5000);
      System.out.print('\u000C'); 
      Setup.printSlow("Story written and coded by Alex Ha and Nick Tu",60);
      wait(4000);
      System.exit(1);
      
      
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
