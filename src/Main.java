import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("1) Максимальное кол-во максимальных элементов");
        System.out.println("2) Массив(замена значений)");
        System.out.println("3) Случайный двумерный массив");
        System.out.println("4) Фибоначи");
        System.out.println("5) Счастливый билетик");
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        switch (w) {
            case 1: {
                int [] a = {2,5,6,7,4,3,5,7,3,7};
                Max a1 = new Max();
                System.out.println(a1.getMax(a));
                break;
            }
            case 2: {
                RMas m = new RMas();
                m.getRmas();
                break;
            }
            case 3: {
                Rand r = new Rand();
                r.gerRand();
                break;
            }
            case 4: {
                Fibonachi f = new Fibonachi();
                f.getFibonachi();
                break;
            }
            case 5: {
                Bilet b1 = new Bilet();
                b1.getBilet();
                break;
            }
            default: {
                System.out.println("Неправильный выбор");
            }
        }
    }
}
