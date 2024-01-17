import java.util.ArrayList;
import java.util.List;

public class Logger {
    private static Logger instance;

    static final private List<Log> logs = new ArrayList<>();
    private Logger() {
    }
    public static Logger getInstance()
    {
        if(instance == null)
        {
            instance = new Logger();
        }
        return instance;
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
