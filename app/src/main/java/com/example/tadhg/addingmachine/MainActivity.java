package com.example.tadhg.addingmachine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText X =  findViewById(R.id.X);
        final EditText Y =  findViewById(R.id.Y);
        final TextView Z =  findViewById(R.id.Z);
        TextWatcher textWatcher = new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {


            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                int xnum = 0;
                if (!X.getText().equals(""))
                    xnum = Integer.parseInt(X.getText().toString());

                int ynum = 0;

                if (!Y.getText().equals(""))
                    ynum = Integer.parseInt(Y.getText().toString());

                int znum = xnum + ynum;
                Z.setText(znum + "");
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        };

        Y.addTextChangedListener(textWatcher);
        X.addTextChangedListener(textWatcher);

    }
}
