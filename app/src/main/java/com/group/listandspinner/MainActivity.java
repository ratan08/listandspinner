package com.group.listandspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = (Spinner) findViewById(R.id.Spinner);
        ListView listView =(ListView) findViewById(R.id.listView);

        ArrayList<String> array = new ArrayList<>();
        array.add("ratan");
        array.add("ratan1");
        array.add("ratan2");
        array.add("ratan3");
        array.add("ratan5");

        ArrayAdapter<String> arrAdepter = new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item,array);

        spinner.setAdapter(arrAdepter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, array.get(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        ArrayAdapter<String>  listAdepter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,array );
        listView.setAdapter(listAdepter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, listAdepter.getItem(position), Toast.LENGTH_SHORT).show();
            }
        });


    }
}