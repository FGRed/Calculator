package org.example.enums;

public enum Operation {
    CALCULATE(1),
    CONVERT(2);

    private final int operation;
    Operation(int operation){
        this.operation = operation;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public int getOperation() {
        return operation;
    }
}
