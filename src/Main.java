import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Task> map = new HashMap<>();
        while(true) {
           // TaskManager.viewTask(map);
            System.out.println("Please enter \n 1 to add,\n 2 to view,\n 3 to mark as complete,\n 4 to delete task,\n press # to exit");

            String input = sc.nextLine();
            if(input.equals("#")) break;
            else if(input.equals("1")){
                System.out.println("Enter Task Title: ");
                String taskKey = sc.nextLine();
                System.out.println("Enter Task Name: ");
                String taskName = sc.nextLine();
                System.out.println("Enter Task Description: ");
                String taskDesc = sc.nextLine();
                System.out.println("Enter Task Status(true/false): ");
                String taskStatus = sc.nextLine();
                boolean tStatus;
                if(taskStatus.equals("true")) tStatus = true;
                else tStatus = false;
                TaskManager.addTask(map, taskKey, new Task(taskName, taskDesc, new Date(), tStatus));
            }
            else if (input.equals("2")){
                System.out.println("Your current to do list: ");
                TaskManager.viewTask(map);
            }
            else if (input.equals("3")){
                System.out.println("Enter Task Title to update task status completed: ");
                String taskKeyInput = sc.nextLine();
                if (map.isEmpty()) System.out.println("No task available");
                else TaskManager.markAsComplete(map,taskKeyInput);
            }
            else if (input.equals("4")){
                System.out.println("Enter Task Title to delete the task: ");
                String deleteTaskKey = sc.nextLine();
                TaskManager.deleteTask(map,deleteTaskKey);
                System.out.println("Successfully deleted " + deleteTaskKey);
            }

//            map.put("First Task", new Task("Report", "Prepare MD Sir Report", new Date(), false));
//            map.put("Another Task", new Task("Report", "Prepare DMD Sir Report", new Date(), false));
//            TaskManager.viewTask(map);
//            TaskManager.deleteTask(map, "First Task");
//            //System.out.println(map.get("Another Task"));
//            TaskManager.viewTask(map);
//
//            TaskManager.viewTask(map);
//            TaskManager.markAsComplete(map, "Third Task");
//            TaskManager.viewTask(map);
        }
        System.out.println("Exited!");
    }

}
