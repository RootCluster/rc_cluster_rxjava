package org.incoder.network.original.rxjava;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.incoder.network.R;

/**
 * @author :Jerry xu
 * @date :2018-06-11 13:00
 */
public class RxJavaFragment extends Fragment {


    public RxJavaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_rx_java, container, false);
    }

}
