package gardeshgari.gardeshgari.utils;

import android.app.Application;
import android.graphics.Typeface;

import com.orhanobut.hawk.Hawk;

public class BaseApplication extends Application {

    public static BaseApplication app;
    public static Typeface appface;

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
        appface = Typeface.createFromAsset(getAssets(),"B Yekan+.ttf");
        Hawk.init(this).build();

    }

}
