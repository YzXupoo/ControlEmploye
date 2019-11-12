package com.example.testing;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText firstName, lastName, age, height, weight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.firstName = this.findViewById(R.id.firstName);
        this.lastName = this.findViewById(R.id.lastName);
        this.age = this.findViewById(R.id.age);
        this.height = this.findViewById(R.id.height);
        this.weight = this.findViewById(R.id.weight);

        Button buttonclick = (Button)findViewById(R.id.addEmployee);


        buttonclick.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                addEmployee();
                messageLog();
            }
        });


    }
    public void addEmployee() {
        Intent intent1= new Intent(MainActivity.this, AddEmployee.class);
        intent1.putExtra("firstName", firstName.getText().toString());
        intent1.putExtra("lastName", lastName.getText().toString());
        intent1.putExtra("age", age.getText().toString());
        intent1.putExtra("height", height.getText().toString());
        intent1.putExtra("weight", weight.getText().toString());
        startActivity(intent1);
    }


    public void messageLog() {
        Log.d("test", firstName.toString());
        Log.d("test", lastName.toString());
        Log.d("test", age.toString());
        Log.d("test", height.toString());
        Log.d("test", weight.toString());

    }
}
