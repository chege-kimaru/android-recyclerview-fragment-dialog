package com.kevin.recyclerviewfragmentdialog;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kevin Kimaru Chege on 7/avatar10/2018.
 */

public class FragmentContact extends Fragment{
    View mView;
    private RecyclerView mRecyclerView;
    private List<Contact> listContact;

    public FragmentContact() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.contact_fragment, container, false);
        mRecyclerView = (RecyclerView) mView.findViewById(R.id.contact_recyclerview);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(), listContact);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecyclerView.setAdapter(recyclerViewAdapter);
        return mView;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        listContact = new ArrayList<>();
        listContact.add(new Contact("Kevin Kimaru", "0727683173", R.drawable.avatar1));
        listContact.add(new Contact("Robert Kimani", "073468478", R.drawable.avatar6));
        listContact.add(new Contact("Peris Wangari", "0727683173", R.drawable.avatar3));
        listContact.add(new Contact("Eric Ojwang", "07453253173", R.drawable.avatar4));
        listContact.add(new Contact("Elizabeth Wangari", "07432545173", R.drawable.avatar3));
        listContact.add(new Contact("Marxx Marcellous", "072743555533", R.drawable.avatar6));
        listContact.add(new Contact("Peter Miles", "073453473", R.drawable.avatar7));
        listContact.add(new Contact("Kevin Chege", "07276345353", R.drawable.avatar8));
        listContact.add(new Contact("Francis Kimaru", "07344535455", R.drawable.avatar6));
        listContact.add(new Contact("Jane Otieno", "0755344353", R.drawable.avatar4));
    }
}
