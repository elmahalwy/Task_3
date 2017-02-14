package com.example.elkholy.task_3;


import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {
    boolean status = false;
    View view;
    FragmentManager fragmentManager = getFragmentManager();
    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Button btn_submit = (Button) findViewById(R.id.btn_submit);


        First_Fragment first_fragment = new First_Fragment();
        fragmentTransaction.add(R.id.fragment_container, first_fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();


    }



}
