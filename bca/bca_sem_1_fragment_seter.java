package com.example.bca_mca_notes.bca;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.bca_mca_notes.R;
import com.example.bca_mca_notes.flagManeger.Flag_manager_for_inflatemenu;
import com.example.bca_mca_notes.sem1_fragment.vbnet_fragment_and_sub_5_fragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class bca_sem_1_fragment_seter extends AppCompatActivity {
    BottomNavigationView BNV;
    int flag=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bca_sem_1_fragment_seter);
        BNV=findViewById(R.id.Bottom_navigation);
        Flag_manager_for_inflatemenu flag_manager_for_inflatemenu= new Flag_manager_for_inflatemenu();


        int check_flag_for_inflate_menu=flag_manager_for_inflatemenu.manage_layout_by_sem;


        String s=String.valueOf(check_flag_for_inflate_menu);
        Toast.makeText(bca_sem_1_fragment_seter.this, "Hello  s"+s, Toast.LENGTH_SHORT).show();

        if(check_flag_for_inflate_menu==1){
          BNV.inflateMenu(R.menu.subject_menu);
        }
        else if(check_flag_for_inflate_menu==2){
            BNV.inflateMenu(R.menu.bca_sem_2_sub);
        }
        else if(check_flag_for_inflate_menu==3){
            BNV.inflateMenu(R.menu.bca_sem_2_sub);

        }
        else if(check_flag_for_inflate_menu==4){
            BNV.inflateMenu(R.menu.bca_sem_2_sub);

        }
        else if(check_flag_for_inflate_menu==5){
            BNV.inflateMenu(R.menu.bca_sem_2_sub);

        }
        else if(check_flag_for_inflate_menu==6){
            BNV.inflateMenu(R.menu.bca_sem_2_sub);

        }

        loadFragment(new vbnet_fragment_and_sub_5_fragment());
        BNV.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id = item.getItemId();

                if (id==R.id.item1){
                    //vb.net
                    loadFragment(new vbnet_fragment_and_sub_5_fragment());

                } else if (id==R.id.item2){
                    //conum
                    loadFragment(new vbnet_fragment_and_sub_5_fragment());

                } else if (id==R.id.item3){
                    //os
                    loadFragment(new vbnet_fragment_and_sub_5_fragment()  );

                } else if (id==R.id.item4){
                    //graphics
                    loadFragment(new vbnet_fragment_and_sub_5_fragment());

                } else if (id==R.id.item5){
                    //coa
                    loadFragment(new vbnet_fragment_and_sub_5_fragment());
                }
                return true;
            }
        });



    }

    private void loadFragment(Fragment fragment) {

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        if(flag==0) {
            flag++;
            ft.add(R.id.fragment, fragment);
        }


        else
            ft.replace(R.id.fragment,fragment);

        ft.commit();
    }


    }

//
//       switch (check_flag_for_inflate_menu){
//           case  1:
//               BNV.inflateMenu(R.menu.subject_menu);
//break;
//       }
