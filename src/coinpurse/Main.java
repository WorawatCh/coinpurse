package coinpurse;
 
/**
 * A main class to create objects and connect objects together.
 * The user interface needs a reference to coin purse.
 * @author Worawat Chueajedton
 */
public class Main {

    /**
     * Configure and start the application.
     * @param args not used
     */
    public static void main( String[] args ) {
         Purse purse = new Purse(100);
         ConsoleDialog ui = new ConsoleDialog(purse);
         ui.run();
         
         
    }
}
