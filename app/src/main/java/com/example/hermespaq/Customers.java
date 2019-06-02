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
    int [] IMAGES = {R.drawable.hola1, R.drawable.hola2, R.drawable.hola3, R.drawable.hola4};
    String [] NAMES = {"Antonio Galvan", "Julio Castro", "Maria Mejia", "Laura Pineda"};
    String [] DESCRIPTIONS = {"2 paquetes", "1 paquete", "3 paquetes", "7 paquetes"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customers);

        ListView listView=(ListView)findViewById(R.id.listView);
        CustomAdapter customAdapter=new CustomAdapter();

        listView.setAdapter(customAdapter);
    }

    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return IMAGES.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view = getLayoutInflater().inflate(R.layout.customlayout, null);
            ImageView imageView=(ImageView)view.findViewById(R.id.imageView2);
            TextView textView_name =(TextView)view.findViewById(R.id.textView_name);
            TextView textView_description =(TextView)view.findViewById(R.id.textView_description);
            imageView.setImageResource(IMAGES[i]);
            textView_name.setText(NAMES[i]);
            textView_description.setText(DESCRIPTIONS[i]);

            return view;
        }
    }
}
