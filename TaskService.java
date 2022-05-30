package task;
import java.util.ArrayList;
import java.util.List;

public class TaskService{
    public List<Task> tasks = new ArrayList<Task>();

    public void addTask(String id, String name, String desc) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getTaskID() == id) {
                throw new IllegalArgumentException("Enter unique ID");
            }
        }
        Task newTask = new Task(id, name, desc);
        tasks.add(newTask);
    }

    public void deleteTaskbyID(String id) {
    	for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getTaskID() == id) {
                tasks.get(i).deleteTask(tasks.get(i));
                tasks.remove(tasks.get(i));
                return;
            }
        }
    	throw new IllegalArgumentException("Invalid ID");
    }

    public void updateTaskName(String id, String newName) {
    	for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getTaskID()== id) {
                tasks.get(i).setName(newName);
                return;
            }
        }
    	throw new IllegalArgumentException("Invalid ID");
    }

    public void updateTaskDesc(String id, String newDesc) {
    	for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getTaskID() == id) {
                tasks.get(i).setDescription(newDesc);
                return;
            }
        }
    	throw new IllegalArgumentException("Invalid ID");
    }

}
