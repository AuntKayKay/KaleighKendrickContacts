package com.example.kaleigh.kaleighkendrickcontacts;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public String getContact(View theView) {
        String result ="";
        TextView myTextView = (TextView)
                findViewById(R.id.displayContact);
                result = result + myTextView.getText().toString().trim()+"\n";
        TextView myNameView = (TextView)
                findViewById(R.id.name);
                result = result + myNameView.getText().toString().trim() + ", ";
        TextView myEmailView = (TextView)
                findViewById(R.id.eMail);
                result = result + myEmailView.getText().toString().trim() + ", ";
        TextView myPhoneView = (TextView)
                findViewById(R.id.phoneNumber);
                result = result + myPhoneView.getText().toString().trim() + ", ";
        RadioGroup rg = (RadioGroup) findViewById(R.id.phoneRadioGroup);
                result = result + ((RadioButton)findViewById(rg.getCheckedRadioButtonId() )).getText().toString() + "\n";
        return result;
    }

    public void saveContact(View theView) {
        TextView myTextView = (TextView)
                findViewById(R.id.displayContact);
        myTextView.setText(this.getContact(theView));
    }
}
