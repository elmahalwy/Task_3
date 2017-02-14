package com.example.elkholy.task_3;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class First_Fragment extends Fragment {

    Button btn_submit;
    EditText ed_mail;
    EditText ed_name;

    public static String name ;
    public static String mail ;

    public First_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first_layout, container, false);


    }

    @Override
    public void onStart() {
        super.onStart();

        ed_name = (EditText) getActivity().findViewById(R.id.ed_Name);
        ed_mail = (EditText) getActivity().findViewById(R.id.ed_mail);

        btn_submit = (Button) getActivity().findViewById(R.id.btn_submit);
        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                Second_Fragment f2 = new Second_Fragment();
                fragmentTransaction.replace(R.id.fragment_container, f2);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                name = ed_name.getText().toString();
                mail =ed_mail.getText().toString();
                //   Toast.makeText(getActivity().getApplicationContext(),
                //         ,Toast.LENGTH_LONG).show();
            }
        });
    }
}
