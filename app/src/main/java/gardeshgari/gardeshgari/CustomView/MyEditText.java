package gardeshgari.gardeshgari.CustomView;

import android.content.Context;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;

import gardeshgari.gardeshgari.utils.BaseApplication;

public class MyEditText extends AppCompatEditText {
    public MyEditText(Context context) {
        super(context);
        setTypeface(BaseApplication.appface);
    }

    public MyEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        setTypeface(BaseApplication.appface);
    }

    public MyEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setTypeface(BaseApplication.appface);
    }
    public String text(){
        return this.getText()!=null?this.getText().toString(): "" ;
    }

}
