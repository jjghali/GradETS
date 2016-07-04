package geniets.android.repositories;

import com.annimon.stream.Collectors;
import com.annimon.stream.Stream;

import java.util.List;
import java.util.concurrent.ExecutionException;

import geniets.android.data.soap.Cours;

public class CoursRepository extends AbstractRepository {
    public CoursRepository() {
        super();
    }

    public List<Cours> getCoursSession(final String sSession, final String id,
                                       final String password) {
        List<Cours> cours = getCours(id, password);
        return Stream.of(cours).filter(c -> c.session.equals(sSession))
                .collect(Collectors.<Cours>toList());
    }

    public List<Cours> getCours(final String id, final String password) {
        List<Cours> cours = null;

        try {
            cours = soap.listeCoursAsync(id,password).get().Result.liste;
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        return cours;
    }
}
