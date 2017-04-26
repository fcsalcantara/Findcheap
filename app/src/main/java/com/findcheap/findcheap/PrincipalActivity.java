package com.findcheap.findcheap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class PrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        if (LoginActivity.uLogado != null) {

            Toast.makeText(getApplicationContext(), "Usuário \"" + LoginActivity.uLogado.toString()
                    + "\" logado.", Toast.LENGTH_SHORT).show();

        }

    }

    public void onClickBarCodeImg(View v) {
        startActivity(new Intent(this, EntradaProdutoActivity.class));
    }


}
