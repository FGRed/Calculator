package org.example.util;

import org.example.enums.Operation;

import java.util.Scanner;

import static org.example.util.ConsoleCommandUtil.print;
import static org.example.util.Formulas.*;

public class CalculatorService {

    public static void doOperation(int operation) {
        if (operation == Operation.CALCULATE.getOperation()) {
            calculate();
        } else if (operation == Operation.CONVERT.getOperation()) {
            convert();
        } else {
            throw new IllegalArgumentException("Illegal operation!");
        }
    }

    public static void calculate() {

        while (true) {
            double total;

            print("First value: ");
            Scanner scanner = new Scanner(System.in);
            double num1 = scanner.nextDouble();
            print("");
            print("First value: " + num1 + "\n");
            print("1) Sum" + "\n2) Subs" + "\n3) Add" + "\n4) Div" + "\n5) Exit");
            Scanner scanner1 = new Scanner(System.in);
            int sel = scanner1.nextInt();
            while (sel < 1 || sel > 5) {
                print("Invalid input.");
                sel = scanner.nextInt();
            }
            System.out.print("Second value: ");
            double num2 = scanner.nextDouble();

            if (sel == 1) {
                total = num1 + num2;
                print(num1 + " + " + num2 + " = " + total + "\n");
                num1 = total;
            }
            if (sel == 2) {
                total = num1 - num2;
                print(num1 + " - " + num2 + " = " + total + "\n");
                num1 = total;
            }
            if (sel == 3) {
                total = num1 * num2;
                print(num1 + " * " + num2 + " = " + total + "\n");
                num1 = total;
            }
            if (sel == 4) {
                total = num1 / num2;
                print(num1 + " / " + num2 + " = " + total + "\n");
                num1 = total;
            }
            if (sel == 5) {
                break;
            }
        }
    }


