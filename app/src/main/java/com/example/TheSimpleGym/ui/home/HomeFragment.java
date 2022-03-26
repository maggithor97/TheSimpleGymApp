package com.example.TheSimpleGym.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.TheSimpleGym.R;
import com.example.TheSimpleGym.databinding.FragmentHomeBinding;
//import com.example.androidtest.R;
//import com.example.androidtest.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_home, container, false);
        String[] menuItems = {
                "Eh hlutur í lista"
                , "Eh fallegur hlutur"
                , "Shit þetta er fallegur hlutur"
                , "Einn annar hlutur í lista"
        };
        ListView listView = (ListView) view.findViewById(R.id.listinnMinn);
        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                menuItems
        );
        listView.setAdapter(listViewAdapter);

        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}