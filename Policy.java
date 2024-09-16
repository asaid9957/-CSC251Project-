public class Policy 
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

}
