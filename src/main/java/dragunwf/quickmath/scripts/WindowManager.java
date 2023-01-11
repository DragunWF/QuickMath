package dragunwf.quickmath.scripts;

import dragunwf.quickmath.ui.GameUI;
import dragunwf.quickmath.ui.MainMenuUI;

public class WindowManager {
    private static MainMenuUI mainMenuUI;
    private static GameUI gameUI;
    
    public static void initializeTabs() {
        mainMenuUI = new MainMenuUI();
        mainMenuUI.start();
    }
    
    public static void openGameUI() {
        gameUI = new GameUI();
        gameUI.start();
    }
}
