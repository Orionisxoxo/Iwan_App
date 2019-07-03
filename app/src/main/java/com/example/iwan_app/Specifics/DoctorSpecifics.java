package com.example.iwan_app.Specifics;

import android.content.Context;
import android.content.Intent;

import com.example.iwan_app.Activities.DoctorView;
import com.example.iwan_app.StrategyForUserLogin;

public class DoctorSpecifics implements StrategyForUserLogin {

    Context context;

    @Override
    public void openCheckedView(Context context) {
        //CheckBox doctorStart = ((Activity)context).findViewById(R.id.doctorCheck);
        Intent intent = new Intent(context, DoctorView.class);
        context.startActivity(intent);
    }
}
