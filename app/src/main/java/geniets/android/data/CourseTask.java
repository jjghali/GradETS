package geniets.android.data;

enum CourseType {
    LABO, TP, COURS
}

public class CourseTask {
    private String Title;
    private String Code;
    public String TimeStart;
    public String TimeEnd;
    public String ClassLocation;
    public CourseType CourseType;

    public CourseTask(String title, String code, String timeStart, String timeEnd,
                      String classLocation, CourseType courseType) {
        Title = title;
        Code = code;
        TimeStart = timeStart;
        TimeEnd = timeEnd;
        ClassLocation = classLocation;
        CourseType = courseType;
    }

    public String getTitle() {
        return Title;
    }

    public String getCode() {
        return Code;
    }

    public String getTimeStart() {
        return TimeStart;
    }

    public String getTimeEnd() {
        return TimeEnd;
    }

    public String getClassLocation() {
        return ClassLocation;
    }

    public geniets.android.data.CourseType getCourseType() {
        return CourseType;
    }
}
