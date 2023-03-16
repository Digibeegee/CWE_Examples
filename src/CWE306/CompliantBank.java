package CWE306;

import static java.lang.System.exit;

public class CompliantBank {
    public static boolean validPan(String pan){
        return pan.matches("^[A-Z]{5}[0-9]{4}[A-Z]{1}$");
    }
    public static BankAccount createBankAccount(String accountNumber, String accountType,
                                                String accountOwnerName, double balance, String panID) {
        if(!validPan(panID)) {
            System.out.println("Cannot create account");
            return null;
        }
        BankAccount account = new BankAccount();
        account.setAccountNumber(accountNumber);
        account.setAccountType(accountType);
        account.setAccountOwnerName(accountOwnerName);
        account.setBalance(balance);
        return account;
    }
    public static void main(String[] args) {

        //Authenticating user my PAN ID before creating bank account

        BankAccount user1 = createBankAccount("987","Savings","Owner",1000, "ABCDE1234F");
        if(user1 != null)
            user1.getOwnerName();
    }
}
