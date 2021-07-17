public class Multiple {
    
    public void getMultipleOfThree(int[] numbers) {
        
        //TODO: print multiple of 3 - System.out.print()
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i]%3 == 0){
                System.out.print(numbers[i]);
            }
        }
        
        
    }

}
