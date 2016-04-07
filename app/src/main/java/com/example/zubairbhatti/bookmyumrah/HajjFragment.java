package com.example.zubairbhatti.bookmyumrah;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

// This comment is added by Khurram Mir - Test 2 for testing purposes
/**
 * A simple {@link Fragment} subclass.
 */
public class HajjFragment extends Fragment {


    public HajjFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hajj, container, false);
    }

}
