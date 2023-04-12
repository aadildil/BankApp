import java.util.UUID;

public class SBIBank implements Bank{

    private int balance;
    private String name;
    private int roi;
    private String password;
    private String accountNumber;

    public SBIBank(int balance, String name, String password) {
        this.balance = balance;
        this.name = name;
        this.password = password;
        this.accountNumber= String.valueOf(UUID.randomUUID());
        this.roi=5;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public SBIBank(String name, String password) {
        this.name = name;
        this.password = password;
        this.balance=0;
        this.accountNumber= String.valueOf(UUID.randomUUID());
        this.roi=5;
    }

    public SBIBank() {

    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Double getBalanceAsDouble()
    {
        return Double.valueOf(String.valueOf(this.balance));
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoi() {
        return roi;
    }

    public void setRoi(int roi) {
        this.roi = roi;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }


    @Override
    public int checkBalance() {
        return this.balance;
    }

    @Override
    public boolean addMoney(int m) {
        this.balance+=m;
        return true;
    }

    @Override
    public boolean withdrawMoney(int m)
    {
        if(m>this.balance)
        return false;

        this.balance-=m;
        return true;
    }

    @Override
    public int getROI() {
        return this.roi;
    }

    @Override
    public int totalInterest(int p,int t) {
        return (int)(p*this.roi*t/100);
    }
}
