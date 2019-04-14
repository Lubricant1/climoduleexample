package commands;

import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class CommandFactory {
    private static CommandFactory instance;
    private Map<String, Command> commands;

    public static CommandFactory getInstance() {
        if (Objects.isNull(instance))
            instance = new CommandFactory();
        return instance;
    }

    private CommandFactory() {
        initialize();
    }

    /**
     * Method scans package annotated CommandPackageAnnotation
     * and puts instances of classes annotated CommandAnnotation
     */
    private void initialize() {
        //todo: implementation
    }

    public Collection<String> getCommandDefinitions() {
        return commands
            .values()
            .stream()
            .map(Command::getDefinition)
            .collect(Collectors.toList());
    }

    public Map<String, Command> getCommands() {
        return commands;
    }

    public Command getCommand(String commandType) {
        return commands.get(commandType);
    }
}
