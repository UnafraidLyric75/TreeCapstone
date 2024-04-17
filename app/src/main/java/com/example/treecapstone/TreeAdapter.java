package com.example.treecapstone;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class TreeAdapter extends ArrayAdapter<Tree> {

    public TreeAdapter(Context context, ArrayList<Tree> treeArrayList){
        super(context,R.layout.list_tree,treeArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Tree tree = getItem(position);

        if(convertView == null){

            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_tree,parent,false);
        }

        ImageView imageView = convertView.findViewById(R.id.treePic);
        TextView treeName = convertView.findViewById(R.id.treeName);
        TextView treeSciName = convertView.findViewById(R.id.treeSciName);

        imageView.setImageResource(tree.imageId);
        treeName.setText(tree.name);
        treeSciName.setText(tree.sciName);

        return convertView;
    }
}
