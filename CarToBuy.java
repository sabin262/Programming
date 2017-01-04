/**
 * This subclass consists of attributes, constructors and methods of CarToBuy where one s.
 * 
 * @author Sabin Nakarmi
 * @version December 10, 2016
 */
public class CarToBuy extends Car
{
    private int price,registrationYear,mileage;
    private boolean sold;
    
    /**
     * Constructor for CarToBuy
     */
    public CarToBuy(String description,int price,int registrationYear,int mileage)
    {
        super(description);
        this.price = price;
        this.registrationYear = registrationYear;
        this.mileage = mileage;
        sold = false; 
    }
    
    /**
     * Getter/Accessor (method)
     * Method: getPrice
     * Return type: int
     * Access modifier: public
     */
    public int getPrice() 
    {
        return price;
    }
    
    /**
     * Getter/Accessor (method)
     * Method: getprice
     * Return type: int
     * Access modifier: public
     */
    public int getRegistrationYear() 
    {
        return registrationYear;
    }
    
    /**
     * Getter/Accessor (method)
     * Method: getMileage
     * Return type: int
     * Access modifier: public
     */
    public int getMileage() 
    {
        return mileage;
    }
    
    /**
     * Getter/Accessor (method)
     * Method: getSold
     * Return type: boolean
     * Access modifier: public
     */
    public boolean getSold() 
    {
        return sold;
    }
    
    /**
     * Setter/Mutator (method)
     * Method: setPrice
     * Parameter: i of type int
     * Return type: void
     * Access modifier: public
     */
    public void setPrice(int price)
    {
        if(getSold() == true)
        {
            System.out.println("The car has been sold. No further changes allowed.\n");
        }
        else
        {
            this.price = price;
        }
    }
    
    /**
     * Method: buyCar
     * Return type: void
     * Access modifier: public
     */
    public void buyCar(String customerName)
    {
        if(getSold() == true)
        {
            System.out.println("The car already has been sold.\n");
        }
        else
        {
            setCustomerName(customerName);
            sold = true;
        }
    }
    
    /**
     * Method: display
     * Return type: void
     * Access modifier: public
     */
    public void display()
    {
        super.display();
        if(getSold() == false)
        {
            System.out.println("Price: " + getPrice());
            System.out.println("Registration Year: " + getRegistrationYear());
            System.out.println("Mileage: " + getMileage() + "\n");
        }   
    }
}
