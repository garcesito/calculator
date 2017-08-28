package com.garcesito.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private String operando1="",operando2="",operador="",resultado="";
    private Button bSeven,bSix,bFive,bEight,bNine,bFour,bThree,bTwo,bOne,bZero,bDot;
    private Button bDivide,bMultiply,bPLus,bMinus,bEqual;
    private TextView tPantalla;
    private float Res;
    private int c=1,op=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bSeven =(Button) findViewById(R.id.bSeven);
        bEight=(Button) findViewById(R.id.bEight);
        bNine =(Button) findViewById(R.id.bNine);
        bFour =(Button) findViewById(R.id.bFour);
        bFive =(Button) findViewById(R.id.bFive);
        bSix =(Button) findViewById(R.id.bSix);
        bOne =(Button) findViewById(R.id.bOne);
        bTwo =(Button) findViewById(R.id.bTwo);
        bThree =(Button) findViewById(R.id.bThree);
        bZero =(Button) findViewById(R.id.bZero);
        bDot =(Button) findViewById(R.id.bDot);


        bDivide =(Button) findViewById(R.id.bDivide);
        bMultiply =(Button) findViewById(R.id.bMultiply);
        bPLus =(Button) findViewById(R.id.bPlus);
        bMinus =(Button) findViewById(R.id.bMinus);
        bEqual =(Button) findViewById(R.id.bEqual);


        tPantalla = (TextView) findViewById(R.id.tPantalla);

        bSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(c==1)
                {
                    operando1=operando1+"7";
                    tPantalla.setText(operando1);
                }else
                {
                    operando2=operando2+"7";
                    tPantalla.setText(operando1+operador+operando2);
                }

            }
        });

        bEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(c==1)
                {
                    operando1=operando1+"8";
                    tPantalla.setText(operando1);
                }else
                {
                    operando2=operando2+"8";
                    tPantalla.setText(operando1+operador+operando2);
                }
            }
        });
        bNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(c==1)
                {
                    operando1=operando1+"9";
                    tPantalla.setText(operando1);
                }else
                {
                    operando2=operando2+"9";
                    tPantalla.setText(operando1+operador+operando2);
                };
            }
        });
        bFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(c==1)
                {
                    operando1=operando1+"4";
                    tPantalla.setText(operando1);
                }else
                {
                    operando2=operando2+"4";
                    tPantalla.setText(operando1+operador+operando2);
                }
            }
        });
        bFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(c==1)
                {
                    operando1=operando1+"5";
                    tPantalla.setText(operando1);
                }else
                {
                    operando2=operando2+"5";
                    tPantalla.setText(operando1+operador+operando2);
                }
            }
        });
        bSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(c==1)
                {
                    operando1=operando1+"6";
                    tPantalla.setText(operando1);
                }else
                {
                    operando2=operando2+"6";
                    tPantalla.setText(operando1+operador+operando2);
                }
            }
        });
        bOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(c==1)
                {
                    operando1=operando1+"1";
                    tPantalla.setText(operando1);
                }else
                {
                    operando2=operando2+"1";
                    tPantalla.setText(operando1+operador+operando2);
                }
            }
        });
        bTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(c==1)
                {
                    operando1=operando1+"2";
                    tPantalla.setText(operando1);
                }else
                {
                    operando2=operando2+"2";
                    tPantalla.setText(operando1+operador+operando2);
                }
            }
        });
        bThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(c==1)
                {
                    operando1=operando1+"3";
                    tPantalla.setText(operando1);
                }else
                {
                    operando2=operando2+"3";
                    tPantalla.setText(operando1+operador+operando2);
                }
            }
        });
        bZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(c==1)
                {
                    operando1=operando1+"0";
                    tPantalla.setText(operando1);
                }else
                {
                    operando2=operando2+"0";
                    tPantalla.setText(operando1+operador+operando2);
                }
            }
        });
        bDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(c==1)
                {
                    operando1=operando1+".";
                    tPantalla.setText(operando1);
                }else
                {
                    operando2=operando2+".";
                    tPantalla.setText(operando1+operador+operando2);
                }
            }
        });
        bPLus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c=2;
                op=1;
                operador=operador+"+";
                tPantalla.setText(operando1+operador);
            }
        });

        bMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c=2;
                op=2;
                operador=operador+"-";
                tPantalla.setText(operando1+operador);
            }
        });
        bMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c=2;
                op=3;
                operador=operador+"*";
                tPantalla.setText(operando1+operador);
            }
        });
        bDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c=2;
                op=4;
                operador=operador+"/";
                tPantalla.setText(operando1+operador);
            }
        });
        bEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c=1;

                /*esto deberia ir en una varias funciones*/


                if(op==1)
                {
                    float op1= Float.parseFloat(operando1);
                    float op2= Float.parseFloat(operando2);
                    Res= op1 +op2;
                }
                if(op==2)
                {
                    float op1= Float.parseFloat(operando1);
                    float op2= Float.parseFloat(operando2);
                    Res= op1 -op2;
                }
                if(op==3)
                {
                    float op1= Float.parseFloat(operando1);
                    float op2= Float.parseFloat(operando2);
                    Res= op1 *op2;
                }
                if(op==4)
                {
                    float op1= Float.parseFloat(operando1);
                    float op2= Float.parseFloat(operando2);
                    Res= op1 /op2;
                }

                String a="-14.5";
                String b="9.3";
                float op1= Float.parseFloat(a);
                float op2= Float.parseFloat(b);
                Res= op1 /op2;
                    tPantalla.setText(operando1+operador+operando2+"= \n"+ Res);




                /*despues de mostrar resultado inicializar los operandos y operadores*/
                operando1="";
                operando2="";
                operador="";
                resultado="";
                op=0;

            }
        });
    }
}
