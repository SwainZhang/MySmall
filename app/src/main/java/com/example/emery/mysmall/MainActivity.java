package com.example.emery.mysmall;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import net.wequick.small.Small;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(), "onStart()", Toast.LENGTH_SHORT).show();
        Small.setUp(this, new Small.OnCompleteListener() {
            @Override
            public void onComplete() {
                Toast.makeText(getApplicationContext(), "该跳转了。。。", Toast.LENGTH_SHORT).show();
                Small.openUri("main", MainActivity.this);
            }
        });
    }
}
