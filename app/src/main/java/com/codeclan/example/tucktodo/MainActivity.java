package com.codeclan.example.tucktodo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListView)findViewById(R.id.task_listview);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,setUpStringsList());

        mListView.setAdapter(adapter);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(
                    AdapterView<?> parent, View view, int position, long id){
                        String selected = (String) mListView.getItemAtPosition(position);
                Log.d("ListView:", selected + "Selected");
            }
        });

    }

    private ArrayList<String> setUpStringsList()
    {
        ArrayList<String> stringsList = new ArrayList<String>();

        String[] strings =
        {
                "Make breakfast",
                "Make lunch",
                "Make dinner"
        };

        for (int i = 0; i < strings.length; i++)
        {
            stringsList.add(strings[i]);
        }
        return stringsList;
    }






}
