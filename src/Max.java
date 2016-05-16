public class Max {
    public int getMax(int array[]){
        int max = array[0];
        int k = 0;
        for(int i = 0; i<array.length; i++){
            if (array[i] == max) k++;
            if (array[i] > max) max = array[i];
        }
        return k;
    }

}
