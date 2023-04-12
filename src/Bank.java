public interface Bank {

    int checkBalance();

    boolean addMoney(int m);
    boolean withdrawMoney(int m);

    int getROI();

    int totalInterest(int p,int t);
}
