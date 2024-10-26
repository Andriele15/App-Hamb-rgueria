package br.ulbra.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class CatalogoActivity extends AppCompatActivity {

    private Button btnWhatsApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogo);

        btnWhatsApp = findViewById(R.id.btnWhatsApp);

        btnWhatsApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numeroWhatsApp = "51986832337"; // Substitua pelo número desejado
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://wa.me/" + numeroWhatsApp));
                startActivity(intent);
            }
        });
    }
}
