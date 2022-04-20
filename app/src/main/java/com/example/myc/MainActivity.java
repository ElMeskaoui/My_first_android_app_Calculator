package com.example.myc;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    boolean isItFirst = true;
    String op="+";
    String oldNumber;
    TextView edi ;
    TextView edi1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }


    public void numberEv(View view) {
        edi = (TextView) findViewById(R.id.editText);
        edi1 = (TextView) findViewById(R.id.editText1);

        if (isItFirst)
            edi.setText("");
        isItFirst = false;


        String numbe = edi.getText().toString();
            switch (view.getId()){
                case R.id.ButtPo:
                    numbe +=".";
                    break;
                case R.id.Butt0:
                    numbe +="0";
                    break;
                case R.id.Butt1:
                    numbe +="1";
                    break;
                case R.id.Butt2:
                    numbe +="2";
                    break;
                case R.id.Butt3:
                    numbe +="3";
                    break;
                case R.id.Butt4:
                    numbe +="4";
                    break;
                case R.id.Butt5:
                    numbe +="5";
                    break;
                case R.id.Butt6:
                    numbe +="6";
                    break;
                case R.id.Butt7:
                    numbe +="7";
                    break;
                case R.id.Butt8:
                    numbe +="8";
                    break;
                case R.id.Butt9:
                    numbe +="9";
                    break;
                case R.id.ButtPm:
                    numbe ="-"+numbe;
                    break;
                case R.id.ButtAC:
                    numbe ="0";
                    isItFirst = true;
                    break;
            }
            edi.setText(numbe);
            edi1.setText("");



    }

    public void Opper(View view) {
        isItFirst = true;
        edi1 = (TextView) findViewById(R.id.editText1);
        oldNumber = edi.getText().toString();
        switch (view.getId()){
            case R.id.Buttdiv: op="/"; break;
            case R.id.ButtPlu: op="+"; break;
            case R.id.ButtMi: op="-"; break;
            case R.id.ButtMul: op="*"; break;

        }
        edi1.setText(op);
    }

    public void equal(View view) {
        String newNumber = edi.getText().toString();
        String eq;
        double res = 0.0;
        switch (op){
            case "+": res = Double.parseDouble(oldNumber)+Double.parseDouble(newNumber);break;
            case "-": res = Double.parseDouble(oldNumber)-Double.parseDouble(newNumber); break;
            case "*": res = Double.parseDouble(oldNumber)*Double.parseDouble(newNumber); break;
            case "/": res = Double.parseDouble(oldNumber)/Double.parseDouble(newNumber); break;

        }
        edi.setText(res+"");

    }
}