public class PlatinumClient extends Client{
    public PlatinumClient(int idClient, String lastName, String firstName) {
        super(idClient, lastName, firstName, 0.01, 0.005);
    }

    public void fullReport()
    {
        System.out.println("------------------------------------------------");
        System.out.println("Full Report About the Client :");
        System.out.println("Client ID : " + getIdClient());
        System.out.println("Full Name : " + getFullName());
        System.out.println("Commission Rate : " + getCommissionRate());
        System.out.println("Interest Rate : " + getInterestRate());
        System.out.println("Client Type : PlatinumClient");
        System.out.println("------------------------------------------------");

    }

    @Override
    public String toString() {
        return "PlatinumClient{" +
                "idClient=" + super.getIdClient() +
                ", lastName='" + super.getLastName() + '\'' +
                ", firstName='" + super.getFirstName() + '\'' +
                ", accounts=" + super.accounts_str() +
                ", commissionRate=" + getCommissionRate() +
                ", interestRate=" + getInterestRate() +
                '}';
    }

    @Override
    public void draw() {
        System.out.println("  #####  #######  #####  ######");
        System.out.println(" #     #    #    #     # #");
        System.out.println(" #          #    #       #");
        System.out.println("  #####     #     #####  #####");
        System.out.println("       #    #          # #");
        System.out.println(" #     #    #    #     # #");
        System.out.println("  #####     #     #####  ######");
    }
}
