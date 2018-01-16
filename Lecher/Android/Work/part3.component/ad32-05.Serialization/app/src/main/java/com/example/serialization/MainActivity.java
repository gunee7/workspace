package com.example.serialization;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Intent i;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);

        ButtonListener blistener = new ButtonListener();

        btn1.setOnClickListener( blistener );
        btn2.setOnClickListener( blistener );
        btn3.setOnClickListener( blistener );
        btn4.setOnClickListener( blistener );
        btn5.setOnClickListener( blistener );
    }


    private class ButtonListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn1:
                //기본 타입을 이용한 데이터 전달
                    i.putExtra("data","test");
                    break;

                case R.id.btn2:
                    //배열을 이용한 데이터 전달
                    int [] array = {0,1,2,3,4,5,6,7,8};
                    i.putExtra("data","test");
                    break;

                case R.id.btn3:
                    //Serializable을 이용한 데이터 전달
                    i.putExtra("data","test");
                    break;

                case R.id.btn4:
                    //Parcelable을 이용한 데이터 전달
                    i.putExtra("data","test");
                    break;

                case R.id.btn5:
                    //Bunndle을 이용한 데이터 전달
                    i.putExtra("data","test");
                    break;


            }
        }
    }
}
