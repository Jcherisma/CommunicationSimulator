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

    private int totalSpentTalkingTime;
	
	private int totalSentMessages;
	
	private double totalInternetUsage;

    public Operator(int id, double talkingCharge, double messageCost, double networkCharge, int discountRate){
        this.id = id;
        setTalkingCharge(talkingCharge);
		setMessageCost(messageCost);
		setNetworkCharge(networkCharge);
		setDiscountRate(discountRate);

        totalSpentTalkingTime = 0;
		totalSentMessages = 0;
		totalInternetUsage = 0.0;
    }
    
    double calculateTalkingCost(int min, Customer customer){
        double cost = min * talkingCharge;

        	// Apply discount if the customer’s age is below age 18 (18 is excluded) or higher than 65 (65 is excluded).
		if(customer.getAge() < 18 || customer.getAge() > 65)
            cost *= (double)(100 - discountRate) / 100.0;

        return cost;
    }

    double calculateMessageCost(int amount, Customer customer, Customer other){
        double cost = amount * messageCost;

        if(customer.getOperator().getID() == other.getOperator().getID())
             cost *= (double)(100 - discountRate) / 100.0;

        return cost;
    }

    double calculateNetworkCost(double amount){
        double cost = amount * networkCharge;

        return cost;
    }

    public double getTalkingCharge() {
		return talkingCharge;
	}

	public void setTalkingCharge(double talkingCharge) {
		try {
			if(talkingCharge < 0.0)
				throw new IllegalArgumentException("Talking charge must be non-negative.");
			
			this.talkingCharge = talkingCharge;
			
		} catch(final IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

    public double getMessageCost() {
		return messageCost;
	}

	
	public void setMessageCost(double messageCost) {
		try {
			if(messageCost < 0.0)
				throw new IllegalArgumentException("Message cost must be non-negative.");
			
			this.messageCost = messageCost;
			
		} catch(final IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	
	public double getNetworkCharge() {
		return networkCharge;
	}


	public void setNetworkCharge(double networkCharge) {
		try {
			if(networkCharge < 0.0)
				throw new IllegalArgumentException("Network charge must be non-negative.");
			
			this.networkCharge = networkCharge;
			
		} catch(final IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}


	public int getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(int discountRate) {
		try {
			if(discountRate < 0 || discountRate > 100)
				throw new IllegalArgumentException("Discount rate must be between 0-100.");
			
			this.discountRate = discountRate;
			
		} catch(final IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

    public int getID() {
		return id;
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
	
	public void addTalkingTime(int minute) {
		final int newTotalSpentTalkingTime = totalSpentTalkingTime + minute;
		if(newTotalSpentTalkingTime >= 0)
			totalSpentTalkingTime = newTotalSpentTalkingTime;	// Result has to be non-negative.
		// Result can be negative if:
		// 1) Value of "minute" is negative with a larger absolute value than totalSpentTalkingTime.
		// 2) Overflow occurs.
	}

	public void addSentMessages(int quantity) {
		final int newTotalSentMessages = totalSentMessages + quantity;
		if(newTotalSentMessages >= 0)
			totalSentMessages = newTotalSentMessages;			// Result has to be non-negative.
		// Result can be negative if:
		// 1) Value of "quantity" is negative with a larger absolute value than totalSentMessages.
		// 2) Overflow occurs.
	}

	
	public void addInternetUsage(double amount) {
		final double newTotalInternetUsage = totalInternetUsage + amount;
		if(newTotalInternetUsage >= 0.0)
			totalInternetUsage = newTotalInternetUsage;			// Result has to be non-negative.
		// Result can be negative if:
		// 1) Value of "amount" is negative with a larger absolute value than totalInternetUsage.
		// 2) Overflow occurs.
	}
	

}

