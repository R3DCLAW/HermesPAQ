package com.example.hermespaq;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Customers extends AppCompatActivity {

    int[] Images = {R.drawable.hola1, R.drawable.hola2, R.drawable.hola3, R.drawable.hola4};

    String[] Names = {"Antonio Galvan", "Maria Mejia", "Julio Castro", "Laura Pineda"};

    String[] Descriptions = {"2 paquetes", "1 paquete", "3 paquetes", "7 paquetes"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customers);

        ListView listView=(ListView) findViewById(R.id.listView);

        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);

    }

    class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return Images.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view =getLayoutInflater().inflate(R.layout.customlayout,null);

            ImageView imageView=(ImageView)view.findViewById(R.id.imageView);
            TextView textView_name=(TextView)view.findViewById(R.id.textView_name);
            TextView textView_description=(TextView)view.findViewById(R.id.textView_description);

            imageView.setImageResource(Images[i]);
            textView_name.setText(Names[i]);
            textView_description.setText(Descriptions[i]);

            return view;
        }
    }
}
