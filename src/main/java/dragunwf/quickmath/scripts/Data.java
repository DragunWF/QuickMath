package dragunwf.quickmath.scripts;

public class Data {
    private static int gamesPlayedInSession = 0;
    private static int highScore = 0;
    private static boolean newHighScore = false;
    
    public static void saveScore(int score) {
        gamesPlayedInSession++;
        if (score > highScore) {
            highScore = score;
            newHighScore = true;
        }
    }
    
    public static void onNewGame() {
        newHighScore = false;
    }
    
    public static boolean isNewHighScore() { 
        return newHighScore;
    }
    
    public static int getGamesPlayed() {
        return gamesPlayedInSession;
    }
    
    public static int getHighScore() {
        return highScore;
    }
}
