package com.suwatsinglor.candidate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.suwatsinglor.candidate.databinding.ActivityBankkiBinding;
import com.suwatsinglor.candidate.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    ActivityBankkiBinding bankBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_bankki);

        bankBinding = ActivityBankkiBinding.inflate(getLayoutInflater());
        View view = bankBinding.getRoot();

        setContentView(view);

        //binding.textView.setText("Rujilaaaaa");
    }

    @Override
    protected void onStop() {

        super.onStop();
    }
}