package util;

import java.util.Scanner;

public class MenuUtil {
    public static void showMenu() {
        System.out.println("Please,select menu: ");
        Menu.showAllMenu();
        Scanner scanner = new Scanner(System.in);
        int selectedMenu = scanner.nextInt();
        Menu menu=Menu.findMenuElement(selectedMenu);
        MenuUtil.processMenu(menu);
    }

    public static void processMenu(Menu menu) {
        menu.process();
    }
}
