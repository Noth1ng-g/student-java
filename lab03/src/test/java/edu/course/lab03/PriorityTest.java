package edu.course.lab03;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class PriorityTest {
    @Test
    void effortPolicyShouldSelectTaskWithMoreHours() {
        TaskPrioritizer prioritizer = new TaskPrioritizer(new EffortPriorityPolicy());
        ProjectTask t1 = new ProjectTask("1", "TODO", 5);
        ProjectTask t2 = new ProjectTask("2", "TODO", 10);
        assertEquals(t2, prioritizer.selectHighestPriority(t1, t2));
    }
    @Test
    void statusPolicyShouldSelectInProgressTask() {
        TaskPrioritizer prioritizer = new TaskPrioritizer(new StatusPriorityPolicy());
        ProjectTask t1 = new ProjectTask("1", "TODO", 10);
        ProjectTask t2 = new ProjectTask("2", "IN_PROGRESS", 5);   
        assertEquals(t2, prioritizer.selectHighestPriority(t1, t2));
    }
}