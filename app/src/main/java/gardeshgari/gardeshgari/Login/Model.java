package gardeshgari.gardeshgari.Login;

import com.orhanobut.hawk.Hawk;

import gardeshgari.gardeshgari.utils.Gen;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Model implements Contract.Model {
    Contract.Presenter presenter;
    String msg;
    @Override
    public void attachpresenter(Contract.Presenter presenter) {
        this.presenter= (Contract.Presenter) presenter;

    }

    @Override
    public void login(UsersModel User) {

        String mobile = User.getMobile().toString();
        String password = User.getPassword().toString();

        Gen.endpoint.login(mobile,password).enqueue((new Callback<UsersModel>() {
            @Override
            public void onResponse(Call<UsersModel> call, Response<UsersModel> response) {
                int statuscode = response.code();
                if(statuscode==200){
                    msg = response.body().getToken();
                    presenter.gettoken("خوش آمدید");
                    Hawk.put("token" , msg);
                }else {
                    presenter.gettoken("رمز عبور شما معتبر نیست");
                }
            }
            @Override
            public void onFailure(Call<UsersModel> call, Throwable t) {
                presenter.gettoken("رمز عبور شما معتبر نیست..");

            }
        }));

    }
}
