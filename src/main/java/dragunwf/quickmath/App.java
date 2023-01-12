package dragunwf.quickmath;

import dragunwf.quickmath.scripts.WindowManager;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Starting application...");
        initializeApp();
        System.out.println("Initialized App!");
    }

    private static void initializeApp() throws Exception {
        // App starts with the main menu
        WindowManager.initialize();
        WindowManager.openMainMenu();
    }
}
