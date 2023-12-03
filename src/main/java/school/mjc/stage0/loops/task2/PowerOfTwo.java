package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int count = 0;
        if(power <0){
            System.out.println("too much power");
        } else {
            int result = 1;
            while (count <= power) {
                if(count == 0){
                    System.out.println(result);
                } else {
                    result *= 2;
                    System.out.println( result);
                }
                count++;
            }
        }

    }
}
