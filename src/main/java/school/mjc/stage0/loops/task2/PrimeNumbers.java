package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int count = 0;
        while( count <= printToInclusive){
            if(count > 1 && (count == 2 || count == 3 || count == 5 || (((count-1) % 6 == 0 || (count+1) % 6 == 0) && count % 5 != 0))){
                System.out.println(count);
            }
            count++;
        }
    }
}
