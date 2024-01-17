
public class Main {
    public static void main(String[] args) {
        Log l1 = new Log(123,"Money Deposit",2000);
        Log l2 = new Log(456,"Money Withdraw",1500);

        System.out.println(l1);
        System.out.println(l2);

        Logger logger = new Logger();
        logger.addLog(l1);
        logger.addLog(l2);
        logger.display();

    }
}