package za.co.bounte.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import za.co.bounte.R;
import za.co.bounte.model.HomePresenter;
import za.co.bounte.model.HomePresenterImpl;

public class HomeActivity extends AppCompatActivity implements HomeView{

    private HomePresenter homePresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        homePresenter = new HomePresenterImpl(this);

        homePresenter.showMessage();
    }

    @Override
    public void showMessage(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
    }
}
