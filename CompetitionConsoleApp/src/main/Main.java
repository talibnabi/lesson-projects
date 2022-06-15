package main;

import bean.Config;
import util.Menu;
import util.MenuUtil;

public class Main {
    public static void main(String[] args) {
        Config.initialize();
        Thread.setDefaultUncaughtExceptionHandler(new MyUncaughtExceptionHandler());
        MenuUtil.showMenu();
    }
}
