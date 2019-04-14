package commands;

import data.Context;

public interface Command {
    boolean execute(Context ctx, String[] args);
    String getDefinition();
}
