package com.example.appthoitiet.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.appthoitiet.Adapter.FragmentPager;
import com.example.appthoitiet.R;
import com.example.appthoitiet.fragment.FragmentMainHome;

public class MainActivity extends AppCompatActivity implements SearchView.OnQueryTextListener {
    ViewPager2 viewPager2;
    FragmentPager fragmentPager;
    SearchView searchView;
    ImageView ivHead;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager2 = findViewById(R.id.viewPage2);
        fragmentPager = new FragmentPager(this);
        viewPager2.setAdapter(fragmentPager);
        searchView =(SearchView) findViewById(R.id.sv_Search);
        ivHead = findViewById(R.id.iv_Head);
        searchView.setOnQueryTextListener(this);
    }
    public void GetCurrentWeatherData(String Data)
    {
        RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
        String url = "https://api.openweathermap.org/data/2.5/weather?q=HaNoi&appid=3e67a2514786d73e9ce3178cf62bcfd7";
        StringRequest request = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Log.d("ketqua : ",response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("ddd", "onErrorResponse: khong cos ket qua ");
            }
        });
        requestQueue.add(request);
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        String text = newText;
        GetCurrentWeatherData(text);
        return false;
    }
}