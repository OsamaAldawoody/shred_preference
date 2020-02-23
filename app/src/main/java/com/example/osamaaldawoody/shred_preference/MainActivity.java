package com.example.osamaaldawoody.shred_preference;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView shred_pereference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        shred_pereference = (TextView)findViewById(R.id.shared_pref);

    }
    public void goto_shared(View view){
        Intent i = new Intent(this,shared.class);
        startActivity(i);
    }
}
