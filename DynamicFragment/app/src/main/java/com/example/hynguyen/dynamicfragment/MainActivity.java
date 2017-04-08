package com.example.hynguyen.dynamicfragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    static int number = 1;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnLoad = (Button) findViewById(R.id.btn_load);

        View.OnClickListener listener = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                HelloFragment hello = new HelloFragment();
                Bundle bd = new Bundle();

                bd.putString("number",String.valueOf(number));
                number++;
                hello.setArguments(bd);
                fragmentTransaction.replace(R.id.fragment_container, hello, "HELLO");
                fragmentTransaction.commit();
            }
        };

        btnLoad.setOnClickListener(listener);

    }
}
