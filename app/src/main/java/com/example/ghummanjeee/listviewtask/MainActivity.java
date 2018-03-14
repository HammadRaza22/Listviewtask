package com.example.ghummanjeee.listviewtask;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.ghummanjeee.listviewtask.Adapter.arrayadapter;
import com.example.ghummanjeee.listviewtask.Model.Weather;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lst;
    arrayadapter arry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Init();

    }

    private void Init() {
        lst = (ListView) findViewById(R.id.listvw);
        //Sun  Items
        Weather doop=new Weather();
        doop.setCity("Sialkot");
      doop.setTemperature("Clear");
        doop.setImage(R.drawable.doop);
        // /Barish
        Weather barish=new Weather();
        barish.setCity("Rawalpindi");
        barish.setTemperature("Cloudy. 25 °F");
        barish.setImage(R.drawable.badal);
        // Badal
      Weather badal=new Weather();
        badal.setCity("Peshawar");
        badal.setTemperature("Cloudy. 15 °F");
        badal.setImage(R.drawable.barish);


        ArrayList<Weather> ListUsers=new ArrayList<Weather>();
        ListUsers.add(doop);
        ListUsers.add(barish);
        ListUsers.add(badal);



       arry=new arrayadapter(getApplicationContext(),ListUsers);
        lst.setAdapter(arry);


    }
}
