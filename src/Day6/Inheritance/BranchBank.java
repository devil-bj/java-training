package Day6.Inheritance;

import java.util.logging.Logger;

public class BranchBank extends CentralBank {
    String branchName = "Bargacchi Branch";
    String location = "Itahari";
    String type = "Branch";
    double branchCode=  123d;
    String branchPhone = "025678092";

    void operation(){
        Logger.getGlobal().info(" Update info to the Center branch.\n"+ "Creates Clients add to the database" + swiftCode);

    }

}
