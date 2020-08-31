package duke;

import java.util.ArrayList;

import duke.task.Task;

/**
 * Ui is a class that prints messages to the user.
 */
public class Ui {
    /**
     * Prints a welcome message.
     */
    public static void welcomeMessage() {
        String catLogo = "        /\\_____/\\\n"
                + "       /  o   o  \\\n"
                + "      ( ==  ^  == )\n"
                + "       )         (\n"
                + "      (           )\n"
                + "     ( (  )   (  ) )\n"
                + "    (__(__)___(__)__)";
        System.out.println(catLogo);

        System.out.println("    ____________________________________________________________");
        System.out.println("    Hello! I'm NEKOBOT!!");
        System.out.println("    What can I do for you :>");
        System.out.println("    ____________________________________________________________");
    }

    /**
     * Prints a goodbye message.
     */
    public static void goodbyeMessage() {
        System.out.println("    ____________________________________________________________");
        System.out.println("     Bye~ Hope to see you again soon ;w;");
        System.out.println("    ____________________________________________________________");
    }

    /**
     * Prints all tasks in the TaskList.
     * @param taskList An ArrayList containing all existing Tasks.
     */
    public static void listMessage(ArrayList<Task> taskList) {
        System.out.println("    ____________________________________________________________");
        System.out.println("    Here are the tasks in your list!!");
        int index = 1;
        for (Task task : taskList) {
            System.out.println("    " + index + ". " + task);
            index++;
        }
        System.out.println("    ____________________________________________________________");
    }

    /**
     * Prints all tasks whose date is set as the current date (today).
     * @param taskList An ArrayList containing all existing Tasks.
     */
    public static void todayMessage(ArrayList<Task> taskList) {
        // TODO: refactor to filter in duke.task.TaskList class
        System.out.println("    ____________________________________________________________");
        System.out.println("    Here are today's tasks!!");
        int index = 1;
        for (Task task : taskList) {
            if (task.isToday()) {
                System.out.println("    " + index + ". " + task);
                index++;
            }
        }
        System.out.println("    ____________________________________________________________");
    }

    /**
     * Prints all tasks that match the search term provided
     * @param taskList An ArrayList containing all Tasks that match the search term provided
     */
    public static void findMessage(ArrayList<Task> taskList) {
        if (taskList.size() == 0) {
            System.out.println("    ____________________________________________________________");
            System.out.println("    Oh dear, I couldn't find any matching tasks :o");
            System.out.println("    ____________________________________________________________");
        } else {
            System.out.println("    ____________________________________________________________");
            System.out.println("    Here are your search results!!");
            int index = 1;
            for (Task task: taskList) {
                System.out.println("    " + index + ". " + task);
                index++;
            }
            System.out.println("    ____________________________________________________________");
        }
    }

    /**
     * Prints a message indicating the specified task has been added.
     * @param task The Task that has been added.
     * @param size An integer value representing the new size of the TaskList.
     */
    public static void addTaskMessage(Task task, int size) {
        System.out.println("    ____________________________________________________________");
        System.out.println("     Okies! I've added this task~");
        System.out.println("       " + task);
        System.out.println("     Now you have " + size + " tasks in the list uwu");
        System.out.println("    ____________________________________________________________");
    }

    /**
     * Prints a message indicating the specified task has been marked completed.
     * @param task The Task that has been marked completed.
     */
    public static void doneTaskMessage(Task task) {
        System.out.println("    ____________________________________________________________");
        System.out.println("     Yay! I've marked this task as done :3");
        System.out.println("       " + task);
        System.out.println("    ____________________________________________________________");
    }

    /**
     * Prints a message indicating the specified task has been deleted.
     * @param task The Task that has been deleted.
     * @param size An integer value representing the new size of the TaskList.
     */
    public static void deleteTaskMessage(Task task, int size) {
        System.out.println("    ____________________________________________________________");
        System.out.println("     Got it! I'll remove this task :>");
        System.out.println("       " + task);
        System.out.println("     Only " + size + " tasks left!!");
        System.out.println("    ____________________________________________________________");
    }

    /**
     * Prints out the error message of the exception that occurred.
     * @param uiMessage The error message of the exception that occurred.
     */
    public static void errorMessage(String uiMessage) {
        System.out.println("    ____________________________________________________________");
        System.out.println("    " + uiMessage);
        System.out.println("    ____________________________________________________________");
    }
}
