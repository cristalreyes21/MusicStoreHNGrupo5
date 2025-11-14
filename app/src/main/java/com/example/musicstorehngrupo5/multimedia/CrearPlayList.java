package com.example.musicstorehngrupo5.multimedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.musicstorehngrupo5.R;

public class CrearPlayList extends AppCompatActivity {


    ImageButton botonAtrass;
    Button CrearPlays;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.crear_play_list);

        CrearPlays = (Button) findViewById(R.id.btnCrearPlayList);


        CrearPlays.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent creacion = new Intent(getApplicationContext(), Play.class);
                startActivity(creacion);
            }
        });

        botonAtrass = (ImageButton) findViewById(R.id.btn_CrearPlayList);
        View.OnClickListener buttonClick = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Class<?> actividad = null;

                if (view.getId() == R.id.btn_CrearPlayList) {
                    actividad = PlayList.class;
                }

                if (actividad != null) {
                    moveActivity(actividad);
                }
            }
        };
        botonAtrass.setOnClickListener(buttonClick);



    }
    // Método para cambiar a otra actividad
    private void moveActivity(Class<?> actividad) {
        Intent intent = new Intent(getApplicationContext(), actividad);
        startActivity(intent);
    }
