package dragunwf.quickmath.scripts;

public class Data {
    private static int gamesPlayedInSession = 0;
    private static int highScore = 0;
    
    public static void saveScore(int score) {
        gamesPlayedInSession++;
        if (score > highScore) {
            highScore = score;
        }
    }
    
    public static int getGamesPlayed() {
        return gamesPlayedInSession;
    }
    
    public static int getHighScore() {
        return highScore;
    }
}
