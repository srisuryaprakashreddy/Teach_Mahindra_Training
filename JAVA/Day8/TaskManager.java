package homework;
import java.util.LinkedList;
import java.util.Iterator;

class TaskManager {
    private LinkedList<String> tasks = new LinkedList<>();

    public void manageTasks() {

        tasks.addFirst("Complete project report");
        tasks.addLast("Attend team meeting");
        tasks.addLast("Reply to emails");

        // Remove completed task from the start
        tasks.removeFirst();

        // Display all tasks
        Iterator<String> iterator = tasks.iterator();
        System.out.println("To-Do List:");
        while (iterator.hasNext()) {
            System.out.println("- " + iterator.next());
        }
    }

    public static void main(String[] args) {
        TaskManager tm = new TaskManager();
        tm.manageTasks();
    }
}

