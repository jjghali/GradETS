package me.jjghali.grades.android.repositories;

import me.jjghali.grades.android.data.soap.IServiceEvents;
import me.jjghali.grades.android.data.soap.OperationResult;
import me.jjghali.grades.android.data.soap.SignetsMobileSoap;

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
