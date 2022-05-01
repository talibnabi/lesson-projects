package util;

import java.util.Scanner;

public class MenuUtil {
    public static Menu showMenu() {
        System.out.println("Please select menu: ");
        Menu[] menu = Menu.values();
        Menu.showAllMenu();
        Scanner scanner = new Scanner(System.in);
        int selectedMenu = scanner.nextInt();
        return Menu.find(selectedMenu);
    }

    public static void menuProcess(Menu menu) {
        menu.process();
    }
}
