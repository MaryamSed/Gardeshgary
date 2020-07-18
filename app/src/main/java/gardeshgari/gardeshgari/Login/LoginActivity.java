package gardeshgari.gardeshgari.Login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import gardeshgari.gardeshgari.R;
import gardeshgari.gardeshgari.utils.BaseActivity;
import gardeshgari.gardeshgari.utils.Gen;

@EActivity(R.layout.activity_login)
public class LoginActivity extends BaseActivity implements Contract.View {
    Contract.Presenter presenter = (Contract.Presenter)new Presenter();
    UsersModel User = new UsersModel();

    @ViewById
    EditText mobile , password;
    @ViewById
    Button login , register;
    @AfterViews
    void init(){
        presenter.attachview((Contract.View) this);
    }
    @Click
    void login(){
        User.setMobile(mobile.getText().toString());
        User.setPassword(password.getText().toString());

        presenter.login(User);

        dialog.show();
        mobile.setText("");
        password.setText("");
    }

    @Override
    public void gettoken(String token) {
        Gen.toast("خوش آمدید");
        if(token!=null){
            //startActivity(new Intent(mcontext, ***.class));
            dialog.dismiss();
        }

    }
    @Click
    void register(){
        //startActivity(new Intent(mcontext , RegisterActivity_.class));
    }
}
