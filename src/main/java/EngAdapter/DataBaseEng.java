package EngAdapter;

import ukr.БазаДаних;

public class DataBaseEng extends БазаДаних {

    public String getUserData() {
        return отриматиДаніКористувача();
    }

    public String getStatisticsData() {
        return отриматиСтатистичніДані();
    }
}
