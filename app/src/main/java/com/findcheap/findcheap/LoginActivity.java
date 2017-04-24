package com.findcheap.findcheap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.findcheap.findcheap.model.Usuario;

import java.util.ArrayList;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    public final static ArrayList<Usuario> arrUsuarios = new ArrayList<>();;
    public static Usuario uLogado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        arrUsuarios.add(new Usuario("Default", "d@fc.com", "000.000.000-00", "@passwd"));
        uLogado = null;
    }

    @Override
    public void onClick(View v) { }

    public void onClickCriarContaBtn(View v) {
        Intent i = new Intent(this, CriarContaActivity.class);
        startActivity(i);
    }

    public void onClickEconomizarBtn(View v) {
        String login = ( (EditText) findViewById(R.id.loginTxt) ).getText().toString();
        String senha = ( (EditText) findViewById(R.id.senhaPsswd) ).getText().toString();
        Usuario u = new Usuario("", login, "", senha);
        if (arrUsuarios.contains(u)) { uLogado = arrUsuarios.get(arrUsuarios.indexOf(u)); }
        Intent i = new Intent(this, TesteLoginActivity.class);
        startActivity(i);
    }

}
