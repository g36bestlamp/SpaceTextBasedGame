import javax.swing.*;
/**
 * Write a description of class NavigationSystem here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NavigationSystem
{
   public static void First(){
   System.out.print("Navigation System: ");
   Setup.printSlow("Detection of radio signal. Translating into image now:",15);
   Icon image = new ImageIcon("WhiteNoise.PNG"); 
   JOptionPane.showMessageDialog(null, "Radio Signal", 
   "Radio Signal", JOptionPane.PLAIN_MESSAGE, image);
   System.out.print("Navigation System: ");
   Setup.printSlow("Refining Input",15);
   Setup.printSlow("...",500);
   System.out.print("Navigation System: ");
   Setup.printSlow("Extracting Data",15);
   Setup.printSlow("...",500);
   System.out.print("Navigation System: ");
   Setup.printSlow("Data Extraction Failed",15);
   wait(1000);
   System.out.print("Navigation System: ");
   Setup.printSlow("Tracking Location of Data",15);
   Setup.printSlow("...",500);
   System.out.print("Navigation System: ");
   Setup.printSlow("Landing Procedures Loaded",15);
   Setup.printSlow("...",500);
   System.out.print("Navigation System: ");
   Setup.printSlow("Performing Counter-Thrust",15);
   Setup.printSlow("...",500);
   wait(5000);
   System.out.print("Navigation System: ");
   Setup.printSlow("Orbital Decay Complete.",15);
   wait(5000);
   Setup.printSlow("Estimated DIstance Landing Spot to Target: 0.2km",15);
   wait(5000);
   System.out.print("Navigation System: ");
   Setup.printSlow("Entering Atmosphere",15);
   wait(2000);
   System.out.print("Navigation System: ");
   Setup.printSlow("Altitude: 30km",15);
   wait(3000);
   System.out.print("Navigation System: ");
   Setup.printSlow("Starting atmospheric thrusters.",15);
   wait(3000);
   Setup.printSlow("WHhhehhhhheeeesssh",15);
   wait(500);
   Setup.printSlow("CLUNK",15);
   wait(500);
   System.out.print("Navigation System: ");
   Setup.printSlow("Altitude 25km",15);
   System.out.print("Navigation System: ");
   Setup.printSlow("Atmospheric thruster ignition failure.",15);
   wait(1000);
   System.out.print("Navigation System: ");
   Setup.printSlow("Re-attempting.",15);
   Setup.printSlow("WHhhehhhhheeeesssh",15);
   wait(500);
   Setup.printSlow("CLUNK",15);
   wait(500);
   Setup.printSlow("Altitude 20km",15);
   wait(5000);
   Setup.printSlow("Altitude 15km",15);
   System.out.print("Navigation System: ");
   Setup.printSlow("Manual Start Advised. Enter x to attempt manual start.",15);
   UserInput.getValidInput("x");
   Setup.printSlow("WHhhehhhhheeeesssh",15);
   wait(500);
   Setup.printSlow("CLUNK",15);
   wait(500);
   System.out.print("Navigation System: ");
   Setup.printSlow("Atmospheric thruster ignition failure. Critical Gasket Failure. Fuel injection line ruptured.",15);
   wait(1000);
   Setup.printSlow("Altitude 10km",15);
   wait(1000);
   System.out.print("Navigation System: ");
   Setup.printSlow("Back-Up Landing System Advised. Enter Y to start Back-Up Landing Procedure.",15);
   UserInput.getValidInput("y");
   System.out.print("Navigation System: ");
   Setup.printSlow("Engaging Back-Up System.",15);
   wait(3000);
   System.out.print("Navigation System: ");
   Setup.printSlow("Ion Thrusters Engaged, Xeon injection rate optimal.",15);
   wait(500);
   System.out.print("Navigation System: ");
   Setup.printSlow("Altitude: 5km",15);
   wait(500);
   System.out.print("Navigation System: ");
   Setup.printSlow("Parachute Deployment in 5",15);
   wait(1000);
   System.out.println("4");
   wait(1000);
   System.out.println("3");
   wait(1000);
   System.out.println("2");
   wait(1000);
   System.out.println("1");
   wait(1000);
   System.out.print("Navigation System: ");
   Setup.printSlow("PARACHUTE DEPLOYMENT FAILURE. UNCONTROLLED IMPACT IMMINENT. BRACE FOR IMPACT.",15);
   wait(2000);
   System.out.println("Altitude: 1.5km");
   wait(1000);
   System.out.println("Altitude: 0.7km");
   wait(1000);
   System.out.println("Altitude: 0.2km");
   wait(1000);
   }
   public static void bios(){
   Setup.printSlow("BIOS",15);
   Setup.printSlow("...",500);
   Setup.printSlow("Success",15);
   wait(300);
   Setup.printSlow("Version:19.59.2",15);
   Setup.printSlow("...",500);
   Setup.printSlow("Loading Instar_OS 1.7",15);
   Setup.printSlow("...",500);
   Setup.printSlow("Success",15);
   wait(300);
   Setup.printSlow("Initiating System Check",15);
   Setup.printSlow("...",500);
   Setup.printSlow("Navigation System",15);
   Setup.printSlow("...",500);
   Setup.printSlow("Failure. Check Navigation Chip.",15);
   wait(1000);
   Setup.printSlow("Landing System",15);
   Setup.printSlow("...",500);
   Setup.printSlow("Failure. No response from Servos A1, A3, A4.",15);
   wait(1000);
   Setup.printSlow("Take-Off System",15);
   Setup.printSlow("...",500);
   Setup.printSlow("Failure. No response from thrusters A2, B3, B6.",15);
   wait(1000);
   Setup.printSlow("Communication System",15);
   Setup.printSlow("...",500);
   Setup.printSlow("Success. Problem detected in amp unit. Recommended Solution: Replace amp unit.",15);
   wait(1000);
   Setup.printSlow("Primary Systems: ¼. Loading Emergency Survival Systems.",15);
   Setup.printSlow("...",500);
   Setup.printSlow("Success",15);
   wait(1000);
   Setup.printSlow("Loading 3 Point Micro GPS and Cubon Compactor to Personnel ",15);
   Setup.printSlow("...",500);
   Setup.printSlow("Success",15);
   wait(1000);
   Setup.printSlow("Ejecting Personnel",15);
   Setup.printSlow("...",500);
   Setup.printSlow("Terminating",15);
   Setup.printSlow("...",500);
   System.out.print('\u000C');
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
