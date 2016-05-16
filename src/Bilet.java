public class Bilet {
    public void getBilet() {
        int sum = 1;
        int a = 0;
        int b = 0;
        for (int i = 1; i < 1000000; i++) {
            a = 0;
            b = 0;
            int v = i;
            int bi = i;
            for (int j = 0; j < 3; j++){
                a += v%10;
                v = v/10;
            }
            for (int k = 0; k < 3; k++){
                b += v%10;
                v = v/10;
            }
            if (a == b) sum++;

        }
        System.out.println(sum);
    }
}
