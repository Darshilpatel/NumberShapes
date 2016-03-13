package com.darshilpatel.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        class Number {
            int number;

            public boolean ifSquare() {
                
            }

             public boolean ifTriangle(){
                 int x = 1;
                 int triangualNumber = 1;

                 while (triangualNumber < number){
                     x++;
                     triangualNumber = triangualNumber + x;
                 }

                 if (triangualNumber == number){
                     return true;
                 } else {
                     return false;
                 }

             }


        }
        Number myNumber = new Number();
        myNumber.number = 6;


    }
}
