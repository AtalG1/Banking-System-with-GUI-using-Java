import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

/**
 * Write a description of class GUI here.
 *
 * @author (LondonmetID 22067674 Atal Gyawali)
 * @version (a version number or a date)
 */
public class BankGUI implements ActionListener{
    // Declaring Frame components 
    private JButton adddebit, addcredit, withdrawdebit, cancelcredit, setcreditlimit, debitclear, creditclear, debitdisplay, creditdisplay;
    private JTextField Dcardidtext, Dclientnametext, Dissuerbanktext, Dbankaccounttext, Dbalanceamounttext, Dpinnumbertext, Dcardid2text, Dpinnumber2text, withdrawalamounttext, Ccardidtext, Cclientnametext, Cissuerbanktext, Cbankaccounttext, Cbalanceamounttext, cvctext, interestratetext, Ccardid2text, newcreditlimittext, newgraceperiodtext;
    private JComboBox Dyearcombo, Dmonthcombo, Ddaycombo, Cyearcombo, Cmonthcombo, Cdaycombo;
    private ArrayList<BankCard> carddetails;
    public BankGUI(){

        carddetails = new ArrayList();
        //1. Creating JFrame
        JFrame frame = new JFrame();

        // 1.1 Creating Frame Components

        //1.1.1 Creating Buttons

        adddebit = new JButton("Add Debit Card");
        addcredit = new JButton("Add Credit Card");
        withdrawdebit = new JButton("Withdraw From Debit Card");
        cancelcredit = new JButton("Cancel Credit Card");
        setcreditlimit = new JButton("Set Credit Card");
        debitclear = new JButton("Clear");
        creditclear = new JButton("Clear");
        debitdisplay = new JButton("Display");
        creditdisplay = new JButton("Display");

        //1.1.2 Creating Labels
        //(FOR DEBIT)//
        JLabel debit = new JLabel("DEBIT");
        JLabel Dcardid = new JLabel("Card ID:");
        JLabel Dclientname = new JLabel("Client Name:");
        JLabel Dissuerbank = new JLabel("Issuer Bank:");
        JLabel Dbankaccount = new JLabel("Bank Account:");
        JLabel Dbalanceamount = new JLabel("Balance Amount:");
        JLabel Dpinnumber = new JLabel("PIN Number:");
        JLabel Dcardid2 = new JLabel("Card ID:");
        JLabel Dpinnumber2 = new JLabel("PIN Number:");
        JLabel withdrawalamount = new JLabel("Withdrawal Amount:");
        JLabel date = new JLabel("Date of Withdrawal:");

        //(FOR CREDIT)//
        JLabel credit = new JLabel("CREDIT");
        JLabel Ccardid = new JLabel("Card ID:");
        JLabel Cclientname = new JLabel("Client Name:");
        JLabel Cissuerbank = new JLabel("Issuer Bank:");
        JLabel Cbankaccount = new JLabel("Bank Account:");
        JLabel Cbalanceamount = new JLabel("Balance Amount:");
        JLabel cvc = new JLabel("CVC Number:");
        JLabel interestrate = new JLabel("Interest Rate:");
        JLabel expirationdate = new JLabel("Expiration Date:");
        JLabel Ccardid2 = new JLabel("Card ID:");
        JLabel newcreditlimit = new JLabel("New Credit Limit:");
        JLabel newgraceperiod = new JLabel("New Grace Period:");

        //1.1.3 Creating Text Fields

        //(FOR DEBIT)//
        Dcardidtext = new JTextField();
        Dclientnametext = new JTextField();
        Dissuerbanktext = new JTextField();
        Dbankaccounttext = new JTextField();
        Dbalanceamounttext = new JTextField();
        Dpinnumbertext = new JTextField();
        Dcardid2text = new JTextField();
        Dpinnumber2text = new JTextField();
        withdrawalamounttext = new JTextField();

        //(FOR CREDIT)//
        Ccardidtext = new JTextField();
        Cclientnametext = new JTextField();
        Cissuerbanktext = new JTextField();
        Cbankaccounttext = new JTextField();
        Cbalanceamounttext = new JTextField();
        cvctext = new JTextField();
        interestratetext = new JTextField();
        Ccardid2text = new JTextField();
        newcreditlimittext = new JTextField();
        newgraceperiodtext = new JTextField();

        //1.1.4 Creating Combo Box
        //(FOR DEBIT)
        Dyearcombo = new JComboBox();
        for(int dy = 2023; dy >= 1990; dy--){
            Dyearcombo.addItem(dy);
        }

        String[] month = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        Dmonthcombo = new JComboBox(month);

        Ddaycombo = new JComboBox();
        for(int dd = 1; dd <= 31; dd++){
            Ddaycombo.addItem(dd);
        }

        //(FOR CREDIT)
        Cyearcombo = new JComboBox();
        for(int cy = 2023; cy >= 1990; cy--){
            Cyearcombo.addItem(cy);
        }

        Cmonthcombo = new JComboBox(month);

        Cdaycombo = new JComboBox();
        for(int cd = 1; cd <= 31; cd++){
            Cdaycombo.addItem(cd);
        }

        // 1.2 Setting Components Bounds

        //1.2.1 Setting (Button) Bounds

        adddebit.setBounds(1019,56,174,76);
        addcredit.setBounds(999,502,214,39);
        withdrawdebit.setBounds(936,227,191,64);
        cancelcredit.setBounds(906,632,190,62);
        setcreditlimit.setBounds(906,568,201,56);
        debitclear.setBounds(1148,226,105,65);
        creditclear.setBounds(1123,568,114,56);
        debitdisplay.setBounds(1014,303,190,45);
        creditdisplay.setBounds(1107,632,130,62);

        //1.2.2 Setting (Label) Bounds

        //(FOR DEBIT)//
        debit.setBounds(575,0,130,67);
        Dcardid.setBounds(34,78,126,31);
        Dclientname.setBounds(34,120,140,31);
        Dissuerbank.setBounds(35,162,139,31);
        Dbankaccount.setBounds(454,78,171,31);
        Dbalanceamount.setBounds(454,123,186,31);
        Dpinnumber.setBounds(454,168,169,31);
        Dcardid2.setBounds(31,233,120,31);
        Dpinnumber2.setBounds(31,283,142,31);
        withdrawalamount.setBounds(442,229,215,28);
        date.setBounds(449,283,208,31);

        // (FONT) //
        debit.setFont(new Font("Arial", Font.PLAIN, 36));
        Dcardid.setFont(new Font("Arial", Font.PLAIN, 22));
        Dclientname.setFont(new Font("Arial", Font.PLAIN, 22));
        Dissuerbank.setFont(new Font("Arial", Font.PLAIN, 22));
        Dbankaccount.setFont(new Font("Arial", Font.PLAIN, 22));
        Dbalanceamount.setFont(new Font("Arial", Font.PLAIN, 22));
        Dpinnumber.setFont(new Font("Arial", Font.PLAIN, 22));
        Dcardid2.setFont(new Font("Arial", Font.PLAIN, 22));
        Dpinnumber2.setFont(new Font("Arial", Font.PLAIN, 22));
        withdrawalamount.setFont(new Font("Arial", Font.PLAIN, 22));
        date.setFont(new Font("Arial", Font.PLAIN, 22));

        //(FOR CREDIT)//
        credit.setBounds(581,353,150,58);
        Ccardid.setBounds(24,424,116,31);
        Cclientname.setBounds(24,467,139,31);
        Cissuerbank.setBounds(24,510,139,31);
        Cbankaccount.setBounds(393,423,169,31);
        Cbalanceamount.setBounds(393,465,186,31);
        cvc.setBounds(393,509,169,31);
        interestrate.setBounds(833,422,169,31);
        expirationdate.setBounds(833,466,169,31);
        Ccardid2.setBounds(32,584,109,31);
        newcreditlimit.setBounds(410,573,191,31);
        newgraceperiod.setBounds(410,624,204,31);

        //(FONT)//
        credit.setFont(new Font("Arial", Font.PLAIN, 36));
        Ccardid.setFont(new Font("Arial", Font.PLAIN, 22));
        Cclientname.setFont(new Font("Arial", Font.PLAIN, 22));
        Cissuerbank.setFont(new Font("Arial", Font.PLAIN, 22));
        Cbankaccount.setFont(new Font("Arial", Font.PLAIN, 22));
        Cbalanceamount.setFont(new Font("Arial", Font.PLAIN, 22));
        cvc.setFont(new Font("Arial", Font.PLAIN, 22));
        interestrate.setFont(new Font("Arial", Font.PLAIN, 22));
        expirationdate.setFont(new Font("Arial", Font.PLAIN, 22));
        Ccardid2.setFont(new Font("Arial", Font.PLAIN, 22));
        newcreditlimit.setFont(new Font("Arial", Font.PLAIN, 22));
        newgraceperiod.setFont(new Font("Arial", Font.PLAIN, 22));

        //1.2.3 Setting (Text Field) Bounds

        //(FOR DEBIT)//
        Dcardidtext.setBounds(181,78,242,31);
        Dclientnametext.setBounds(181,120,242,31);
        Dissuerbanktext.setBounds(181,162,242,31);
        Dbankaccounttext.setBounds(648,78,242,31);
        Dbalanceamounttext.setBounds(648,123,242,31);
        Dpinnumbertext.setBounds(648,170,242,31);
        Dcardid2text.setBounds(173,233,250,31);
        Dpinnumber2text.setBounds(173,285,250,31);
        withdrawalamounttext.setBounds(664,225,250,31);

        // (FONT) //
        Dcardidtext.setFont(new Font("Arial", Font.PLAIN, 22));
        Dclientnametext.setFont(new Font("Arial", Font.PLAIN, 22));
        Dissuerbanktext.setFont(new Font("Arial", Font.PLAIN, 22));
        Dbankaccounttext.setFont(new Font("Arial", Font.PLAIN, 22));
        Dbalanceamounttext.setFont(new Font("Arial", Font.PLAIN, 22));
        Dpinnumbertext.setFont(new Font("Arial", Font.PLAIN, 22));
        Dcardid2text.setFont(new Font("Arial", Font.PLAIN, 22));
        Dpinnumber2text.setFont(new Font("Arial", Font.PLAIN, 22));
        withdrawalamounttext.setFont(new Font("Arial", Font.PLAIN, 22));

        //(FOR CREDIT)//
        Ccardidtext.setBounds(167,423,210,31);
        Cclientnametext.setBounds(167,466,210,31);
        Cissuerbanktext.setBounds(167,509,210,31);
        Cbankaccounttext.setBounds(595,417,224,31);
        Cbalanceamounttext.setBounds(595,465,224,31);
        cvctext.setBounds(595,513,224,31);
        interestratetext.setBounds(1016,418,224,31);
        Ccardid2text.setBounds(151,581,227,31);
        newcreditlimittext.setBounds(625,572,212,31);
        newgraceperiodtext.setBounds(625,624,212,31);

        //(FONT)//
        Ccardidtext.setFont(new Font("Arial", Font.PLAIN, 22));
        Cclientnametext.setFont(new Font("Arial", Font.PLAIN, 22));
        Cissuerbanktext.setFont(new Font("Arial", Font.PLAIN, 22));
        Cbankaccounttext.setFont(new Font("Arial", Font.PLAIN, 22));
        Cbalanceamounttext.setFont(new Font("Arial", Font.PLAIN, 22));
        cvctext.setFont(new Font("Arial", Font.PLAIN, 22));
        interestratetext.setFont(new Font("Arial", Font.PLAIN, 22));
        Ccardid2text.setFont(new Font("Arial", Font.PLAIN, 22));
        newcreditlimittext.setFont(new Font("Arial", Font.PLAIN, 22));
        newgraceperiodtext.setFont(new Font("Arial", Font.PLAIN, 22));

        //1.2.4 Setting (Combo Box) Bounds
        //(FOR DEBIT)
        Dyearcombo.setBounds(664,283,70,31);
        Dmonthcombo.setBounds(752,283,70,31);
        Ddaycombo.setBounds(844,283,70,31);

        //(FOR CREDIT)
        Cyearcombo.setBounds(1007,462,69,31);
        Cmonthcombo.setBounds(1094,462,69,31);
        Cdaycombo.setBounds(1185,462,69,31);

        // 1.3 Adding Frame Components And Action Listener
        //Adding Button Action Listener
        adddebit.addActionListener(this);
        addcredit.addActionListener(this);
        withdrawdebit.addActionListener(this);
        cancelcredit.addActionListener(this);
        setcreditlimit.addActionListener(this);
        debitclear.addActionListener(this);
        creditclear.addActionListener(this);
        debitdisplay.addActionListener(this);
        creditdisplay.addActionListener(this);

        //1.3.1 Adding (Buttons)
        frame.add(adddebit);
        frame.add(addcredit);
        frame.add(withdrawdebit);
        frame.add(cancelcredit);
        frame.add(setcreditlimit);
        frame.add(debitclear);
        frame.add(creditclear);
        frame.add(debitdisplay);
        frame.add(creditdisplay);

        //1.3.2 Adding (Labels)

        //(FOR DEBIT)//
        frame.add(debit);
        frame.add(Dcardid);
        frame.add(Dclientname);
        frame.add(Dissuerbank);
        frame.add(Dbankaccount);
        frame.add(Dbalanceamount);
        frame.add(Dpinnumber);
        frame.add(Dcardid2);
        frame.add(Dpinnumber2);
        frame.add(withdrawalamount);
        frame.add(date);

        //(FOR CREDIT)//
        frame.add(credit);
        frame.add(Ccardid);
        frame.add(Cclientname);
        frame.add(Cissuerbank);
        frame.add(Cbankaccount);
        frame.add(Cbalanceamount);
        frame.add(cvc);
        frame.add(interestrate);
        frame.add(expirationdate);
        frame.add(Ccardid2);
        frame.add(newcreditlimit);
        frame.add(newgraceperiod);

        // Adding (Text Field)

        // Adding TextField Action Listener
        //(Debit Listener)//
        Dcardidtext.addActionListener(this);
        Dclientnametext.addActionListener(this);
        Dissuerbanktext.addActionListener(this);
        Dbankaccounttext.addActionListener(this);
        Dbalanceamounttext.addActionListener(this);
        Dpinnumbertext.addActionListener(this);
        Dcardid2text.addActionListener(this);
        Dpinnumber2text.addActionListener(this);
        withdrawalamounttext.addActionListener(this);

        //(FOR DEBIT)//
        frame.add(Dcardidtext);
        frame.add(Dclientnametext);
        frame.add(Dissuerbanktext);
        frame.add(Dbankaccounttext);
        frame.add(Dbalanceamounttext);
        frame.add(Dpinnumbertext);
        frame.add(Dcardid2text);
        frame.add(Dpinnumber2text);
        frame.add(withdrawalamounttext);

        // Adding TextField Action Listener
        //(Credit Listener)//

        Ccardidtext.addActionListener(this);
        Cclientnametext.addActionListener(this);
        Cissuerbanktext.addActionListener(this);
        Cbankaccounttext.addActionListener(this);
        Cbalanceamounttext.addActionListener(this);
        cvctext.addActionListener(this);
        interestratetext.addActionListener(this);
        Ccardid2text.addActionListener(this);
        newcreditlimittext.addActionListener(this);
        newgraceperiodtext.addActionListener(this);

        //(FOR CREDIT)
        frame.add(Ccardidtext);
        frame.add(Cclientnametext);
        frame.add(Cissuerbanktext);
        frame.add(Cbankaccounttext);
        frame.add(Cbalanceamounttext);
        frame.add(cvctext);
        frame.add(interestratetext);
        frame.add(Ccardid2text);
        frame.add(newcreditlimittext);
        frame.add(newgraceperiodtext);

        // Adding (Combo Box)

        // Adding combo box action listener
        // ( Debit combo)
        Dyearcombo.addActionListener(this);
        Dmonthcombo.addActionListener(this);
        Ddaycombo.addActionListener(this);

        //(FOR DEBIT)
        frame.add(Dyearcombo);
        frame.add(Dmonthcombo);
        frame.add(Ddaycombo);

        // Adding combo box action lsitener
        //( Credit Combo)
        Cyearcombo.addActionListener(this);
        Cmonthcombo.addActionListener(this);
        Cdaycombo.addActionListener(this);

        //(FOR CREDIT)
        frame.add(Cyearcombo);
        frame.add(Cmonthcombo);
        frame.add(Cdaycombo);

        //2. Setting Frame Size
        frame.setSize(1280,750);

        //3. Setting Layout
        frame.setLayout(null);

        //4. Setting Default operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //5. Setting Visibility
        frame.setVisible(true);

        //6. Setting Resizability
        frame.setResizable(false);
    }

