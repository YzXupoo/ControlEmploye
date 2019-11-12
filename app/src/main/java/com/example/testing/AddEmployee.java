package com.example.testing;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AddEmployee extends AppCompatActivity {

    TextView firstName, lastName, age, height, weight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_employee);

        this.firstName = this.findViewById(R.id.firstName);
        this.lastName = this.findViewById(R.id.lastName);
        this.age = this.findViewById(R.id.age);
        this.height = this.findViewById(R.id.height);
        this.weight = this.findViewById(R.id.weight);

        Bundle extras = getIntent().getExtras();

        firstName.setText(extras.getString("firstName"));
        lastName.setText(extras.getString("lastName"));
        age.setText(extras.getString("age"));
        height.setText(extras.getString("height"));
        weight.setText(extras.getString("weight"));




    }


}
