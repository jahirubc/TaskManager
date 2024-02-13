import java.util.Date;

public class Task {
    private String name;
    private String description;
    private Date dueDate;
    private boolean completionStatus;

    public Task(String name, String description, Date dueDate, boolean completionStatus) {
        this.name = name;
        this.description = description;
        this.dueDate = dueDate;
        this.completionStatus = completionStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isCompletionStatus() {
        return completionStatus;
    }

    public void setCompletionStatus(boolean completionStatus) {
        this.completionStatus = completionStatus;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", dueDate=" + dueDate +
                ", completionStatus=" + completionStatus +
                '}';
    }
}
