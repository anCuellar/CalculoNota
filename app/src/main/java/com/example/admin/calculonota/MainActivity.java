package com.example.admin.calculonota;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //ATRIBUTOS
    EditText corte1, corte2, corte3, c1m2, c2m2, c3m2, c1m3, c2m3, c3m3;
    TextView resultado, resultado2, resultado3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        corte1 = (EditText) findViewById(R.id.corte1);
        corte2 = (EditText) findViewById(R.id.corte2);
        corte3 = (EditText) findViewById(R.id.corte3);
        resultado = (TextView) findViewById(R.id.textViewResultado);
        c1m2 = (EditText) findViewById(R.id.c1m2);
        c2m2 = (EditText) findViewById(R.id.c2m2);
        c3m2 = (EditText) findViewById(R.id.c3m2);
        resultado2 = (TextView) findViewById(R.id.textViewResultado2);
        c1m3 = (EditText) findViewById(R.id.c1m3);
        c2m3 = (EditText) findViewById(R.id.c2m3);
        c3m3 = (EditText) findViewById(R.id.c3m3);
        resultado3 = (TextView) findViewById(R.id.textViewResultado3);

        // ONCHANGE MATERIA 1

        corte1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

                try {
                    String nota1 = corte1.getText().toString();
                    String nota2 = corte2.getText().toString();
                    String nota3 = corte3.getText().toString();
                    float nr01 = Float.parseFloat(nota1);
                    float nr02 = Float.parseFloat(nota2);
                    float nr03 = Float.parseFloat(nota3);
                    double r = (((nr01 + nr02) / 2) * 0.6 + (nr03 * 0.4));
                    String result = String.valueOf(r);
                    resultado.setText(result);
                } catch (Exception e) {
                    if (corte1.getText().toString().equals("") || (corte2.getText().toString().equals("") || (corte3.getText().toString().equals("")))) {
                        Toast notification = Toast.makeText(MainActivity.this, "No debe haber valores vacios", Toast.LENGTH_LONG);
                        notification.show();

                    }

                    ;
                }
            }
        });

        corte2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

                try {
                    String nota1 = corte1.getText().toString();
                    String nota2 = corte2.getText().toString();
                    String nota3 = corte3.getText().toString();
                    float nr01 = Float.parseFloat(nota1);
                    float nr02 = Float.parseFloat(nota2);
                    float nr03 = Float.parseFloat(nota3);
                    double r = (((nr01 + nr02) / 2) * 0.6 + (nr03 * 0.4));
                    String result = String.valueOf(r);
                    resultado.setText(result);
                } catch (Exception e) {
                    if (corte1.getText().toString().equals("") || (corte2.getText().toString().equals("") || (corte3.getText().toString().equals("")))) {
                        Toast notification = Toast.makeText(MainActivity.this, "No debe haber valores vacios", Toast.LENGTH_LONG);
                        notification.show();
                    }
                    ;
                }
            }
        });
        corte3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

                try {
                    String nota1 = corte1.getText().toString();
                    String nota2 = corte2.getText().toString();
                    String nota3 = corte3.getText().toString();
                    float nr01 = Float.parseFloat(nota1);
                    float nr02 = Float.parseFloat(nota2);
                    float nr03 = Float.parseFloat(nota3);
                    double r = (((nr01 + nr02) / 2) * 0.6 + (nr03 * 0.4));
                    String result = String.valueOf(r);
                    resultado.setText(result);
                } catch (Exception e) {
                    if (corte1.getText().toString().equals("") || (corte2.getText().toString().equals("") || (corte3.getText().toString().equals("")))) {
                        Toast notification = Toast.makeText(MainActivity.this, "No debe haber valores vacios", Toast.LENGTH_LONG);
                        notification.show();
                    }
                    ;
                }
            }
        });


        {


            // MATERIA 2

            c1m2.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void afterTextChanged(Editable editable) {

                    try {
                        String nota1 = c1m2.getText().toString();
                        String nota2 = c2m2.getText().toString();
                        String nota3 = c3m2.getText().toString();
                        float nr01 = Float.parseFloat(nota1);
                        float nr02 = Float.parseFloat(nota2);
                        float nr03 = Float.parseFloat(nota3);
                        double r = (((nr01 + nr02) / 2) * 0.6 + (nr03 * 0.4));
                        String result = String.valueOf(r);
                        resultado2.setText(result);
                    } catch (Exception e) {
                        if (c1m2.getText().toString().equals("") || (c2m2.getText().toString().equals("") || (c3m2.getText().toString().equals("")))) {
                            Toast notification = Toast.makeText(MainActivity.this, "No debe haber valores vacios", Toast.LENGTH_LONG);
                            notification.show();
                        }
                        ;
                    }
                }
            });

            c1m2.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void afterTextChanged(Editable editable) {

                    try {
                        String nota1 = c1m2.getText().toString();
                        String nota2 = c2m2.getText().toString();
                        String nota3 = c3m2.getText().toString();
                        float nr01 = Float.parseFloat(nota1);
                        float nr02 = Float.parseFloat(nota2);
                        float nr03 = Float.parseFloat(nota3);
                        double r = (((nr01 + nr02) / 2) * 0.6 + (nr03 * 0.4));
                        String result = String.valueOf(r);
                        resultado2.setText(result);
                    } catch (Exception e) {
                        if (c1m2.getText().toString().equals("") || (c2m2.getText().toString().equals("") || (c3m2.getText().toString().equals("")))) {
                            Toast notification = Toast.makeText(MainActivity.this, "No debe haber valores vacios", Toast.LENGTH_LONG);
                            notification.show();
                        }
                        ;
                    }
                }
            });
            c3m2.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void afterTextChanged(Editable editable) {

                    try {
                        String nota1 = c1m2.getText().toString();
                        String nota2 = c2m2.getText().toString();
                        String nota3 = c3m2.getText().toString();
                        float nr01 = Float.parseFloat(nota1);
                        float nr02 = Float.parseFloat(nota2);
                        float nr03 = Float.parseFloat(nota3);
                        double r = (((nr01 + nr02) / 2) * 0.6 + (nr03 * 0.4));
                        String result = String.valueOf(r);
                        resultado2.setText(result);
                    } catch (Exception e) {
                        if (c1m2.getText().toString().equals("") || (c2m2.getText().toString().equals("") || (c3m2.getText().toString().equals("")))) {
                            Toast notification = Toast.makeText(MainActivity.this, "No debe haber valores vacios", Toast.LENGTH_LONG);
                            notification.show();
                        }
                        ;
                    }
                }
            });


        }


        // MATERIA 3

        c1m3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

                try {
                    String nota1 = c1m3.getText().toString();
                    String nota2 = c2m3.getText().toString();
                    String nota3 = c3m3.getText().toString();
                    float nr01 = Float.parseFloat(nota1);
                    float nr02 = Float.parseFloat(nota2);
                    float nr03 = Float.parseFloat(nota3);
                    double r = (((nr01 + nr02) / 2) * 0.6 + (nr03 * 0.4));
                    String result = String.valueOf(r);
                    resultado3.setText(result);
                } catch (Exception e) {
                    if (c1m3.getText().toString().equals("") || (c2m3.getText().toString().equals("") || (c3m3.getText().toString().equals("")))) {
                        Toast notification = Toast.makeText(MainActivity.this, "No debe haber valores vacios", Toast.LENGTH_LONG);
                        notification.show();
                    }
                    ;
                }
            }
        });

        c1m3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

                try {
                    String nota1 = c1m3.getText().toString();
                    String nota2 = c2m3.getText().toString();
                    String nota3 = c3m3.getText().toString();
                    float nr01 = Float.parseFloat(nota1);
                    float nr02 = Float.parseFloat(nota2);
                    float nr03 = Float.parseFloat(nota3);
                    double r = (((nr01 + nr02) / 2) * 0.6 + (nr03 * 0.4));
                    String result = String.valueOf(r);
                    resultado3.setText(result);
                } catch (Exception e) {
                    if (c1m3.getText().toString().equals("") || (c2m3.getText().toString().equals("") || (c3m3.getText().toString().equals("")))) {
                        Toast notification = Toast.makeText(MainActivity.this, "No debe haber valores vacios", Toast.LENGTH_LONG);
                        notification.show();
                    }
                    ;
                }
            }
        });
        c3m3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

                try {
                    String nota1 = c1m3.getText().toString();
                    String nota2 = c2m3.getText().toString();
                    String nota3 = c3m3.getText().toString();
                    float nr01 = Float.parseFloat(nota1);
                    float nr02 = Float.parseFloat(nota2);
                    float nr03 = Float.parseFloat(nota3);
                    double r = (((nr01 + nr02) / 2) * 0.6 + (nr03 * 0.4));
                    String result = String.valueOf(r);
                    resultado3.setText(result);
                } catch (Exception e) {
                    if (c1m3.getText().toString().equals("") || (c2m3.getText().toString().equals("") || (c3m3.getText().toString().equals("")))) {
                        Toast notification = Toast.makeText(MainActivity.this, "No debe haber valores vacios", Toast.LENGTH_LONG);
                        notification.show();
                    }
                    ;
                }
            }
        });


    }

    public void total(View v){

        String t1 =corte1.getText().toString();
        String t2 =corte2.getText().toString();
        String t3 =corte3.getText().toString();
        double n1 =0;
        double n2 =0;
        double n3 =0;

        n1 = Double.valueOf(t1);
        n2 = Double.valueOf(t2);
        n3 = Double.valueOf(t3);

        double total = (n1 + n2 + n3) / 3;

        Toast not = Toast.makeText(MainActivity.this, getString(R.string.aviso)+" "+String.format("%.2f",total), Toast.LENGTH_LONG);
        not.show();

    }

    public void acercaDe (View view)
    {
        Intent i = new Intent(this,acercaDe.class);
        startActivity(i);
    }

    }











