
/**
 * Write a description of class CreditCard here.
 *
 * @author (LondonmetID 22067674 Atal Gyawali)
 * @version (a version number or a date)
 */
public class CreditCard extends BankCard
{
    //Putting attributes 
  private int CVCnumber;
  private double CreditLimit;
  private double InterestRate;
  private String ExpirationDate;
  private int GracePeriod;
  private boolean isGranted;
  
  //Constructor
  public CreditCard (int CardId, String ClientName, String IssuerBank, String BankAccount, int BalanceAmount, int CVCnumber,
  double InterestRate,String ExpirationDate){
      
      super(CardId, IssuerBank, BankAccount, BalanceAmount);
      setclientname(ClientName);
      this.CVCnumber = CVCnumber;
      this.InterestRate = InterestRate;
      this.ExpirationDate = ExpirationDate;
      this.isGranted = false;
  }
  
  //acessor method of each attributes
  public int getCVCnumber(){
      return CVCnumber;
  }
  
  public double getCreditLimit(){
      return CreditLimit;
  }
  
  public double getInterestRate(){
      return InterestRate;
  }
  
  public String getExpirationDate(){
      return ExpirationDate;
  }
  
  public int getGracePeriod(){
      return GracePeriod;
  }
  
  public boolean getisGranted(){
      return isGranted;
  }
  
  // method that sets credit limit
  public void setCreditLimit(double CreditLimit, int GracePeriod){
      if (CreditLimit <= 2.5 * super.getBalanceAmount()){
          this.CreditLimit = CreditLimit;
          this.GracePeriod = GracePeriod;
          this.isGranted = true;
      }
      else{
          System.out.println("Credit cannot be issued");
      }
  }
  
  //method that cancels the credit card when certain conditions are met
  public void cancelCreditCard(){
      this.CVCnumber = 0;
      this.CreditLimit = 0;
      this.GracePeriod = 0;
      this.isGranted = false;
  }
  
  //method that displays the details of the Credit card only when isGranted is true
  public void display(){
      if(isGranted = true){
          super.display();
          System.out.println("Credit Limit = " + CreditLimit);
          System.out.println("Grace Period = " + GracePeriod);
      }
      else{
         System.out.println("Credit not Granted"); 
      }
  }
}
