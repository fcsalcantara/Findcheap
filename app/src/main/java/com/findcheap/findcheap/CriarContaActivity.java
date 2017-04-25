package com.findcheap.findcheap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.findcheap.findcheap.model.Usuario;

public class CriarContaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criar_conta);
    }

    public void onClickCriarContaBtn(View v) {
        String nome = ((EditText) findViewById(R.id.nomeTxt)).getText().toString();
        String email = ((EditText) findViewById(R.id.emailTxt)).getText().toString();
        String cpf = ((EditText) findViewById(R.id.cpfTxt)).getText().toString();
        String senha = ((EditText) findViewById(R.id.senhaPsswd)).getText().toString();
        String confirmaSenha = ((EditText) findViewById(R.id.confirmarSenhaPswd)).getText()
                .toString();
        if (senha.equals(confirmaSenha)) {
            LoginActivity.arrUsuarios.add(new Usuario(nome, email, cpf, senha));
            startActivity(new Intent(this, LoginActivity.class));
        } else {
            ((EditText) findViewById(R.id.senhaPsswd)).setText("");
            ((EditText) findViewById(R.id.confirmarSenhaPswd)).setText("");
            Toast.makeText(getApplicationContext(), "As senhas digitadas precisam ser iguais!",
                    Toast.LENGTH_SHORT).show();
        }
    }

}
