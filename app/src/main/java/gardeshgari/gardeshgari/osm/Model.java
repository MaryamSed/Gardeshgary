package gardeshgari.gardeshgari.osm;

public class Model implements Contract.Model {
    Contract.Presenter presenter;
    @Override
    public void attachpresenter(Contract.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void gettext() {
        String text = "You are here";
        presenter.gettext(text);
    }

    @Override
    public void getlocate() {
        double longitude = 35.729212;
        double latitude =  51.418870;
        presenter.sendlocat(latitude , longitude);

    }
}
