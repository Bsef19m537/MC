package com.example.customlistviewapp;

import android.content.Context;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

public class personAdapter extends ArrayAdapter<person> {
    public personAdapter(@NonNull Context context, int resource, @NonNull person[] objects) {
        super(context, resource, objects);
    }
}
