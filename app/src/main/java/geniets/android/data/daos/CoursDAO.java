package geniets.android.data.daos;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

import geniets.android.data.DBHelper;
import geniets.android.data.soap.Cours;

@Table(database = DBHelper.class, name = CoursDAO.TABLE_NAME)
public class CoursDAO extends BaseModel  {

    public static final String TABLE_NAME = "COURS";

    @Column
    @PrimaryKey(autoincrement = true)
    public int id;

    @Column
    public String sigle;

    @Column
    public String groupe;

    @Column
    public String session;

    @Column
    public String programmeEtudes;

    @Column
    public String cote;

    @Column
    public Integer nbCredits = 0;

    @Column
    public String titreCours;

    public CoursDAO() {
    }

    public CoursDAO(Cours cours) {
        sigle = cours.sigle;
        groupe = cours.groupe;
        session = cours.session;
        programmeEtudes = cours.programmeEtudes;
        cote = cours.cote;
        nbCredits = cours.nbCredits;
        titreCours = cours.titreCours;
    }

    public Cours clone() {
        Cours cours = new Cours();
        cours.id = id;
        cours.sigle = sigle;
        cours.groupe = groupe;
        cours.session = session;
        cours.programmeEtudes = programmeEtudes;
        cours.cote = cote;
        cours.nbCredits = nbCredits;
        cours.titreCours = titreCours;

        return cours;
    }
}