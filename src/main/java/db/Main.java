package db;

import EngAdapter.AuthorizationEng;
import EngAdapter.DataBaseEng;

public class Main {
    public static void main(String[] args) {
        DataBaseEng db = new DataBaseEng();
        AuthorizationEng authorization = new AuthorizationEng();
        if (authorization.authorize(db)) {
            ReportBuilder br = new ReportBuilder(db);
        }
    }
}
