package com.practice.lionepart7;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.textfield.TextInputEditText;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.VH> {
    Context context;
    List<Item> itemList;

    public RecyclerAdapter(Context context, List<Item> itemList) {
        this.context = context;
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.custom_row_item, parent, false);
        return new VH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {
        Item item = itemList.get(position);
        holder.imageView.setImageResource(item.getStudentImage());
        holder.studentName.setText(item.getStudentName());
        holder.studentDepartment.setText(item.getStudentDepartment());
        holder.studentAge.setText(""+item.getStudentAge());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "You selected: "+item.getStudentName()+"\nFrom: "+item.getStudentDepartment()+"\nWith: "+item.getStudentGrades(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    class VH extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView studentName, studentDepartment, studentAge;

        public VH(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.profilePicId);
            studentName = itemView.findViewById(R.id.studentName);
            studentDepartment = itemView.findViewById(R.id.studentdepartment);
            studentAge = itemView.findViewById(R.id.studentAge);

        }
    }
}
