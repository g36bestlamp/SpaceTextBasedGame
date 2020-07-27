    
    /**
     * Write a description of class Path here.
     *
     * @author (your name)
     * @version (a version number or a date)
     */
    public class Path
    {
     public static void path(){
    Setup.printSlow("You walk along the path, and eventually get to the center of the giant clearing, and there is the source of the signal, the spaceship of Juliate 2.\nYou hear muffled sounds in the crumbling structure of the ship, and wonder if you should try to approach it.",30);
    System.out.println("(approach)(Scan)");
    String input = UserInput.getValidInput("approach","scan");
    if(input.equals("approach")){
       Setup.printSlow("You cautiously walk towards the ship, but suddenly jumps back and drawing your laser gun when several grotesque silver figures emerged from the spaceship.\nThey look dangerous, and you need to act now.",30);
    }else if(input.equals("scan")){
       Setup.printSlow("You put on your scanner goggles and roughly scan the ship. The ship appears gray in front of your eyes but a couple of green dots are getting brighter and brighter -- several alien-like creatures ran out from the ship.\nThey look dangerous, and you need to act now.",30);
    }
    wait(5000);
       Setup.printSlow("You put those aliens down with your weapons, and after some thorough analysis, you found out that they are silicon-based creatures, the first found by humans.\nThen, out of curiosity and the hope of finding functioning parts of an engine, you go into the ship itself. What do you see?",30);
       System.out.println("(Notebook)(Engine)");
       String input2 = UserInput.getValidInput("notebook","engine");
    if(input2.equals("notebook")){
        Setup.printSlow("Oh, snap! The notebook indicates that the ‘aliens’ you shot were actually the crew of Juliate 2! According to the notebook, Onziema - 7 Planet has an ability to corrode everything with silicon which would slowly kill humans.\nSome crew members have died long ago while others lingered on as another form of life.\nOn an abstract map you found in the notebook, a red cross appears in a circle, and an eastward path of 10 kilometers from your location to the cross is indicated.",30);
    }else if(input2.equals("engine")){
        Setup.printSlow("Lucky you! After some sweaty work, you have put together a functioning spaceship with supplies on hand. You could now depart to find a human base or further explore the planet efficiently. ",30);
        System.out.println("(leave)(explore)");
        String input3 = UserInput.getValidInput("leave","explore");
        if(input3.equals("leave")){
          
         Setup.printSlow("You fly off to space. Just as you are getting comfortable for some deep hibernation, however, your ship’s alarms go off.\nYou see a bright flash coming from the surface of Onziema - 7, and you know nothing more.",30);
         wait(2000);
         System.out.print('\u000C'); 
         wait(4000);
         System.out.println("        /\\");
         wait(200);
         System.out.println("       /  \\");
         wait(200);
         System.out.println("      / /\\ \\");
         wait(200);
         System.out.println("     / /  \\ \\");
         wait(200);
         System.out.println("    / /    \\ \\");
         wait(200);
         System.out.println("   / / RD   \\ \\");
         wait(200);
         System.out.println("   \\ \\   EC / /");
         wait(200);
         System.out.println("    \\ \\    / / ");
         wait(200);
         System.out.println("     \\ \\  / /");
         wait(200);
         System.out.println("      \\ \\/ /");
         wait(200);
         System.out.println("       \\  /");
         wait(200);
         System.out.println("        \\/");
         wait(2000);
         Setup.printSlow("Red Diamond Exploration Corps",60);
         Setup.printSlow("Juliate 3 Mission Report",60);
         Setup.printSlow("Status: ",60);
         wait(1000);
         Setup.printSlow("Missing; Last Contact December 15, 2119",120);
         wait(5000);
         System.out.print('\u000C'); 
         Setup.printSlow("Story written and coded by Alex Ha and Nick Tu",60);
         wait(4000);
         System.exit(1);
        }else if(input3.equals("explore")){
          Setup.printSlow("You decide to fly to the cave 10km back. Maybe you'll find more answers there.",30);
        }
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
