package com.example.hynguyen.dynamicfragment;

/**
 * Created by hynguyen on 4/5/17.
 */

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class HelloFragment extends Fragment {
    TextView tv_message;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        /** Inflating the layout for this fragment **/
        View v = inflater.inflate(R.layout.hello_fragment_layout, null);
        tv_message = (TextView) v.findViewById(R.id.tv_message);
        Bundle bd = getArguments();
        tv_message.setText(bd.getString("number"));
        return v;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
}
