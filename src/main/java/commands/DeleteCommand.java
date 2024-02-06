package commands;

import exceptions.FileError;
import storage.Storage;
import tasklist.TaskList;
import tasks.Task;
import ui.Ui;

public class DeleteCommand extends Command {
    private final int index;

    public DeleteCommand(int index) {
        this.index = index;
    }

    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) throws FileError {
        Task removedTask = tasks.getTaskList().get(index - 1);
        tasks.getTaskList().remove(index - 1);
        String result = "Noted. I've removed this task:\n"
                + removedTask
                + String.format("Now you have %d tasks in the list\n", tasks.getTaskList().size());
        ui.showResult(result);
        storage.write(tasks.getTaskList());
    }
}
