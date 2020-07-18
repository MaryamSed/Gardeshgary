package gardeshgari.gardeshgari.Login;

public class Presenter implements Contract.Presenter {
    Contract.View view;
    Contract.Model model = (Contract.Model) new Model();
    @Override
    public void attachview(Contract.View view) {
        this.view=view;
        model.attachpresenter(this);
    }

    @Override
    public void login(UsersModel User) {
        model.login(User);
    }

    @Override
    public void gettoken(String token) {
        view.gettoken(token);
    }
}
