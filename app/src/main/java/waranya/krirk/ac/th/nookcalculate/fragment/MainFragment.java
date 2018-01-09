package waranya.krirk.ac.th.nookcalculate.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import waranya.krirk.ac.th.nookcalculate.MainActivity;
import waranya.krirk.ac.th.nookcalculate.R;


/**
 * Created by Admin on 9/1/2561.
 */

public class MainFragment extends Fragment {

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        Create Toolbar
        createToolbar();

        // ShowName controller
        showNameController();

        //   Calculate Controller
        calculateController();

    } // Main Method

    private void calculateController() {
        Button button1 = getView().findViewById(R.id.btnCalculate);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getActivity().getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.contentMainFragment, new CalculateFragment())
                        .addToBackStack(null)
                        .commit();

            }
        });
    }

    private void showNameController() {
        final Button button = getView().findViewById(R.id.btnShowName);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView = getView().findViewById(R.id.txtShowName);
                textView.setText("Master Nook");


            }
        });
    }

    private void createToolbar() {
        Toolbar toolbar = getView().findViewById(R.id.ToolbarMain);
        ((MainActivity) getActivity()).setSupportActionBar(toolbar);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_main, container, false);
        return view;
    }
}  // Main Class
