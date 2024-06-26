package com.example.proyectoappbydvirtualstore;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button iniciarSesionButton = findViewById(R.id.iniciarsesion);
        iniciarSesionButton.setOnClickListener(view -> {
            // Crear un Intent para abrir la actividad "menu.java"
            Intent intent = new Intent(MainActivity.this, menu.class);
            startActivity(intent);

        });

        // Agrega el código para abrir la actividad de registro al hacer clic en el TextView
        TextView textView3 = findViewById(R.id.textView3);
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity_registro();
            }
        });
    }

    public void activity_registro() {
        Intent intent = new Intent(MainActivity.this,registro.class);
        startActivity(intent);
    }


}
