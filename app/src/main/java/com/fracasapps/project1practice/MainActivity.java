package com.fracasapps.project1practice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    public static final String INTENT_EXTRA_POSITION = "position";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.stock_names, android.R.layout.simple_list_item_1);
        ListView listView = findViewById(R.id.stock_list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener((parent, view, position, id) -> launchDetailActivity(position));
    }

    private void launchDetailActivity(int position){
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra(INTENT_EXTRA_POSITION, position);
        startActivity(intent);
    }
}
