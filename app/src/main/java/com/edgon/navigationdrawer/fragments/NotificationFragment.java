package com.edgon.navigationdrawer.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.edgon.navigationdrawer.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class NotificationFragment extends Fragment {


    TextView txtNotification;
    View view;

    public NotificationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_notification, container, false);

        txtNotification = (TextView) view.findViewById(R.id.txt_notification);

        txtNotification.setText(R.string.text_tab_notification);

        return view;
    }

}
