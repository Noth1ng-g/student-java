package edu.course.lab02;
public class ProjectTask {
    private final String id;
    private final String title;
    private TaskStatus status;
    private int estimatedHours;
    public ProjectTask(String id, String title, int estimatedHours) {
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("ID не может быть пустым");
        }
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Название не может быть пустым");
        }
        if (estimatedHours <= 0) {
            throw new IllegalArgumentException("Оценка трудоемкости должна быть больше 0");
        }
        this.id = id;
        this.title = title;
        this.estimatedHours = estimatedHours;
        this.status = TaskStatus.TODO; 
    }
    public void changeStatus(TaskStatus newStatus) {
        if (newStatus == null) {
            throw new IllegalArgumentException("Статус не может быть null");
        }
        this.status = newStatus;
    }
    public boolean isCompleted() {
        return this.status == TaskStatus.DONE;
    }
    public void increaseEstimate(int hours) {
        if (hours <= 0) {
            throw new IllegalArgumentException("Добавляемые часы должны быть положительными");
        }
        this.estimatedHours += hours;
    }
    public String getId() { return id; }
    public String getTitle() { return title; }
    public TaskStatus getStatus() { return status; }
    public int getEstimatedHours() { return estimatedHours; }
}