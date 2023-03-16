package CWE306;

public class Bank {

    //Missing Authentication for Critical Function

        public static BankAccount createBankAccount(String accountNumber, String accountType,
                                                String accountOwnerName, double balance) {
        BankAccount account = new BankAccount();
        account.setAccountNumber(accountNumber);
        account.setAccountType(accountType);
        account.setAccountOwnerName(accountOwnerName);
        account.setBalance(balance);

        return account;
    }
    public static void main(String[] args) {

            //no authentication of user being able to create account

        BankAccount user1 = createBankAccount("987","Savings","Owner",1000);
        user1.getOwnerName();
    }
}
