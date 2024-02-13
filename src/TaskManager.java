import java.util.HashMap;
import java.util.Map;

public class TaskManager {
    private HashMap<String, Task> map = new HashMap<>();

    public TaskManager(HashMap<String, Task> map) {
        this.map = map;
    }
    public static void addTask(HashMap<String, Task> map,String key, Task task){
        map.put(key,task);
    }
    public static void deleteTask(HashMap<String, Task> map, String key){
        if(!map.isEmpty()){
            map.remove(key);
        }
    }
    public static void markAsComplete(HashMap<String, Task> map, String key){
        Task task = map.get(key);
        task.setCompletionStatus(true);
        map.put(key, task);
    }
    public static void viewTask(HashMap<String, Task> map){
        for(Map.Entry<String, Task> entry: map.entrySet()){
            System.out.println(entry.getKey()+" : "+ entry.getValue());
        }
        System.out.println("---------------------------------------");
    }
}
