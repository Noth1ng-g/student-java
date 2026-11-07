package edu.course.lab04;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class IssueRegistryTest {
    @Test
    void experiment1And2_EqualKeysReplaceValue() {
        IssueRegistry registry = new IssueRegistry();
        IssueId id1 = new IssueId("PROJ", 1);
        IssueId id2 = new IssueId("PROJ", 1);
        registry.add(id1, new ProjectTask("Задача 1"));
        registry.add(id2, new ProjectTask("Задача 2"));
        assertEquals(1, registry.size());
        assertEquals("Задача 2", registry.get(id1).getTitle());
    }
    @Test
    void experiment3_Collision() {
        IssueRegistry registry = new IssueRegistry();
        IssueId id1 = new IssueId("Aa", 1); 
        IssueId id2 = new IssueId("BB", 1); 
        registry.add(id1, new ProjectTask("Задача A"));
        registry.add(id2, new ProjectTask("Задача B"));
        assertEquals(2, registry.size());
        assertEquals("Задача A", registry.get(id1).getTitle());
        assertEquals("Задача B", registry.get(id2).getTitle());
    }
    @Test
    void experiment4_CompareWithNullAndOtherType() {
        IssueId id = new IssueId("PROJ", 1);
        assertFalse(id.equals(null));
        assertFalse(id.equals("Строка - другой тип"));
    }
    @Test
    void experiment5_MutableKeyProblem() {
        class MutableKey {
            public String name;
            public MutableKey(String name) { this.name = name; }
            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                return java.util.Objects.equals(name, ((MutableKey) o).name);
            }
            @Override
            public int hashCode() { return java.util.Objects.hash(name); }
        }
        java.util.Map<MutableKey, String> map = new java.util.HashMap<>();
        MutableKey key = new MutableKey("СтароеИмя");
        map.put(key, "Значение");
        assertEquals("Значение", map.get(key));
        key.name = "НовоеИмя";
        assertNull(map.get(key)); 
    }
}