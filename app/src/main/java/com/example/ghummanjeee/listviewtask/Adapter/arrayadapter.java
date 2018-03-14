package com.example.ghummanjeee.listviewtask.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ghummanjeee.listviewtask.Model.Weather;
import com.example.ghummanjeee.listviewtask.R;

import java.util.ArrayList;

/**
 * Created by GhummanJeee on 3/13/2018.
 */

public class arrayadapter extends ArrayAdapter<Weather> {
    ArrayList<Weather> OListuser;
    LayoutInflater OLayoutInflater;

    public arrayadapter(Context context, ArrayList<Weather> OuserList) {
        super(context, 0, OuserList);
        OListuser=OuserList;
        OLayoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

   @Override
    public int getCount() {
        return OListuser.size();
    }

    @Override
    public Weather getItem(int position) {

        return OListuser.get(position);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view=OLayoutInflater.inflate(R.layout.listview,null);


        TextView city=(TextView)view.findViewById(R.id.city);
        TextView temp=(TextView)view.findViewById(R.id.temp);
        ImageView vi=(ImageView)view.findViewById(R.id.img);
        Weather ouser=  getItem(position);
        city.setText(ouser.getCity());
        temp.setText(ouser.getTemperature("Cloudy. 25 °F"));
      //  vi.setImageDrawable(ouser.getImage());


        return  view;

    }


    public LayoutInflater getOLayoutInflater() {
        return OLayoutInflater;
    }

    public void setOLayoutInflater(LayoutInflater OLayoutInflater) {
        this.OLayoutInflater = OLayoutInflater;
    }

    public ArrayList<Weather> getOListuser() {
        return OListuser;
    }

    public void setOListuser(ArrayList<Weather> OListuser) {
        this.OListuser = OListuser;
    }




}