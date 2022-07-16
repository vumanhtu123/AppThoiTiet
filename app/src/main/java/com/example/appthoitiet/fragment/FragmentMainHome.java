package com.example.appthoitiet.fragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.appthoitiet.R;

public class FragmentMainHome extends Fragment {
    View view;
    TextView tv_Contry,tv_Date,tv_Temperature,tv_Today,tv_Tomorrow,tv_nextDay;
    LinearLayout linearLayout;
    RecyclerView recyclerView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return view = inflater.inflate(R.layout.activity_fragment_main_home,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        anhxa();
    }

    public void anhxa()
    {
        tv_Contry = view.findViewById(R.id.tvContry);
        tv_Date = view.findViewById(R.id.tvDate);
        tv_Today = view.findViewById(R.id.tvToday);
        tv_Tomorrow = view.findViewById(R.id.tvTomorrow);
        tv_nextDay = view.findViewById(R.id.tvNextDay);
        tv_Temperature = view.findViewById(R.id.tvTemperature);
        linearLayout = view.findViewById(R.id.linearLayout);
        recyclerView = view.findViewById(R.id.recyclerView);
    }
}