package com.example.lab20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    private EditText edUserInput;
    private TextView tvResult;

    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        this.edUserInput = findViewById(R.id.edUserInput);
        this.tvResult = findViewById(R.id.tvResult);
        this.spinner = (Spinner) findViewById(R.id.spCountOptions);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this,
                R.array.selection_options,
                android.R.layout.simple_spinner_item
        );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.spinner.setAdapter(adapter);
    }


    public void btnCountClick(View view) {

        String Selection_chars=getResources().getString(R.string.Selection_chars);
        if(spinner.getSelectedItem().toString().equalsIgnoreCase(Selection_chars)) {
            String userInput = this.edUserInput.getText().toString();
            Log.i("UserText", userInput);

            int count = WordCounter.getCharsCount(userInput);
            Log.i("UserTextCount", String.valueOf(count));

            if (count == 0)
            {
                Toast.makeText(this, "You did not enter anything! Please enter something.", Toast.LENGTH_SHORT).show();
                tvResult.setText("Empty for now))");
            }
            else {
                if(count==1)
                    this.tvResult.setText("There is: " + String.valueOf(count)+ " char");
                else
                    this.tvResult.setText("There are: " + String.valueOf(count)+ " chars");
            }


        }
        else
        {
            String userInput = this.edUserInput.getText().toString();
            Log.i("UserText", userInput);

            int count = WordCounter.getWordsCount(userInput);
            Log.i("UserTextCount", String.valueOf(count));

            if (count == 0) {
                Toast.makeText(this, "You did not enter any words! Please enter something.", Toast.LENGTH_SHORT).show();
                tvResult.setText("Empty for now))");
            }
            else {
                if(count==1)
                    this.tvResult.setText("There is: " + String.valueOf(count)+ " word");
                else
                    this.tvResult.setText("There are: " + String.valueOf(count)+ " words");
            }
            // Toast.makeText(this, "Not implemented yet", Toast.LENGTH_SHORT).show();
        }
    }
}