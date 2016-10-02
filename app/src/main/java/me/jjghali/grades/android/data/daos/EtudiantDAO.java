package me.jjghali.grades.android.data.daos;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.annotation.Unique;
import com.raizlabs.android.dbflow.sql.queriable.StringQuery;
import com.raizlabs.android.dbflow.structure.BaseModel;

import me.jjghali.grades.android.data.DBHelper;
import me.jjghali.grades.android.data.soap.Etudiant;

@Table(database = DBHelper.class, name = EtudiantDAO.TABLE_NAME)
public class EtudiantDAO extends BaseModel {

    public static final String TABLE_NAME = "ETUDIANT";



    @Column
    @PrimaryKey(autoincrement = true)
    public int id;

    @Column
    @Unique
    public String nom;

    @Column
    @Unique
    public String prenom;

    @Column
    @Unique
    public String codePerm;

    @Column
    @Unique
    public String codeUniversel;

    @Column
    public String soldeTotal;

    @Column
    public Boolean masculin = false;

    public EtudiantDAO() {
    }

    public EtudiantDAO(Etudiant etudiant) {

        nom = etudiant.nom;
        prenom = etudiant.prenom;
        codePerm = etudiant.codePerm;
        soldeTotal = etudiant.soldeTotal;
        masculin = etudiant.masculin;
        codeUniversel = etudiant.codeUniversel;
    }

    public Etudiant clone() {
        Etudiant etudiant = new Etudiant();
        etudiant.id = id;
        etudiant.nom = nom;
        etudiant.prenom = prenom;
        etudiant.codePerm = codePerm;
        etudiant.soldeTotal = soldeTotal;
        etudiant.masculin = masculin;
        etudiant.codeUniversel = codeUniversel;

        return etudiant;
    }

}
