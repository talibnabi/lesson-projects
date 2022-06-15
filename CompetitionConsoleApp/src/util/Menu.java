package util;

import bean.Config;
import service.*;
import serviceInter.ProcessService;

import static util.MenuUtil.showMenu;


public enum Menu {
    LOGIN(1, "login", new MenuLoginService()),
    REGISTER(2, "register", new MenuRegisterService()),
    START(3, "start", new MenuStartService()),
    LOGOUT(4, "logout", new MenuLogoutService()),
    EXIT(5, "exit", new MenuExitService()),
    SHOW_ALL_COMPETITOR(6, "show all competitors", new MenuShowAllCompetitor()),
    UNKNOWN;
    private int row;
    private String label;
    private ProcessService processService;

    Menu() {

    }

    Menu(int row, String label, ProcessService process) {
        this.setRow(row);
        this.setLabel(label);
        this.setProcess(process);
    }


    public static void showAllMenu() {
        Menu[] menus = Menu.values();
        for (int i = 0; i < menus.length; i++) {
            if (menus[i] != Menu.UNKNOWN) {
                if (menus[i] == Menu.LOGIN || menus[i] == Menu.REGISTER) {
                    if (!Config.isLoggedIn()) {
                        System.out.println(menus[i]);
                    }
                } else if (Config.isLoggedIn()) {
                    System.out.println(menus[i]);
                }
            }
        }
    }

    public static Menu findMenuElement(int selectedMenu) {
        Menu[] menus = Menu.values();
        for (int i = 0; i < menus.length; i++) {
            if (menus[i].getRow() == selectedMenu) {
                return menus[i];
            }
        }
        return Menu.UNKNOWN;
    }

    public ProcessService getProcess() {
        return processService;
    }

    public void setProcess(ProcessService process) {
        this.processService = process;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String toString() {
        return this.row + "." + this.label;
    }

    public void process() {
        processService.process();
        showMenu();
    }

}
