package com.platzi.platzigram;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.platzi.platzigram.view.ContainerActivity;
import com.platzi.platzigram.view.CreateAccountActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void goCreateAccount(View view) {
        Intent intent = new Intent(this, CreateAccountActivity.class);
        startActivity(intent);
    }

    public void goLogin(View view) {
        Intent intent = new Intent(this, ContainerActivity.class);
        startActivity(intent);
    }

    public void goPage(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.platzi.com"));
        startActivity(intent);
    }
}
