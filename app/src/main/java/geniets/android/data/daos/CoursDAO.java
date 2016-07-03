package geniets.android.data.daos;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.structure.BaseModel;

public class CoursDAO extends BaseModel {
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

}