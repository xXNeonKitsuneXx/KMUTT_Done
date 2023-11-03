public class Customer{
    private String firstname;
    private String lastname;
    private int customerId;

    Customer(String fn, String In, int id){
        firstname = fn;
        lastname = In;
        customerId = id;
    }
    public String getFirstname(){
        return firstname;
    }
    public void setFirstname(String firstname){
        this.firstname = firstname;
    }
    public String getLastname(){
        return lastname;
    }
    public void setLastname(String lastname){
        this.lastname = lastname;
    }
    public int getCustomerId(){
        return customerId;
    }
    public void setCustomerId(int customerId){
        this.customerId = customerId;
    }
}
public class Member extends Customer{

    Member(String fn, String In, int id) {
        super(fn, In, id);
        //TODO Auto-generated constructor stub
    }
    
}