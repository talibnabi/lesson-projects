package service;

import bean.Competitor;
import bean.Config;
import serviceMenuInter.MenuRegisterServiceInter;

public class MenuShowAllCompetitor implements MenuRegisterServiceInter {
    @Override
    public void processLogic() {
        Competitor[] competitors = Config.getInstance().getCompetitor();
        for (int i = 0; i < competitors.length; i++) {
            System.out.println(competitors[i]);
        }
    }
}
