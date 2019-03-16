package com.kevin.recyclerviewfragmentdialog;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Kevin Kimaru Chege on 7/avatar10/2018.
 */

public class FragmentFav extends Fragment {
    View mView;

    public FragmentFav() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fav_fragment, container, false);
        return mView;
    }
}
