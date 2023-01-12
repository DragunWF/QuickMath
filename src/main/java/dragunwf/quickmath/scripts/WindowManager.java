package dragunwf.quickmath.scripts;

import dragunwf.quickmath.ui.GameUI;
import dragunwf.quickmath.ui.MainMenuUI;
import dragunwf.quickmath.ui.RetryMenuUI;

public class WindowManager {
    private static MainMenuUI mainMenuUI;
    private static GameUI gameUI;
    private static RetryMenuUI retryMenuUI;
    
    public static void openMainMenu() throws Exception {
        WindowManager.openWindow("mainMenu");
    }
    
    public static void openGame() throws Exception {
        WindowManager.openWindow("game");
    }
    
    public static void openRetryMenu() throws Exception {
        WindowManager.openWindow("retryMenu");
    }
    
    private static void openWindow(String name) throws Exception {
        switch (name) {
            case "mainMenu":
                mainMenuUI = new MainMenuUI();
                mainMenuUI.start();
                break;
            case "game":
                gameUI = new GameUI();
                gameUI.start();
                break;
            case "retryMenu":
                retryMenuUI = new RetryMenuUI();
                retryMenuUI.start();
                break;
            default:
                throw new Exception("Window name passed is not recognized!");
        }
        System.out.printf("Opened %sUI\n", name);
    }
}
