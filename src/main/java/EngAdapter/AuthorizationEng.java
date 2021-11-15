package EngAdapter;

import ukr.Авторизація;

public class AuthorizationEng extends Авторизація {
    public boolean authorize(DataBaseEng db) {
        return авторизуватися(db);
    }
}
