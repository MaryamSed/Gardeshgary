package gardeshgari.gardeshgari.Login;

public class Contract {

    interface View{
        void gettoken(String token);

    }
    interface Presenter{
        void attachview(View view);
        void login(UsersModel User);
        void gettoken(String token);

    }
    interface Model{
        void attachpresenter(Presenter presenter);
        void login(UsersModel User);

    }

}
