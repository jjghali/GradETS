package geniets.android.services;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import geniets.android.data.sqlite.DaoMaster;
import geniets.android.data.sqlite.DaoSession;

public class AbstractService {
    SQLiteDatabase db;
    DaoMaster daoMaster;
    DaoSession daoSession;
    DaoMaster.DevOpenHelper helper;
    Cursor cursor;

    public AbstractService(Activity activity) {
        helper = new DaoMaster.DevOpenHelper(activity, "geniets-db", null);
        db = helper.getWritableDatabase();
        daoMaster = new DaoMaster(db);
        daoSession = (DaoSession) daoMaster.newSession();
    }
}
