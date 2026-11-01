package edu.course.lab03;

public class ProjectTask {
    private final String id;
    private final String status;
    private final int estimatedHours;

    public ProjectTask(String id, String status, int estimatedHours) {
        this.id = id;
        this.status = status;
        this.estimatedHours = estimatedHours;
    }

    public String getId() { return id; }
    public String getStatus() { return status; }
    public int getEstimatedHours() { return estimatedHours; }
}