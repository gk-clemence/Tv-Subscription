package com.practice.lionepart7;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    Button btnNext;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNext = findViewById(R.id.btnNext);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(MainActivity.this,Recycler.class);
                startActivity(mIntent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.themenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.add:
                callDialog();
                break;
            case R.id.list:
                startActivity(new Intent(this, Recycler.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void callDialog() {
        MaterialAlertDialogBuilder thedialog = new MaterialAlertDialogBuilder(this);
        LayoutInflater layoutInflater = getLayoutInflater();
        View view = layoutInflater.inflate(R.layout.activity_custom_dialog, null);
        TextInputEditText dialogName = view.findViewById(R.id.dialogName);
        TextInputEditText dialogDepartment = view.findViewById(R.id.dialogDepartment);
        TextInputEditText dialogGrade = view.findViewById(R.id.dialogGrade);
        TextInputEditText dialogAge = view.findViewById(R.id.dialogAge);
        thedialog.setView(view);
        thedialog.setTitle("Input your Information Here");
        thedialog.setPositiveButton("Send", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, ""+dialogName.getText().toString()+"\n"+dialogAge.getText().toString()+"\n"+dialogDepartment.getText().toString()+"\n"+dialogGrade.getText().toString(), Toast.LENGTH_LONG).show();
            }
        });
        thedialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });


        thedialog.setCancelable(false);
        thedialog.show();

    }
    public void registerAccount(){
        startActivity(new Intent(getApplicationContext(), Register.class));
    }
}