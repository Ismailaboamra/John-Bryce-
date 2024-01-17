import java.sql.Timestamp;

public class Log {
    private int id;
    private String description;
    private double amount;
    private final Timestamp timestamp = new Timestamp(System.currentTimeMillis());

    public Log(int id ,String desc,double amount) {
        setId(id);
        setAmount(amount);
        setDescription(desc);
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public double getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Log{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", amount=" + amount +
                ", timestamp=" + timestamp +
                '}';
    }
}
