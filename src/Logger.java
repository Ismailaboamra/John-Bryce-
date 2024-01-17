import java.util.ArrayList;
import java.util.List;

public class Logger {
    static final private List<Log> logs = new ArrayList<>();
    public Logger() {
    }
    public static List<Log> getLogs(){
        return logs;
    }
    public void addLog(Log log){
        logs.add(log);
    }
    public void display (){
        int i = 1;
        for (Log logs: logs) {
            System.out.println("log " + i +" "+ logs );
            i++;
        }
    }
}
