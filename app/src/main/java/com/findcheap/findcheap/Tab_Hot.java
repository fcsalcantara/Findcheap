package com.findcheap.findcheap;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * Created by thiag_000 on 25/04/2017.
 */

public class Tab_Hot extends Fragment {
    private static final String TAG = "HOT";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab_hot, container, false);

        return view;
    }

    public void onClickBarCodeImg(View v) {
        startActivity(new Intent(this, EntradaProdutoActivity.class));
    }


}