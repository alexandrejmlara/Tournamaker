package com.example.alexandrelara.tournamaker;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectTypeActivity extends Activity {

    Dialog selectTypeDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.alexandrelara.tournamaker.R.layout.activity_select_type);
    }

    public void tournamentTypeDialog(View v){
        selectTypeDialog = new Dialog(SelectTypeActivity.this);
        selectTypeDialog.setTitle("Create a Tournament");
        selectTypeDialog.setContentView(com.example.alexandrelara.tournamaker.R.layout.activity_select_type_popup);
        selectTypeDialog.show();

        // Cancel Button event listener
        Button cancelBtn = (Button) selectTypeDialog.findViewById(com.example.alexandrelara.tournamaker.R.id.cancelBtn);
        cancelBtn.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             selectTypeDialog.dismiss();
                                         }
                                     }
        );

        // Confirm Button event listener
        Button confirmBtn = (Button) selectTypeDialog.findViewById(com.example.alexandrelara.tournamaker.R.id.confirmBtn);
        confirmBtn.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             selectTypeDialog.dismiss(); // Temporary
                                         }
                                     }
        );
    }


}
