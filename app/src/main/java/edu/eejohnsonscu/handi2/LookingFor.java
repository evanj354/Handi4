package edu.eejohnsonscu.handi2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LookingFor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_looking_for);
    }

    public void jumpToPage(View view) {
        mViewPager.setCurrentItem(1);
    }
}
