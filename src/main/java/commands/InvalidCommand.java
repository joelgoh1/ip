package commands;

import storage.Storage;
import tasklist.TaskList;
import ui.Ui;

/**
 *  Handles any InvalidCommand that a user inputs. Error message
 *  will be displayed to the user on execute
 */
public class InvalidCommand extends Command{
    public final String result;

    public InvalidCommand(String result) {
        this.result = result;
    }

    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) {
        ui.showResult(result);
    }
}
