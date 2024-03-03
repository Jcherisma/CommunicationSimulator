package Src;
/*
 * What is necesary in class:
 *      name --> String
 *      ID  --> Int 
 *      imitingAmount --> double or int
 *      Operator --> Operator
 *      Bill --> Bill
 * 
 *      Possibly needed:
 *          debt --> double 
 * 
 *    Customer class must have the following methods with the exact parameters:
         A constructor with five parameters: int ID, String name, int age , Operator
            operator, double limitingAmount
         void talk(int minute, Customer other) for customers to talk via the operator.
            Other is the another customer, mainly the second customer.
         void message(int quantity, Customer other) for customers to send message,
            amount is the number of messages to be sent. Other is the another customer,
            mainly the second customer.
         void connection(double amount) for customers to connect the internet.
            Amount is the number of data as MB.
         Getter and setter methods for age,operator,and bill. Ex: getAge (), setAge(int
            age)
 */

public class Customer {
    private int id;
    private String name;
    private int age;
    private Operator operator;
    private Bill bill;

    private int totalSpentTalkingTime;

    private int totalSentMessages;
	
	private double totalInternetUsage;

    public Customer(int i, String n, int a,Operator op,double l){
        this.id = i;
        this.name =  n;
        setAge(a);
        this.operator = op;
        bill = new Bill(l);

        totalSpentTalkingTime = 0;
		totalSentMessages = 0;
		totalInternetUsage = 0.0;
    }

    public void talk(int minute, Customer name){

    }

    public void message(int amount, Customer name){
            
    }

    public void connection(double amount){
            
    }

    //Getter and setter methods for age,operator,and bill. Ex: getAge (), setAge(int
    //age)
    public void setAge(int age){
        try {
			if(age < 0)
				throw new IllegalArgumentException("Age must be non-negative.");
		
			this.age = age;
			
		} catch(final IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
    }

    public int getAge(){

        return age;
    }

    public void setOperator(Operator op ){

        this.operator = op;
    }

    public Operator getOperator(){

        return operator;
    }

    public void setBill(Bill bill ){

        this.bill = bill;
    }

    public Bill getBill(){

        return bill;
    }

 
	public int getID() {
		return id;
	}
	
	
	public String getName() {
		return name;
	}
	

	public int getTotalSpentTalkingTime() {
		return totalSpentTalkingTime;
	}

	
	public int getTotalSentMessages() {
		return totalSentMessages;
	}

	public double getTotalInternetUsage() {
		return totalInternetUsage;
	}

}
