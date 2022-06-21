package com.example.optionmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_bar, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch(item.getItemId())
        {
            case R.id.group:

                Toast.makeText(this, "Group clicked", Toast.LENGTH_SHORT).show();
                break;

            case R.id.broadcast:

                Toast.makeText(this, "broadcast clicked", Toast.LENGTH_SHORT).show();
                break;

            case R.id.web:

                Toast.makeText(this, "web clicked", Toast.LENGTH_SHORT).show();
                break;

            case R.id.message:

                Toast.makeText(this, "message clicked", Toast.LENGTH_SHORT).show();
                break;

            case R.id.status:

                Toast.makeText(this, "status clicked", Toast.LENGTH_SHORT).show();
                break;

            case R.id.settings:

                Toast.makeText(this, "settings clicked", Toast.LENGTH_SHORT).show();
                break;

        }
        return super.onOptionsItemSelected(item);
    }
}