package com.edgon.navigationdrawer.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.edgon.navigationdrawer.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DashboardFragment extends Fragment {

    private TextView txtDashboard;
    View view;

    public DashboardFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        view = inflater.inflate(R.layout.fragment_dashboard, container, false);

        initToolbar("Dashboard", view);

        txtDashboard = (TextView) view.findViewById(R.id.txt_dashboard);

        txtDashboard.setText(R.string.text_tab_dashboard);

        return view;
    }

    private void initToolbar(String title, View view) {
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar_);
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        ((AppCompatActivity) getActivity()).setTitle(title);

        /*DrawerLayout drawer = (DrawerLayout) view.findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                ((AppCompatActivity) getActivity()),
                drawer,
                toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();*/

    }

}
