package J169_Executor_Testing_Futures;

import java.util.concurrent.Callable;

public class Fetch_Name implements Callable<String> {

    private final String name;

    public Fetch_Name(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        System.out.printf("\n Getting full name of %s from server", name);
        Thread.sleep(4000);
        return name + "Bhartiya";
    }
}