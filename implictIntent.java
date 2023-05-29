MainActivity.java
package com.example.pract1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void GOOGLE(View view) {
        String url = "http://www.google.com";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
    public void MYNTRA(View view) {
        String url = "http://www.myntra.com";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
    public void AMAZON(View view) {
        String url = "http://www.amazon.com";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
}

activit_main.xml
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
xmlns:tools="http://schemas.android.com/tools"
android:layout_width="match_parent"
android:layout_height="match_parent"
android:padding="8dp"
tools:context=".MainActivity">
<Button
    android:id="@+id/google"
    android:onClick="GOOGLE"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="GOOGLE"
    android:layout_centerInParent="true"
    android:layout_above="@id/myntra"
    />
    <Button
        android:id="@+id/myntra"
        android:onClick="MYNTRA"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="MYNTRA"
        android:layout_centerInParent="true"
        android:layout_below="@id/myntra"
        />
    <Button
        android:id="@+id/amazon"
        android:onClick="AMAZON"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="AMAZON"
        android:layout_centerInParent="true"
        android:layout_below="@id/myntra"/>
</RelativeLayout>