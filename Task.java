package task;

public class Task {

    private String taskID;
    private String name;
    private String description;

    public Task(String id, String name, String desc) {
        
        if (id == null || id.length() > 10) {
            throw new IllegalArgumentException("Invalid Task ID");
        }
        if (name == null || name.length() > 20) {
            throw new IllegalArgumentException("Invalid name");
        }
        if (desc == null || desc.length() > 50) {
            throw new IllegalArgumentException("Invalid description");
        }
        
        taskID = id;
        this.name = name;
        description = desc;
    }

    public String getTaskID() {
        return taskID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.length() > 20) {
            throw new IllegalArgumentException("Invalid name");
        }
        else {
        this.name = name;
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String desc) {
        if (desc == null || desc.length() > 50) {
            throw new IllegalArgumentException("Invalid description");
        }
        else {
            description = desc;
        }
    }

    public void deleteTask(Task task) {
        taskID = null;
        name = null;
        description = null;
    }
}