    public static void main(String[] args) {
        new BankGUI();
        // java BankGUI.java
    }

    // Giving Functionality to Buttons
    JFrame msgframe = new JFrame();

    public void actionPerformed(ActionEvent e){

        // ADD Debit Button
        if(e.getSource()== adddebit){
            // If text fields are empty show message
            if(Dcardidtext.getText().isEmpty() | Dclientnametext.getText().isEmpty() | Dissuerbanktext.getText().isEmpty() |
            Dbankaccounttext.getText().isEmpty() | Dbalanceamounttext.getText().isEmpty() | Dpinnumbertext.getText().isEmpty()){
                JOptionPane.showMessageDialog( msgframe, "Please Input every field");
            }
            else {
                // Sending user a message if he/she enters CardID in any form other than integer
                try{
                    int Dcardid1data = Integer.parseInt(Dcardidtext.getText());
                }
                catch(NumberFormatException er){
                    JOptionPane.showMessageDialog( msgframe, "Card ID should be in number Format");
                    return;
                }

                // Sending user a message if he/she enters BalanceAmount in any form other than Integer 
                try{
                    int Dbalanceamountdata = Integer.parseInt(Dbalanceamounttext.getText());
                }
                catch(NumberFormatException er){
                    JOptionPane.showMessageDialog( msgframe, "Balance Amount should be in number Format");
                    return;
                }

                // Sending user a message if he/she enters PIN Number in any form other than integer
                try{
                    int Dpinnumber1data = Integer.parseInt(Dpinnumbertext.getText());
                }
                catch(NumberFormatException er){
                    JOptionPane.showMessageDialog( msgframe, "PIN Number should be in number Format");
                    return;
                }
                // Storing Inputs in Variable
                int Dcardid1data = Integer.parseInt(Dcardidtext.getText());
                String Dissuerbankdata = Dissuerbanktext.getText();
                String Dbankacountdata = Dbankaccounttext.getText();
                int Dbalanceamountdata = Integer.parseInt(Dbalanceamounttext.getText());
                int Dpinnumber1data = Integer.parseInt(Dpinnumbertext.getText());
                String Dclientnamedata = Dclientnametext.getText();
                int repeat = 0;

                if(carddetails.size() == 0){
                    // Storing the data in Array list
                    DebitCard Ddetails1 = new DebitCard (Dbalanceamountdata,Dcardid1data,Dbankacountdata,Dissuerbankdata,Dclientnamedata,
                            Dpinnumber1data);
                    carddetails.add(Ddetails1);
                    JOptionPane.showMessageDialog( msgframe, "Debit Card Added");
                }
                else{
                    // Checking if the debit card already exists
                    //for BankCard variable in carddetails array
                    for(BankCard details : carddetails){
                        if (details instanceof DebitCard){
                            DebitCard Ddetails2 = (DebitCard) details;
                            if (Ddetails2.getCardId() == Dcardid1data){
                                repeat = repeat + 1;
                            }
                        }
                    }
                    // If the debit card doesn't exist then adding the debit card
                    if (repeat == 0){
                        DebitCard Ddetails3 = new DebitCard(Dbalanceamountdata,Dcardid1data,Dbankacountdata,Dissuerbankdata,Dclientnamedata,
                                Dpinnumber1data);
                        carddetails.add(Ddetails3);
                        JOptionPane.showMessageDialog( msgframe, "Debit Card Added");
                    }
                    // sending message to the user if the Debit Card already exists
                    else{
                        JOptionPane.showMessageDialog( msgframe, "Debit Card Already Exists");
                    }
                }
            }
        }

        // Withdraw From Debit Card Button
        if(e.getSource() == withdrawdebit){
            // If text fields are empty show message
            if(Dcardid2text.getText().isEmpty() | Dpinnumber2text.getText().isEmpty() | withdrawalamounttext.getText().isEmpty()){
                JOptionPane.showMessageDialog( msgframe, "Please Input every field");
            }
            else{
                // Sending user a message if he/she enters Card ID in any form other than integer
                try{
                    int Dcardid2data = Integer.parseInt(Dcardid2text.getText());
                }
                catch(NumberFormatException er){
                    JOptionPane.showMessageDialog( msgframe, "Card ID should be in number Format");
                    return;
                }

                // Sending user a message if he/she enters PIN Number in any form other than integer
                try{
                    int Dpinnumeber2data = Integer.parseInt(Dpinnumber2text.getText());
                }
                catch(NumberFormatException er){
                    JOptionPane.showMessageDialog( msgframe, "PIN Number should be in number Format");
                    return;
                }

                // Sending user a message if he/she enters Withdrawal Amount in any form other than integer
                try{
                    int Dwithdrawalamountdata = Integer.parseInt(withdrawalamounttext.getText());
                }
                catch(NumberFormatException er){
                    JOptionPane.showMessageDialog( msgframe, "Withdrawal Amount should be in number Format");
                    return;
                }

                // Storing Inputs in Variables
                int Dcardid2data = Integer.parseInt(Dcardid2text.getText());
                int Dpinnumber2data = Integer.parseInt(Dpinnumber2text.getText());
                int Dwithdrawalamountdata = Integer.parseInt(withdrawalamounttext.getText());
                boolean cardExists = false;
                int Dbalanceamountdata = Integer.parseInt(Dbalanceamounttext.getText());
                String withdrawaltime =  Dyearcombo.getSelectedItem() + "/" + Dmonthcombo.getSelectedItem()+ "/" + Ddaycombo.getSelectedItem();

                // Iterating over debit card
                for ( BankCard details : carddetails){
                    if(details instanceof DebitCard){
                        DebitCard Ddetails1 = (DebitCard) details;

                        // Checking if the entered ID matches
                        if(Ddetails1.getCardId() == Dcardid2data){
                            cardExists = true ;

                            // Checking if the PIN number matches
                            if(Ddetails1.getPINnumber() == Dpinnumber2data){

                                // Checking if there is enough balance
                                if(Ddetails1.getBalanceAmount() >= Dwithdrawalamountdata){

                                    //Withdrawing the money
                                    Ddetails1.Withdraw(Dwithdrawalamountdata,withdrawaltime, Dpinnumber2data);
                                    String Data = "CardID : " + Dcardid2data + " " + "\nPin Number :" + Dpinnumber2data + 
                                        "\nWithdraw Amount :" + Dwithdrawalamountdata + " " + "\nTime :" + withdrawaltime;

                                    Ddetails1.setbalanceamount(Dbalanceamountdata - Dwithdrawalamountdata);
                                    JOptionPane.showMessageDialog( msgframe, "Sucessfully withdrawn from your account" + Data);
                                }
                                else{
                                    JOptionPane.showMessageDialog( msgframe, "Insufficent Balance in the Account");
                                } 
                            }
                            else{
                                JOptionPane.showMessageDialog( msgframe, "Wrong Pin Number");
                            }
                        }
                    }
                }
                if (!cardExists) {
                    JOptionPane.showMessageDialog( msgframe, "Sorry Your card doesn't exist in our system");
                }
            }
        }

        // Display Button of Debit
        if(e.getSource() ==  debitdisplay){
            // If debit card is not added show message
            if(carddetails.isEmpty()){
                JOptionPane.showMessageDialog( msgframe, "Please Enter the card details before displaying them");
            }
            else{
                for(BankCard details : carddetails){
                    if ( details instanceof DebitCard){
                        DebitCard Ddetails1 = (DebitCard) details;
                        String value1 = "Card ID : " + Ddetails1.getCardId()+ "\nClient Name :" + "\nClient Name: " + Ddetails1.getClientName() + 
                            "\nIssuer Bank: " + Ddetails1.getIssuerBank() + "\nBalance Amount: " + Ddetails1.getBalanceAmount() + "\nBank Account: " + Ddetails1.getBankAccount() + 
                            "\nPin Number: " + Ddetails1.getPINnumber() + "\nWithdraw Amount: " + Ddetails1.getWithdrawalAmount() ;

                        String value2 = "Card ID: " + Ddetails1.getCardId() + "\nClient Name: " + Ddetails1.getClientName() + 
                            "\nIssuer Bank: " + Ddetails1.getIssuerBank() + "\nBalance Amount: " + Ddetails1.getBalanceAmount() + 
                            "\nBank Account: " + Ddetails1.getBankAccount() + "\nPin Number: " + Ddetails1.getPINnumber() + "\n";

                        String message = Ddetails1.getHasWithdrawn() ? "Debit Card.\n" + value1 : "Debit Card.\n" + value2 + "\n";

                        // showing the details to the user
                        JOptionPane.showMessageDialog( msgframe,  message, "Display", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        }

        // ADD Credit Button
        if(e.getSource() == addcredit){
            // If text fields are empty show message
            if(Ccardidtext.getText().isEmpty() | Cclientnametext.getText().isEmpty() | Cissuerbanktext.getText().isEmpty() | 
            Cbankaccounttext.getText().isEmpty() | Cbalanceamounttext.getText().isEmpty() | cvctext.getText().isEmpty() | 
            interestratetext.getText().isEmpty()  ){

                JOptionPane.showMessageDialog( msgframe, "Please Input every field");
            }
            else{
                // Sending user a message if he/she enters CardID in any form other than integer
                try{
                    int Ccardid1data = Integer.parseInt(Ccardidtext.getText());
                }
                catch(NumberFormatException er){
                    JOptionPane.showMessageDialog( msgframe, "Card ID should be in number Format");
                    return;
                }

                // Sending user a message if he/she enters BalanceAmount in any form other than Integer 
                try{
                    int Cbalanceamountdata = Integer.parseInt(Cbalanceamounttext.getText());
                }
                catch(NumberFormatException er){
                    JOptionPane.showMessageDialog( msgframe, "Balance Amount should be in number Format");
                    return;
                }

                // Sending user a message if he/she enters CVC Number in any form other than integer
                try{
                    int cvcnumberdata = Integer.parseInt(cvctext.getText());
                }
                catch(NumberFormatException er){
                    JOptionPane.showMessageDialog( msgframe, "CVC Number should be in number Format");
                    return;
                }

                // Sending user a message if he/she enters Interest rate in any form other than number(double)
                try{
                    double interestratedata = Double.parseDouble(interestratetext.getText());
                }
                catch(NumberFormatException er){
                    JOptionPane.showMessageDialog( msgframe, "Interest Rate should be in number Format");
                    return;
                }

                // Storing Inputs in Variables
                int Ccardid1data = Integer.parseInt(Ccardidtext.getText());
                String Cclientnamedata = Cclientnametext.getText();
                String Cissuerbankdata = Cissuerbanktext.getText();
                String Cbankaccountdata = Cbankaccounttext.getText();
                int Cbalanceamountdata = Integer.parseInt(Cbalanceamounttext.getText());
                int cvcnumberdata = Integer.parseInt(cvctext.getText());
                double interestratedata = Double.parseDouble(interestratetext.getText());
                String expirationdatedata = "";
                int repeat = 0;

                if(carddetails.size() == 0){
                    // Storing the data in Array list
                    CreditCard Cdetails1 = new CreditCard (Ccardid1data, Cclientnamedata, Cissuerbankdata,
                            Cbankaccountdata, Cbalanceamountdata, cvcnumberdata, interestratedata, expirationdatedata);
                    carddetails.add(Cdetails1);
                    JOptionPane.showMessageDialog( msgframe, "Credit Card Added");
                }
                else{
                    // Checking if the credit card already exists
                    //for BankCard variable in carddetails array
                    for(BankCard details : carddetails){
                        if (details instanceof CreditCard){
                            CreditCard Cdetails2 = (CreditCard) details;
                            if (Cdetails2.getCardId() == Ccardid1data){
                                repeat = repeat + 1;
                            }
                        }
                    }
                    // If the debit card doesn't exist then adding the debit card
                    if (repeat == 0){
                        CreditCard Cdetails3 = new CreditCard (Ccardid1data, Cclientnamedata, Cissuerbankdata,
                                Cbankaccountdata, Cbalanceamountdata, cvcnumberdata, interestratedata, expirationdatedata);
                        carddetails.add(Cdetails3);
                        JOptionPane.showMessageDialog( msgframe, "Credit Card Added");
                    }
                    // sending message to the user if the Debit Card already exists
                    else{
                        JOptionPane.showMessageDialog( msgframe, "Credit Card Already Exists");
                    }
                }
            }
        }

        // Credit Display Button
        if(e.getSource() ==  creditdisplay){
            // If card does't exist show message
            if(carddetails.isEmpty()){
                JOptionPane.showMessageDialog( msgframe, "Please Enter the card details before displaying them");
            }
            else{
                    // Loop through the arraylis 
                for(BankCard details : carddetails){
                    if ( details instanceof CreditCard){
                        CreditCard Cdetails1 = (CreditCard) details;
                        String time = Cyearcombo.getSelectedItem() + "/" + Cmonthcombo.getSelectedItem() + "/" + Cdaycombo.getSelectedItem();

                        String value1 = "Card ID : "+ Cdetails1.getCardId() + "\nClient Name : " + Cdetails1.getClientName() + 
                            "\nIssuer Bank : " + Cdetails1.getIssuerBank() + "\nBalance Amount : " + Cdetails1.getBalanceAmount() +
                            "\nBank Account : " + Cdetails1.getBankAccount() +"\n" + "\nGrace Period : " + Cdetails1.getGracePeriod() + 
                            "\nCredit Limit : " + Cdetails1.getCreditLimit();

                        String value2 = "Card ID : "+Cdetails1.getCardId() + "\nClient Name : " + Cdetails1.getClientName() + 
                            "\nIssuer Bank : " + Cdetails1.getIssuerBank() + "\nBalance Amount : " + Cdetails1.getBalanceAmount() +
                            "\nBank Account : " + Cdetails1.getBankAccount() + "\nCVC Number : " + Cdetails1.getCVCnumber() + 
                            "\nInterest Rate : " + Cdetails1.getInterestRate() +
                            "\nExpiration Date : " + time + "\nIs Granted : " + Cdetails1.getisGranted() ;

                        if(Cdetails1.getisGranted() == true ){
                            JOptionPane.showMessageDialog(null,"Credit Card.\n" + value1 , "Display",
                                JOptionPane.INFORMATION_MESSAGE);
                        }

                        else{
                            JOptionPane.showMessageDialog(null,"Credit Card.\n" + value2 + "\n", "Display",
                                JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                }
            }
        }

        // Set Credit Limit Button
        if(e.getSource() == setcreditlimit){
            // If text fields are empty show message
            if(Ccardid2text.getText().isEmpty() | newcreditlimittext.getText().isEmpty() | newgraceperiodtext.getText().isEmpty()){
                JOptionPane.showMessageDialog( msgframe, "Please Input every field");
            }
            else{

                // Sending user a message if he/she enters Card ID in any form other than integer
                try{
                    int Ccardid2data = Integer.parseInt(Ccardid2text.getText());
                }
                catch(NumberFormatException er){
                    JOptionPane.showMessageDialog( msgframe, "Card ID should be in number Format");
                    return;
                }

                // Sending user a message if he/she enters Credit Limit in any form other than double
                try{
                    double newcreditlimitdata = Double.parseDouble(newcreditlimittext.getText());
                }
                catch(NumberFormatException er){
                    JOptionPane.showMessageDialog( msgframe, "Credit Limit should be in number Format");
                    return;
                }

                // Sending user a message if he/she enters Grace period in any form other than Integer
                try{
                    int newcgraceperioddata = Integer.parseInt(newgraceperiodtext.getText());
                }
                catch(NumberFormatException er){
                    JOptionPane.showMessageDialog( msgframe, "New Grace Period should be in number Format");
                    return;
                }

                // Storing Inputs in variables
                int Ccardid2data = Integer.parseInt(Ccardid2text.getText());
                double newcreditlimitdata = Double.parseDouble(newcreditlimittext.getText());
                int newcgraceperioddata = Integer.parseInt(newgraceperiodtext.getText());
                int repeatsc = 0;

                if(carddetails.size() == 0 ){
                    JOptionPane.showMessageDialog( msgframe," Please Enter the values to set the credit limit "); }

                else{
                    for(BankCard Ccard : carddetails){
                        if (Ccard instanceof CreditCard){
                            CreditCard Cdetails1 = (CreditCard) Ccard;
                            if(Cdetails1.getCardId() == Ccardid2data ){
                                if(newcreditlimitdata <= 2.5 * Cdetails1.getBalanceAmount()){
                                    Cdetails1.setCreditLimit(newcreditlimitdata,newcgraceperioddata);
                                    String Data = "Card Id : " + Ccardid2data + "Grace Period : " + newcgraceperioddata;

                                    JOptionPane.showMessageDialog( msgframe," Credit Limit set");
                                    repeatsc ++ ;
                                }
                            }
                        }
                    }}
                if(repeatsc == 0){
                    JOptionPane.showMessageDialog( msgframe," Sorry your card doesn't exist in our system");
                }

            }
        }

        // Cancel Credit Card
        if(e.getSource() == cancelcredit){
            // If text fields are empty
            if(Ccardidtext.getText().isEmpty() | Cclientnametext.getText().isEmpty() | Cissuerbanktext.getText().isEmpty() | 
            Cbankaccounttext.getText().isEmpty() | Cbalanceamounttext.getText().isEmpty() | cvctext.getText().isEmpty() | 
            interestratetext.getText().isEmpty()  ){

                JOptionPane.showMessageDialog( msgframe, "Please Input every field ");
            }
            else
            {
                try{
                    int CardID = Integer.parseInt(Ccardidtext.getText());
                    //CreditCard
                    if(carddetails.size() == 0){
                        JOptionPane.showMessageDialog( msgframe, "Sorry your card is not in our system ");
                    }

                    else{
                        for(BankCard cCard : carddetails){
                            if(cCard instanceof CreditCard){
                                CreditCard Cdetails2 = (CreditCard) cCard;
                                if(Cdetails2.getCardId() == CardID){
                                    Cdetails2.cancelCreditCard();
                                    JOptionPane.showMessageDialog( msgframe, "Your credit card has been cancelled ");
                                }
                            }
                        }
                    }  
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog( msgframe, "Please Enter the correct value ");

                }
            }
        }

        // Debit Clear Button
        if(e.getSource() == debitclear){
            Dcardidtext.setText("") ; Dclientnametext.setText("") ; Dissuerbanktext.setText("") ; Dbankaccounttext.setText("") ; 
            Dbalanceamounttext.setText("") ; Dpinnumbertext.setText("") ; Dcardid2text.setText("") ; Dpinnumber2text.setText("");
            withdrawalamounttext.setText("") ;
        }

        // Credit Clear Button
        if(e.getSource() == creditclear){
            Ccardidtext.setText("") ; Cclientnametext.setText("") ; Cissuerbanktext.setText("") ; Cbankaccounttext.setText("") ; 
            Cbalanceamounttext.setText(""); cvctext.setText(""); interestratetext.setText(""); Ccardid2text.setText("") ; 
            newcreditlimittext.setText("") ; newgraceperiodtext.setText("") ;
        }

    }
}

