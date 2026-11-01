package edu.course.lab03;
public class TaskPrioritizer {
    private final PriorityPolicy policy;
    public TaskPrioritizer(PriorityPolicy policy) {
        this.policy = policy;
    }
    public ProjectTask selectHighestPriority(ProjectTask t1, ProjectTask t2) {
        if (policy.calculatePriority(t1) >= policy.calculatePriority(t2)) {
            return t1;
        }
        return t2;
    }
}