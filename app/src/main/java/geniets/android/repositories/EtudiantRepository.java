package geniets.android.repositories;

import java.util.concurrent.ExecutionException;

import geniets.android.data.soap.Etudiant;
import geniets.android.data.soap.IServiceEvents;
import geniets.android.data.soap.OperationResult;
import geniets.android.data.soap.SignetsMobileSoap;

public class EtudiantRepository extends AbstractRepository {
    public EtudiantRepository() {
        super();
    }

    public Etudiant getInfoEtudiant(String id, String password) {
        Etudiant result = null;
        try {
            result = soap.infoEtudiantAsync(id, password).get().Result;
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        return result;
    }

    public boolean isLoginValid(String id, String password) {
        boolean result = false;
        try {
            result = soap.donneesAuthentificationValidesAsync(id, password).get().Result;
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        return result;
    }
}

