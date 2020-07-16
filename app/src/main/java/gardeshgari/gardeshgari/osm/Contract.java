package gardeshgari.gardeshgari.osm;

public interface Contract {

    interface View {
        void recieveText(String text);
        void recivelocate(double lat , double lon);
    }
    interface Presenter{
        void attachview(View view);
        void gettext();
        void getlocate();
        void sendlocat(double lat , double lon);
        void gettext(String text);

    }
    interface Model{
        void attachpresenter(Presenter presenter);
        void gettext();
        void getlocate();

    }
}
