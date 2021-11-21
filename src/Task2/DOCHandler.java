package Task2;

public class DOCHandler extends AbstractHandler {
    public DOCHandler(String docType) {
        super(docType);
        open();
        create();
        change();
        save();
    }

    @Override
    public void create() {
        System.out.print("\nВи можете cтворити документи типу__ " + docType);
    }

    @Override
    public void change() {
        System.out.print("\nВи можете змінити документи типу__ " + docType);
    }

    @Override
    public void save() {
        System.out.print("\nВи можете зберегти документи типу__ " + docType);
       }
}
