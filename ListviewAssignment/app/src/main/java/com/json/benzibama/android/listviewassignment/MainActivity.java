package com.json.benzibama.android.listviewassignment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends Activity implements OnItemSelectedListener{
    private RadioGroup Rgb1;
    private RadioButton Rb1;
    private Button submitbutton,Listbutton,Custombutton;
    private EditText name;
    private Spinner spinner1;
    String item;
    final Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState)

    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submitbutton=(Button) findViewById(R.id.Button1);
        Listbutton=(Button) findViewById(R.id.Button2);
        Custombutton=(Button) findViewById(R.id.Button3);

        //EditText assigning
        name=(EditText) findViewById(R.id.EmpName);
        Rgb1=(RadioGroup) findViewById(R.id.RadioGp1);

        spinner1=(Spinner) findViewById(R.id.course);
        spinner1.setOnItemSelectedListener(this);
        List list = new ArrayList();
        list.add("Java");
        list.add("Android");
        list.add("Dot Net");
        list.add("SQL Server");
        ArrayAdapter dataAdapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(dataAdapter);

        submitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //get selected radio button from radioGroup
                int selectedId = Rgb1.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                Rb1= (RadioButton) findViewById(selectedId);
                String value=Rb1.getText().toString();
                String textvalue=name.getText().toString();
                String total = textvalue +" selected the the course "+item +" and the duration is  " + value;
                /*Toast.makeText(getApplicationContext(), textvalue,
                      Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(), value,
                        Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(), "Selected: " + item, Toast.LENGTH_LONG).show();*/
                Toast.makeText(getApplicationContext(), total,
                        Toast.LENGTH_LONG).show();
            }
        });
        Listbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, SimpleListview.class);
                startActivity(intent);
            }
        });
        Custombutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(MainActivity.this, customListView.class);
                startActivity(intent1);
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
// On selecting a spinner item
        item = parent.getItemAtPosition(position).toString();

        // Showing selected spinner item

        Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

}
