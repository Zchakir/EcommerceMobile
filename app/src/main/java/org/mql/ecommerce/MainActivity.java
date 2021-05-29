package org.mql.ecommerce;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.mql.ecommerce.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Product> data;
    private Button add;
    private Button show;
    EditText name;
    EditText price;
    EditText category;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        data=new ArrayList<Product>();
       // textView= (TextView) findViewById(R.id.textView);
        add = (Button) findViewById(R.id.button);
        show = (Button) findViewById(R.id.button2);

        add.setOnClickListener(v -> {
            name = (EditText) findViewById(R.id.editTextTextPersonName);
            price = (EditText) findViewById(R.id.editTextTextPersonName2);
            category = (EditText) findViewById(R.id.editTextTextPersonName3);
            data.add(new Product(name.getText().toString(),Integer.parseInt(price.getText().toString()),category.getText().toString()));
            Toast.makeText(getApplicationContext(),"Produit Ajoute",Toast.LENGTH_LONG);
        });

        show.setOnClickListener(v -> {

            Intent productIntent = new Intent(this, Productlist.class);
            productIntent.putExtra("data",data);
            startActivity(productIntent);
        });

    }


}