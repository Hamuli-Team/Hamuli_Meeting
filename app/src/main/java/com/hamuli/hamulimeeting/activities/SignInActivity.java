package com.hamuli.hamulimeeting.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.hamuli.hamulimeeting.R;

import java.util.HashMap;

public class SignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        findViewById(R.id.textSignUp).setOnClickListener(view -> startActivity(new Intent(SignInActivity.this, SignUpActivity.class)));

//        FirebaseFirestore database = FirebaseFirestore.getInstance();
//        HashMap<String, Object> user = new HashMap<>();
//        user.put("first_name", "John");
//        user.put("last_name", "Doe");
//        user.put("email", "john.doe@gmail.com");
//        database.collection("users")
//                .add(user)
//                .addOnSuccessListener(documentReference -> Toast.makeText(SignInActivity.this, "User Added", Toast.LENGTH_SHORT).show())
//                .addOnFailureListener(e -> Toast.makeText(SignInActivity.this, "Error adding user", Toast.LENGTH_SHORT).show());
    }
}