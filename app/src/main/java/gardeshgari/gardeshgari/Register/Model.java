package gardeshgari.gardeshgari.Register;

import com.orhanobut.hawk.Hawk;

import gardeshgari.gardeshgari.utils.Gen;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Model implements Contract.Model {
    Presenter presenter;
    @Override
    public void attachpresenter(Contract.Presenter presenter) {
        this.presenter=(Presenter) presenter;
    }

    @Override
    public void registerUser(Identity User) {
        final String name = User.getName().toString();
        final String family = User.getFamily().toString();
        String mobile = User.getMobile().toString();
        final String address = User.getMobile().toString();
        String password = User.getPassword().toString();

        Gen.endpoint.register(name,family,mobile,address,password).enqueue(new Callback<Void>() {
            @Override
            public void onResponse(Call<Void> call, Response<Void> response) {
                if(response.code() == 200) {
                    presenter.get_msg("اطلاعات شما با موفقیت ثبت شد");
                    Hawk.put("name" , name);
                    Hawk.put("family" , family);
                    Hawk.put("address" , address);
                }else{
                    presenter.get_msg("لطفا مجدد تلاش کنید");
                }
            }

            @Override
            public void onFailure(Call<Void> call, Throwable t) {
                //presenter.get_msg("لطفا مجدد تلاش کنید..");
                presenter.get_msg(t.toString());

            }
        });

    }
}
