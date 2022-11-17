package com.example.mobilef.ui.home;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.mobilef.R;

import java.util.ArrayList;


public class HomeFragment extends Fragment {
    private ImageSlider imageSlider;
    TextView peyzajclick,mmclick,makinaclick,insaatclick,gidaclick,genetikclick,eeclick,cevreclick,biyomedikalclick,bilgisayarclick;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_home, container, false);
        imageSlider=view.findViewById(R.id.slider);

        peyzajclick=view.findViewById(R.id.peyzajclick);
        mmclick=view.findViewById(R.id.mmclick);
        makinaclick=view.findViewById(R.id.makinaclick);
        insaatclick=view.findViewById(R.id.insaatclick);
        gidaclick=view.findViewById(R.id.gidaclick);
        genetikclick=view.findViewById(R.id.genetikclick);
        eeclick=view.findViewById(R.id.eeclick);
        cevreclick=view.findViewById(R.id.cevreclick);
        biyomedikalclick=view.findViewById(R.id.biyomedikalclick);
        bilgisayarclick=view.findViewById(R.id.bilgisayarclick);

        getActivity().setTitle("Ana Sayfa");

        ArrayList<SlideModel> imageList = new ArrayList<>();


        imageList.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/my-college-app-93ca2.appspot.com/o/slider%2Fa.png?alt=media&token=fa547a2f-09b0-43c8-8749-45ea69358728", ScaleTypes.FIT));
        imageList.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/my-college-app-93ca2.appspot.com/o/slider%2Faa.jpg?alt=media&token=26fb28ab-8e7f-4de8-bd98-a18dcf46fd63",ScaleTypes.FIT));
        imageList.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/my-college-app-93ca2.appspot.com/o/slider%2Faaa.png?alt=media&token=2373ccf4-c371-4ef0-9d52-3d5c5d6cf3af",ScaleTypes.FIT));
        imageList.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/my-college-app-93ca2.appspot.com/o/slider%2Faaaa.jpg?alt=media&token=6cc4ad72-9f0f-49d9-86ef-d85644c8474c",ScaleTypes.FIT));
        imageList.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/my-college-app-93ca2.appspot.com/o/slider%2Fab.jpg?alt=media&token=793f884f-2343-4033-a89a-6d01ffeb6176",ScaleTypes.FIT));



        peyzajclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mmf.kastamonu.edu.tr/index.php/peyzaj-mimarligi/genel-bilgiler.html"));
                startActivity(browserIntent);
            }
        });

        mmclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mmf.kastamonu.edu.tr/index.php/metalurji-ve-malzeme-muhendisligi/genel-bilgiler.html"));
                startActivity(browserIntent);
            }
        });

        makinaclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mmf.kastamonu.edu.tr/index.php/makine-muhendisligi/genel-bilgiler.html"));
                startActivity(browserIntent);
            }
        });

        insaatclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mmf.kastamonu.edu.tr/index.php/insaat-muhendisligi/genel-bilgiler.html"));
                startActivity(browserIntent);
            }
        });


        gidaclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mmf.kastamonu.edu.tr/index.php/gida-muhendisligi/genel-bilgiler.html"));
                startActivity(browserIntent);
            }
        });


        genetikclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mmf.kastamonu.edu.tr/index.php/genetik-ve-biyomuhendislik/genel-bilgiler.html"));
                startActivity(browserIntent);
            }
        });


        eeclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mmf.kastamonu.edu.tr/index.php/elektrik-ve-elektronik-muhendisligi/genel-bilgiler.html"));
                startActivity(browserIntent);
            }
        });


        cevreclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mmf.kastamonu.edu.tr/index.php/cevre-muhendisligi/genel-bilgiler.html"));
                startActivity(browserIntent);
            }
        });


        biyomedikalclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mmf.kastamonu.edu.tr/index.php/biyomedikal-muhendisligi.html"));
                startActivity(browserIntent);
            }
        });


        bilgisayarclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mmf.kastamonu.edu.tr/index.php/bilgisayar-muhendisligi.html"));
                startActivity(browserIntent);
            }
        });

        imageSlider.setImageList(imageList);
        return view;
    }
}