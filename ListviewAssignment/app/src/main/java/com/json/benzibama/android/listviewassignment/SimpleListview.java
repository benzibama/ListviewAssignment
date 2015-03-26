package com.json.benzibama.android.listviewassignment;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by bama on 3/23/2015.
 */
public class SimpleListview extends Activity {
    static final String[] STATES = new String[] { "Tamil Nadu","Kerala","Andhra","Mumbai","Calcutta" };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simplelistviewlayout);
        ListView listView =(ListView) findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, STATES);
        listView.setAdapter(adapter);
                //listView.setTextFilterEnabled(true);
        Button b1=(Button) findViewById(R.id.buttonExit);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                String item  = STATES[position];
                Toast.makeText(getApplicationContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
            }
        });

    }

}