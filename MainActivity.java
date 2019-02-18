package com.example.teste_aula_dois;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtvOutMessage;
    private EditText ptxtMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtvOutMessage = (TextView) findViewById(R.id.txtOutMessage);
        ptxtMessage = (EditText) findViewById(R.id.ptxtMessage);

    }

    public void onClickOk(View view){
        String message = ptxtMessage.getText().toString();

        int num = Integer.parseInt(message);
        if((num%2)==0){
            txtvOutMessage.append(getString(R.string.key_even)+"\n");
        } else {
            txtvOutMessage.append(getString(R.string.key_odd)+"\n");
        }
        ptxtMessage.setText("");
    }

    public void onClickClear(View view){
        txtvOutMessage.setText("");
        ptxtMessage.setText("");
    }
}
