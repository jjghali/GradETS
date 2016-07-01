package geniets.android.adapters;


import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class ScheduleTaskAdapter extends BaseAdapter{
    //    private List<CourseTask> courses;
    private Activity activity;

//    public ScheduleTaskAdapter(List<CourseTask> courses, Activity activity) {
//        this.courses = courses;
//        this.activity = activity;
//    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
//        View = convertView ?? activity.getLayoutInflater().inflate(R.layout.)

        return null;
    }
}
