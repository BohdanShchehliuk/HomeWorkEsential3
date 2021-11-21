package Task2;

import java.util.Scanner;

public class User {
    public String docType;

    public User() {
        this.docType = select();
    }

    private String select() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введіть тип документу: XML, DOC або TXT");
        String docType = input.nextLine();
        return docType;
    }
}
