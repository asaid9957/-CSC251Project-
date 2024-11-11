public class PolicyHolder 
{
    // Method to identify policy attributes and validate input    
    private int policyNumber;
    private String providerName;
    private String policyholderFirstName;
    private String policyholderLastName;
    private int policyholderAge;
    private String policyholderSmokingStatus;
    private double policyholderHeight; 
    private double policyholderWeight; 

    // No-arg constructor with default values
    public Policy() 
    {
        this.policyNumber = 0;
        this.providerName = "";
        this.policyholderFirstName = "";
        this.policyholderLastName = "";
        this.policyholderAge = 0;
        this.policyholderSmokingStatus = "non-smoker";
        this.policyholderHeight = 0.0;
        this.policyholderWeight = 0.0;
    }

    // Constructor with arguments
    public Policy(int policyNumber, String providerName, String policyholderFirstName, String policyholderLastName, int policyholderAge, String policyholderSmokingStatus, double policyholderHeight, double policyholderWeight) 
    {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.policyholderFirstName = policyholderFirstName;
        this.policyholderLastName = policyholderLastName;
        this.policyholderAge = policyholderAge;
        this.policyholderSmokingStatus = policyholderSmokingStatus;
        this.policyholderHeight = policyholderHeight;
        this.policyholderWeight = policyholderWeight;
    }

    // Getters and Setter Methods
    public int getPolicyNumber() 
    {
        return policyNumber;
    }

    public void setPolicyNumber(int policyNumber) 
    {
        this.policyNumber = policyNumber;
    }

    public String getProviderName() 
    {
        return providerName;
    }

    public void setProviderName(String providerName) 
    {
        this.providerName = providerName;
    }

    public String getPolicyholderFirstName() 
    {
        return policyholderFirstName;
    }

    public void setPolicyholderFirstName(String policyholderFirstName) 
    {
        this.policyholderFirstName = policyholderFirstName;
    }

    public String getPolicyholderLastName() 
    {
        return policyholderLastName;
    }

    public void setPolicyholderLastName(String policyholderLastName) 
    {
        this.policyholderLastName = policyholderLastName;
    }

    public int getPolicyholderAge() 
    {
        return policyholderAge;
    }

    public void setPolicyholderAge(int policyholderAge) 
    {
        this.policyholderAge = policyholderAge;
    }

    public String getPolicyholderSmokingStatus() 
    {
        return policyholderSmokingStatus;
    }

    public void setPolicyholderSmokingStatus(String policyholderSmokingStatus) 
    {
        this.policyholderSmokingStatus = policyholderSmokingStatus;
    }

    public double getPolicyholderHeight() 
    {
        return policyholderHeight;
    }

    public void setPolicyholderHeight(double policyholderHeight) 
    {
        this.policyholderHeight = policyholderHeight;
    }

    public double getPolicyholderWeight() 
    {
        return policyholderWeight;
    }

    public void setPolicyholderWeight(double policyholderWeight) 
    {
        this.policyholderWeight = policyholderWeight;
    }

    // Method to calculate BMI of policyholder
    public double calculateBMI() 
    {
        return (policyholderWeight * 703) / (policyholderHeight * policyholderHeight);
    }

    // Method to calculate the price of insurance policy
    public double calculatePrice() 
    {
        double basePrice = 600.0;
        double additionalFee = 0.0;

        // Additional fee if policyholder is over 50 years old
        if (policyholderAge > 50) 
        {
            additionalFee += 75.0;
        }

        // Additional fee if policyholder is a smoker
        if (policyholderSmokingStatus.equalsIgnoreCase("smoker")) 
        {
            additionalFee += 100.0;
        }

        // Additional fee if BMI is over 35
        double bmi = calculateBMI();
        if (bmi > 35) 
        {
            additionalFee += (bmi - 35) * 20;
        }

        return basePrice + additionalFee;
    }

import java. util.Scanner;

public class Project_adem_said
{    
    // Main method to test the class
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Read policy details from user input
        System.out.print("Please enter the Policy Number: ");
        int policyNumber = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Please enter the Provider Name: ");
        String providerName = scanner.nextLine();

        System.out.print("Please enter the Policyholder's First Name: ");
        String policyholderFirstName = scanner.nextLine();

        System.out.print("Please enter the Policyholder's Last Name: ");
        String policyholderLastName = scanner.nextLine();

        System.out.print("Please enter the Policyholder's Age: ");
        int policyholderAge = scanner.nextInt();

        System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
        String policyholderSmokingStatus = scanner.next();

        System.out.print("Please enter the Policyholder's Height (in inches): ");
        double policyholderHeight = scanner.nextDouble();

        System.out.print("Please enter the Policyholder's Weight (in pounds): ");
        double policyholderWeight = scanner.nextDouble();

        // Create a Policy object with the provided input
        Policy policy = new Policy(policyNumber, providerName, policyholderFirstName, policyholderLastName, policyholderAge, policyholderSmokingStatus, policyholderHeight, policyholderWeight);

        // Output of policy details and calculated values
        System.out.println("\nPolicy Number: " + policy.getPolicyNumber());
        System.out.println("Provider Name: " + policy.getProviderName());
        System.out.println("Policyholder's First Name: " + policy.getPolicyholderFirstName());
        System.out.println("Policyholder's Last Name: " + policy.getPolicyholderLastName());
        System.out.println("Policyholder's Age: " + policy.getPolicyholderAge());
        System.out.println("Policyholder's Smoking Status: " + policy.getPolicyholderSmokingStatus());
        System.out.println("Policyholder's Height: " + policy.getPolicyholderHeight() + " inches");
        System.out.println("Policyholder's Weight: " + policy.getPolicyholderWeight() + " pounds");
        System.out.println("Policyholder's BMI: " + String.format("%.2f", policy.calculateBMI()));
        System.out.println("Policy Price: $" + String.format("%.2f", policy.calculatePrice()));
        System.out.println("The number of policies with a smoker is: " + smokerCount);
        System.out.println("The number of policies with a non-smoker is: " + nonSmokerCount);
        System.out.println("Total number of policy objects created: " + policies.size());
    }
}
}