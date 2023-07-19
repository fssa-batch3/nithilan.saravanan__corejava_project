<<<<<<< HEAD
package day09.practice;

import java.time.LocalDate;
import java.util.Comparator;

class Task {
    private String name;
    private LocalDate deadline;
    private int priority;

    // Constructor, getters, and setters
}



public class m implements Comparator<Task> {
    @Override
    public int compare(Task task1, Task task2) {
        // Compare deadlines first
        int deadlineComparison = task1.getDeadline().compareTo(task2.getDeadline());
        if (deadlineComparison != 0) {
            return deadlineComparison;
        }

        // If the deadlines are the same, compare priorities
        return Integer.compare(task1.getPriority(), task2.getPriority());
    }
}

=======
package day09.practice;

import java.time.LocalDate;
import java.util.Comparator;

class Task {
    private String name;
    private LocalDate deadline;
    private int priority;

    // Constructor, getters, and setters
}



public class m implements Comparator<Task> {
    @Override
    public int compare(Task task1, Task task2) {
        // Compare deadlines first
        int deadlineComparison = task1.getDeadline().compareTo(task2.getDeadline());
        if (deadlineComparison != 0) {
            return deadlineComparison;
        }

        // If the deadlines are the same, compare priorities
        return Integer.compare(task1.getPriority(), task2.getPriority());
    }
}

>>>>>>> b4a9a9f8f32134ef21e6f65267938e9fd3159aff
