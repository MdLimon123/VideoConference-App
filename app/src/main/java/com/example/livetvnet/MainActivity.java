package com.example.livetvnet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout channel_i, btv,channel_24, atn_news,asian_tv,my_tv,desh_tv,
    duranto_tv,dbc_news,ekattor_tv,jamuna_tv,maasranga_tv,rtv,news_24,mohona_tv,gtv;

    private String url_channel_i="https://rhridoy136.shortcm.li/channeli.m3u8";
    private String url_btv="https://rhridoy136.shortcm.li/btvworld.m3u8";
    private String url_channel_24="https://rhridoy136.shortcm.li/channel24.m3u8";
    private String url_atn_news="https://rhridoy136.shortcm.li/atnnews.m3u8";
    private String url_asian_tv="https://rhridoy136.shortcm.li/asiantv.m3u8";
    private String url_my_tv="https://rhridoy136.shortcm.li/mytv.m3u8";
    private String url_desh_tv="https://rhridoy136.shortcm.li/deshtv.m3u8";
    private String url_duranto_tv="http://ctgiptv.kitv.live:1935/live/ASNet/asnetwork/12.m3u8";
    private String url_dbc_news="https://rhridoy136.shortcm.li/dbcnews.m3u8";
    private String url_ekattor="http://ctgiptv.kitv.live:1935/live/ASNet/asnetwork/11.m3u8";
    private String url_jamuna_tv="https://rhridoy136.shortcm.li/jamunatv.m3u8";
    private String url_maasranga="http://ctgiptv.kitv.live:1935/live/test/test1/1.m3u8";
    private String url_rtv="https://rhridoy136.shortcm.li/rtv.m3u8";
    private String url_news_24="https://rhridoy136.shortcm.li/news24.m3u8";
    private String url_mohona_tv="https://rhridoy136.shortcm.li/mohonatv.m3u8";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        channel_i = findViewById(R.id.channel_i_id);
        channel_24 = findViewById(R.id.channel_24);
        btv = findViewById(R.id.btv);
        atn_news = findViewById(R.id.atn_news);
        asian_tv = findViewById(R.id.asian_tv);
        my_tv = findViewById(R.id.my_tv);
        desh_tv = findViewById(R.id.desh_tv);
        duranto_tv = findViewById(R.id.durnto_tv);
        dbc_news = findViewById(R.id.dbc_news);
        ekattor_tv = findViewById(R.id.ekttor_tv);
        jamuna_tv = findViewById(R.id.jamuna_tv);
        maasranga_tv = findViewById(R.id.maasranga_tv);
        rtv = findViewById(R.id.rtv);
        news_24 = findViewById(R.id.news_24);
        mohona_tv = findViewById(R.id.mohona_tv);
      //  gtv = findViewById(R.id.gtv);



        channel_i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent =new Intent(Intent.ACTION_VIEW, Uri.parse(url_channel_i));
                startActivity(intent);

            }
        });

        btv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent =new Intent(Intent.ACTION_VIEW, Uri.parse(url_btv));
                startActivity(intent);

            }
        });

        channel_24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent =new Intent(Intent.ACTION_VIEW, Uri.parse(url_channel_24));
                startActivity(intent);

            }
        });

        atn_news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent =new Intent(Intent.ACTION_VIEW, Uri.parse(url_atn_news));
                startActivity(intent);
            }
        });

        asian_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent =new Intent(Intent.ACTION_VIEW, Uri.parse(url_asian_tv));
                startActivity(intent);

            }
        });

        my_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent =new Intent(Intent.ACTION_VIEW, Uri.parse(url_my_tv));
                startActivity(intent);

            }
        });

        desh_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent =new Intent(Intent.ACTION_VIEW, Uri.parse(url_desh_tv));
                startActivity(intent);
            }
        });

        duranto_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent =new Intent(Intent.ACTION_VIEW, Uri.parse(url_duranto_tv));
                startActivity(intent);

            }
        });

        dbc_news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent =new Intent(Intent.ACTION_VIEW, Uri.parse(url_dbc_news));
                startActivity(intent);
            }
        });

        ekattor_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent =new Intent(Intent.ACTION_VIEW, Uri.parse(url_ekattor));
                startActivity(intent);

            }
        });

        jamuna_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent =new Intent(Intent.ACTION_VIEW, Uri.parse(url_jamuna_tv));
                startActivity(intent);
            }
        });

        maasranga_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent =new Intent(Intent.ACTION_VIEW, Uri.parse(url_maasranga));
                startActivity(intent);
            }
        });

        rtv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent =new Intent(Intent.ACTION_VIEW, Uri.parse(url_rtv));
                startActivity(intent);
            }
        });

        news_24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent =new Intent(Intent.ACTION_VIEW, Uri.parse(url_news_24));
                startActivity(intent);
            }
        });

        mohona_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent =new Intent(Intent.ACTION_VIEW, Uri.parse(url_mohona_tv));
                startActivity(intent);
            }
        });

    }
}