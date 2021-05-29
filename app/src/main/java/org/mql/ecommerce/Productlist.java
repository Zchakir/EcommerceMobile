package org.mql.ecommerce;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.mql.ecommerce.model.Product;

import java.util.ArrayList;
import java.util.List;

public class Productlist extends AppCompatActivity {

    Intent intent;
    ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productlist);
        intent=getIntent();
        list=(ListView) findViewById(R.id.myListView);
        ArrayList<Product> data = (ArrayList<Product>) intent.getSerializableExtra("data");
        ArrayList<String> stringData = new ArrayList<String>();
        for (Product ele:
             data) {
            stringData.add(ele.toString());
        }
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                stringData);
        list.setAdapter(arrayAdapter);
    }
}