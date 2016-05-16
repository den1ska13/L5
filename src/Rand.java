import java.util.Arrays;
import java.util.Random;

public class Rand {
    public void gerRand() {
        double rand = (int)(Math.random()*10);
        Random random = new Random();
        int i1 = random.nextInt(10) + 10;

        Integer array[][] = new Integer[10][10];
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10);
            }
        }
        System.out.println(Arrays.deepToString(array));

    }
}
