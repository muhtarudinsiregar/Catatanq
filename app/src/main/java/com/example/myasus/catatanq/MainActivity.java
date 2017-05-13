package com.example.myasus.catatanq;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

import static com.example.myasus.catatanq.R.id.editText;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> items;
    ArrayAdapter<String> itemsAdapter;
    ListView lvlItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvlItems = (ListView)findViewById(R.id.listView);

        items = new ArrayList<>();
        itemsAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, items);
        lvlItems.setAdapter(itemsAdapter);
        items.add("First Item");
        items.add("Second Item");
    }

    protected void onAddItem(View v) {
        EditText editText = (EditText) findViewById(R.id.editText);

        String itemText = editText.getText().toString();
        itemsAdapter.add(itemText);

        editText.setText("");
    }
}
