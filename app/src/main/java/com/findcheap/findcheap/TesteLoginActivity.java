package com.findcheap.findcheap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.findcheap.findcheap.model.Usuario;

public class TesteLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teste_login);

        /* Toast.makeText(
                getApplicationContext(),
                "USUÁRIO DEFAULT: " + LoginActivity.arrUsuarios.get(0).toString(),
                Toast.LENGTH_SHORT
        ).show(); */

        if (LoginActivity.uLogado == null) {
            Toast.makeText(
                    getApplicationContext(),
                    "NENHUM USUÁRIO ESTÁ LOGADO!",
                    Toast.LENGTH_SHORT
            ).show();
        } else {
            ( (TextView) findViewById(R.id.msgLoginTxtVw) ).setText(LoginActivity.uLogado.toString());
            Toast.makeText(
                    getApplicationContext(),
                    "USUÁRIO LOGADO: " + LoginActivity.uLogado.toString(),
                    Toast.LENGTH_SHORT
            ).show();
        }
    }
}
