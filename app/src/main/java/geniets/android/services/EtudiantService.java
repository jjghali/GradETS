package geniets.android.services;

import com.raizlabs.android.dbflow.sql.language.Select;

import geniets.android.data.daos.EtudiantDAO;
import geniets.android.data.daos.EtudiantDAO_Table;
import geniets.android.data.soap.Etudiant;

public class EtudiantService {

    public static void insertOrUpdate(Etudiant etudiant) {
        EtudiantDAO etudiantDAO = new EtudiantDAO(etudiant);
        etudiantDAO.save();
    }

    //TODO: get id from userpreferences
    public static EtudiantDAO read() {
        return new Select().from(EtudiantDAO.class).querySingle();
    }

    public static void delete(String codePerm) {
        new Select().from(EtudiantDAO.class)
                .where(EtudiantDAO_Table.codePerm.is(codePerm)).querySingle().delete();
    }
}
