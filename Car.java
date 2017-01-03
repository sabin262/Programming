/**
 * This class consists of attributes, constructors and methods.
 * 
 * @author Sabin Nakarmi
 * @version December 10, 2016
 */
public class Car
{
    private String description,customerName;
    
        
    /**
     * Constructor for Car with String parameter
     */
    public Car(String s)
    {
        description=s;
        customerName =""; 
    }
    
    /**
     * Getter/Accessor (method)
     * Method: getDescription
     * Return type: String
     * Access modifier: public
     */
    public String getDescription() 
    {
        return description;
    }
    
    /**
     * Getter/Accessor (method)
     * Method: getCustomerName
     * Return type: String
     * Access modifier: public
     */
    public String getCustomerName() 
    {
        return customerName;
    }
    
    /**
     * Setter/Mutator (method)
     * Method: setCustomerName
     * Parameter: s of type String
     * Return type: void
     * Access modifier: public
     */
    public void setCustomerName(String name)
    {
        customerName = name;
    }
   
    /**
     * Method: display
     * Return type: void
     * Access modifier: public
     */
    public void display()
    {
        System.out.println("Car Description: " + getDescription());
        if(customerName!="")
        {
            System.out.println("Customer Name: " + customerName);
        }
    }
}
