package me.jjghali.grades.android.fragments;

import android.app.Fragment;
import android.content.Context;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;
import grades.android.R;

public class ProfileFragment extends Fragment {


    @BindView(R.id.profile_image)
    public ImageView profileImageView;

    public ProfileFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        ButterKnife.bind(this, view);

//        profileImageView = (ImageView) view.findViewById(R.id.profile_image);

        Context context = getActivity();
        Picasso.with(context).load("http://vignette2.wikia.nocookie.net/creepypasta/images/0/05/Doge.png/revision/latest?cb=20131121015552").placeholder(R.drawable.unknown_user).resize(96,96).into(profileImageView);
        return view;
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
