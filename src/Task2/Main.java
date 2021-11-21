package Task2;

public class Main {
    public static void main(String[] arg) {
        User user = new User();

        if (user.docType.equals("XML")) {
            AbstractHandler abstractHandler = new XMLHandler("XML");
        } else if (user.docType.equals("DOC")) {
            AbstractHandler abstractHandler = new XMLHandler("DOC");
        } else if (user.docType.equals("TXT")) {
            AbstractHandler abstractHandler = new XMLHandler("TXT");
        } else {
            System.out.println("Ви ввели невірний формат");
        }
    }
}

