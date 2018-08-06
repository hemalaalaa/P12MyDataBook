package com.example.a16022706.p12_mydatabook;


import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;

import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Random;


/**
 * A simple {@link Fragment} subclass.
 */
public class BioFragment extends Fragment {

    Button btnEdit;
    TextView tvEditedBio;


    public BioFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


         View vvv = inflater.inflate(R.layout.biofragment, container, false);

        // Inflate the layout for this fragment

        btnEdit = (Button) vvv.findViewById(R.id.btnFragBio);
        tvEditedBio = (TextView) vvv.findViewById(R.id.tvEditedBio);


        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                View view = inflater.inflate(R.layout.editBox, null);

                final EditText etEditBio = (EditText) view
                        .findViewById(R.id.editTextEditBio);

                final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setTitle("Access Code")


                        .setView(view)
                        .setCancelable(false)


                        .setNegativeButton("CANCEL",  new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int id) {



                            }
                        })


                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int id) {
                                String input = etEditBio.getText().toString();
                                tvEditedBio.setText(input);


//                                int code = Integer.parseInt(etAccessCode.getText().toString());
//                                if (code == 738964) {
//
//                                } else {
//                                    finish();
//
//                                }
                            }
                        });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();


            }
        });

        return vvv;


    }

}
