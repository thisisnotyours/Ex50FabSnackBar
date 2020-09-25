package com.suek.ex50fabsnackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickFab(View view) {
        //Toast.makeText(this, "Floating Action Button", Toast.LENGTH_SHORT).show();
        //Toast 의 업그레이드 버전 : Snack Bar
        Snackbar.make(view, "This is Snack Bar", Snackbar.LENGTH_INDEFINITE).setAction("OK", new View.OnClickListener() {  //"OK" 버튼을 '하나만' 만들수있음
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "click ok (Toast)", Toast.LENGTH_SHORT).show();
            }
        }).show();
    }

    public void clickBtn(View view) {
        //새로운 CoordinatorLayout 을 이용하면 원하는 위치에
        //Snackbar 를 보이게 할수있음.

        //스낵바가 놓여질 CoordinatorLayout 뷰객체를 참조하기
        View v= findViewById(R.id.layout_snackbar_container);
        Snackbar.make(v, "Snack Bar", Snackbar.LENGTH_LONG).setAction("Submit", new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        }).show();
    }
}
