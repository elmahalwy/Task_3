package com.example.elkholy.task_3;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Second_Fragment extends Fragment {
    TextView tv_welcome;
    EditText ed_mail;
    EditText ed_name;
    public Second_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second_layout, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        ed_name =(EditText) getActivity().findViewById(R.id.ed_Name);
        ed_mail=(EditText) getActivity().findViewById(R.id.ed_mail);
        tv_welcome = (TextView) getActivity().findViewById(R.id.tv_welcome);
         tv_welcome.setText("welcome "+ First_Fragment.name + "\n" +First_Fragment.mail);

    }
}
