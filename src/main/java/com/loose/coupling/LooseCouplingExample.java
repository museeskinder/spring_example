package com.loose.coupling;

public class LooseCouplingExample {
    public static void main(String[] args) {
        UserDatabaseProvider databaseProvider = new UserDatabaseProvider();
        UserManager userManagerWithDb = new UserManager(databaseProvider);
        System.out.println(userManagerWithDb.getUserInfo());

        UserDataProvider dataFromWebService = new WebServiceProvider();
        UserManager userManagerWithWs = new UserManager(dataFromWebService);
        System.out.println(userManagerWithWs.getUserInfo());
    }
}
