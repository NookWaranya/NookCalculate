package waranya.krirk.ac.th.nookcalculate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import waranya.krirk.ac.th.nookcalculate.fragment.MainFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      //  Add Fragment to Activity
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contentMainFragment, new MainFragment())
                    .commit();

        }


    }  // Main Method

    @Override
    public void onClick(View view) {

    }
}  // Main Class
