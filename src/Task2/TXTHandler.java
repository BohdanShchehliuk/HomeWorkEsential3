package Task2;

public class TXTHandler extends AbstractHandler {
    public TXTHandler(String docType) {
        super(docType);
        open();
        create();
        change();
        save();
    }

    @Override
    public void create() {
        System.out.printf("\nВи можете cтворити документи типу__ " + docType);
    }

    @Override
    public void change() {
        System.out.printf("\nВи можете змінити документи типу__ " + docType);
    }

    @Override
    public void save() {
        System.out.printf("\nВи можете зберегти документи типу__ " + docType);
        System.out.println("\n ");
    }
}
