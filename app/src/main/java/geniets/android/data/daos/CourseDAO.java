package geniets.android.data.daos;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.internal.DaoConfig;
import geniets.android.data.soap.Cours;

public class CourseDAO extends AbstractDao<Cours, Long>{

    public static final String TABLENAME = "COURS";

    public CourseDAO(DaoConfig config) {
        super(config);
    }

    public CourseDAO(DaoConfig config, AbstractDaoSession daoSession) {
        super(config, daoSession);
    }

    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists ? "IF NOT EXISTS " : "";
        db.execSQL("CREATE TABLE " + constraint + "\"" + TABLENAME + "\" ("
                + "\"_id\" INTEGER PRIMARY KEY , "
                + "\"SIGLE\" TEXT NOT NULL ,"
                + "\"SESSION\" TEXT NOT NULL ,"
                + "\"PROGRAMME_ETUDES\" TEXT NOT NULL ,"
                + "\"NBCREDITS\" INTEGER ,"
                + "\"TITRE_COURS\" TEXT NOT NULL ,"
                + "\"COTE\" );");
    }

    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"" + TABLENAME + "\"";
        db.execSQL(sql);
    }

    @Override
    protected Cours readEntity(Cursor cursor, int offset) {
        Cours entity = new Cours();
        entity.id = cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
        entity.sigle = cursor.getString(offset + 1);
        entity.session = cursor.getString(offset + 2);
        entity.programmeEtudes = cursor.getString(offset + 3);
        entity.nbCredits = cursor.getInt(offset + 4);
        entity.titreCours = cursor.getString(offset + 5);
        entity.cote = cursor.getString(offset + 6);
        return entity;
    }

    @Override
    protected Long readKey(Cursor cursor, int offset) {
        return null;
    }

    @Override
    protected void readEntity(Cursor cursor, Cours entity, int offset) {

    }

    @Override
    protected void bindValues(SQLiteStatement stmt, Cours entity) {

    }

    @Override
    protected Long updateKeyAfterInsert(Cours entity, long rowId) {
        return null;
    }

    @Override
    protected Long getKey(Cours entity) {
        return null;
    }

    @Override
    protected boolean isEntityUpdateable() {
        return false;
    }
}
