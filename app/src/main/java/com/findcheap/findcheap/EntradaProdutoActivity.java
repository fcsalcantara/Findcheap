package com.findcheap.findcheap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class EntradaProdutoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrada_produto);
    }

    public void onClickHomeImg(View v) {
        startActivity(new Intent(this, PrincipalActivity.class));
    }

}
