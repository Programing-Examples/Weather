package main.java.com.company;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        double[] dailyTemp = new double[30];
        Random rand = new Random(); //Class to create random numbers

        //nextDouble() returns a random number between 0 and 1
        for (int i = 0; i < dailyTemp.length; i++) {
            dailyTemp[i] = (rand.nextDouble() * 8) + 24; //Multiplying by 8 plus 24 gets us numbers between 24 and 32
            System.out.println("Temp on day "+ (i+1) + ": " + dailyTemp[i]);
        }

        System.out.println("----------------------------");

        //Get the max temperature
        double maxTemp = dailyTemp[0];

        for (double temp : dailyTemp) {
            if (temp > maxTemp) {
                maxTemp = temp;
            }
        }

        System.out.println("The highest temperature was: " + maxTemp);

        System.out.println("----------------------------");

        //Get the min temperature
        double minTemp = dailyTemp[0];

        for (double temp : dailyTemp) {
            if (temp < minTemp) {
                minTemp = temp;
            }
        }

        System.out.println("The lowest temperature was: " + minTemp);

        System.out.println("----------------------------");

        //Calculate the average temperature
        double avgTemp = 0;

        for (double temp : dailyTemp) {
            avgTemp += temp;
        }

        avgTemp = avgTemp/dailyTemp.length; //avgTemp /= dailyTemp.length

        System.out.println("The average temperature was: " + avgTemp);

    }
}
