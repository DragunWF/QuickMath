package dragunwf.quickmath;

public class Data {
    private static int gamesPlayedInSession = 0;
    private static int highScore = 0;
    
    public static void saveScore(int newScore) {
        gamesPlayedInSession++;
        if (newScore > highScore) {
            highScore = newScore;
        }
    }
    
    public static int getHighScore() {
        return highScore;
    }
}
