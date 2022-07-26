package com.example.listviewcustomization;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lvw = (ListView) findViewById(R.id.lv);
        String[] data  = {"vegetables" , " Fruits " , "Nuts" , "Drink" };
        Integer[] images = { R.drawable.img_4 , R.drawable.img_5 , R.drawable.img_6 , R.drawable.img_7 };


        customAdapter adapter = new customAdapter(getApplicationContext() , data , images );
        lvw.setAdapter(adapter);
    }

    public class customAdapter extends ArrayAdapter<String>{

        private final Context context;
        private final String[] data;
        private final Integer[] images;

        public customAdapter(@NonNull Context context, String[] data , Integer[] images ) {
            super(context, R.layout.customlist , data);

            this.context = context;
            this.data = data;
            this.images = images;
        }

        public View getView(int i , View convertview , ViewGroup viewgroup){
           View v1 = getLayoutInflater().inflate(R.layout.customlist , viewgroup , true);

            ImageView img = v1.findViewById(R.id.img);
            TextView name = v1.findViewById(R.id.name);

           img.setImageResource(images[i]);
           name.setText(data[i]);

           
        }
    }
}