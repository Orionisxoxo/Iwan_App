package com.example.iwan_app.Specifics;

import android.content.Context;
import android.content.Intent;

import com.example.iwan_app.Activities.TechnicianView;
import com.example.iwan_app.StrategyForUserLogin;

public class TechnicianSpecifics implements StrategyForUserLogin {

    Context context;

    @Override
    public void openCheckedView(Context context) {
        //CheckBox technicianStart = ((Activity)context).findViewById(R.id.technicianCheck);
        Intent intent = new Intent(context, TechnicianView.class);
        context.startActivity(intent);
    }
}
