import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PolicyDemo 
{
    public static void main(String[] args) 
    {
        ArrayList<Policy> policies = new ArrayList<>();
        int smokerCount = 0;
        int nonSmokerCount = 0;

        try 
        {
            File file = new File("PolicyInformation.txt");
            Scanner fileReader = new Scanner(file);

            // Reading the file and creating Policy objects
            while (fileReader.hasNext()) 
            {
                int policyNumber = fileReader.nextInt();
                fileReader.nextLine();  // Move to the next line
                String providerName = fileReader.nextLine();
                String firstName = fileReader.nextLine();
                String lastName = fileReader.nextLine();
                int age = fileReader.nextInt();
                fileReader.nextLine();  // Move to the next line
                String smokingStatus = fileReader.nextLine();
                double height = fileReader.nextDouble();
                double weight = fileReader.nextDouble();
                
                // Create Policy object and add to the list
                Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
                policies.add(policy);
                
                // Count smokers and non-smokers
                if (smokingStatus.equalsIgnoreCase("smoker")) 
                {
                    smokerCount++;
                } 
                else 
                {
                    nonSmokerCount++;
                }
            }
            fileReader.close();

            // Displaying policies
            for (Policy policy : policies) 
            {
                policy.displayPolicyInfo();
                System.out.println();  // Blank line between policies
            }

            // Displaying the count of smokers and non-smokers
            System.out.println("The number of policies with a smoker is: " + smokerCount);
            System.out.println("The number of policies with a non-smoker is: " + nonSmokerCount);

        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
