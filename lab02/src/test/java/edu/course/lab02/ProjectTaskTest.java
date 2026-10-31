package edu.course.lab02;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class ProjectTaskTest {
    @Test
    void shouldCreateValidTask() {
        ProjectTask task = new ProjectTask("T-1", "Сделать лабу", 10);
        assertEquals("T-1", task.getId());
        assertEquals("Сделать лабу", task.getTitle());
        assertEquals(TaskStatus.TODO, task.getStatus()); // По умолчанию TODO
        assertEquals(10, task.getEstimatedHours());
    }
    @Test
    void shouldThrowExceptionForNullId() {
        assertThrows(IllegalArgumentException.class, () -> {
            new ProjectTask(null, "Title", 10);
        });
    }
    @Test
    void shouldThrowExceptionForEmptyId() {
        assertThrows(IllegalArgumentException.class, () -> {
            new ProjectTask("   ", "Title", 10); 
        });
    }
    @Test
    void shouldThrowExceptionForNullTitle() {
        assertThrows(IllegalArgumentException.class, () -> {
            new ProjectTask("T-1", null, 10);
        });
    }
    @Test
    void shouldThrowExceptionForEmptyTitle() {
        assertThrows(IllegalArgumentException.class, () -> {
            new ProjectTask("T-1", "", 10);
        });
    }
    @Test
    void shouldThrowExceptionForZeroHours() {
        assertThrows(IllegalArgumentException.class, () -> {
            new ProjectTask("T-1", "Title", 0);
        });
    }
    @Test
    void shouldThrowExceptionForNegativeHours() {
        assertThrows(IllegalArgumentException.class, () -> {
            new ProjectTask("T-1", "Title", -5);
        });
    }
    @Test
    void shouldChangeStatusAndBeCompleted() {
        ProjectTask task = new ProjectTask("T-1", "Сделать лабу", 10);
        assertFalse(task.isCompleted()); 
        task.changeStatus(TaskStatus.IN_PROGRESS);
        assertEquals(TaskStatus.IN_PROGRESS, task.getStatus());
        assertFalse(task.isCompleted()); 
        task.changeStatus(TaskStatus.DONE);
        assertEquals(TaskStatus.DONE, task.getStatus());
        assertTrue(task.isCompleted()); 
    }
    @Test
    void shouldThrowExceptionForNullStatus() {
        ProjectTask task = new ProjectTask("T-1", "Сделать лабу", 10);
        assertThrows(IllegalArgumentException.class, () -> {
            task.changeStatus(null);
        });
    }
    @Test
    void shouldIncreaseEstimateSuccessfully() {
        ProjectTask task = new ProjectTask("T-1", "Сделать лабу", 10);
        task.increaseEstimate(5);
        assertEquals(15, task.getEstimatedHours());
    }
    @Test
    void shouldThrowExceptionForInvalidEstimateIncrease() {
        ProjectTask task = new ProjectTask("T-1", "Сделать лабу", 10);
        assertThrows(IllegalArgumentException.class, () -> {
            task.increaseEstimate(0);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            task.increaseEstimate(-3);
        });
    }
}