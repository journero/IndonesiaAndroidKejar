package com.example.jo.indonesiaandroidkejar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout mlineLearn, mLineQuiz, mLineAbout, mLineEmail;//MEMBUAT VARIABEL BERTIPE LINEAR

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//MENYAMBUNGKN MAINACTIVITY.JAVA DENGAN LAYOUT

        mlineLearn = (LinearLayout) findViewById(R.id.belajar);
        mLineQuiz = (LinearLayout) findViewById(R.id.latihan);
        mLineAbout = (LinearLayout) findViewById(R.id.about);
        mLineEmail = (LinearLayout) findViewById(R.id.contact);
        //MENYAMBUNGKAN MAINACTIVITY.JAVA DENGAN ID PADA LAYOUT

        mlineLearn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String to = "journero@gmail.com";
                String subject = "Nanya Dong";
                String message = "Gua mau nanya";

                Intent email = new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL, new String[]{to});
                email.putExtra(Intent.EXTRA_SUBJECT, subject);
                email.putExtra(Intent.EXTRA_TEXT, message);
                email.setType("message/rfc822");
                startActivity(Intent.createChooser(email,"Kirim Eamail Dengan"));


            }
        });
    };
}


