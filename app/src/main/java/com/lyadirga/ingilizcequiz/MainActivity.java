package com.lyadirga.ingilizcequiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    public static final String QUIZ_KEY="key";
    public static final int SAYILAR=1;
    public static final int RENKLER=2;
    public static final int HAYVANLAR=3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

  public void testClick(View v){

      Intent intent=new Intent(getApplicationContext(),Quiz.class);

    switch (v.getId()){
        case R.id.fab1:
            intent.putExtra(QUIZ_KEY,SAYILAR);
            startActivity(intent);
            break;
        case R.id.fab2:
            intent.putExtra(QUIZ_KEY,RENKLER);
            startActivity(intent);
            break;
        case R.id.fab3:
            intent.putExtra(QUIZ_KEY,HAYVANLAR);
            startActivity(intent);
            break;
    }
  }

}
