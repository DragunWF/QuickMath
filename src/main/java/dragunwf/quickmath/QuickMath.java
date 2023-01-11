package dragunwf.quickmath;

public class QuickMath {
    public static void main(String[] args) {
        System.out.println("Starting application...");
        initializeApp();
        System.out.println("Initialized App!");
    }
    
    private static void initializeApp() {
        WindowManager.initializeTabs();
    }
}
