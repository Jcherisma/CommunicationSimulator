package Src;
/*
 *  * What is necesary in class:
 *      int ID
 *      double talkingCharge
 *      double messageCost
 *      double networkCharge
 *      int discountRate
 *      Operator class should have the following methods with the given parameters:
             A constructor with 5 parameters: ID, talkingCharge, messageCost,
                networkCharge, discountRate
             double calculateTalkingCost(int minute, Customer customer) for calculating
                the total amount to pay for talking.
             double calculateMessageCost(int quantity, Customer customer, Customer
                other) for calculating the total amount to pay for talking.
             double calculateNetworkCost(double amount) for calculating the total amount
                to pay for talking
             Getter and setter methods for talkingCharge, messageCost, networkCharge,
                discountRate
 */
public class Operator {
    int id;
    double talkingCharge;
    double messageCost;
    double networkCharge;
    int discountRate;

    public Operator(int id, double talkingCharge, double messageCost, double networkCharge, int discountRate){
        this.id = id;
        this.talkingCharge =  talkingCharge;
        this.messageCost = messageCost;
        this.networkCharge = networkCharge;
        this.discountRate = discountRate;
    }
    
    double calculateTalkingCost(int min, Customer customer){
        double cost = 0;

        return cost;
    }

    double calculateMessageCost(int amount, Customer customer){
        double cost = 0;

        return cost;
    }

    double calculateNetworkCost(double amount){
        double cost = 0;

        return cost;
    }
}
