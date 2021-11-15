package ATMsystem;

public class Account {
    private String name;
    private String cardNumber;
    private double balance;
    private String passWord;
    private int withdrawalAmount;

    public Account(String name, String cardNumber, double balance, String passWord, int withdrawalAmount) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.balance = balance;
        this.passWord = passWord;
        this.withdrawalAmount = withdrawalAmount;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public int getWithdrawalAmount() {
        return withdrawalAmount;
    }

    public void setWithdrawalAmount(int withdrawalAmount) {
        this.withdrawalAmount = withdrawalAmount;
    }

    public Account() {
    }
}
