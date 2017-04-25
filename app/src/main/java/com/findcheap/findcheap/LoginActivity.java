package com.findcheap.findcheap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.findcheap.findcheap.model.Usuario;

import java.util.ArrayList;

public class LoginActivity extends AppCompatActivity {

    public final static ArrayList<Usuario> arrUsuarios = new ArrayList<>();;
    public static Usuario uLogado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        arrUsuarios.add(new Usuario("Default", "default", "000.000.000-00", "pass"));
        uLogado = null;
    }

    public void onClickEconomizarBtn(View v) {
        String login = ((EditText) findViewById(R.id.loginTxt)).getText().toString();
        String senha = ((EditText) findViewById(R.id.senhaPsswd)).getText().toString();
        if (login.equals("") || senha.equals(""))
            Toast.makeText(getApplicationContext(), "O login e a senha precisam ser preenchidos!",
                    Toast.LENGTH_SHORT).show();
        else {
            Usuario u = new Usuario("", login, "", senha);
            if (arrUsuarios.contains(u)) {
                uLogado = arrUsuarios.get(arrUsuarios.indexOf(u));
                startActivity(new Intent(this, PrincipalActivity.class));
            } else {
                ((EditText) findViewById(R.id.senhaPsswd)).setText("");
                Toast.makeText(getApplicationContext(), "Login ou senha inválidos!",
                        Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void onClickCriarContaBtn(View v) {
        startActivity(new Intent(this, CriarContaActivity.class));
    }

    public void onClickEsqueceuSenhaTxtVw(View v) {
        startActivity(new Intent(this, EsqueceuSenhaActivity.class));
    }

}
