package com.example.alignwidget;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Context context;    // interface to global information about an application environment

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // context : app 환경에 대한 모든 정보를 갖고 있는 인터페이스(객체)이다.
        context = getApplicationContext();
        textView = findViewById(R.id.textView);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("setOnClickListener를 구현!!");
            }
        });
    }

    public void onHelloButtonClick(View view)
    {
        Toast.makeText(context, "hello button을 클릭하였습니다", Toast.LENGTH_LONG).show();
        textView.setText("안녕하세요? 안드로이드입니다.");
    }

    public void showToast(View view)
    {
        String msg = "Hello Toast";
        Toast toast = Toast.makeText(context, msg, Toast.LENGTH_LONG);
        toast.show();
    }
}