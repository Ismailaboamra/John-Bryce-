import java.util.Objects;

public class Account {
    private int accountid;
    private double balance;

    public Account(int accountid,double balance) {
        setAccountid(accountid);
        setBalance(balance);
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountid=" + accountid +
                ", balance=" + balance +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return ((Account)(obj)).getAccountid() == this.getAccountid();

    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccountid(int accountid) {
        this.accountid = accountid;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountid() {
        return accountid;
    }
}
