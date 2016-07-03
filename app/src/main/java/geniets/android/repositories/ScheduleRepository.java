package geniets.android.repositories;

import geniets.android.data.soap.IServiceEvents;
import geniets.android.data.soap.OperationResult;
import geniets.android.data.soap.SignetsMobileSoap;

public class ScheduleRepository {
    SignetsMobileSoap soap;

    public ScheduleRepository() {
        soap = new SignetsMobileSoap(new IServiceEvents() {
            @Override
            public void Starting() {
            }

            @Override
            public void Completed(OperationResult result) {
            }
        });
    }

    public void getFullSchedule() {

    }

    public void getSemesterSchedule(String semester) {

    }

    public void getCourseSchedule(String course, String semester) {

    }
}
