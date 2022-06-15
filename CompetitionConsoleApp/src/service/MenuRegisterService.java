package service;

import bean.Competitor;
import bean.Config;
import serviceMenuInter.MenuRegisterServiceInter;
import util.CompetitorUtil;
import util.FileUtility;

import java.util.Scanner;

public class MenuRegisterService implements MenuRegisterServiceInter {
    @Override
    public void processLogic() {
        System.out.println("How many people will take part in the competition? ");
        Scanner scanner = new Scanner(System.in);
        int competitionCount = scanner.nextInt();
        for (int i = 0; i < competitionCount; i++) {
            String name = CompetitorUtil.getText("Enter competitor name: ");
            String surname = CompetitorUtil.getText("Enter competitor surname: ");
            int age = CompetitorUtil.getNumber("Enter competitor age: ");
            String location = CompetitorUtil.getText("Enter competition location: ");
            Competitor competitor = new Competitor();
            competitor.setName(name);
            competitor.setSurname(surname);
            competitor.setAge(age);
            competitor.setCompetitionLocation(location);
            Config.getInstance().appendCompetitor(competitor);
        }
    }
}
