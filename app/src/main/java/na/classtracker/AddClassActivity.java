package na.classtracker;

/**
 * Created by kristopher on 5/28/17.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.*;
import java.util.ArrayList;
import java.io.Serializable;
public class AddClassActivity extends Activity {

    /**
     * Called when the activity is first created.
     */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addclass);



        Button next = (Button) findViewById(R.id.Return);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                EditText classname = (EditText)findViewById(R.id.ClassName);
                String nclassname = classname.getText().toString();
                EditText profName = (EditText)findViewById(R.id.Professor_Name);
                String nprofName = profName.getText().toString();
                EditText location = (EditText)findViewById(R.id.Location);
                String nlocation = location.getText().toString();
                EditText time = (EditText)findViewById(R.id.Time);
                String ntime = time.getText().toString();
                myClass newclass = new myClass(nprofName, nlocation, ntime);



                Intent intent = new Intent();
                intent.putExtra("newClass", newclass);
                intent.putExtra("ClassString", nclassname);
                setResult(RESULT_OK, intent);
                finish();
            }

        });
    }
}