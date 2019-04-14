package commands.implementation;

import annotations.CommandAnnotation;
import commands.Command;
import common.CommandConstants;
import data.Context;

@CommandAnnotation(commandType = CommandConstants.READ_COMMAND)
public class ReadCommand implements Command {
    private String definition;

    public ReadCommand(String definition) {
        this.definition = definition;
    }

    /**
     * Method reads file (arg)
     * parses file and puts it to ctx
     * returns operation success
     */
    public boolean execute(Context ctx, String[] args) {
        //todo: implement
    }

    @Override
    public String getDefinition() {
        return definition;
    }
}
