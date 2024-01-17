import java.text.NumberFormat;

public class RegularClient extends Client{
    public RegularClient(int idClient, String lastName, String firstName) {
        super(idClient, lastName, firstName, 0.03, 0.001);
    }

    public void fullReport()
    {
        NumberFormat percentFormat = NumberFormat.getPercentInstance();
        percentFormat.setMinimumFractionDigits(1);
        System.out.println("------------------------------------------------");
        System.out.println("Full Report About the Client :");
        System.out.println("Client ID : " + getIdClient());
        System.out.println("Full Name : " + getFullName());
        System.out.println("Commission Rate : " + percentFormat.format(getCommissionRate()));
        System.out.println("Interest Rate : " + percentFormat.format(getInterestRate()));
        System.out.println("Client Type : Regular");
        System.out.println("------------------------------------------------");

    }

    @Override
    public void draw() {
        System.out.println("  ____                   _       _            _    ");
        System.out.println(" |  _ \\ ___  _ __   ___ | |_   _| | ___ _ __ | |_  ");
        System.out.println(" | |_) / _ \\| '_ \\ / _ \\| | | | | |/ _ \\ '_ \\| __| ");
        System.out.println(" |  __/ (_) | | | | (_) | | |_| | |  __/ | | | |_  ");
        System.out.println(" |_|   \\___/|_| |_|\\___/|_|\\__,_|_|\\___|_| |_|\\__| ");

    }

    @Override
    public String toString() {
        NumberFormat percentFormat = NumberFormat.getPercentInstance();
        percentFormat.setMinimumFractionDigits(1);
        return "RegularClient{" +
                "idClient=" + super.getIdClient() +
                ", lastName='" + super.getLastName() + '\'' +
                ", firstName='" + super.getFirstName() + '\'' +
                ", accounts=" + super.accounts_str() +
                ", commissionRate=" + percentFormat.format(getCommissionRate())+
                ", interestRate=" + percentFormat.format(getInterestRate()) +
                '}';
    }
}
