
/**
 * Write a description of class DebitCard here.
 *
 * @author (LondonmetID 22067674 Atal Gyawali)
 * @version (a version number or a date)
 */
public class DebitCard extends BankCard
{
    //Putting attributes 
    private int PINnumber;
    private int WithdrawalAmount;
    private String DateOfWithdrawal;
    private boolean HasWithdrawn;
    
    //Constructor and Parameters
    public DebitCard(int BalanceAmount, int CardId, String BankAccount, String IssuerBank,String ClientName, int PINnumber){
        super( CardId, IssuerBank, BankAccount, BalanceAmount);
        setclientname(ClientName);
        this.PINnumber = PINnumber;
        HasWithdrawn = false;
    }
    
    // acessor method of each attributes
    public int getPINnumber(){
        return PINnumber;
    }
    
    public int getWithdrawalAmount(){
        return WithdrawalAmount;
    }
    
    public String getDateOfWithdrawal(){
        return DateOfWithdrawal;
    }
    
    public boolean getHasWithdrawn(){
        return HasWithdrawn;
    }
    
    public void setWithdrawalAmount(int WithdrawalAmount){
        this.WithdrawalAmount = WithdrawalAmount;
    }
    
    //Withdraw method that deducts the money directly from the client account
    public void Withdraw(int WithdrawalAmount, String DateOfWithdrawal, int PINnumber){
        if(PINnumber == this.PINnumber){
            if(getBalanceAmount() >= WithdrawalAmount){
                setbalanceamount(getBalanceAmount() - WithdrawalAmount);
                this.WithdrawalAmount = WithdrawalAmount;
                this.DateOfWithdrawal = DateOfWithdrawal;
                this.HasWithdrawn = true;
                System.out.println("Withdrawal Sucessful");
            }
            else if(getBalanceAmount() < WithdrawalAmount){
                System.out.println("Insufficient Balance");
            }
            else if(PINnumber != this.PINnumber){
                System.out.println("Invalid PIN number");
            }
        }
    }
    
    // method that displays the details of Debit card 
    public void display(){
        super.display();
        System.out.println("PIN = " + PINnumber);
        if (HasWithdrawn = true){
            System.out.println("Withdrawal Amount = " + WithdrawalAmount);
            System.out.println("Date of Withdrawal = " + DateOfWithdrawal);
        }
        else{
            System.out.println("No transaction yet");
            System.out.println("Balance Amount = " + super.getBalanceAmount());
        }
    }
}
