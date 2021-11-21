package Task2;

abstract class AbstractHandler {
    public String docType;
    public AbstractHandler(String docType) {
        this.docType = docType;
    }
    void open() {
        System.out.print("Вітаємо! Ви відкрили документ формату__"+docType);
    }
    public abstract void create();
    public abstract void change();
    public abstract void save();
}
