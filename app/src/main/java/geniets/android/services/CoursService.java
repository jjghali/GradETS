package geniets.android.services;

import com.raizlabs.android.dbflow.sql.language.Select;

import java.util.List;

import geniets.android.data.daos.CoursDAO;
import geniets.android.data.daos.CoursDAO_Table;
import geniets.android.data.soap.Cours;

public class CoursService {

    public static void insertOrUpdate(Cours cours) {
        CoursDAO coursDAO = new CoursDAO(cours);
        coursDAO.save();
    }

    public static CoursDAO getCoursSigleSession(String sigle, String sSession) {
        return new Select().from(CoursDAO.class).where(CoursDAO_Table.sigle.is(sigle))
                .and(CoursDAO_Table.session.is(sSession)).querySingle();
    }

    public static List<CoursDAO> listCoursSession(String sSession) {
        return new Select().from(CoursDAO.class).where(CoursDAO_Table.session.is(sSession)).queryList();
    }

    public static void delete(String sigle, String sSession) {
        new Select().from(CoursDAO.class).where(CoursDAO_Table.session.is(sSession))
                .and(CoursDAO_Table.sigle.is(sigle)).querySingle().delete();
    }

}