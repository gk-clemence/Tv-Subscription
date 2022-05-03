package com.practice.lionepart7;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import java.util.ArrayList;
import java.util.List;

public class Login extends AppCompatActivity {
    RecyclerView recyclerView;
    List<Product> productList;
    ProductRVAdapter rvAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.myRV);
        recyclerView.setLayoutManager(new GridLayoutManager(this,3));
        productList =new ArrayList<>();
        productList=fillTheList();
        rvAdapter = new ProductRVAdapter(productList,this);
        recyclerView.setAdapter(rvAdapter);
    }

    private List<Product> fillTheList() {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Apple Tv",R.drawable.appletv,340,"This channel can  Work a lot for you Just Test it.."));
        productList.add(new Product("Canal Rwanda",R.drawable.caanal,120,"This channel can  Work a lot for you Just Test it.. "));
        productList.add(new Product("CNN",R.drawable.cnn,200,"This channel can  Work a lot for you Just Test it.."));
        productList.add(new Product("StarTimes",R.drawable.starttimes,300,"This channel can  Work a lot for you Just Test it.."));
        productList.add(new Product("Netflix",R.drawable.netflix,100,"This channel can  Work a lot for you Just Test it.."));
        productList.add(new Product("Canal+",R.drawable.canalplus,200,"This channel can  Work a lot for you Just Test it.."));

        return productList;
    }


}