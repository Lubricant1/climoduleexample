package commands.implementation;

import annotations.CommandAnnotation;
import commands.Command;
import common.CommandConstants;
import data.Context;

@CommandAnnotation(commandType = CommandConstants.SAVE_COMMAND)
public class SaveCommand implements Command {
    private String definition;

    public SaveCommand(String definition) {
        this.definition = definition;
    }

    /**
     * Method saves data from ctx to file (arg)
     * returns operation success
     */
    public boolean execute(Context ctx, String[] args) {
        //todo: implementation
    }

    @Override
    public String getDefinition() {
        return definition;
    }
}
