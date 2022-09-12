public class Main {
    public static void main(String[] args) {
        guitar g = new guitar(6);
        baraban b = new baraban(100);
        truba t = new truba(10);
        instrument[] inter = {g, b, t};
        for (instrument i : inter) {
            i.play();
        }
    }
}
