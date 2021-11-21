package IntegerMasive;

public class InOrder extends Massive {

    int[] arrayNew = new int[array.length];

    public int[] order() {

        for (int k=0; k<array.length-1; k++) {
          int min = array[0];
            for (int i = 0; i < array.length - (k+1); i++) {
                if (array[i + 1] > min) {
                    array[i] = array[i + 1];
                    array[i + 1] = min;
                } else {
                    min = array[i + 1];
                }
            }
        }
        return array;
    }
}


