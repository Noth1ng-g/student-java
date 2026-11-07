package edu.course.lab04;
import java.util.HashMap;
import java.util.Map;
public class IssueRegistry {
    private final Map<IssueId, ProjectTask> map = new HashMap<>();
    public void add(IssueId id, ProjectTask task) {
        map.put(id, task);
    }
    public ProjectTask get(IssueId id) {
        return map.get(id);
    }
    public void remove(IssueId id) {
        map.remove(id);
    }
    public boolean contains(IssueId id) {
        return map.containsKey(id);
    }
    public int size() {
        return map.size();
    }
}
