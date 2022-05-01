package util;

import service.*;
import serviceInter.MenuService;

import java.util.Scanner;

public enum Menu {
    LOGIN(1, "login", new MenuLoginService()),
    REGISTER(2, "register", new MenuRegisterService()),
    ADD_TEACHER(3, "add teacher", new MenuAddTeacherService()),
    ADD_STUDENT(4, "add student", new MenuAddStudentService()),
    SHOW_ALL_TEACHER(5, "show all teachers", new MenuShowTeacherService()),
    SHOW_ALL_STUDENT(6, "show all students", new MenuShowStudentService()),
    UNKNOWN;
    private String label;
    private int number;
    private MenuService menuService;

    Menu() {

    }

    Menu(int number, String label, MenuService menuService) {
        this.label = label;
        this.number = number;
        this.menuService = menuService;
    }

    public static void showAllMenu() {
        Menu[] menu = Menu.values();
        for (int i = 0; i < menu.length; i++) {
            if (menu[i] != Menu.UNKNOWN) {
                System.out.println(menu[i]);
            }
        }
    }

    public static Menu find(int number) {
        Menu[] menu = Menu.values();
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].getNumber() == number) {
                return menu[i];
            }
        }
        return Menu.UNKNOWN;
    }

    public String getLabel() {
        return this.label;
    }

    public int getNumber() {
        return this.number;
    }

    public void process() {
        menuService.process();
    }

    public String toString() {
        return this.number + "." + this.label;
    }

}
