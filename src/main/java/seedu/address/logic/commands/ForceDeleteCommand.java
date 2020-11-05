package seedu.address.logic.commands;

import seedu.address.model.module.ModuleCode;

public class ForceDeleteCommand extends DeleteCommand {

    /**
     * Creates a ForceDeleteCommand to force delete the module with the specified {@code ModuleCode}
     */
    public ForceDeleteCommand(ModuleCode code) {
        super(code);
    }

    @Override
    public boolean requiresStall() {
        return false;
    }
}
