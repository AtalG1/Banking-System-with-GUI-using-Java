
/**
 * Write a description of class BankCard here.
 *
 * @author (LondonmetID 22067674 Atal Gyawali)
 * @version (a version number or a date)
 */
public class BankCard
{
    //Putting attributes 
    private int CardId;
    private String ClientName;
    private String IssuerBank;
    private String BankAccount;
    private int BalanceAmount;
    
    //Constructor and Parameters
        
    public BankCard (int CardId, String IssuerBank, String BankAccount, int BalanceAmount){
        this.CardId = CardId;
        this.IssuerBank = IssuerBank;
        this.BankAccount = BankAccount;
        this.BalanceAmount = BalanceAmount;
        this.ClientName = "";
    }
    
    // acessor method of each attributes
    public int getCardId(){
        return CardId;
    }
    
    public String getClientName(){
        return ClientName;
    }
    
    public String getIssuerBank(){
        return IssuerBank;
    }
    
    public String getBankAccount(){
        return BankAccount;
    }
    
    public int getBalanceAmount(){
        return BalanceAmount;
    }
    
    //Method to set client name and balance ammonut 
    public void setclientname(String newName){
        this.ClientName = newName;
    }
    
    public void setbalanceamount(int newAmount){
        this.BalanceAmount = newAmount;
    }
    
    // display method to output all the attributes and a suitable message if the client name is not assigned
    public void display(){
        if(ClientName.equals("")){
            System.out.println("Client name is not given");
        }
        else{
            System.out.println("Card Id = " + CardId);
            System.out.println("Client Name = " + ClientName);
            System.out.println("Issuer Bank = " + IssuerBank);
            System.out.println("Bank Account = " + BankAccount);
            System.out.println("Balance Amount = " + BalanceAmount);
        }
    }
}
