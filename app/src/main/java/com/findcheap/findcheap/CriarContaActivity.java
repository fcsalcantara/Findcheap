package com.findcheap.findcheap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.findcheap.findcheap.model.Usuario;

public class CriarContaActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criar_conta);
    }

    @Override
    public void onClick(View v) { }

    public void onClickCriarContaBtn(View v) {

        String nome = ( (EditText) findViewById(R.id.nomeTxt) ).getText().toString();
        String email = ( (EditText) findViewById(R.id.emailTxt) ).getText().toString();
        String cpf = ( (EditText) findViewById(R.id.cpfTxt) ).getText().toString();
        String senha = ( (EditText) findViewById(R.id.senhaPsswd) ).getText().toString();
        String confirmaSenha = ( (EditText) findViewById(R.id.confirmarSenhaPswd) ).getText().toString();

        if ( senha.equals(confirmaSenha) ) {
            Usuario u = new Usuario(nome, email, cpf, senha);
            LoginActivity.arrUsuarios.add(u);
            Intent i = new Intent(this, LoginActivity.class);
            startActivity(i);
        } else {
            ( (EditText) findViewById(R.id.senhaPsswd) ).setText("");
            ( (EditText) findViewById(R.id.confirmarSenhaPswd) ).setText("");
            Toast.makeText(
                    getApplicationContext(),
                    "AS SENHAS DIGITADAS DEVEM SER IGUAIS!",
                    Toast.LENGTH_SHORT
            ).show();
        }
    }

}
