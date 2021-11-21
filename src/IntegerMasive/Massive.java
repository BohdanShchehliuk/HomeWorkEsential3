package IntegerMasive;

public class Massive {

    int number = 10; // розмір масива
    int [] array = new int[number];
    public Massive() {
        creatMassive();
        System.out.println(" ");
    }
    public int  [] creatMassive() {
        for (int i = 0; i<number; i++) {
            array[i] = (int)(Math.random()*100);
            System.out.print(array[i]+" ");
        }
        return array ;
    }
}
