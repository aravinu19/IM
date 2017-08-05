package com.periculam.aravi.im;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AccountInfoGrabber extends AppCompatActivity {

    EditText profname,hint;
    Button proc;

    String profn, hintu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_info_grabber);

        profname = (EditText)findViewById(R.id.profname);
        hint = (EditText)findViewById(R.id.hint);
        proc = (Button)findViewById(R.id.proceed);

        proc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                profn = profname.getText().toString();
                hintu = hint.getText().toString();

                if(!profn.equals(null))
                {
                    if(!hintu.equals(null))
                    {

                    }
                }
            }
        });

    }
}
