package com.example.a16022706.p12_mydatabook;


import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class VaccinationFragment extends Fragment {

    Button btnEdit;
    TextView tvEditedVacci;

    public VaccinationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View vvv = inflater.inflate(R.layout.vaccinationfragment, container, false);

        // Inflate the layout for this fragment

        btnEdit = (Button) vvv.findViewById(R.id.btnFragVacci);
        tvEditedVacci = (TextView) vvv.findViewById(R.id.tvEditedVacci);


        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                View view = inflater.inflate(R.layout.editbox, null);

                final EditText etEditVacci = (EditText) view
                        .findViewById(R.id.editTextEditFragments);

                final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setTitle("Edit Vaccination")


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
                                String input = etEditVacci.getText().toString();
                                tvEditedVacci.setText(input);
                            }
                        });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();


            }
        });

        return vvv;

    }

}
