package geniets.android.data;

import java.util.Date;
import java.util.List;


public class DayTask {
    public Date Date;
    public List<CourseTask> Courses;

    public DayTask(java.util.Date date, List<CourseTask> courses) {
        Date = date;
        Courses = courses;
    }

    public java.util.Date getDate() {
        return Date;
    }

    public List<CourseTask> getCourses() {
        return Courses;
    }
}