    public static void convert() {
        double total;
        double value;
        int selConv;
        print("Select conversion type:");
        print("1) Area" +"\n2) Energy" +"\n3) Length" +"\n4) Speed" +"\n5) Temperature"
                +"\n6) Volume");
        Scanner sc = new Scanner(System.in);
        int conv = sc.nextInt();
        while(conv < 1 || conv > 6) {
            print("Invalid input! Select again.");
            print("1) Area" +"\n2) Energy" +"\n3) Length" +"\n4) Speed" +"\n5) Temperature"
                    +"\n6) Volume");
            conv = sc.nextInt();
        }
        switch (conv) {
            case (1):
                print("Select conversion:"); //Area
                print("1) Square feet > Square meters" +"\n2) Square meters > Square feet"
                        +"\n3) Square miles > Square kilometers" +"\n4) Square kilometers > Square miles");
                Scanner sc1 = new Scanner(System.in);
                selConv = sc1.nextInt();
                while (selConv < 1 || selConv > 4) {
                    print("Invalid input!");
                    selConv = sc1.nextInt();
                }
                System.out.print("Enter value: ");
                Scanner sc2 = new Scanner(System.in);
                value = sc2.nextDouble();
                if(selConv == 1) {
                    total = value * SQUARE_ROOT_METERS_MUL;
                    print(value +" Square foot is " +total +" square meters.");
                } if(selConv == 2) {
                total = value * SQUARE_ROOT_FEET_MUL;
                print(value +" Square meters is " +total +" square foot.");
            } if(selConv == 3) {
                total = value * SQAURE_ROOT_KM_MUL;
                print(value +" Square miles is " +total +" square kilometers.");
            } if(selConv == 4) {
                total = value * SQUARE_ROOT_MILSE_MUL;
                print(value +" Square kilometers is " +total +" square miles.");
            }
                break;

            case(2):
                print("Select conversion:"); //Energy
                print("1) Kilocalories > Kilojoules" +"\n2) Kilojoules > Kilocalories"
                        +"\n3) Foot-pounds > Newton meters" +"\n4) Newton meters > Foot-pounds");
                Scanner sc12 = new Scanner(System.in);
                selConv = sc12.nextInt();
                while (selConv < 1 || selConv > 4) {
                    print("Invalid input!");
                    selConv = sc12.nextInt();
                }
                System.out.print("Enter value: ");
                Scanner sc22 = new Scanner(System.in);
                value = sc22.nextDouble();
                if(selConv == 1) {
                    total = value * 4.184;
                    print(value +" kilocalories is " +total +" kilojoules.");
                } if(selConv == 2) {
                total = value * 0.2390057361;
                print(value +" kilojoules is " +total +" kilocalories.");
            } if(selConv == 3) {
                total = value * 1.3558179483;
                print(value +" foot-pounds is " +total +" newton meters.");
            } if(selConv == 4) {
                total = value * 0.7375621493;
                print(value +" newton meters is " +total +" foot-pounds.");
            }
                break;


            case(3):
                System.out.print("Select conversion:"); //Length
                System.out.print("1) Feet > Meters" +"\n2) Meters > Feet" +"\n3) Feet > Centimeters"
                        +"\n4) Centimeters > Feet" +"\n5) Inches > Centimeters" +"\n6) Centimeters > Inches");
                Scanner sc13 = new Scanner(System.in);
                selConv = sc13.nextInt();
                while (selConv < 1 || selConv > 6) {
                    print("Invalid input!");
                    selConv = sc13.nextInt();
                }
                System.out.print("Enter value: ");
                Scanner sc23 = new Scanner(System.in);
                value = sc23.nextDouble();
                if(selConv == 1) {
                    total = value * 0.3048;
                    print(value +" feet is " +total +" meters.");
                } if(selConv == 2) {
                total = value * 3.280839895;
                print(value +" meters is " +total +" feet.");
            } if(selConv == 3) {
                total = value * 30.48;
                print(value +" feet is " +total +" centimeters.");
            } if(selConv == 4) {
                total = value * 0.032808399;
                print(value +" centimeters is " +total +" feet.");
            } if(selConv == 5) {
                total = value * 2.54;
                print(value + " inches is " + total + " centimeter.");
            } if(selConv == 6) {
                total = value * 0.3937007874;
                print(value + " centimeters is " + total + " inches.");
            }
                break;


            case(4):
                print("Select conversion:"); //Speed
                print("1) Km/h > Mph" +"\n2) Mph > Km/h" +"\n3) Km/h > Meters per second"
                        +"\n4) Meters per second > Km/h");
                Scanner sc14 = new Scanner(System.in);
                selConv = sc14.nextInt();
                while (selConv < 1 || selConv > 4) {
                    print("Invalid input!");
                    selConv = sc14.nextInt();
                }
                System.out.print("Enter value: ");
                Scanner sc24 = new Scanner(System.in);
                value = sc24.nextDouble();
                if(selConv == 1) {
                    total = value * 0.6213711922;
                    print(value +" kilometers per hour is " +total +" miles per hour.");
                } if(selConv == 2) {
                total = value * 1.609344;
                print(value +" miles per hour is " +total +" kilometers per hour.");
            } if(selConv == 3) {
                total = value * 0.2777777778;
                print(value +" kilometers per hour is " +total +" meters per second.");
            } if(selConv == 4) {
                total = value * 3.6;
                print(value + " meters perr second is " + total + " kilometers.");
            }
                break;


            case(5):
                print("Select conversion:"); //Temp
                print("1) Fahrenheit > Celsius" +"\n2) Celsius > Fahrenheit" +"\n3) Celsius > Kelvin"
                        +"\n4) Kelvin > Celsius");
                Scanner sc15 = new Scanner(System.in);
                selConv = sc15.nextInt();
                while (selConv < 1 || selConv > 4) {
                    print("Invalid input!");
                    selConv = sc15.nextInt();
                }
                System.out.print("Enter value: ");
                Scanner sc25 = new Scanner(System.in);
                value = sc25.nextDouble();
                if(selConv == 1) {
                    total = (value - 32) / 1.8;
                    print(value +" fahrenheit is " +total +" celsius.");
                } if(selConv == 2) {
                total = value * 1.8 + 32;
                print(value +" celsius is " +total +" fahrenheit.");
            } if(selConv == 3) {
                total = value + 273.15;
                print(value +" celsius is " +total +" kelvin.");
            } if(selConv == 4) {
                total = value - 273.15;
                print(value +" kelvin is " +total +" celsius.");
            }
                break;


            case(6):
                print("Select conversion:"); //Volume
                print("1) US gallons > Liters" +"\n2) Liters > US gallons" +"\n3) Fluid Oz > Milliliter"
                        +"\n4) Milliliter > Fluid Oz");
                Scanner sc16 = new Scanner(System.in);
                selConv = sc16.nextInt();
                while (selConv < 1 || selConv > 4) {
                    print("Invalid input!");
                    selConv = sc16.nextInt();
                }
                System.out.print("Enter value: ");
                Scanner sc26 = new Scanner(System.in);
                value = sc26.nextDouble();
                if(selConv == 1) {
                    total = value * 3.785411784;
                    print(value +" (US) gallons is " +total +" liters.");
                } if(selConv == 2) {
                total = value * 0.2641720524;
                print(value +" liters is " +total +" (US) gallons.");
            } if(selConv == 3) {
                total = value * 29.5735295625;
                print(value +" fluid ounces is " +total +" milliliters.");
            } if(selConv == 4) {
                total = value * 0.0338140227;
                print(value +" milliliters is " +total +" fluid ounces.");
            }
                break;

            default:
                break;
        }
    }

}
