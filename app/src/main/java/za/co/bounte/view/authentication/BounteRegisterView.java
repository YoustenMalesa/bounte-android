package za.co.bounte.view.authentication;

/**
 * Created by Rocky on 2018/01/10.
 */

public interface BounteRegisterView {

    void showError(String message);
    void showProgress(String message);
    void hideProgress(String message);
    void navigateToDashboard();

}
