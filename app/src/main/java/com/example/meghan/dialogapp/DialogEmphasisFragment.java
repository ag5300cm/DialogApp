package com.example.meghan.dialogapp;

// DialogEmphasisFragment

import android.content.DialogInterface;
import android.os.Bundle;
//import android.support.v7.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.graphics.Color;
import android.widget.EditText;
import android.widget.TextView;


public class DialogEmphasisFragment extends DialogFragment {


}














/*
public class DialogEmphasisFragment extends DialogFragment {

    //TextView whatSomeoneEntered.findViewById(R.id.enteredText_EditText);

    //This data is the text to be displayed in the dialog's list
    //Replace any/all colors with your own prefered colors
    final CharSequence[] Emphasis_Choices = { "Capitalize", "Add Exclamation Point", "Add Smiley Face" };

    //Parallel array with the color values, as int values
    //Replace colors with your own prefered colors in this array too
    final String[] COLOR_VALUES = { String.toUpperCase(), Color.GREEN, Color.BLUE };

    //Interface for the listener
    interface  ColorDialogSelectionListener {
        void colorSelected(int color);
    }

    private DialogEmphasisFragment mListener;

    //New instance - no arguments, but good practice to use anyway
    public static DialogEmphasisFragment newInstance() {
        DialogEmphasisFragment fragment = new DialogEmphasisFragment();
        return fragment;
    }

    /*
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof DialogSelectionListener) {
            mListener = (DialogSelectionListener) activity;
        } else {
            throw new RuntimeException(activity.toString() + " must implement DialogSelectionListener");
        }
    }
    */

/*
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("What emphasis would you like")
                .setItems(Emphasis_Choices, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // which is the index of the item selected from the list
                        // the parallel array is used to return a color value
                        // return the data from the index of this array
                        mListener.colorSelected(COLOR_VALUES[which]);
                    }
                });

        return builder.create();
    }

}
*/