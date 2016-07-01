package geniets.android.data.daos;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;
import geniets.android.data.soap.Etudiant;
import geniets.android.data.sqlite.DaoSession;


public class EtudiantDAO extends AbstractDao<Etudiant, Long> {
    public static final String TABLENAME = "ETUDIANT";

    public EtudiantDAO(DaoConfig etudiantDaoConfig, DaoSession daoSession) {
        super(etudiantDaoConfig, daoSession);
    }

    public EtudiantDAO(DaoConfig config) {
        super(config);
    }

    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists ? "IF NOT EXISTS " : "";
        db.execSQL("CREATE TABLE " + constraint + "\"" + TABLENAME + "\" ("
                + "\"_id\" INTEGER PRIMARY KEY , "
                + "\"NOM\" TEXT NOT NULL ,"
                + "\"PRENOM\" TEXT NOT NULL ,"
                + "\"CODEPERM\" TEXT UNIQUE NOT NULL ,"
                + "\"SOLDETOTAL\" TEXT NOT NULL );");
    }

    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"" + TABLENAME + "\"";
        db.execSQL(sql);
    }

    @Override
    protected Etudiant readEntity(Cursor cursor, int offset) {
        Etudiant entity = new Etudiant();
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.nom = cursor.getString(offset + 1);
        entity.prenom = cursor.getString(offset + 2);
        entity.codePerm = cursor.getString(offset + 3);
        entity.soldeTotal = cursor.getString(offset + 4);

        return entity;
    }

    @Override
    protected Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }

    @Override
    protected void readEntity(Cursor cursor, Etudiant entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.nom = cursor.getString(offset + 1);
        entity.prenom = cursor.getString(offset + 2);
        entity.codePerm = cursor.getString(offset + 3);
        entity.soldeTotal = cursor.getString(offset + 4);

    }

    @Override
    protected void bindValues(SQLiteStatement stmt, Etudiant entity) {
        stmt.clearBindings();

        Long id = entity.getId();
        if (id != null)
            stmt.bindLong(1, id);

        stmt.bindString(2, entity.nom);
        stmt.bindString(3, entity.prenom);
        stmt.bindString(4, entity.codePerm);
        stmt.bindString(5, entity.soldeTotal);

    }

    @Override
    protected Long updateKeyAfterInsert(Etudiant entity, long rowId) {
        return null;
    }

    @Override
    protected Long getKey(Etudiant entity) {
        return entity != null ? entity.getId() : null;
    }

    @Override
    protected boolean isEntityUpdateable() {
        return true;
    }

    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Nom = new Property(1, String.class, "nom", false, "NOM");
        public final static Property Prenom = new Property(2, String.class, "prenom", false, "PRENOM");
        public final static Property CodePerm = new Property(3, String.class, "codePerm", false, "CODEPERM");
        public final static Property SoldeTotal = new Property(4, String.class, "soldTotal", false, "SOLDETOTAL");
    }
}
