package com.example.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ListViewAdapter extends ArrayAdapter<ListItem> {
    public ListViewAdapter(@NonNull Context context, @NonNull List<ListItem> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ListItem item = getItem(position);

        convertView = LayoutInflater.from(getContext()).inflate(R.layout.customlist, parent, false);
        ImageView imageView = convertView.findViewById(R.id.imageView);
        TextView textView = convertView.findViewById(R.id.textView);

        imageView.setImageResource(item.getImageId());
        textView.setText(item.getName());

        return convertView;
    }
}
