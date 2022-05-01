package service;

import bean.Config;
import serviceMenuInter.MenuLogoutServiceInter;
import util.Menu;
import util.MenuUtil;

public class MenuLogoutService implements MenuLogoutServiceInter {
    @Override
    public void processLogic() {
        Config.setLoggedIn(false);
        MenuUtil.showMenu();
    }
}
