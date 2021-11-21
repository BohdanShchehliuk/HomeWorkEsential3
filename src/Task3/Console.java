package Task3;

import java.awt.*;
import java.util.Scanner;

public class Console {
    public int number;
    public Console() {
        console();
    }
    public int console() {
        System.out.println("Введіть цифру від одного до чотирьох");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        return number;
    }
}
