package com.example.osamaaldawoody.shred_preference;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class shared extends AppCompatActivity {

    EditText name_text;
    EditText password_text;
    CheckBox chk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared);
        name_text = (EditText) findViewById(R.id.editText2);
        password_text = (EditText) findViewById(R.id.editText);
        chk = (CheckBox) findViewById(R.id.checkBox);
        chk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (chk.isChecked()==true){
                    SharedPreferences pref = getSharedPreferences("file",0);
                    SharedPreferences.Editor handler = pref.edit();
                    handler.putString("y",name_text.getText().toString());
                    handler.putString("z",password_text.getText().toString());
                    handler.putBoolean("x",true);
                    handler.commit();
                }
            }
        });
        SharedPreferences pref = getSharedPreferences("file",0);
        if (pref.getBoolean("x",false) == true){
            String name = pref.getString("y","");
            name_text.setText(name);
            String pw = pref.getString("z","");
            password_text.setText(pw);
            chk.setChecked(true);
        }
    }

}
