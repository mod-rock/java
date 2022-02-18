import java.util.*;
import java.text.*;

class Main{
    private static void calculateFuelConsumption(double litre, double km){
        DecimalFormat decimal = new DecimalFormat("0.00");

        double mile = km*0.6214;
        double gallon = litre*0.2642;

        double litresPerKM = litre/km*100;
        double gallonsPerMile = mile/gallon;

        System.out.println("Litres/100KM");
        System.out.println(litresPerKM);
        System.out.println("Miles/gallons");
        System.out.println(gallonsPerMile);
    }

    private static void errorCheck(double value){
        if(value<=0){
            System.out.println(value + " is an Invalid Input");
            System.exit(0);
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no of litres to fill the tank:");
        double litre = in.nextDouble();
        errorCheck(litre);
        System.out.println("Enter the distance covered");
        double km = in.nextDouble();
        errorCheck(km);
        calculateFuelConsumption(litre, km);
    }
}