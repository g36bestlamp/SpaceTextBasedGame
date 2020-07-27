
import javax.swing.*;
import java.util.Scanner;
/**
 * Write a description of class GameTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GameMain
{   
   
   
   public static void main() 
   {
       Icon image = new ImageIcon("fab219d8297a470048b930aab06e999f.jpg"); 
       Icon image2 = new ImageIcon("Onziema System.PNG"); 
       Icon image3 = new ImageIcon("Onziema System Scale.PNG"); 
       Icon image4 = new ImageIcon("Rono.jpg"); 
       JOptionPane.showMessageDialog(null, "SPEX - A Space Exploration Game", 
          "Spex", JOptionPane.PLAIN_MESSAGE, image);
        
         System.out.println("Welcome to SPEX, a space exploration game");
         System.out.println("The game lets players make choices as the storyline progresses. The game offers two choices at a time, and in order to choose one, you just need to type in “A” or “B” in the input at the bottom of the display window. Have fun!");
         System.out.println("");
         System.out.println("");
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
         wait(200);
         Setup.printSlow("Red Diamond Exploration Corps",60);
         Setup.printSlow("Juliate 2 Mission Report",60);
         Setup.printSlow("Status: Missing; Last Contact November 20, 2119",60);
         Setup.printSlow("Mission: Retrieve Juliate 1: Index 1 and any remaining data.",60);
         Setup.printSlow("Destination: Onziema-7",60);
         Setup.printSlow("Commence date: October 19, 2119",60);
         Setup.printSlow("Sponsor: Ugandan Ministry of Space Expedition",60);
         System.out.println("===============================================");
         Setup.printSlow("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■",6);
         Setup.printSlow("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■",6);
         Setup.printSlow("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■",6);
         Setup.printSlow("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■",6);
         Setup.printSlow("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■",6);
         Setup.printSlow("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■",6);
         Setup.printSlow("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■",6);
         Setup.printSlow("(Redacted on request of Ugandan Ministry of Public Relation)",30);
         Setup.printSlow("Index 1: 17-ton Stargazer Type mission probe. Designed to record gravitational fields, star luminosity, and chemical composition.",30);
         Setup.printSlow("Index 2*:■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■ ",30);
         Setup.printSlow("* Use upon unplanned termination",30);
         Setup.printSlow("Index 3:■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■",30);
         Setup.printSlow("(Redacted on request of Ugandan Ministry of Technology) ",6);
         System.out.println("===============================================");
         System.out.println("End Mission Report");
         wait(3000);
         System.out.print('\u000C'); 
         System.out.print("David Kato: ");
         wait(500);
         Setup.printSlow("Your assignment is to find Juliate-2 and rescue any surviving crew members. Any questions regarding your assignment?",30);
         while(David_Kato.FirstChoice()){
          David_Kato.FirstChoice();
         }
         System.out.print("David Kato: ");
         wait(500);
         Setup.printSlow("Great. You can head toward stern hangar 3.",30);
         wait(3000);
         System.out.print('\u000C');
         Setup.printSlow("Location: Hangar 3 onboard UPD Rono (3,780,000-ton Gaiter Class Lightshot Cruiser)",15);
         JOptionPane.showMessageDialog(null, "UPD Rono", 
          "UPD Rono", JOptionPane.PLAIN_MESSAGE, image4);
         J_Martin.Hangar();
         wait(3000);
         System.out.print('\u000C');
         Setup.printSlow("Location: Forward Lightshot",15);
         while(J_Martin.FirstChoice()){
          J_Martin.FirstChoice();
         }
         wait(3000);
         System.out.print('\u000C');
         JOptionPane.showMessageDialog(null, "Onziema Star System", 
         "Onziema Star System", JOptionPane.PLAIN_MESSAGE, image2);
         JOptionPane.showMessageDialog(null, "Onziema Star System Scale", 
         "Onziema Star System Scale", JOptionPane.PLAIN_MESSAGE, image3);
         Setup.printSlow("Location: Onziema Star System, retrograde orbit around Onziema-7",15);
         NavigationSystem.First();
         System.out.print('\u000C');
         wait(5000);
         NavigationSystem.bios();
         Setup.printSlow("Location: Onziema Star System, Surface of Onziema-7",30);
         Setup.printSlow("Distance to Location: 9km",30);
         Setup.printSlow("(As you look around, you immediately notice the rather monochrome color of the surrounding “plants”. The plants are unusually geometric)",30);
         System.out.println("(inspect plant)(inspect crash)(walk)");
         while(PlanetSurface.FirstSite()){
          PlanetSurface.FirstSite();
         }
         Setup.printSlow("Location: Onziema Star System, Surface of Onziema-7",30);
         Setup.printSlow("Distance to Location: 7km",30);
         Setup.printSlow("Walking toward the radio signal, entertained by the constant pinging of the GPS, you walk into a clearing with a bright yellow river flowing in a rather interesting pattern. \n Perfectly resembling a square wave, it seems to be steaming hot. As you look toward the right, you can see that it is going into a cave of sorts.",30);
         PlanetSurface.SecondSite();
         System.out.print('\u000C');
         Setup.printSlow("Location: Onziema Star System, Underground Cave of Onziema-7",15);
         Setup.printSlow("Distance to Location: null",15);
         Setup.printSlow("Walking through the cave, you notice the rather flat surfaces of the cave, looking more like tubing. \nIf you posted this on r/oddlysatisfying you would get at least 5k upvotes. \nAs you get deeper, the “cave” walls starts steaming.",30);
         while(Cave.FirstSite()){
         Cave.FirstSite();
         }
         Cave.Hand();
         System.out.println("===============================================");
         Cave.SecondSite();
         System.out.println("===============================================");
         Cave.ThirdSite();
         System.out.println("===============================================");
         Setup.printSlow("You reach the end of the cave. A small hub with a gathering of pallets and tents.",30);
         wait(500);
         Setup.printSlow("You see five people in a circle, each with a blow to their head. “Suicide.” You conclude. \n“Crew of Juliate 2.” Looking around, though, something spectacular comes into your notice: a computer.\nThe moment you turn it on, a message appears: Beware!",30);
         wait(500);
         Setup.printSlow("The last action done on this machine was the editing of a document. The document seems to be a diary for the crew members of Juliate 2. \nThe words were at first calm, then happy, then depressed, then delusional. In fact, it is hard to find a single coherent sentence in the last 20 entries. \nDespite the confusion, however, there is one spine-chilling message to you--- \nOnziema - 7 is a weapon, an automatic weapon seeking carbon-based lifeforms to obliterate. But it seems that its creators deactivated it a long time ago, so long that it orbits around a sun and totally behaves like a natural planet.",30); 
         wait(500);
         Setup.printSlow("“That is all to my mission, time to report back to Earth.” Just as you depart for an exit, a sudden shock struck the cave, and a terrifying rapture is on the walls. \nYou tiptoe toward the exit, but accidentally fell to the ground and",30);
         wait(200);
         System.out.println("BOOM!");
         Setup.printSlow("the whole cave disintegrated into a",30);
         Setup.printSlow("...",300);
         Setup.printSlow("room. A room illuminated by an exquisite 3D map, and a control panel of unknown words. As you inspect the room, lights on the control panel turned on one by one, until a green light suddenly lit up. ",30);
         wait(300);
         Setup.printSlow("Crrrrrrk, a shockwave knocks you onto the ground. “Not again.” You wait for 2 minutes, nothing happens, then, abruptly, a horrible idea dawns on you. \nYou rush out the ruins of the cave immediately, just to see whole mountains and rivers crash into pieces, and an ugly surface of metal appear deep under. \n“Ah, s#$%, here we go.”",30);
         Setup.printSlow("HOOOOOOOOOOOmmmnnnnnn",60);
         Setup.printSlow(" The ground shakes violently, and you rush toward one of the displays on the panel. \nYou see a button with a label of the alien language with some words you can understand. You decide whether to press it or not.",30);
         Cave.FourthSite();
         Setup.printSlow("Tipped off by the two words you know, you decide to press the button. You’re met with a large red circle flashing on every display around you.",30);
         wait(700);
         Setup.printSlow("The ground starts to tremble. Earthquake?",30);
         wait(700);
         Setup.printSlow("No, the entire planet is shaking. As you try to grab onto a solid object, your radio comes to life.",30);
         wait(700);
         Setup.printSlow("“This is the UPD Rono. Hailing all frequencies. This is the UPD Rono. Hailing all frequencies.”",60);
         wait(700);
         Setup.printSlow("You fumble for your radio as the ground continues to shake.",30);
         wait(700);
         Setup.printSlow("“This is Juliet 3, who am I speaking to?”",60);
         wait(700);
         Setup.printSlow("“This is David Kato, what is happening here? We jumped here as we detected a major surge in energy coming from here.”",60);
         wait(700);
         Setup.printSlow("“It’s extremely unstable here. Could I get visuals of what’s happening?”",60);
         wait(1000);
         Setup.printSlow("“It looks like the planet is",60);
         Setup.printSlow("...",400);
         Setup.printSlow("Opening up?",60);
         Setup.printSlow("...",300);
         wait(700);
         Setup.printSlow("“By the name of god, it’s an opening to the core! It’s building up a mass of black energy. What’s happening here?”",60);
         Setup.printSlow("Bridge Officer: Sir, the planet is aimed towards the home solar system! This is targeting our home planet! But I have no idea if this will hit it, or less even hurt it.”",60);
         wait(700);
         Setup.printSlow("“General Quarters! 2nd battle speed, get us within 3 mels of that opening! Load Actinium-337 Shells, open all port-side missile hatches! Fire on command.”",60);
         wait(700);
         Setup.printSlow("“Listen up, I’m not going to blow up the planet on a mere suspicion. I’ll leave the choice up to you. You better make it up soon as it looks like it will fire in a short time. Make your choice.”",60);
         Cave.EndSite();
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
