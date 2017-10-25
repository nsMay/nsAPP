package come.fossette.nsapp.util;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ns.t on 2017/10/25.
 * activity控制器
 */

public class MActivityCollector {
    private static List<Activity> activities=new ArrayList<>();
    public static void AddActivity(Activity activity){
        activities.add(activity);
    }
    public static void RemoveActivity(Activity activity){
        activities.remove(activity);
    }
    public static void FinishAll(){
        for(Activity activity:activities){
            if(!activity.isFinishing()){
                activity.finish();
                activity.overridePendingTransition(0,0);
            }
        }
    }
}
