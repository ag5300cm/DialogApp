package com.example.meghan.dialogapp;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.support.v7.app.AlertDialog;

public class MainActivity extends AppCompatActivity {
        //implements DialogEmphasisFragment.DialogSelectionListener {

    Button mChooseBackgroundColor;
    //RelativeLayout mBackground;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //mBackground = (RelativeLayout) findViewById(R.id.background);
        mChooseBackgroundColor = (Button) findViewById(R.id.addEnphasis_button);

        mChooseBackgroundColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Show dialog
                DialogEmphasisFragment dialog = DialogEmphasisFragment.newInstance();
                dialog.show(getFragmentManager(), "Color Dialog");
            }
        });
    }

    /* //Need to activate something
    @Override
    public void colorSelected(int color) {
        mBackground.setBackgroundColor(color);
    }
    */
}
























/*

public class MainActivity extends AppCompatActivity {

    private TextView mDialogResult;

    interface MainActivtiyListener {
        void userClickedCapitalize();
        void userClickedAddExclamationPoints();
        void userClickedAddSmileyFace();
        void userClickedOk();
        void userClickedCancel();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDialogResult = (TextView) findViewById(R.id.instructions_textview);

        Button showDialog = (Button) findViewById(R.id.addEnphasis_button);
        showDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Dialogs are created by a Builder.
                AlertDialog.Builder builder =
                        new AlertDialog.Builder(MainActivity.this);

                TextView theEditText = (TextView) findViewById(R.id.enteredText_EditText);

                //Tell builder which options we'd like. Chain methods together

               builder.setItems arraylist<>
                        (theEditText.toString())
                        .setTitle("What emphasis would you like")
                        .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                userClickedOk();
                            }
                        })
                        .setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                userClickedCancel();
                            }
                        })
                        .create()      //Create dialog
                        .show();       //Show dialog
            }
        });
    }



    private void userClickedOk() {
        mDialogResult.setText("You clicked ok");
    }

    private void userClickedCancel() {
        mDialogResult.setText("You clicked cancel");
    }


}

*/



















/*
import android.content.DialogInterface;
import android.preference.DialogPreference;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView mDialogResult; //Adding global variable

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDialogResult = (TextView) findViewById(R.id.dialog_result_text); //initialize

        Button showDialog = (Button) findViewById(R.id.show_dialog_button); //changed from show_dialog_box
        showDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Dialogs are created by a Builder.
                //There's so many possible options when creating a Dialog, so constructors are really awkward.
                // 'Builder' is the name of a design pattern that tries to address this - Google for more info.
                //Dialogs belong to an Activity, so provide a reference to this Activity.
                AlertDialog.Builder builder =
                        new AlertDialog.Builder(ShowSimpleDialogActivity.this);

                //Tell builder which options we'd like. Chain methods together
                builder.setMessage("I'm a dialog")
                        .setTitle("This is the title")
                        //.setPositiveButton(android.R.string.ok, null);
                        .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                userClickedOk(); //slide 10 on powerpoint
                            }
                        })
                        .setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                userClickedCancel(); //slide 10 on powerpoint
                            })
                                    .create()
                            .show()


                            //Request the builder creates a Dialog with the specified options
                            AlertDialog dialog = builder.create();

                            //And show the dialog
                            dialog.show();

                        }
            });
        }
    }
*/