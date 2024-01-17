
public class Main {
    public static void main(String[] args) {
        Log l1 = new Log(123,"Money Deposit",2000);
        Log l2 = new Log(456,"Money Withdraw",1500);

        Account a1 = new Account(111, 1000);
        Account a2 = new Account(222, 3000);
        Account a3 = new Account(333, 2500);
        Account a4 = new Account(444, 10_000);
        Account a5 = new Account(555, 6000);

        Client client1 = new Client(123, "Cohen", "Roni", 2.5, 7);

        Bank bank = new Bank();

        client1.addAccount(a1);
        client1.addAccount(a2);
        client1.addAccount(a3);
        client1.addAccount(a4);
        client1.addAccount(a5);


        System.out.println(l1);
        System.out.println(l2);

        Logger logger = new Logger();
        logger.addLog(l1);
        logger.addLog(l2);
        logger.display();

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a5);

        System.out.println(client1);

        System.out.println(bank);






    }
}