package geniets.android.data.sqlite;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;
import geniets.android.data.daos.EtudiantDAO;

public class DaoSession extends AbstractDaoSession {

    private final DaoConfig etudiantDaoConfig;

    private final AbstractDao etudiantDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        etudiantDaoConfig = daoConfigMap.get(EtudiantDAO.class).clone();
        etudiantDaoConfig.initIdentityScope(type);

        etudiantDao = new EtudiantDAO(etudiantDaoConfig, this);

        registerDao(EtudiantDAO.class, etudiantDao);
    }

    public void clear() {
        etudiantDaoConfig.getIdentityScope().clear();
    }

    public AbstractDao getEtudiantDao() {
        return etudiantDao;
    }
}
