package come.fossette.nsapp.util;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.Set;

/**
 * Created by ns.t on 2017/10/25.
 * SharedPreferences
 */

public class MSharedPreferences {
    static SharedPreferences preferences;
    static SharedPreferences.Editor editor;
    private static final String TAG = "AP_DATA";
    private static void init(Context context){
        preferences=context.getSharedPreferences(TAG,Context.MODE_PRIVATE);
        editor=preferences.edit();
    }

    /**
     * 存取值
     * */

    public static void setKeyValue(Context context,String key,String value){
        init(context);
        editor.putString(key,value);
        editor.commit();
    }
    public static void setKeyValue(Context context,String key,int value){
        init(context);
        editor.putInt(key,value);
        editor.commit();
    }
    public static void setKeyValue(Context context,String key,float value){
        init(context);
        editor.putFloat(key,value);
        editor.commit();
    }
    public static void setKeyValue(Context context,String key,boolean value){
        init(context);
        editor.putBoolean(key,value);
        editor.commit();
    }
    public static void setKeyValue(Context context,String key,long value){
        init(context);
        editor.putLong(key,value);
        editor.commit();
    }
    public static void setKeyValue(Context context,String key, Set set){
        init(context);
        editor.putStringSet(key,set);
        editor.commit();
    }
    /**
     * 获取值
     * */

    public static Object getValue(Context context,String key){
        init(context);
        return preferences.getString(TAG,key);
    }

    /**
     * 删除
     * */
    public static void removeValue(Context context,String key){
        init(context);
        editor.remove(key);
        editor.commit();
    }
    public static void removeAllValue(Context context){
        init(context);
        editor.clear();
        editor.commit();
    }
}
