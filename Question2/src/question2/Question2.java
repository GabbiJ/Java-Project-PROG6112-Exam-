package question2;
/**
 * @author ST10034968
 */
import java.util.*;
public class Question2 
{
    public static void main(String[] args) 
    {
        //Declarations
        int propTypePrices[][] = new int[3][3];
        String provinces[] = new String[3];
        double averages[] = new double[3];
        String message;
        Scanner s = new Scanner(System.in);
        
        //populating arrays with user input
        for(int i = 0; i < provinces.length; i++)
        {
            System.out.println("Enter a province: ");
            provinces[i] = s.nextLine();
        }
        
        for(int i = 0; i < propTypePrices.length; i++)
        {
            System.out.println("Enter the average flat price for " + provinces[i]);
            propTypePrices[i][0] = s.nextInt();
            
            System.out.println("Enter the average town house price for " + provinces[i]);
            propTypePrices[i][1] = s.nextInt();
            
            System.out.println("Enter the average house price for " + provinces[i]);
            propTypePrices[i][2] = s.nextInt();
        }
        
        //calculating averages
        for(int i = 0; i < averages.length; i++)
        {
            averages[i] = 0;
            for(int j = 0; j < 3; j++)
            {
                averages[i] += propTypePrices[i][j];
            }
            
            averages[i] = (Math.round((averages[i] / 3) * 100)) / (double)100;
        }
        
        //adding info to string to be printed
        message = "\t FLAT\t\tTOWN HOUSE\tHOUSE"
                + "\n-----------------------------------------------------------";
                
        for(int i = 0; i < propTypePrices.length; i++)
        {
            message += "\n" + provinces[i];
            
            for(int j = 0; j < 3; j++)
            {
                message += "\t R " + propTypePrices[i][j];
            }
            
            message += "\n";
        }
        
        message += "\n";
        
        for(int i = 0; i < averages.length; i++)
        {
            message += "Average property prices in " + provinces[i] + " = R " + averages[i] + "\n"; 
        }
        //printing output to user
        System.out.println(message);
        

    }
    
    
}
