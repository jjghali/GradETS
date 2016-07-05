package geniets.android.data.daos;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;

import geniets.android.data.DBHelper;
import geniets.android.data.soap.Seances;

@Table(database = DBHelper.class, name = SeanceDAO.TABLE_NAME)
public class SeanceDAO implements InterfaceDAO {

    public static final String TABLE_NAME = "SEANCES";

    @Column
    @PrimaryKey(autoincrement = true)
    public int id;

    @Column
    public java.util.Date dateDebut;

    @Column
    public java.util.Date dateFin;

    @Column
    public String coursGroupe;

    @Column
    public String nomActivite;

    @Column
    public String local;

    @Column
    public String descriptionActivite;

    @Column
    public String libelleCours;

    public SeanceDAO() {
    }

    public SeanceDAO(Seances seance) {
        this.dateDebut = seance.dateDebut;
        this.dateFin = seance.dateFin;
        this.coursGroupe = seance.coursGroupe;
        this.nomActivite = seance.nomActivite;
        this.local = seance.local;
        this.descriptionActivite = seance.descriptionActivite;
        this.libelleCours = seance.libelleCours;
    }

    public Seances clone(){
        Seances seances = new Seances();

        seances.dateDebut = dateDebut;
        seances.dateFin = dateFin;
        seances.coursGroupe = coursGroupe;
        seances.nomActivite = nomActivite;
        seances.local = local;
        seances.descriptionActivite = descriptionActivite;
        seances.libelleCours = libelleCours;

        return seances;
    }
}
