
public class Main {
    public static void main(String[] args) {
        Log l1 = new Log(123,"Money Deposit",2000);
        Log l2 = new Log(456,"Money Withdraw",1500);

        Account a1 = new Account(111, 1000);
        Account a2 = new Account(222, 3000);
        Account a3 = new Account(333, 2500);
        Account a4 = new Account(444, 10_000);
        Account a5 = new Account(555, 6000);




        System.out.println(l1);
        System.out.println(l2);

        Logger logger = Logger.getInstance();
        logger.addLog(l1);
        logger.addLog(l2);
        logger.display();

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a5);








    }
}