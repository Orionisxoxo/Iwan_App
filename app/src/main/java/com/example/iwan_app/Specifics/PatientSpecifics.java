package com.example.iwan_app.Specifics;

import android.content.Context;
import android.content.Intent;

import com.example.iwan_app.Activities.PatientView;
import com.example.iwan_app.StrategyForUserLogin;

public class PatientSpecifics implements StrategyForUserLogin {

    Context context;

    @Override
    public void openCheckedView(Context context) {
        //CheckBox patientStart = ((Activity)context).findViewById(R.id.patientCheck);
        Intent intent = new Intent(context, PatientView.class);
        context.startActivity(intent);
    }
}
