package duke.command;

import duke.Storage;
import duke.Ui;
import duke.task.TaskList;

/**
 * Represents a Command given by the user to exit and close the app.
 */
public class ExitCommand extends Command {
    /**
     * Prints a goodbye message and exits the application.
     * @param list A TaskList containing the user's Tasks.
     * @param storage A Storage object that handles the storage of tasks in local storage, allowing them to persist.
     */
    @Override
    public void execute(TaskList list, Storage storage) {
        Ui.goodbyeMessage();
    }

    /**
     * Gets whether the Command is to exit the application.
     * @return true
     */
    @Override
    public boolean isExit() {
        return true;
    }
}
