package me.jjghali.grades.android.repositories;

import java.util.concurrent.ExecutionException;

import me.jjghali.grades.android.data.soap.Etudiant;

public class EtudiantRepository extends AbstractRepository {
    public EtudiantRepository() {
        super();
    }

    public Etudiant getInfoEtudiant(String username, String password) {
        Etudiant result = null;

        try {
            result = soap.infoEtudiantAsync(username, password).get().Result;
            result.codeUniversel = username;
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

