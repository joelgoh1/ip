package commands;

import tasklist.TaskList;
import ui.Ui;
import storage.Storage;

/**
 *  Handles the displaying of the user's task list to the user in a readable manner
 */
public class ListCommand extends Command{
    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < tasks.getTaskList().size(); i++) {
            output.append(i + 1).append(".");
            output.append(tasks.getTaskList().get(i));
        }
        ui.showResult(String.valueOf(output));
    }
}
