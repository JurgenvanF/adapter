package com.hz;

import java.util.List;
import java.util.Arrays;

public class BooleanAdapter implements BooleanAdapterInterface {

    private ConsoleReader adaptee;

    private List<String> trueResponse;

    public BooleanAdapter(ConsoleReader reader) {

        this.adaptee = reader;

        String[] trueResponses = new String[] {"true", "yes", "oh yeah", "great", "sure", "love to", "of course", "always", "never done otherwise"};
        this.trueResponse = Arrays.asList(trueResponses);
    }

    @Override public Boolean readLineBoolean() {

        String line = this.adaptee.readLine();

        return trueResponse.contains(line);
    }
}