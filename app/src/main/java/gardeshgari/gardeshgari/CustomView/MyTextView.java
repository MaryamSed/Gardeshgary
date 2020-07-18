package gardeshgari.gardeshgari.CustomView;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

import gardeshgari.gardeshgari.utils.BaseApplication;

public class MyTextView extends AppCompatTextView {
    public MyTextView(Context context) {
        super(context);
        setTypeface(BaseApplication.appface);
    }

    public MyTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setTypeface(BaseApplication.appface);
    }

    public MyTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setTypeface(BaseApplication.appface);
    }
}
