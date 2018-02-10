package com.example.vinay.loginapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.content.Intent;





import android.widget.Button;
import android.widget.EditText;

import android.widget.Toast;

public class LoginApp extends AppCompatActivity{
    Button b;
    EditText ed1,ed2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_app);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login_app, menu);
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

    public void login(View view)
    {
    b = (Button)findViewById(R.id.button);
    ed1 = (EditText)findViewById(R.id.editText);
    ed2 = (EditText)findViewById(R.id.editText2);




            if(ed1.getText().toString().equals("vinay") &&
                    ed2.getText().toString().equals("password")) {
                 Toast.makeText(getApplicationContext(),
                 "Redirecting...",Toast.LENGTH_SHORT).show();
                Intent redirect = new Intent(LoginApp.this, translateApp.class);
                startActivity(redirect);



            }else{
                Toast.makeText(getApplicationContext(), "Wrong Credentials",Toast.LENGTH_SHORT ).show();

            }
        }

}
