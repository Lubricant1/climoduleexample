import handler.implementation.ApacheCmdHandler;

public class Main {
    public static void main(String[] args) {
        //todo: think about how to avoid using only apache-cli
        ApacheCmdHandler.getInstance().handle();
    }
}
