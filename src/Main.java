public class Main {
    public static void main(String[] args) {

        System.out.println("lets create a bank app");
        Bank sbi=new SBIBank(0,"Aadil","po89");
        if(sbi.addMoney(1000))
            System.out.println("Money Deposited");
        else
            System.out.println("Money Deposit Failed!! please try again");

        if(sbi.withdrawMoney(200))
            System.out.println("Please collect cash");
        else
            System.out.println("Money Withdrawal Failed!! please try again");



        int b=sbi.checkBalance();

        SBIBank sbiAcc=new SBIBank();
        sbiAcc.setName("Biju");
        sbiAcc.setBalance(10000);
        sbiAcc.setPassword("pass");

    }
}