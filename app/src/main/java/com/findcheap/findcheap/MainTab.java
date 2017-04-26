package com.findcheap.findcheap;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;
import android.widget.Toast;

public class MainTab extends AppCompatActivity {

    private static final String TAG = "MainTab";

    private SectionsPageAdapter mSectionsPageAdapter;

    private ViewPager mViewPager;

   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_tab);
        if (LoginActivity.uLogado != null) {
           Toast.makeText(getApplicationContext(), "Usuário \"" + LoginActivity.uLogado.toString()
                   + "\" logado.", Toast.LENGTH_SHORT).show();
       }
        Log.d(TAG, "onCreate: Starting.");

        mSectionsPageAdapter = new SectionsPageAdapter(getSupportFragmentManager());

        mViewPager = (ViewPager) findViewById(R.id.container);
        setupViewPager(mViewPager);findViewById(R.id.tabs);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);




   }
    private void setupViewPager(ViewPager viewPager){
        SectionsPageAdapter adapter = new SectionsPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new Tab_Hot(), "HOT");
        adapter.addFragment(new Tab_Map(), "MAPA");
        viewPager.setAdapter(adapter);
    }

    public void onClickBarCodeImg(View v) {
        startActivity(new Intent(this, EntradaProdutoActivity.class));
    }



}



