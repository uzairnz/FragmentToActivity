package com.example.uzair.fragmenttoactivity;

/**
 * Created by UZAIR on 10/11/2017.
 */
import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class SimpleFragment extends Fragment {
    private static final String ARG_PARAM1 = "param1";

    private String mParam1;

    private ItemFragment.OnFragmentInteractionListener mListener;

    public static SimpleFragment newInstance(String param1) {
        SimpleFragment fragment = new SimpleFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        fragment.setArguments(args);
        return fragment;
    }

    public SimpleFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View myView =  inflater.inflate(R.layout.fragment_simple, container, false);


        return myView;
    }



}
