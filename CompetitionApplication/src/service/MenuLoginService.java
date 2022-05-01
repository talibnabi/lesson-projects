package service;

import bean.Config;
import serviceMenuInter.MenuLoginServiceInter;

import java.util.Scanner;

public class MenuLoginService implements MenuLoginServiceInter {
    private static int count;

    @Override
    public void processLogic() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Username: ");
        String username = scanner.nextLine();

        scanner = new Scanner(System.in);
        System.out.println("Password: ");
        String password = scanner.nextLine();
        if (!(username.equals("Sarkhan") && password.equals("12345"))) {
            count++;
            if (count == 3) {
                System.out.println("You banned.");
                System.exit(0);
            }
            this.processLogic();
        }
        Config.setLoggedIn(true);
    }
}
