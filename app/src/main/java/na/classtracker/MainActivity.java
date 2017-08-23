package na.classtracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.widget.AdapterView.OnItemSelectedListener;
import java.util.*;
import java.util.ArrayList;
import android.content.Intent;
import java.io.Serializable;
import android.app.Activity;




public class MainActivity extends AppCompatActivity {

    private Hashtable<String, myClass> classList = new Hashtable<>();
    ArrayList<String> spinnerList = new ArrayList<String>();

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // Check which request we're responding to
        if (requestCode == 1) {
            // Make sure the request was successful
            if (resultCode == RESULT_OK) {

                Serializable newData = data.getSerializableExtra("newClass");

                String newClass = data.getStringExtra("ClassString");
                classList.put(newClass, (myClass)newData);
                spinnerList.add(newClass);
            }
        }
    }

    public void startAddClass()
    {
        Intent addClassWindow = new Intent(this, AddClassActivity.class);
        startActivityForResult(addClassWindow, 1);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinnerList.add("Add Class");

        Button goButton = (Button)findViewById(R.id.ActionButton);
        goButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                startAddClass();
            }
        });

        Spinner dropdown = (Spinner)findViewById(R.id.spinnerMain);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, spinnerList);
        dropdown.setAdapter(adapter);
    }

}
