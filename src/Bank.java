import java.util.ArrayList;
import java.util.List;

public class Bank {
     private static final int MAX_SIZE = 5;
     private final String name = "John Bryce Bank";
     private List<Client> clients = new ArrayList<>();
     private static double totalCommission;

    public Bank() {
    }

    public void addClient(Client client)
    {
        //todo - not implemented yet
    }

    public void removeClient(Client client)
    {
        //todo - not implemented yet
    }
    public Client findClientById(int id)
    {
        for (Client client : getClients()) {
            if (client.getIdClient() == id)
                return client;
        }
        return null;
    }
    public static void setTotalCommission(double totalCommission) {
        Bank.totalCommission = totalCommission;
    }

    public void viewLogs()
    {
        //todo - not implemented yet
    }

    public double getFortune()
    {
        double sum = totalCommission;
        for (Client client : getClients()) {
            sum += client.getFortune();
        }
        return sum;
    }

    public void startAccountUpdater()
    {
        //todo - not implemented yet
    }

    public static void updateTotalCommission(double commission)
    {
        totalCommission+=commission;
    }


    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", clients=" + clients +
                '}';
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }


    public List<Client> getClients() {
        return clients;
    }

    public String getName() {
        return name;
    }
}
