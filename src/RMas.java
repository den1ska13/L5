public class RMas {
    public void getRmas() {
        int [] mas = {5,6,1,3,7,9,3,1,3,5,6,7,9,3,1};
        for (int i = 0; i < mas.length; i++) System.out.print(mas[i]+" ");
        System.out.println();
        int p = 0;
        int l = mas.length;
        for (int i = 0; i < (mas.length/2); i++) {
            p = mas[l-i-1];
            mas[l-i-1] = mas[i];
            mas[i] = p;
        }
        for (int i = 0; i < mas.length; i++) System.out.print(mas[i]+" ");
    }
}
