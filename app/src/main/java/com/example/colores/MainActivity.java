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
     * En este apartado se declaran variables de tipo Button y Spinner para
     * su posterior utilización.
    * */
    Button button;
    Spinner spinner;
    Spinner spinner2;

    /**
     * Método principal donde se mandan llamar los métodos.
     *
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         InicializarV();

         ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.opciones, android.R.layout.simple_spinner_item);
         spinner.setAdapter(adapter);
         spinner2.setAdapter(adapter);
        ColoresM();

    }
    /**
    * Método en el cual se inicializan las variables del layout como los spinners y buttons
    * */
    public void InicializarV(){
        spinner = (Spinner) findViewById(R.id.spinner);;
        spinner2 = (Spinner) findViewById(R.id.spinner2);;
        button = (Button) findViewById(R.id.button);;
    }

    /**
     * Método en el cual se toman desiciones mediante if para determinar que opcion esta ingresada en
     * el  control tipo Spinner.
     * @param: sp1, donde se guardara la opción ingresada en el spinner y se comparara con el otro spinner2.
     * @param: sp2, donde se guardara la opción ingresada en el spinner y se comparara con el otro spinner.
     */
    public void ColoresM(){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sp1 = spinner.getSelectedItem().toString();
                String sp2 = spinner2.getSelectedItem().toString();

                if ((sp1.equals("Azul") && sp2.equals("Amarillo")) || (sp1.equals("Amarillo") && sp2.equals("Azul"))){
                    button.setBackgroundColor(Color.GREEN);
                    button.setText("VERDE");
                }else{
                    if ((sp1.equals("Amarillo") && sp2.equals("Rojo")) || (sp1.equals("Rojo") && sp2.equals("Amarillo"))){
                        int a = Color.rgb(255, 165, 0);
                        button.setBackgroundColor(a);
                        button.setText("NARANJA");
                    }else{
                        if ((sp1.equals("Azul") && sp2.equals("Rojo")) || (sp1.equals("Rojo") && sp2.equals("Azul"))){

                            int a = Color.rgb(167, 4, 254);
                            button.setBackgroundColor(a);
                            button.setText("Magenta");
                        }else {
                            if ((sp1.equals("Azul") && sp2.equals("Verde")) || (sp1.equals("Verde") && sp2.equals("Azul"))){

                                int a = Color.rgb(167, 4, 254);
                                button.setBackgroundColor(a);
                                button.setText("Cian");
                            }else {
                                if ((sp1.equals("Amarillo") && sp2.equals("Cian")) || (sp1.equals("Cian") && sp2.equals("Amarillo"))){
                                    button.setBackgroundColor(Color.GREEN);
                                    button.setText("VERDE");
                                }else{
                                    if ((sp1.equals("Amarillo") && sp2.equals("Magenta")) || (sp1.equals("Magenta") && sp2.equals("Amarillo"))){
                                        button.setBackgroundColor(Color.RED);
                                        button.setText("Rojo");
                                    }else {
                                        if ((sp1.equals("Cian") && sp2.equals("Magenta")) || (sp1.equals("Magenta") && sp2.equals("Cian"))){
                                            button.setBackgroundColor(Color.GREEN);
                                            button.setText("VERDE");
                                        }else {
                                            button.setBackgroundColor(Color.GRAY);
                                            button.setText("What ?");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        });
    }
}
