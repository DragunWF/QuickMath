package dragunwf.quickmath.scripts;

public class Game {
    private static String equationText = null;
    private static int correctAnswer;
    private static final int BASE_TIME = 60; // in seconds
    
    public static void randomizeEquation() {
        int a = getRandomNum(5, 150); 
        int b = getRandomNum(5, 150);
        equationText = String.format("%s + %s", a, b);
        correctAnswer = a + b;
    }
    
    public static String getEquationText() throws Exception {
        validateEquation();
        return equationText;
    }
    
    public static int getCorrectAnswer() throws Exception {
        validateEquation();
        return correctAnswer;
    }
    
    public static int getBaseTime() {
        return BASE_TIME;
    }
    
    private static void validateEquation() throws Exception {
        if (equationText == null) {
            throw new Exception("Call randomizeEquation() first!");
        }
    }
    
    private static int getRandomNum(int min, int max) {
        return (int) Math.floor(Math.random() * (max - min) + min);
    }
}
