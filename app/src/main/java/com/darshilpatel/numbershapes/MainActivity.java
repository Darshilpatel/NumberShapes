package com.darshilpatel.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    class Number {
        int number;

        public boolean ifSquare() {
            double squareRootCreate = Math.sqrt(number);

            if (squareRootCreate == Math.floor(squareRootCreate)){
                return true;
            }else {
                return false;
            }


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



    public void testNumber (View view){
        EditText usersNumber  = (EditText) findViewById(R.id.usersNumber);

      


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
