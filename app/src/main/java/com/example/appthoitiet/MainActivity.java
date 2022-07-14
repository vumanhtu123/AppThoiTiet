package com.example.appthoitiet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.appthoitiet.fragment.FragmentMainHome;

public class MainActivity extends AppCompatActivity {
    ViewPager2 viewPager2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager2 = findViewById(R.id.viewPage2);
        FragmentMainHome fragmentMainHome = new FragmentMainHome();
        
    }
}