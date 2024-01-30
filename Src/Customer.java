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
    int id;
    String name;
    int age;
    Operator operator;
    Bill bill;

    public Customer(int i, String n, int a,Operator op,double l){
        this.id = i;
        this.name =  n;
        this.age = a;
        this.operator = op;
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

        this.age = age;
    }

    public int getAge(int age){

        return this.age;
    }
}
