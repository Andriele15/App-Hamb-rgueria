package br.ulbra.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class CadastroActivity extends AppCompatActivity {

    private EditText editNome, editEmail, editSenha, editTelefone;
    private Button btnSalvar;
    private DBHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        editNome = findViewById(R.id.editNome);
        editEmail = findViewById(R.id.editEmailCadastro);
        editSenha = findViewById(R.id.editSenhaCadastro);
        editTelefone = findViewById(R.id.editTelefone); // Adicionando o campo de telefone
        btnSalvar = findViewById(R.id.btnSalvar);
        dbHelper = new DBHelper(this);

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = editNome.getText().toString();
                String email = editEmail.getText().toString();
                String senha = editSenha.getText().toString();
                String telefone = editTelefone.getText().toString(); // Capturando o telefone

                if (dbHelper.cadastrarUsuario(nome, email, senha, telefone)) {
                    Toast.makeText(CadastroActivity.this, "Usuário cadastrado com sucesso!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(CadastroActivity.this, CatalogoActivity.class);
                    startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(CadastroActivity.this, "Erro ao cadastrar usuário", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

