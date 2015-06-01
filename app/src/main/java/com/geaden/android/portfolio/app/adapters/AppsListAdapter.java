package com.geaden.android.portfolio.app.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Toast;

import com.geaden.android.portfolio.app.NanoApp;
import com.geaden.android.portfolio.app.R;

/**
 * Custom array adapter to represent list of apps.
 *
 * @author Gennady Denisov
 */
public class AppsListAdapter extends ArrayAdapter<NanoApp> {

    // Layout resource
    private int resource;

    // Array of nanodegree apps
    private NanoApp[] apps;

    public AppsListAdapter(Context context, int resource, int textResource, NanoApp[] apps) {
        super(context, resource, textResource, apps);
        this.resource = resource;
        this.apps = apps;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        AppViewHolder holder = null;
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(resource, parent, false);
            holder = new AppViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (AppViewHolder) convertView.getTag();
        }
        holder.appButton.setText(apps[position].getTitle());
        holder.appButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), String.format(
                        getContext().getString(R.string.launch_text),
                        apps[position].getShortTitle()), Toast.LENGTH_SHORT).show();
            }
        });
        return super.getView(position, convertView, parent);
    }

    private class AppViewHolder {
        Button appButton;

        public AppViewHolder(View view) {
            appButton = (Button) view.findViewById(R.id.app_btn);
        }
    }
}
