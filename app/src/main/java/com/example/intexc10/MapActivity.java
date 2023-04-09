package com.example.intexc10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.yandex.mapkit.Animation;
import com.yandex.mapkit.MapKitFactory;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.mapview.MapView;

public class MapActivity extends AppCompatActivity {
    private MapView mapView;
    EditText t1;
    EditText t2;
    EditText t3;
    Button Answercheck;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MapKitFactory.initialize(this);
        setContentView(R.layout.activity_main);
        mapView = findViewById(R.id.mapview);
        mapView.getMap().move(
                new CameraPosition(new Point(55.751574, 37.573856), 11.0f, 0.0f, 0.0f),
                new Animation(Animation.Type.SMOOTH, 0),
                null);
                Point mappoint = new Point(55.751574, 37.573856);
                Point mappoint2 = new Point(0.000000, 0.000000);
                Point mappoint3 = new Point(1.000000, 1.000000);
                mapView.getMap().getMapObjects().addPlacemark(mappoint);
                mapView.getMap().getMapObjects().addPlacemark(mappoint2);
                mapView.getMap().getMapObjects().addPlacemark(mappoint3);
                t1 = findViewById(R.id.QuestionOne);
                t2 = findViewById(R.id.QuestionTwo);
                t3 = findViewById(R.id.QuestionThree);
                Answercheck = findViewById(R.id.AnswerCheck);
                String ansone = String.valueOf(t1.getText());
                String anstwo = String.valueOf(t2.getText());
                String ansthree = String.valueOf(t3.getText());
                Answercheck.setOnClickListener(v -> {
                    Intent intent = new Intent(this, CheckActivity.class);
                    intent.putExtra("t1", ansone);
                    intent.putExtra("t2", anstwo);
                    intent.putExtra("t3", anstwo);
                    startActivity(intent);
                });



    }
    @Override
    protected void onStop() {
        mapView.onStop();
        MapKitFactory.getInstance().onStop();
        super.onStop();
    }

    @Override
    protected void onStart() {
        super.onStart();
        MapKitFactory.getInstance().onStart();
        mapView.onStart();
    }
}
