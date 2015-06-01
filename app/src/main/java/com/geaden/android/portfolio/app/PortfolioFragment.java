package com.geaden.android.portfolio.app;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.geaden.android.portfolio.app.adapters.AppsListAdapter;


/**
 * Portfolio fragment.
 */
public class PortfolioFragment extends Fragment {

    // Array of Nanodegree apps that will be developed
    private NanoApp[] nanoApps;

    public PortfolioFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        nanoApps = new NanoApp[]{
                new NanoApp(getString(R.string.spotify_streamer_title),
                        getString(R.string.spotify_streamer_title_short)),
                new NanoApp(getString(R.string.scores_app_title),
                        getString(R.string.scores_app_title_short)),
                new NanoApp(getString(R.string.library_app_title),
                        getString(R.string.library_app_title_short)),
                new NanoApp(getString(R.string.build_it_bigger_title),
                        getString(R.string.build_it_bigger_title_short)),
                new NanoApp(getString(R.string.xyz_reader_title),
                        getString(R.string.xyz_reader_title_short)),
                new NanoApp(getString(R.string.capstone_app_title),
                        getString(R.string.capstone_app_title_short))
        };
        ListView appsListView = (ListView) rootView.findViewById(R.id.portfolio_apps_list);
        AppsListAdapter adapter = new AppsListAdapter(getActivity(), R.layout.apps_list_item, R.id.app_text, nanoApps);
        appsListView.setAdapter(adapter);
        return rootView;
    }
}
