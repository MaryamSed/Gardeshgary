package gardeshgari.gardeshgari.utils.Retrofit;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface EndPoint {

    @FormUrlEncoded
    @POST("PhpProject1/index.php")
    Call<Void> register(
            @Field("name") String name,
            @Field("family") String family,
            @Field("mobile") String mobile,
            @Field("address") String address,
            @Field("password") String password
    );

    @FormUrlEncoded
    @POST("PhpProject1/login.php")
    //Call<OM> login(
    Call<Void> login(
            @Field("mobile") String mobile,
            @Field("password") String password
    );

}
