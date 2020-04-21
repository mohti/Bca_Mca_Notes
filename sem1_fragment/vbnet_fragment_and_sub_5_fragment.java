package com.example.bca_mca_notes.sem1_fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bca_mca_notes.Adapter.RecycleViewAdapter;
import com.example.bca_mca_notes.R;
import com.example.bca_mca_notes.suitcase_here.suitCaseAdapter;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class vbnet_fragment_and_sub_5_fragment extends Fragment {
    private RecyclerView recyclerView;
    ArrayList<suitCaseAdapter> arrlist = new ArrayList<>();


    public vbnet_fragment_and_sub_5_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_vbnet_and_sub_5, container, false);

        recyclerView = view.findViewById(R.id.recyleView_vbnet);

        addData(R.drawable.ic_launcher_background, "VB.net UNIT 1");
        addData(R.drawable.ic_launcher_background, "VB.net UNIT 2");
        addData(R.drawable.ic_launcher_background, "VB.net UNIT 3");
        addData(R.drawable.ic_launcher_background, "VB.net UNIT 4");
        addData(R.drawable.ic_launcher_background, "VB.net UNIT 5");

        RecycleViewAdapter adapter = new RecycleViewAdapter(view.getContext(), arrlist);


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(view.getContext(), LinearLayoutManager.VERTICAL, false);

        recyclerView.setLayoutManager(linearLayoutManager);

        recyclerView.setAdapter(adapter);

        return view;
    }

    public void addData(int image, String name) {
        suitCaseAdapter suitCaseAdapter = new suitCaseAdapter(image, name);
         suitCaseAdapter.image = image;
         suitCaseAdapter.name = name;
         arrlist.add(suitCaseAdapter);

    }
}