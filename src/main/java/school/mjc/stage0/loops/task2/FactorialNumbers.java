package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int  count = 0;
        while(count <= printToInclusive){
            int factorial = 1;
            int result = 1;
            while(factorial <= count){
                result = result * factorial;
                factorial++;
            }
            System.out.println(result);
            count++;
        }


    }
}
