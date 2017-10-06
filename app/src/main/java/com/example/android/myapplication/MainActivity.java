package com.example.android.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;
    LayoutInflater inflater;
    View view;
    Context context= this;
    FrameLayout content;





    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    inflater=null;
                    view=null;
                    content.removeAllViews();
                    inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                    view=inflater.inflate(R.layout.goms1,null);
                    TextView txt= (TextView)view.findViewById(R.id.txt) ;
                    txt.setText("percy");
                    content.addView(view);
                    return true;


                case R.id.navigation_dashboard:
                    inflater=null;
                    view=null;
                    content.removeAllViews();
                    inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                    view=inflater.inflate(R.layout.goms2,null);
                    content.addView(view);
                    return true;


                case R.id.navigation_notifications:
                    inflater=null;
                    view=null;
                    content.removeAllViews();
                    inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                    view=inflater.inflate(R.layout.goms3,null);
                    content.addView(view);
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        content=(FrameLayout) findViewById(R.id.content);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        inflater=null;
        view=null;
        content.removeAllViews();
        inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view=inflater.inflate(R.layout.goms1,null);
        content.addView(view);
    }

}
