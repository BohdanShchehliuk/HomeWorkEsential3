package Task3;

public class Player implements Playable, Record {
    public Player() {
    }
    @Override
    public void play() {
        System.out.println("Грає музика.");
    }
    @Override
    public void record() {
        System.out.println("Запис музики.");
    }
    @Override
    public void pause() {
        System.out.println("Пауза.");
    }
    @Override
    public void stop() {
        System.out.println("Стоп.");
    }
}
