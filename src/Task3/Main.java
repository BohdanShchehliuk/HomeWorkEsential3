package Task3;

public class Main extends Player {

    public static void main(String[] arg) {
        Player player = new Player();
        Console console = new Console();
        if (console.number == 1) {
            player.play();
        } else if (console.number == 2) {
            player.record();
        } else if (console.number == 3) {
            player.pause();
        } else if (console.number == 4) {
            player.stop();
        } else {
            System.out.println("Ви натиснули неправильну клавішу_" + console.number);
        }
    }
}

