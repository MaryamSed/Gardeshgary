package gardeshgari.gardeshgari.Register;

public class Presenter implements Contract.Presenter {

    Contract.View view;
    Contract.Model model = (Contract.Model)new Model();

    @Override
    public void attachview(Contract.View view) {
        this.view = view;
        model.attachpresenter(this);
    }

    @Override
    public void registerUser(Identity User) {
        model.registerUser(User);
    }

    @Override
    public void get_msg(String msg) {
        view.get_msg(msg);
    }
}
