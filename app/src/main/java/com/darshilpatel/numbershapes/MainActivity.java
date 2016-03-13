package com.darshilpatel.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

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

        String toastMessage = "";
        EditText usersNumber  = (EditText) findViewById(R.id.usersNumber);


        //checks for a number, prevents crash if no number is entered
        if (usersNumber.getText().toString().isEmpty()){
            toastMessage = "Please enter a number";
        } else {

            Number myNumber = new Number();
            myNumber.number = Integer.parseInt(usersNumber.getText().toString());


            if (myNumber.ifSquare()) {
                if (myNumber.ifTriangle()) {
                    toastMessage = myNumber.number + " is a triangular and square Number!";
                } else {
                    toastMessage = myNumber.number + " is a sqaure number.";
                }
            } else {
                toastMessage = myNumber.number + " is not a sqaure or triangular number";
            }

        }
        Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_LONG).show();

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}