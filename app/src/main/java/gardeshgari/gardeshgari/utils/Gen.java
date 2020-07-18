package gardeshgari.gardeshgari.utils;

import android.util.Log;
import android.widget.Toast;

import gardeshgari.gardeshgari.BuildConfig;
import gardeshgari.gardeshgari.utils.Retrofit.EndPoint;
import gardeshgari.gardeshgari.utils.Retrofit.Generator;

public class Gen {
    public static EndPoint endpoint = Generator.createService(EndPoint.class);

    public static void toast(String msg){
        Toast.makeText(BaseApplication.app, msg, Toast.LENGTH_SHORT).show();
    }

    public static void log(String tag , String msg ){
        if (BuildConfig.DEBUG)
            Log.d(tag,msg);
    }

    public static void log( String msg ){
        if (BuildConfig.DEBUG)
            Log.d("debug_log",msg);
    }
}
