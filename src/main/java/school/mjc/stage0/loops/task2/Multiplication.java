package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int count = 0;
        while (count <= multiplyByAndToInclusive || count <= multiplyByAndToInclusive * -1) {
            if(multiplyByAndToInclusive == 0){
                System.out.print("");
            } else {
                System.out.println(count * multiplyByAndToInclusive);
            }
            count++;
        }
    }
}
