package com.example.csc250android1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private Button d6_button;
    private Button d20_button;
    private TextView total_tv;




    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);
        this.d6_button = this.findViewById(R.id.d4_button);
        this.d20_button = this.findViewById(R.id.d2_button);
        ;
    }

    public void onButtonClicked(View v)
    {
        //v is the View that called this function
        //Buttons are instances of Views
        //is the button that was push the same as the fname_button
        if(v == this.d20_button)
        {
            TextView total_tv = this.findViewById(R.id.total_tv);
            Dice d20 = new Dice(20);
            this.total_tv.setText("" + d20.roll());
        }
        else if(v == this.d12_button)
        {
            TextView total_tv = this.findViewById(R.id.total_tv);
            Dice d12 = new Dice(12);
            this.total_tv.setText("" + d12.roll());
        }
        else if(v == this.d8_button)
        {
            TextView total_tv = this.findViewById(R.id.total_tv);
            Dice d8 = new Dice(8);
            this.total_tv.setText("" + d8.roll());
        }
        else if(v == this.d6_button)
        {
            TextView total_tv = this.findViewById(R.id.total_tv);
            Dice d6 = new Dice(6);
            this.total_tv.setText("" + d6.roll());
        }
        else if(v == this.d4_button)
        {
            TextView total_tv = this.findViewById(R.id.total_tv);
            Dice d4 = new Dice(4);
            this.total_tv.setText("" + d4.roll());
        }
        else if(v == this.d2_button)
        {
            TextView total_tv = this.findViewById(R.id.total_tv);
            Dice d2 = new Dice(2);
            this.total_tv.setText("" + d2.roll());
        }
        else if(v == this.perc_button)
        {
            TextView total_tv = this.findViewById(R.id.total_tv);
            Dice d100 = new Dice(100);
            this.total_tv.setText("" + d100.roll());
        }
    }
}