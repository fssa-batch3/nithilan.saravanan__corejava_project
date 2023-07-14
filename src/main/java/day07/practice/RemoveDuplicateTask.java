package day07.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicateTask {
    public static void main(String[] args) {
        ArrayList<Task> tasks = new ArrayList<>();

        // Create Task objects with duplicate names and deadlines
        Task task1 = new Task(1, "Task 1", LocalDate.of(2023, 7, 15));
        Task task2 = new Task(2, "Task 2", LocalDate.of(2023, 7, 15));
        Task task3 = new Task(3, "Task 1", LocalDate.of(2023, 7, 15));
        Task task4 = new Task(4, "Task 3", LocalDate.of(2023, 7, 16));
        Task task5 = new Task(5, "Task 1", LocalDate.of(2023, 7, 15));

        // Add Task objects to the ArrayList
        tasks.add(task1);
        tasks.add(task2);
        tasks.add(task3);
        tasks.add(task4);
        tasks.add(task5);

        // Create a HashSet<Task> to remove duplicate tasks
        HashSet<Task> uniqueTasks = new HashSet<>(tasks);

        // Display the unique tasks
        System.out.println("Unique tasks:");
        for (Task task : uniqueTasks) {
            System.out.println(task);
        }
    }

    // Task class representing a task with an id, name, and deadline
    static class Task {
        private int id;
        private String name;
        private LocalDate deadline;

        public Task(int id, String name, LocalDate deadline) {
            this.id = id;
            this.name = name;
            this.deadline = deadline;
        }

        @Override
        public String toString() {
            return "Task{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", deadline=" + deadline +
                    '}';
        }
    }
}
