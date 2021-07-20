package monp.example.learnjava;


import java.util.HashMap;

public class JavaHashMaps {
    public static void main(String[] args){
        HashMap<String, Integer> gameStats = new HashMap<>();
        gameStats.put("James",100);
        gameStats.put("Ruth",457);
        gameStats.put("Carolina",697);

        //gameStats.clear();
        //gameStats.remove("James");

       // for(String item:gameStats.keySet()){
        // System.out.println(item);
        //}

        //for(int item: gameStats.values()){
        //    System.out.println(item);
        //}

        for(String item: gameStats.keySet()){
            System.out.println("key:"+item+" value: "+gameStats.get(item));
        }

        //System.out.println(gameStats.size());

    }
}
