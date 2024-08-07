public class Task {
    String taskID;
    String taskName;
    String status;

    public Task(String taskID, String taskName, String status){
        this.taskID=taskID;
        this.taskName=taskName;
        this.status=status;
    }

    public String getTaskID(){
        return taskID;
    }

    public String getStatus() {
        return status;
    }

    public String getTaskName() {
        return taskName;
    }
}
