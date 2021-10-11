package com.orange.click_2_rent;


import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment1 extends Fragment {

    private RecyclerView maListeRecyler;
    ArrayList<Specialite> specialiteArrayList;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";


    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Fragment1() {
        // Required empty public constructor

    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment1.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment1 newInstance(String param1, String param2) {
        Fragment1 fragment = new Fragment1();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        
        // Inflate the layout for this fragment

        View vue = inflater.inflate(R.layout.fragment_1, container, false);
        maListeRecyler = vue.findViewById(R.id.idRecyclerAffichage);
        maListeRecyler.setLayoutManager(new GridLayoutManager(getContext(),2));

        //initializeData();
        maListeRecyler.setAdapter(new SpecialAdapter(initializeData(),getContext()));

        return vue;

    }

    private List<Specialite> initializeData() {

        specialiteArrayList = new ArrayList<>();

        specialiteArrayList.add(new Specialite(R.drawable.sanitaire,getString(R.string.plomberie)));
        specialiteArrayList.add(new Specialite(R.drawable.electricite,getString(R.string.electricite)));
        specialiteArrayList.add(new Specialite(R.drawable.menuserie,getString(R.string.menuiserie)));
        specialiteArrayList.add(new Specialite(R.drawable.elect,getString(R.string.maconnerie)));
        specialiteArrayList.add(new Specialite(R.drawable.infomatike,getString(R.string.informatique)));
        specialiteArrayList.add(new Specialite(R.drawable.autre,getString(R.string.autres)));

        return specialiteArrayList;
    }

}