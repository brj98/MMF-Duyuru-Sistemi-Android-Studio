package com.example.mobilef.ui.faculty;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.mobilef.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;


public class FacultyFragment extends Fragment {

    private RecyclerView BMuh,BiMuh,CeMuh,EEMuh,GBMuh,GMuh,IMuh,MakMuh;
    private LinearLayout BMuhNoData,BiMuhNoData,CeMuhNoData,EEMuhNoData,GBMuhNoData,GMuhNoData,IMuhNoData,MakMuhNoData;
    private List<TeacherData> list,list2,list3,list4;
    private TeacherAdapter adapter;

    private DatabaseReference reference,dbRef;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_faculty, container, false);

        BMuh = view.findViewById(R.id.BMuh);
        BiMuh = view.findViewById(R.id.BiMuh);
        CeMuh = view.findViewById(R.id.CeMuh);
        EEMuh = view.findViewById(R.id.EEMuh);
        GBMuh = view.findViewById(R.id.GBMuh);
        GMuh = view.findViewById(R.id.GMuh);
        IMuh = view.findViewById(R.id.IMuh);
        MakMuh = view.findViewById(R.id.MakMuh);

        BMuhNoData = view.findViewById(R.id.BMuhNoData);
        BiMuhNoData = view.findViewById(R.id.BiMuhNoData);
        CeMuhNoData = view.findViewById(R.id.CeMuhNoData);
        EEMuhNoData = view.findViewById(R.id.EEMuhNoData);
        GBMuhNoData = view.findViewById(R.id.GBMuhNoData);
        GMuhNoData = view.findViewById(R.id.GMuhNoData);
        IMuhNoData = view.findViewById(R.id.IMuhNoData);
        MakMuhNoData = view.findViewById(R.id.MakMuhNoData);

        getActivity().setTitle("Fakülte Kadrosu");

        reference = FirebaseDatabase.getInstance().getReference().child("teacher");

        BilgisayarMuh();
        BiyomedikalMuh();
        CevreMuh();
        EEMuh();
        GenetikMuh();
        GidaMuh();
        InsaatMuh();
        MakineMuh();

        return view;
    }

    private void BilgisayarMuh() {
        dbRef = reference.child("BİLGİSAYAR MÜHENDİSLİĞİ");
        dbRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                list = new ArrayList<>();
                if (!snapshot.exists()){
                    BMuhNoData.setVisibility(View.VISIBLE);
                    BMuh.setVisibility(View.GONE);
                }else{
                    BMuhNoData.setVisibility(View.GONE);
                    BMuh.setVisibility(View.VISIBLE);
                    for (DataSnapshot dataSnapshot : snapshot.getChildren()){
                        TeacherData data = dataSnapshot.getValue(TeacherData.class);
                        list.add(data);
                    }
                    BMuh.setHasFixedSize(true);
                    BMuh.setLayoutManager(new LinearLayoutManager(getContext()));
                    adapter = new TeacherAdapter(list,getContext());
                    BMuh.setAdapter(adapter);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(getContext(),error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void BiyomedikalMuh() {
        dbRef = reference.child("BİYOMEDİKAL MÜHENDİSLİĞİ");
        dbRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                list2 = new ArrayList<>();
                if (!snapshot.exists()){
                    BiMuhNoData.setVisibility(View.VISIBLE);
                    BiMuh.setVisibility(View.GONE);
                }else{
                    BiMuhNoData.setVisibility(View.GONE);
                    BiMuh.setVisibility(View.VISIBLE);
                    for (DataSnapshot dataSnapshot : snapshot.getChildren()){
                        TeacherData data = dataSnapshot.getValue(TeacherData.class);
                        list2.add(data);
                    }
                    BiMuh.setHasFixedSize(true);
                    BiMuh.setLayoutManager(new LinearLayoutManager(getContext()));
                    adapter = new TeacherAdapter(list2,getContext());
                    BiMuh.setAdapter(adapter);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(getContext(),error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void CevreMuh() {
        dbRef = reference.child("ÇEVRE MÜHENDİSLİĞİ");
        dbRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                list3 = new ArrayList<>();
                if (!snapshot.exists()){
                    CeMuhNoData.setVisibility(View.VISIBLE);
                    CeMuh.setVisibility(View.GONE);
                }else{
                    CeMuhNoData.setVisibility(View.GONE);
                    CeMuh.setVisibility(View.VISIBLE);
                    for (DataSnapshot dataSnapshot : snapshot.getChildren()){
                        TeacherData data = dataSnapshot.getValue(TeacherData.class);
                        list3.add(data);
                    }
                    CeMuh.setHasFixedSize(true);
                    CeMuh.setLayoutManager(new LinearLayoutManager(getContext()));
                    adapter = new TeacherAdapter(list3,getContext());
                    CeMuh.setAdapter(adapter);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(getContext(),error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void EEMuh() {
        dbRef = reference.child("ELEKTRİK-ELEKTRONİK MÜHENDİSLİĞİ");
        dbRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                list4 = new ArrayList<>();
                if (!snapshot.exists()){
                    EEMuhNoData.setVisibility(View.VISIBLE);
                    EEMuh.setVisibility(View.GONE);
                }else{
                    EEMuhNoData.setVisibility(View.GONE);
                    EEMuh.setVisibility(View.VISIBLE);
                    for (DataSnapshot dataSnapshot : snapshot.getChildren()){
                        TeacherData data = dataSnapshot.getValue(TeacherData.class);
                        list4.add(data);
                    }
                    EEMuh.setHasFixedSize(true);
                    EEMuh.setLayoutManager(new LinearLayoutManager(getContext()));
                    adapter = new TeacherAdapter(list4,getContext());
                    EEMuh.setAdapter(adapter);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(getContext(),error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void GenetikMuh() {
        dbRef = reference.child("GENETİK VE BİYOMÜHENDİSLİK");
        dbRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                list4 = new ArrayList<>();
                if (!snapshot.exists()){
                   GBMuhNoData.setVisibility(View.VISIBLE);
                    GBMuh.setVisibility(View.GONE);
                }else{
                    GBMuhNoData.setVisibility(View.GONE);
                    GBMuh.setVisibility(View.VISIBLE);
                    for (DataSnapshot dataSnapshot : snapshot.getChildren()){
                        TeacherData data = dataSnapshot.getValue(TeacherData.class);
                        list4.add(data);
                    }
                    GBMuh.setHasFixedSize(true);
                    GBMuh.setLayoutManager(new LinearLayoutManager(getContext()));
                    adapter = new TeacherAdapter(list4,getContext());
                    GBMuh.setAdapter(adapter);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(getContext(),error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void GidaMuh() {
        dbRef = reference.child("GIDA MÜHENDİSLİĞİ GMuh");
        dbRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                list4 = new ArrayList<>();
                if (!snapshot.exists()){
                     GMuhNoData.setVisibility(View.VISIBLE);
                     GMuh.setVisibility(View.GONE);
                }else{
                     GMuhNoData.setVisibility(View.GONE);
                     GMuh.setVisibility(View.VISIBLE);
                    for (DataSnapshot dataSnapshot : snapshot.getChildren()){
                        TeacherData data = dataSnapshot.getValue(TeacherData.class);
                        list4.add(data);
                    }
                     GMuh.setHasFixedSize(true);
                     GMuh.setLayoutManager(new LinearLayoutManager(getContext()));
                    adapter = new TeacherAdapter(list4,getContext());
                     GMuh.setAdapter(adapter);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(getContext(),error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void InsaatMuh() {
        dbRef = reference.child("İNŞAAT MÜHENDİSLİĞİIMuh");
        dbRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                list4 = new ArrayList<>();
                if (!snapshot.exists()){
                    IMuhNoData.setVisibility(View.VISIBLE);
                    IMuh.setVisibility(View.GONE);
                }else{
                    IMuhNoData.setVisibility(View.GONE);
                    IMuh.setVisibility(View.VISIBLE);
                    for (DataSnapshot dataSnapshot : snapshot.getChildren()){
                        TeacherData data = dataSnapshot.getValue(TeacherData.class);
                        list4.add(data);
                    }
                    IMuh.setHasFixedSize(true);
                    IMuh.setLayoutManager(new LinearLayoutManager(getContext()));
                    adapter = new TeacherAdapter(list4,getContext());
                    IMuh.setAdapter(adapter);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(getContext(),error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void MakineMuh() {
        dbRef = reference.child("MAKİNE MÜHENDİSLİĞİ");
        dbRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                list4 = new ArrayList<>();
                if (!snapshot.exists()){
                    MakMuhNoData.setVisibility(View.VISIBLE);
                    MakMuh.setVisibility(View.GONE);
                }else{
                    MakMuhNoData.setVisibility(View.GONE);
                    MakMuh.setVisibility(View.VISIBLE);
                    for (DataSnapshot dataSnapshot : snapshot.getChildren()){
                        TeacherData data = dataSnapshot.getValue(TeacherData.class);
                        list4.add(data);
                    }
                    MakMuh.setHasFixedSize(true);
                    MakMuh.setLayoutManager(new LinearLayoutManager(getContext()));
                    adapter = new TeacherAdapter(list4,getContext());
                    MakMuh.setAdapter(adapter);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(getContext(),error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}