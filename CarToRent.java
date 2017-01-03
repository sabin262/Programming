public class CarToRent extends Car
{
    private String rentalDate, returnDate;
    private int adminFee, numberOfDays, dailyRate, totalAccumulated;
    private boolean onLoan;
    
    
    public CarToRent(String desc, int adminFee, int dailyRate)
    {
        super(desc);
        this.adminFee = adminFee;
        this.dailyRate = dailyRate;
        rentalDate = "";
        returnDate = "";
        numberOfDays = 0;
        totalAccumulated = 0;
        onLoan = false;
    }
    
    public String getRentalDate()
    {
        return rentalDate;
    }
    
    public String getReturnDate()
    {
        return returnDate;
    }
    
    public int getAdminFee()
    {
        return adminFee;
    }
    
    public int getNumberOfDays()
    {
        return numberOfDays;
    }
    
    public int getDailyRate()
    {
        return dailyRate;
    }
    
    public int getTotalAccumulated()
    {
        return totalAccumulated;
    }
    
    public boolean getOnLoan()
    {
        return onLoan;
    }
    
    public void setDailyRate(int dailyRate)
    {
        this.dailyRate=dailyRate;
    }
    
    public void setAdminFee(int adminFee)
    {
        this.adminFee=adminFee;
    }
    
    public void rentCar(String customerName, String rentalDate, String returnDate, int numberOfDays)
    {
        if(getOnLoan()==true)
        {
            System.out.println("The car is already on loan.\n");
        }
        else 
        {
            super.setCustomerName(customerName);
            this.rentalDate=rentalDate;
            this.returnDate=returnDate;
            this.numberOfDays=numberOfDays;
            onLoan=true;
            totalAccumulated=((dailyRate*numberOfDays)+adminFee)+totalAccumulated;
        }
    }
    
    public void returnCar()
    {
        if(getOnLoan()==true)
        {
            super.setCustomerName("");
            numberOfDays=0;
            rentalDate="";
            returnDate="";
            onLoan=false;
        }
        else
        {
            System.out.println("The car is not on loan.\n");
        }
    }
    
    public void printDescription()
    {
        System.out.println("Description: "+super.getDescription());
        System.out.println("Total Accumulated: "+getTotalAccumulated());
        System.out.println("\n");
    }
    
    public void display()
    {
        super.display();
        System.out.println("Admin Fee:"+getAdminFee());
        System.out.println("Daily Rate: "+getDailyRate());
        if(getOnLoan()==true)
        {
            System.out.println("Rental Date: "+getRentalDate());
            System.out.println("Return Date: "+getReturnDate());
            System.out.println("Number Of Days: "+getNumberOfDays());
        }
        System.out.println("\n");
    }
}