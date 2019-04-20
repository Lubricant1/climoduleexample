package handler.implementation;

import commands.CommandFactory;
import data.Context;
import handler.CmdHandler;
import org.apache.commons.cli.*;

import java.util.Objects;
import java.util.Scanner;

public class ApacheCmdHandler implements CmdHandler {
    private static CmdHandler instance;
    private Options options;
    private HelpFormatter helpFormatter;
    private CommandLineParser parser;
    private Context context;

    @Override
    public void handle() {
        printHelp();
        try {
            while (true) {
                Scanner scanner = new Scanner(System.in);
                String line = scanner.nextLine();
                CommandLine cmd = parser.parse(options, line.split(" "));
                String option = ;//todo: define option
                String[] parameters = ;//todo: define parameters
                boolean success = CommandFactory
                    .getInstance().getCommand(option).execute(context, parameters);
                if (!success)
                    throw new RuntimeException();
            }
        } catch (Exception e) {
            printHelp();
        }
    }

    public static CmdHandler getInstance() {
        if (Objects.isNull(instance))
            instance = new ApacheCmdHandler();
        return instance;
    }

    private ApacheCmdHandler() {
        initialize();
    }

    private void initialize() {
        context = new Context();
        options = new Options();
        helpFormatter = new HelpFormatter();
        parser = new DefaultParser();
        prepareOptions();
    }

    private void prepareOptions() {
        //todo: still thinking of using another approach
        CommandFactory
            .getInstance()
            .getCommands()
            .forEach((s, command) -> options.addOption(s, true, command.getDefinition()));
    }

    private void printHelp() {
        helpFormatter.printHelp("Usage:", options);
    }

}
