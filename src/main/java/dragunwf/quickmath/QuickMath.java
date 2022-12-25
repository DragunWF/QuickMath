package dragunwf.quickmath;

public class QuickMath {
    private static MainMenuUI mainMenuUI;
    
    public static void main(String[] args) {
        System.out.println("Starting application...");
        initializeTabs();
    }
    
    private static void initializeTabs() {
        mainMenuUI = new MainMenuUI();
        mainMenuUI.start();
        
        System.out.println("Tabs are initialized!");
    }
}
