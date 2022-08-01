package com.example.customlistviewapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class personAdapter extends ArrayAdapter<person> {

    private Context mcontext;
    private int mresource;

    public personAdapter(@NonNull Context context, int resource, @NonNull ArrayList<person> objects) {
        super(context, resource, objects);

        this.mcontext = context;
        this.mresource = resource;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater lf = LayoutInflater.from(mcontext);
         convertView = lf.inflate(mresource,parent,false);

        ImageView imgv = convertView.findViewById(R.id.img);
        TextView txtv = convertView.findViewById(R.id.textname);
        TextView stxtv = convertView.findViewById(R.id.subtextname);

        imgv.setImageResource(getItem(position).getImage());
        txtv.setText(getItem(position).getName());
        stxtv.setText(getItem(position).getDes());


        return convertView;
    }


}
