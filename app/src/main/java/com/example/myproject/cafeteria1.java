package com.example.myproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class cafeteria1 extends AppCompatActivity {
    private TextView textView;
    private EditText editText;
    private Button button;

    DatabaseReference mRootRef = FirebaseDatabase.getInstance().getReference();
    DatabaseReference conditionRef = mRootRef.child("text"); //데이터가 있을 위치의 이름을 정해주는 것

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafeteria1);

        textView = (TextView) findViewById(R.id.textView3);
        editText = (EditText) findViewById(R.id.editText);
        button = (Button) findViewById(R.id.button);
    }

    @Override
    protected void onStart() { //데이터의 변화를 알기 위해
        super.onStart();

        conditionRef.addValueEventListener(new ValueEventListener() { //child로 설정해준 경로 안의 데이터가 변화됐을 때 작동
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) { //데이터의 값이 변했을 떄 마다 작동
                String text = dataSnapshot.getValue(String.class); //text안에 받아온 데이터 문자열 넣어줌
                textView.setText(text); //textview의 텍스트를 text로 변경
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) { //에러가 날 떄 작동

            }
        });

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                conditionRef.setValue(editText.getText().toString());  //버튼 누를 때 마다 설정해 둔 경로 안으로 editText값 업뎃뎃
            }
       });

    }
}
