package geniets.android.data;

import java.util.concurrent.ExecutionException;

import geniets.android.data.soap.Etudiant;
import geniets.android.data.soap.IServiceEvents;
import geniets.android.data.soap.OperationResult;
import geniets.android.data.soap.SignetsMobileSoap;

/**
 * Created by jjgha on 2016-06-18.
 */
public class UserService {
    SignetsMobileSoap signetsMobileSoap;

    public UserService() {
        Etudiant result;
        OperationResult<Etudiant> etudiant = null;
        signetsMobileSoap = new SignetsMobileSoap(new IServiceEvents() {
            @Override
            public void Starting() {

            }

            @Override
            public void Completed(OperationResult result) {

            }
        });
        try {
            etudiant = signetsMobileSoap.infoEtudiantAsync("***REMOVED***", "***REMOVED***").get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        result = etudiant.Result;
        System.out.println();
    }
}

