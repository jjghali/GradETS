package geniets.android.services;

import android.app.Activity;

import geniets.android.data.daos.EtudiantDAO;
import geniets.android.data.soap.Etudiant;

public class EtudiantService extends AbstractService {

    private EtudiantDAO dao;

    public EtudiantService(Activity activity) {
        super(activity);
        dao = (EtudiantDAO) daoSession.getEtudiantDao();
    }

    public Etudiant getEtudiant() {
        return dao.queryBuilder().limit(1).list().get(0);
    }

    public Etudiant insertOrReplaceEtudiant(Etudiant etudiant) {
        long id = dao.insertOrReplace(etudiant);
        return dao.load(id);
    }
}
