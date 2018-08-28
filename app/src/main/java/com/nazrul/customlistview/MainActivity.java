package com.nazrul.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView customList;
    String countryName[] = {"Bangladesh", "India", "China", "Japan", "France", "Germany", "Canada", "United Kingdom", "United States"};
    int flagList[] = {R.drawable.BD, R.drawable.IN, R.drawable.CN, R.drawable.JP, R.drawable.FR, R.drawable.GR, R.drawable.CD, R.drawable.UK, R.drawable.US};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        customList = findViewById(R.id.listview);

        CustomAdapter adapter = new CustomAdapter(MainActivity.this, countryName, flagList);
        customList.setAdapter(adapter);

        customList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, countryName[position], Toast.LENGTH_SHORT).show();
            }
        });

    }
}
