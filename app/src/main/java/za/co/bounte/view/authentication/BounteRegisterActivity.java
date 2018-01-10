package za.co.bounte.view.authentication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import za.co.bounte.R;

public class BounteRegisterActivity extends AppCompatActivity implements BounteRegisterView{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bountee_register_view);
    }
}
