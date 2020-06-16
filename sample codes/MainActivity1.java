package com.maneesh.managing;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements frag1.Listener {
/* fragment communication with Activity is made possible by implementing interface defined in fragment by activity
 */
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public void itemclicked(String id1) {
        frag2 f2= new frag2();
        TextView t11=(TextView)findViewById(R.id.t12);
        t11.setText(id1);
        FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.frame1,f2);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
