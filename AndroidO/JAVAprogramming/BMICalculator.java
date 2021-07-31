
package monp.example.bmi;

import java.util.Random;

public class BMICalculator {
    public static void main(String[] args) {
        System.out.println("BMI is: "+ BMIcal(58,1.65));
    }

    public static double BMIcal(double weight,double height){

        double BMIScore = weight/(height*height);

        if(BMIScore <  18.5){
            System.out.println("You are underweight.");
        } else if(BMIScore > 25) {
            System.out.println("Your are overweight.");
        } else{
            System.out.println("Your weight is normal.");
        }


        return BMIScore;

    }
}
