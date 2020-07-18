package gardeshgari.gardeshgari.Register;

public interface Contract {

    interface View{
        void get_msg(String msg);
    }
    interface Presenter{
        void attachview(View view);
        void registerUser(Identity User);
        void get_msg(String msg);
    }
    interface Model{
        void attachpresenter(Presenter presenter);
        void registerUser(Identity User);
    }

}
