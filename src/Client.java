import java.util.ArrayList;
import java.util.List;

public class Client {
    private static final int MAX_SIZE = 5;
    private int idClient;
    private String lastName;
    private String firstName;
    private final List<Account> accounts = new ArrayList<Account>();
    double commissionRate;
    double interestRate;

    @Override
    public boolean equals(Object obj) {
        return ((Client)(obj)).getIdClient() == this.getIdClient();
    }

    @Override
    public String toString() {
        return "Client{" +
                "idClient=" + idClient +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", accounts=" + accounts_str() +
                ", commissionRate=" + commissionRate +
                ", interestRate=" + interestRate +
                '}';
    }

    public Client(int idClient, String lastName, String firstName , double commissionRate, double interestRate)
    {
        setIdClient(idClient);
        setFirstName(firstName);
        setLastName(lastName);
        setCommissionRate(commissionRate);
        setInterestRate(interestRate);
    }

    public void addAccount(Account account)
    {
        //todo - not implemented yet
    }

    public void removeAccount(Account account)
    {
        //todo - not implemented yet

    }

    public Account findAccountById(int id)
    {
        for (Account account : accounts) {
            if(account.getAccountid() == id)
                return account;
        }
        return null;
    }

    public void deposit(Account account,double amount)
    {
        //todo - not implemented yet
    }

    public void withdraw(Account account,double amount)
    {
        //todo - not implemented yet
    }

    public double getFortune()
    {
        double sum = 0;
        for (Account account : accounts) {
            sum += account.getBalance();
        }
        return sum;
    }

    public void autoUpdateAccount()
    {
        //todo - not implemented yet
    }
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getIdClient() {
        return idClient;
    }

    private String accounts_str()
    {
        String str = "[";
        for (Account account:getAccounts()) {
            str += account;
        }
        str += "]";
        return str;
    }

}
