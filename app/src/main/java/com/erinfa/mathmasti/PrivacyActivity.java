package com.erinfa.mathmasti;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;


public class PrivacyActivity extends Activity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacy);

        WebView web_view = findViewById(R.id.web_view);


        web_view.loadUrl("https://pages.flycricket.io/maths-learning-for-k/privacy.html");

    }//oncreate



}
