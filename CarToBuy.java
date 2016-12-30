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
    public CarToBuy(String desc,int p,int r,int m)
    {
        super(desc);
        price=p;
        registrationYear=r;
        mileage=m;
        sold=false; 
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
    public void setPrice(int i)
    {
        if(sold==true)
        {
            System.out.println("The car has been sold. No further changes allowed.");
        }
        else
        {
            price=i;
        }
    }
    
    /**
     * Method: buyCar
     * Return type: void
     * Access modifier: public
     */
    public void buyCar(String name)
    {
        if(sold==true)
        {
            System.out.println("The car already has been sold.");
        }
        else
        {
            setCustomerName(name);
            sold=true;
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
        if(sold==false)
        {
            System.out.println("Price: " + getPrice());
            System.out.println("Registration Year: " + getRegistrationYear());
            System.out.println("Mileage: " + getMileage() + "\n");
        }   
    }
}
