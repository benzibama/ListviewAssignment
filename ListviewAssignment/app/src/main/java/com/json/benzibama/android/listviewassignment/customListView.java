package com.json.benzibama.android.listviewassignment;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

/**
 * Created by bama on 3/25/2015.
 */
public class customListView extends Activity{
    ListView listView;
    String names[]={"Tamil Nadu","Kerala","Karnataka","Calcutta","Mumbai"};
    CustomAdapter customAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custommainlayout);
        listView=(ListView)findViewById(R.id.listview);
        customAdapter=new CustomAdapter(customListView.this , names);

        //ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,names);
        listView.setAdapter(customAdapter);
    }
}
