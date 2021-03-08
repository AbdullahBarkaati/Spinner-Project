package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    RadioGroup group;
    String gender = "";
    Spinner spinner;
    ArrayList<String> arrayList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        group = findViewById(R.id.radio_Group);
        spinner = findViewById(R.id.spinner);

        arrayList.add("Select Option");
        arrayList.add("Android");
        arrayList.add("iOS");

//        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.labels_array, android.R.layout.simple_spinner_item);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_item,arrayList);

        adapter.setDropDownViewResource
                (R.layout.list_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(id!=0) {
                    Toast.makeText(MainActivity.this, "" + arrayList.get(position), Toast.LENGTH_SHORT).show();
                    Toast.makeText(MainActivity.this, "" + id, Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                RadioButton radioButton = group.findViewById(checkedId);

                switch (checkedId){

                    case R.id.radioOne:
                        gender = "1";
                        Toast.makeText(MainActivity.this, ""+radioButton.getText().toString(), Toast.LENGTH_SHORT).show();
                        Toast.makeText(MainActivity.this, ""+gender, Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioTwo:
                        gender = "2";
                        Toast.makeText(MainActivity.this, ""+radioButton.getText().toString(), Toast.LENGTH_SHORT).show();
                        Toast.makeText(MainActivity.this, ""+gender, Toast.LENGTH_SHORT).show();
                        break;

                }

            }
        });


//        checkboxOne.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//
//                if (isChecked){
//                    value = checkboxOne.getText().toString();
//                    Toast.makeText(MainActivity.this, "Option is Selected", Toast.LENGTH_SHORT).show();
//                }else {
//                    Toast.makeText(MainActivity.this, "Not Select", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
//
//        checkboxTwo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//
//                if (isChecked){
//                    checkboxOne.setChecked(false);
//                    value = checkboxTwo.getText().toString();
//                    Toast.makeText(MainActivity.this, "Option2 is Selected", Toast.LENGTH_SHORT).show();
//                }else {
//                    Toast.makeText(MainActivity.this, "Not Select", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
//
//        btn_Submit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this,HomeActivity.class);
//                intent.putExtra("option",value);
//                startActivity(intent);
//
//            }
//        });
    }

}