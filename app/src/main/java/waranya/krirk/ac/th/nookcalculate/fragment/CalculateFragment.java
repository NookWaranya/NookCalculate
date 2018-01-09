package waranya.krirk.ac.th.nookcalculate.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import waranya.krirk.ac.th.nookcalculate.R;

/**
 * Created by Admin on 9/1/2561.
 */

public class CalculateFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_calculate, container,false);

        return view;
    }
}
