package com.example.bca_mca_notes.Adapter;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bca_mca_notes.R;
import com.example.bca_mca_notes.suitcase_here.suitCaseAdapter;

import java.util.ArrayList;


public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.ViewHolder> {

    private Context context;
    private ArrayList<suitCaseAdapter> unitList;

    public RecycleViewAdapter(Context context, ArrayList<suitCaseAdapter> unitList) {
        this.context = context;
        this.unitList = unitList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.unit_name,parent,false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
       suitCaseAdapter caseAdapter= unitList.get(position);
       holder.unitname.setText(caseAdapter.getName());
//       holder.imageView_unit.setImageResource(caseAdapter.getImage());
    }


    @Override
    public int getItemCount() {
        return 5;
    }

     public class  ViewHolder extends RecyclerView.ViewHolder implements  View.OnClickListener{
         TextView unitname;
         ImageView imageView_unit;
         public ViewHolder(@NonNull View itemView) {
             super(itemView);
              itemView.setOnClickListener(this);
             unitname=itemView.findViewById(R.id.textviewRecyle);
         }

         @Override
         public void onClick(View v) {

           int positon =getAdapterPosition();//this get the position on where the user click either 0,1,2,3,4
            suitCaseAdapter caseAdapter=unitList.get(positon);
            String name = caseAdapter.getName();//get  info of the unit name which one user selected
//            caseAdapter.getImage();//get position info about the pic



         }//on click end
     }
}
