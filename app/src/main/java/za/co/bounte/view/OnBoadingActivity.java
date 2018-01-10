package za.co.bounte.view;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.RadioButton;
import android.widget.ViewFlipper;

import za.co.bounte.R;

public class OnBoadingActivity extends AppCompatActivity {

    private ViewFlipper viewFlipper;
    private Context context;
    private float initialX;

    private RadioButton rb1;
    private RadioButton rb2;
    private RadioButton rb3;
    private RadioButton rb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_boading);
        context = this;
        viewFlipper = (ViewFlipper)findViewById(R.id.view_flipper);

        rb1 = (RadioButton) findViewById(R.id.radioButton1);
        rb2 = (RadioButton) findViewById(R.id.radioButton2);
        rb3 = (RadioButton) findViewById(R.id.radioButton3);
        rb4 = (RadioButton) findViewById(R.id.radioButton4);

        rb1.setOnClickListener(radio_listener);
        rb2.setOnClickListener(radio_listener);
        rb3.setOnClickListener(radio_listener);
        rb4.setOnClickListener(radio_listener);

    }

    private View.OnClickListener radio_listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.radioButton1:
                    viewFlipper.setDisplayedChild(0);
                    break;
                case R.id.radioButton2:
                    viewFlipper.setDisplayedChild(1);
                    break;
                case R.id.radioButton3:
                    viewFlipper.setDisplayedChild(2);
                    break;
            }
        }
    };

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch(event.getAction()){
            case MotionEvent.ACTION_DOWN:
                initialX = event.getX();
                break;
            case MotionEvent.ACTION_UP:
                float finalX = event.getX();
                if(initialX > finalX){
                    if(viewFlipper.getDisplayedChild() == 1){
                        break;
                    }else
                    //Set in animation
                    viewFlipper.setInAnimation(AnimationUtils.loadAnimation(context, R.anim.in_from_left));
                    //Set out animation
                    viewFlipper.setOutAnimation(AnimationUtils.loadAnimation(context, R.anim.out_from_left));
                    viewFlipper.showNext();
                }else{
                    if(viewFlipper.getDisplayedChild() == 0){
                        break;
                    }
                    viewFlipper.setInAnimation(AnimationUtils.loadAnimation(context, R.anim.in_from_right));
                    viewFlipper.setOutAnimation(AnimationUtils.loadAnimation(context, R.anim.out_from_right));
                    viewFlipper.showPrevious();
                }
                break;
        }
        return false;
    }
}
