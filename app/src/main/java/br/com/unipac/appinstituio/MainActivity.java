package br.com.unipac.appinstituio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText nome, curso, nota1, nota2, nota3, nota4;
    Button btnCalcular;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nome =  (EditText) findViewById(R.id.nome);
        curso = (EditText) findViewById(R.id.curso);

        nota1 = (EditText) findViewById(R.id.nota1);
        nota2 = (EditText) findViewById(R.id.nota2);
        nota3 = (EditText) findViewById(R.id.nota3);
        nota4 = (EditText) findViewById(R.id.nota4);

        btnCalcular = (Button) findViewById(R.id.btncalcular);

        btnCalcular.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Double nota1Value = Double.parseDouble(nota1.getText().toString());
                Double nota2Value = Double.parseDouble(nota2.getText().toString());
                Double nota3Value = Double.parseDouble(nota3.getText().toString());
                Double nota4Value = Double.parseDouble(nota4.getText().toString());

                double i = (nota1Value + nota2Value + nota3Value + nota4Value) / 4;

                if(i >= 60.0){

                    Toast.makeText(MainActivity.this, "Aprovado", Toast.LENGTH_SHORT).show();

                }else if (i < 60.0){

                    Toast.makeText(MainActivity.this, "Reprovado", Toast.LENGTH_LONG).show();

                }
            }
        });
       }

    }

