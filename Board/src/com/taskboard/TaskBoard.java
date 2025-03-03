package com.taskboard;

import java.util.ArrayList;
import java.util.List;

public class TaskBoard {
    private final List<Task> tasks;

    public TaskBoard() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void displayTasks() {
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    public void updateTaskStatus(String title, String newStatus) {
        for (Task task : tasks) {
            if (task.getTitle().equals(title)) {
                task.setStatus(newStatus);
                break;
            }
        }
    }

    public static void main(String[] args) {
        TaskBoard board = new TaskBoard();

        // Adding tasks
        board.addTask(new Task("Implement Feature X", "Write code for feature X", "To Do"));
        board.addTask(new Task("Fix Bug Y", "Fix the bug in module Y", "In Progress"));
        board.addTask(new Task("Write Documentation", "Document the new API", "Done"));

        // Displaying tasks
        System.out.println("Initial Task Board:");
        board.displayTasks();

        // Updating a task status
        board.updateTaskStatus("Implement Feature X", "In Progress");

        // Displaying tasks after update
        System.out.println("\nUpdated Task Board:");
        board.displayTasks();
    }
}