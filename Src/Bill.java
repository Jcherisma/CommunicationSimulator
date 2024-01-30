package Src;

/*
 * What is necesary in class:
 *    double limitingAmount  
 *    double currentDebt
 *    Bill Class must have the following methods with the exact parameters:
         Constructor with 1 parameter: limitingAmount. Note that you should initialize
          the currentDebt as zero.
         boolean check(double amount) is for checking whether the limitingAmount is
          exceeded or not.
         void add(double amount) is for adding debts to the bill.
         void pay(double amount) is for paying the bills with the given amount.
         void changeTheLimit(double amount) this method is for changing the limiting
            Amount.
         Getter methods for limitingAmount and currentDebt
 */
public class Bill {

  double limitingAmount;
  double currentDebt = 0;

  public Bill(double limitingAmount ){
    this.limitingAmount = limitingAmount;
  }
    
  public boolean checkIfExceedAmount(double amount){

    if(amount > limitingAmount){
      return false;
    } else {
    return true;
    }
  }

  public void add(double amount){
   currentDebt = currentDebt + amount;
  }

/*
 * To Do:
 */
  public void pay(double amount){

  }

/*
 * To Do:
 */
  public void changeTheLimit(double amount){


  }

  public double getLimitingAmount() {
    return this.limitingAmount;
  }

  public double getCurrentDebt() {
    return this.currentDebt;
  }
}
