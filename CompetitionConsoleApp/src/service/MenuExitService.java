package service;

import serviceMenuInter.MenuExitServiceInter;

public class MenuExitService implements MenuExitServiceInter {
    @Override
    public void processLogic() {
        System.exit(0);
    }
}
