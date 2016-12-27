package me.abhishekraj.portfolioapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ProjectDetailsActivity extends AppCompatActivity {
    String projectMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popular_movies);
        projectMessage = getIntent().getExtras().getString("intentExtra");
        TextView projectMessageTextView = (TextView) findViewById(R.id.projectMessageTextVuew);
        projectMessageTextView.setText(projectMessage);
    }
}
