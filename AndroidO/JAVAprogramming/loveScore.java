package monp.example.couldthisbelove;

import java.util.Random;

public class LoveCalculator {

    public static void main(String[] args) {

        System.out.println("Your love score is: "+ifYouHadMyLove("Mr X.","Miss Y."));

    }

    public static int ifYouHadMyLove(String yourName,String theirName){

        Random randObject = new Random();
        int loveScore = randObject.nextInt(101);

        if(loveScore > 80){
            System.out.println(yourName +" and "+ theirName + " love each other like Kanye loves Kanye.");
        } else if(loveScore > 40) {
            System.out.println(yourName +" and "+ theirName +" go together like coke and menthol");
        } else{
                System.out.println("No love possible.");
            }


        return loveScore;

    }
}
