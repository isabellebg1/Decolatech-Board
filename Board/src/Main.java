package com.taskboard;

public class Main {
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
