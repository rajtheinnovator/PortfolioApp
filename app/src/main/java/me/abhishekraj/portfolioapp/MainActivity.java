package me.abhishekraj.portfolioapp;

import android.content.Intent;
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
                Intent popularMoviesIntent = new Intent(MainActivity.this, ProjectDetailsActivity.class);
                popularMoviesIntent.putExtra("intentExtra", "This is Popular Movies Project");
                startActivity(popularMoviesIntent);
                break;
            case R.id.stockHawk:
                Toast.makeText(MainActivity.this, getResources().getString(R.string.stackHawkButtonToast),
                        Toast.LENGTH_SHORT).show();
                Intent stockHawkIntent = new Intent(MainActivity.this, ProjectDetailsActivity.class);
                stockHawkIntent.putExtra("intentExtra", "This is StockHawk Project");
                startActivity(stockHawkIntent);
                break;
            case R.id.buildItBigger:
                Toast.makeText(MainActivity.this, getResources().getString(R.string.buildItBiggerButtonToast),
                        Toast.LENGTH_SHORT).show();
                Intent buildItBiggerIntent = new Intent(MainActivity.this, ProjectDetailsActivity.class);
                buildItBiggerIntent.putExtra("intentExtra", "This is Build It Bigger Project");
                startActivity(buildItBiggerIntent);
                break;
            case R.id.makeYourAppMaterial:
                Toast.makeText(MainActivity.this, getResources().getString(R.string.makeYourAppMaterialButtonToast),
                        Toast.LENGTH_SHORT).show();
                Intent makeYourAppMaterialIntent = new Intent(MainActivity.this, ProjectDetailsActivity.class);
                makeYourAppMaterialIntent.putExtra("intentExtra", "This is Make Your App Material Project");
                startActivity(makeYourAppMaterialIntent);
                break;
            case R.id.goUbiquitous:
                Toast.makeText(MainActivity.this, getResources().getString(R.string.goUbiquitousButtonToast),
                        Toast.LENGTH_SHORT).show();
                Intent goUbiquitousIntent = new Intent(MainActivity.this, ProjectDetailsActivity.class);
                goUbiquitousIntent.putExtra("intentExtra", "This is Go Ubiquitous Project");
                startActivity(goUbiquitousIntent);
                break;
            case R.id.capstone:
                Toast.makeText(MainActivity.this, getResources().getString(R.string.capstoneButtonToast),
                        Toast.LENGTH_SHORT).show();
                Intent capstoneIntent = new Intent(MainActivity.this, ProjectDetailsActivity.class);
                capstoneIntent.putExtra("intentExtra", "This is Capstone Project");
                startActivity(capstoneIntent);
                break;
            default:
                Toast.makeText(MainActivity.this, getResources().getString(R.string.defaultToastMessage),
                        Toast.LENGTH_SHORT).show();
                break;

        }
    }
}
