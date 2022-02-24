package com.example.view.recyclerviewkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rv_profile: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val profileList = arrayListOf(
            Profiles(R.drawable.man, "홍드로이드",27,"안드로이드 앱 개발자"),
            Profiles(R.drawable.man, "안드로이드",27,"아이폰 앱 개발자"),
            Profiles(R.drawable.man, "길드로이드",27,"리펙트 앱 개발자"),
            Profiles(R.drawable.man, "이드로이드",27,"플러터 앱 개발자"),
            Profiles(R.drawable.man, "몬드로이드",27,"유니티 앱 개발자"),
            Profiles(R.drawable.man, "민드로이드",27,"웹 앱 개발자"),
        )

        rv_profile=findViewById(R.id.rv_profile)
        rv_profile.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        rv_profile.setHasFixedSize(true)


        rv_profile.adapter = ProfileAdapter(profileList)


    }
}