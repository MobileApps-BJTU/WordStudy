package wordroid.Explanation;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import wordroid.model.R;

/**
 * A simple {@link android.app.Fragment} subclass.
 */
public class AboutFragment2 extends Fragment {


    public AboutFragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.about_fragment2, container, false);
    }


    public static Fragment newInstance() {
        AboutFragment2 fragment = new AboutFragment2();
        return fragment;
    }
}
