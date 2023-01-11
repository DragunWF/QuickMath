package dragunwf.quickmath.scripts;

import dragunwf.quickmath.ui.GameUI;
import dragunwf.quickmath.ui.MainMenuUI;
import dragunwf.quickmath.ui.RetryMenuUI;
import java.util.HashMap;

public class WindowManager {
    private static HashMap<String, javax.swing.JFrame> windows;
 
    public static void initializeTabs() {
        windows.put("mainMenu", null);
        windows.put("game", null);
        windows.put("retryMenu", null);
    }
    
    public static void openMainMenu() {
        WindowManager.openWindow("mainMenu");
    }
    
    private static void openWindow(String name) {
        javax.swing.JFrame tab = null;
        switch (name) {
            case "mainMenu" -> tab = new MainMenuUI();
            case "game" -> tab = new GameUI();
            case "retryMenu" -> tab = new RetryMenuUI();
        }
        windows.put(name, tab);
        windows.get(name).start();
    }
}
