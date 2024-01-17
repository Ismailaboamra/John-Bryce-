import java.util.ArrayList;
import java.util.List;

public abstract class Client {
    private static final int MAX_SIZE = 5;
    private int idClient;
    private String lastName;
    private String firstName;
    private final List<Account> accounts = new ArrayList<Account>();
    protected double commissionRate;
    protected double interestRate;

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

        if(getAccounts().size() == MAX_SIZE)
        {
            System.out.println("there is no space for new account.");
        } else if (findAccountById(account.getAccountid()) != null) {
            System.out.println("Account id already exist.");
        }
        getAccounts().add(account);
        System.out.println("Account added successfully.");


    }

    public void removeAccount(Account account)
    {

        if (findAccountById(account.getAccountid()) != null){
            getAccounts().remove(account);
            System.out.println("Account removed successfull.");
        }else {
            System.out.println("Account does not exis.");
        }

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
        if (findAccountById(account.getAccountid()) != null)
        {
            account.setBalance(account.getBalance() + amount + amount*getCommissionRate());
            System.out.println("Deposit successfully.");
        }else {
            System.out.println("Account does not exis.");
        }
    }

    public void withdraw(Account account,double amount)
    {
        if (findAccountById(account.getAccountid()) != null)
        {
            if (account.getBalance() >= (amount + amount*getCommissionRate())){
                account.setBalance(account.getBalance() - (amount + amount*getCommissionRate()));
                System.out.println("Withdraw successfully.");
            }else {
                System.out.println("“No Overdraft");
            }
        }else {
            System.out.println("Account does not exist.");
        }
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
        for (Account account:getAccounts()) {
            account.setBalance(account.getBalance() - account.getBalance()*getInterestRate());
        }
    }

    public String getFullName()
    {
        return getFirstName() + " " + getLastName();
    }

    public void fullReport()
    {
        System.out.println("------------------------------------------------");
        System.out.println("Full Report About the Client :");
        System.out.println("Client ID : " + getIdClient());
        System.out.println("Full Name : " + getFullName());
        System.out.println("Commission Rate : " + getCommissionRate());
        System.out.println("Interest Rate : " + getInterestRate());
        System.out.println("Client Type : ");
        System.out.println("------------------------------------------------");

    }

    public abstract void draw();
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

    public String accounts_str()
    {
        String str = "[";
        for (Account account:getAccounts()) {
            str += account;
        }
        str += "]";
        return str;
    }

}
