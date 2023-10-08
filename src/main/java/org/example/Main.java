package org.example;

import java.util.Scanner;

import static org.example.util.CalculatorService.doOperation;
import static org.example.util.ConsoleCommandUtil.print;

public class Main {
    public static void main(String[] args) {
        runProgram();
    }

    public static void runProgram(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            print("Select program: ");
            print("1) Calculator \n2) Converter");
            int selProg = scanner.nextInt();
            if(selProg < 1 || selProg > 2){
                break;
            }
            doOperation(selProg);
        }
    }

}
