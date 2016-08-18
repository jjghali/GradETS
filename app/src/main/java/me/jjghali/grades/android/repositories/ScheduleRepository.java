package me.jjghali.grades.android.repositories;


import java.util.List;
import java.util.concurrent.ExecutionException;

import me.jjghali.grades.android.data.soap.Seances;
import me.jjghali.grades.android.data.soap.Trimestre;

public class ScheduleRepository extends AbstractRepository {

    public ScheduleRepository() {
        super();
    }

    public List<Seances> listeCoursSession(final Trimestre trimestre, final String sigleCours,
                                           final String id, final String password) {
        List<Seances> seancesList = null;
        try {
            seancesList = soap.lireHoraireDesSeancesAsync(id,password,sigleCours,
                    trimestre.abrege, trimestre.dateDebut, trimestre.dateFin)
                    .get().Result.ListeDesSeances;
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        return seancesList;
    }
}