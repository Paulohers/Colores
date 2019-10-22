package com.example.colores;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    /**
    * @Autor=Paulo
     * @param button: Este párametro se utiliza para inicializar el botón y poder instanciarlo con su respectivo id
     * @param spinner: Este párametro se utiliza para inicializar el spinner y poder instanciarlo con su respectivo id.
     * @param C1,C2,C3: Estos párametros estan siendo declarados para mas adelante ser utilizados con el id de un botón en el diseño de la aplicación.
     * En este apartado se declaran variables de tipo Button y Spinner para
     * su posterior utilización.
    * */
    Button button;
    Spinner spinner;
    Button C1,C2,C3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /**
         * Método principal donde se mandan llamar los métodos.
         *
         */
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         InicializarV();

         ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.opciones, android.R.layout.simple_spinner_item);
         spinner.setAdapter(adapter);
        ColoresM();

    }

    public void InicializarV(){
        /**
         * Método en el cual se inicializan las variables del layout como los spinners y buttons
         * @param C1: es un boton el cual cambiara de color, estoy consiguiendo el id que contiene en el xml de diseño para poder utilizarlo, y declararlo
         * en una variable tipo Button.
         * @param C2: es un boton el cual cambiara de color, estoy consiguiendo el id que contiene en el xml de diseño para poder utilizarlo, y declararlo
         * en una variable tipo Button.
         * @param C3: es un boton el cual cambiara de color, estoy consiguiendo el id que contiene en el xml de diseño para poder utilizarlo, y declararlo
         * en una variable tipo Button.
         * */
        spinner = (Spinner) findViewById(R.id.spinner);;
        button = (Button) findViewById(R.id.button);;
        C1 = findViewById(R.id.C1);
        C2 = findViewById(R.id.C2);
        C3 = findViewById(R.id.C3);
    }


    public void ColoresM(){
        /**
         * Método en el cual se toman desiciones mediante un switch para determinar que opcion estara ingresada en
         * el  control tipo Spinner.
         * @param sp1: , variable tipo string,donde se guardara la opción ingresada en el spinner y se comparara dentro del switch con el contenido que lleva dentro,
         * en este caso un string
         */
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String sp1 = spinner.getSelectedItem().toString();
                switch (sp1){
                    case "Azul":
                        C3.setVisibility(View.VISIBLE);
                        C1.setBackgroundColor(Color.BLUE);
                        C2.setBackgroundColor(Color.BLUE);
                        C3.setBackgroundColor(Color.BLUE);
                        button.setTextColor(Color.BLACK);
                        button.setBackgroundColor(Color.BLUE);
                        break;
                    case "Rojo":
                        C3.setVisibility(View.VISIBLE);
                        C1.setBackgroundColor(Color.RED);
                        C2.setBackgroundColor(Color.RED);
                        C3.setBackgroundColor(Color.RED);
                        button.setTextColor(Color.BLACK);
                        button.setBackgroundColor(Color.RED);
                        break;
                    case "Verde":
                        C1.setBackgroundColor(Color.YELLOW);
                        C2.setBackgroundColor(Color.BLUE);
                        C3.setVisibility(View.INVISIBLE);
                        button.setTextColor(Color.BLACK);
                        button.setBackgroundColor(Color.GREEN);
                        break;
                    case "Amarillo":
                        C3.setVisibility(View.VISIBLE);
                        C1.setBackgroundColor(Color.YELLOW);
                        C2.setBackgroundColor(Color.YELLOW);
                        C3.setBackgroundColor(Color.YELLOW);
                        button.setTextColor(Color.BLACK);
                        button.setBackgroundColor(Color.YELLOW);
                        break;
                    case "Naranja":
                        C1.setBackgroundColor(Color.RED);
                        C2.setBackgroundColor(Color.YELLOW);
                        C3.setVisibility(View.INVISIBLE);
                        button.setTextColor(Color.BLACK);
                        button.setBackgroundColor(Color.rgb(255,255,0));
                        break;
                    case "Magenta":
                        C1.setBackgroundColor(Color.RED);
                        C2.setBackgroundColor(Color.BLUE);
                        C3.setVisibility(View.INVISIBLE);
                        button.setTextColor(Color.BLACK);
                        button.setBackgroundColor(Color.rgb(255,0,255));
                        break;
                    case "Cian":
                        C1.setBackgroundColor(Color.BLUE);
                        C2.setBackgroundColor(Color.GREEN);
                        C3.setVisibility(View.INVISIBLE);
                        button.setTextColor(Color.BLACK);
                        button.setBackgroundColor(Color.CYAN);
                        break;
                    case "Negro":
                        C3.setVisibility(View.VISIBLE);
                        C1.setBackgroundColor(Color.BLUE);
                        C2.setBackgroundColor(Color.RED);
                        C3.setBackgroundColor(Color.GREEN);
                        button.setBackgroundColor(Color.BLACK);
                        button.setTextColor(Color.WHITE);
                        break;
                    case "Blanco":
                        C3.setVisibility(View.VISIBLE);
                        C1.setBackgroundColor(Color.CYAN);
                        C2.setBackgroundColor(Color.rgb(255,0,255));
                        C3.setBackgroundColor(Color.GREEN);
                        button.setTextColor(Color.BLACK);
                        button.setBackgroundColor(Color.WHITE);
                        break;

                }


            }
        });
    }
}
