package com.example.iwan_app;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.iwan_app.Specifics.PatientSpecifics;
import com.example.iwan_app.Specifics.TechnicianSpecifics;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    DoctorSpecifics doctorSpecifics;
    PatientSpecifics patientSpecifics;
    TechnicianSpecifics technicianSpecifics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void loginUserWithButton(View view, final Context context) {
        Button userLogin = findViewById(R.id.button);
        userLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(validateIfLoginAndPasswordIsEmpty()) {
                    goToCheckedView(context);
                } else {
                    Log.e("", "Cannot authenticate user.");
                }
            }
        });

    }

    public boolean validateIfLoginAndPasswordIsEmpty() {
        String userNickname = findViewById(R.id.nickname).toString();
        String userPassword = findViewById(R.id.password).toString();
        boolean isValid = true;

        if(userNickname.isEmpty() || userPassword.isEmpty()) {
            isValid = false;
        }
        return isValid;
    }

    public void goToCheckedView(Context context) {
        CheckBox patientStart = findViewById(R.id.patientCheck);
        CheckBox technicianStart = findViewById(R.id.technicianCheck);
        CheckBox doctorStart = findViewById(R.id.doctorCheck);

        if(patientStart.isChecked()) {
            patientSpecifics.openCheckedView(context);
        } if(technicianStart.isChecked()) {
            technicianSpecifics.openCheckedView(context);
        } if(doctorStart.isChecked()) {

        }
    }

    public void validateCheckBox() {

    }
}
