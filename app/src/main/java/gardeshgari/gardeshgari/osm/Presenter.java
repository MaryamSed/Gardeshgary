package gardeshgari.gardeshgari.osm;

public class Presenter implements Contract.Presenter {
    Contract.View view;
    Contract.Model model = new Model();
    @Override
    public void attachview(Contract.View view) {
        this.view = view;
        model.attachpresenter(this);
    }

    @Override
    public void gettext() {
        model.gettext();
    }

    @Override
    public void getlocate() {
        model.getlocate();
    }

    @Override
    public void sendlocat(double lat, double lon) {
        view.recivelocate(lat , lon);
    }

    @Override
    public void gettext(String text) {
        view.recieveText(text);
    }
}
