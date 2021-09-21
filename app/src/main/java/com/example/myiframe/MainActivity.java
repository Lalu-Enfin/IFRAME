package com.example.myiframe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    private WebView mDocumentView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDocumentView = findViewById(R.id.webview);

        mDocumentView.getSettings().setJavaScriptEnabled(true);
        mDocumentView.getSettings().setDomStorageEnabled(true);
        mDocumentView.getSettings().setLoadWithOverviewMode(true);
        mDocumentView.getSettings().setUseWideViewPort(true);
        mDocumentView.getSettings().setAllowFileAccess(true);
        mDocumentView.getSettings().setAllowContentAccess(true);
        mDocumentView.getSettings().setAllowFileAccessFromFileURLs(true);
        mDocumentView.getSettings().setAllowUniversalAccessFromFileURLs(true);
        mDocumentView.getSettings().setSupportMultipleWindows(true);
        mDocumentView.getSettings().setDomStorageEnabled(true);
        mDocumentView.getSettings().setDatabaseEnabled(true);
        mDocumentView.setWebContentsDebuggingEnabled(true);
        mDocumentView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        mDocumentView.getSettings().setSupportZoom(true);
        mDocumentView.getSettings().setBuiltInZoomControls(true);
        mDocumentView.getSettings().setDisplayZoomControls(false);
        mDocumentView.setVerticalScrollBarEnabled(true);
        mDocumentView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        mDocumentView.getSettings().setLoadWithOverviewMode(true);
        mDocumentView.getSettings().setUseWideViewPort(true);
        mDocumentView.setHorizontalScrollBarEnabled(false);
        String html = "<p><iframe src=\"https://player.vimeo.com/video/508414730\" width=\"100%\" height=\"100%\" frameborder=\"0\" allow=\"autoplay; fullscreen\" allowfullscreen=\"\"></iframe></p>";
        //mDocumentView.loadData(html, "text/html", null);
        mDocumentView.loadDataWithBaseURL("", html , "text/html",  "UTF-8", "");

    }
}