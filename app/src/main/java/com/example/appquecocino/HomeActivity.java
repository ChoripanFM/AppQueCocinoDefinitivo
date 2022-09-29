package com.example.appquecocino;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class HomeActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        bottomNavigationView=findViewById(R.id.bottomBar);

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                FragmentTransaction ft;
                switch (item.getItemId()){
                    case R.id.home:
                        ft=getSupportFragmentManager().beginTransaction();
                        ft.replace(R.id.fragmentView,new HomeFragment());
                        ft.commit();
                        return true;
                    case R.id.despensa:
                        ft=getSupportFragmentManager().beginTransaction();
                        ft.replace(R.id.fragmentView,new DespensaFragment());
                        ft.commit();
                        return true;
                    case R.id.favoritos:
                        ft=getSupportFragmentManager().beginTransaction();
                        ft.replace(R.id.fragmentView,new FavoritosFragment());
                        ft.commit();
                        return true;
                }
                return false;
            }
        });
    }
}