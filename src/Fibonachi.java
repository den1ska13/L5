import java.util.Arrays;

public class Fibonachi {
    public void getFibonachi () {
        int[] fmas = new int[11];
        fmas[0] = 1;
        fmas[1] = 1;
        for (int i = 2; i < fmas.length; i++) {
            fmas[i] = fmas[i-1] + fmas[i-2];
        }
        for (int i = 0; i < fmas.length; i++) System.out.print(fmas[i]+" ");
    }
}
