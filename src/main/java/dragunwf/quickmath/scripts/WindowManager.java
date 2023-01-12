package dragunwf.quickmath.scripts;

import dragunwf.quickmath.ui.GameUI;
import dragunwf.quickmath.ui.MainMenuUI;
import dragunwf.quickmath.ui.RetryMenuUI;
import java.util.HashMap;

public class WindowManager {
    private static HashMap<String, Boolean> windowsOpened;
    private static MainMenuUI mainMenuUI;
    private static GameUI gameUI;
    private static RetryMenuUI retryMenuUI;
    
    public static void initialize() {
        windowsOpened = new HashMap<>();
        windowsOpened.put("mainMenu", false);
        windowsOpened.put("game", false);
        windowsOpened.put("retryMenu", false);
    }
    
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
        if (windowsOpened.get(name)) {
            return; // avoids window duplication
        }
            
        switch (name) {
            case "mainMenu" -> {
                mainMenuUI = new MainMenuUI();
                mainMenuUI.start();
            }
            case "game" -> {
                gameUI = new GameUI();
                gameUI.start();
            }
            case "retryMenu" -> {
                retryMenuUI = new RetryMenuUI();
                retryMenuUI.start();
            }
            default -> throw new Exception("Window name passed is not recognized!");
        }
        
        windowsOpened.put(name, true);
        for (String key : windowsOpened.keySet()) {
            if (!key.equals(name)) {
                windowsOpened.put(key, false);
            }
        }
        
        System.out.printf("Opened %sUI\n", name);
    }
}
