package com.kotlin.android.apidemos

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_feature_detail.*

class FeatureDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature_detail)

        intent?.let {
            tv_title.text = intent.getStringExtra("view")
        }
    }
}
