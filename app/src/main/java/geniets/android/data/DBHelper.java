package geniets.android.data;

import com.raizlabs.android.dbflow.annotation.Database;

/**
 * Created by jjgha on 2016-07-03.
 */
@Database(name = DBHelper.NAME, version = DBHelper.VERSION)
public class DBHelper {
    public static final String NAME = "GradETS_DB";
    public static final int VERSION = 1;
}
