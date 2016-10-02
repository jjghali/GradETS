package me.jjghali.grades.android.fragments;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Fragment;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;
import fr.tkeunebr.gravatar.Gravatar;
import grades.android.R;
import me.jjghali.grades.android.data.Constants;
import me.jjghali.grades.android.data.daos.EtudiantDAO;
import me.jjghali.grades.android.services.EtudiantService;

public class ProfileFragment extends Fragment {

    private EtudiantDAO etudiant;
    private String gravatarUrl;

    @BindView(R.id.profile_image)
    protected ImageView profileImageView;
    @BindView(R.id.studentName)
    protected TextView studentName;
    @BindView(R.id.codeUniversel)
    protected TextView textViewCodeUniversel;

    public ProfileFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        ButterKnife.bind(this, view);
        loadStudentInfos();

        Context context = getActivity();
        Picasso.with(context).load(gravatarUrl).placeholder(R.drawable.unknown_user).resize(96,96).into(profileImageView);

        return view;
    }

    private void loadStudentInfos() {
        Gravatar gravatar = new Gravatar.Builder().ssl().build();

        etudiant = EtudiantService.read();
        studentName.setText(etudiant.prenom.trim() + " " + etudiant.nom.trim());
        String email = etudiant.codeUniversel.trim() +"@ens.etsmtl.ca";

        gravatarUrl = gravatar.with(email).build();
        textViewCodeUniversel.setText(etudiant.codeUniversel.trim());
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
