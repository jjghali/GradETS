package geniets.android.repositories;

import geniets.android.data.soap.IServiceEvents;
import geniets.android.data.soap.OperationResult;
import geniets.android.data.soap.SignetsMobileSoap;

abstract class AbstractRepository {
    SignetsMobileSoap soap;

    public AbstractRepository() {
        soap = new SignetsMobileSoap(new IServiceEvents() {
            @Override
            public void Starting() {
            }
            @Override
            public void Completed(OperationResult result) {
            }
        });
    }
}
