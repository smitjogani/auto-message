import java.util.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class App {
    public static void main(String[] args) throws AWTException, InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter your Message :");
        String msg = sc.nextLine();
        System.out.println("How many Times You want to send : ");
        int size = sc.nextInt();

        StringSelection stringSelection = new StringSelection(msg);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);

        Thread.sleep(3000);

        Robot robot = new Robot();

        for (int i = 1; i <= size; i++) {
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
           
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_V);

            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            
            Thread.sleep(2000);
        }

        sc.close();
    }
}