package com.findcheap.findcheap;

;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by thiag_000 on 25/04/2017.
 */

public class Tab_Map extends Fragment{
    private static final String TAG = "MAPA";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab_map, container, false);

        return view;
    }
}
