package main;

import util.Menu;
import util.MenuUtil;

public class Main {
    public static void main(String[] args) {
        Menu menu=MenuUtil.showMenu();
        MenuUtil.menuProcess(menu);
    }
}
