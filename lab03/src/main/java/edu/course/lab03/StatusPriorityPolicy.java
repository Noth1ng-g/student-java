package edu.course.lab03;

public class StatusPriorityPolicy implements PriorityPolicy {
    @Override
    public int calculatePriority(ProjectTask task) {
        if ("IN_PROGRESS".equals(task.getStatus())) return 100;
        if ("TODO".equals(task.getStatus())) return 50;
        return 0; 
    }
}