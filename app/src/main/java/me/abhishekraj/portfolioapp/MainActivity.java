package me.abhishekraj.portfolioapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button popularMovies = (Button) findViewById(R.id.popularMovies);
        popularMovies.setOnClickListener(this);
        Button stockHawk = (Button) findViewById(R.id.stockHawk);
        stockHawk.setOnClickListener(this);
        Button buildItBigger = (Button) findViewById(R.id.buildItBigger);
        buildItBigger.setOnClickListener(this);
        Button makeYourAppMaterial = (Button) findViewById(R.id.makeYourAppMaterial);
        makeYourAppMaterial.setOnClickListener(this);
        Button goUbiquitous = (Button) findViewById(R.id.goUbiquitous);
        goUbiquitous.setOnClickListener(this);
        Button capstone = (Button) findViewById(R.id.capstone);
        capstone.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.popularMovies:
                Toast.makeText(MainActivity.this, getResources().getString(R.string.popularMoviesButtonToast),
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.stockHawk:
                Toast.makeText(MainActivity.this, getResources().getString(R.string.stackHawkButtonToast),
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.buildItBigger:
                Toast.makeText(MainActivity.this, getResources().getString(R.string.buildItBiggerButtonToast),
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.makeYourAppMaterial:
                Toast.makeText(MainActivity.this, getResources().getString(R.string.makeYourAppMaterialButtonToast),
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.goUbiquitous:
                Toast.makeText(MainActivity.this, getResources().getString(R.string.goUbiquitousButtonToast),
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.capstone:
                Toast.makeText(MainActivity.this, getResources().getString(R.string.capstoneButtonToast),
                        Toast.LENGTH_SHORT).show();
                break;
            default:
                Toast.makeText(MainActivity.this, getResources().getString(R.string.defaultToastMessage),
                        Toast.LENGTH_SHORT).show();
                break;

        }
    }
}
