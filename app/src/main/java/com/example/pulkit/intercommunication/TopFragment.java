package com.example.pulkit.intercommunication;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by pulkit on 8/13/15.
 */
public class TopFragment extends Fragment {
    TextView textView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.top_fragament,container,false);
        textView = (TextView) view.findViewById(R.id.showText);
        return view;
    }

    public void setContent(String data) {
        textView.setText(data);
    }
}
