package com.example.pulkit.intercommunication;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by pulkit on 8/13/15.
 */
public class BottomFragment extends Fragment {
    Button button;
    Communicator communicator;
    int counter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_fragment,container, false);
        communicator= (Communicator) getActivity();
        button = (Button) view.findViewById(R.id.clickMe);
        button.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v) {
                        counter++;
                        communicator.response("Count " + counter);
                    }
                }
        );
        return view;
    }
}
