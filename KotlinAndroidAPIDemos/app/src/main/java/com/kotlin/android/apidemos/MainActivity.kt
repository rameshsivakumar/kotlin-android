package com.kotlin.android.apidemos

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

/**
 * @author Ramesh Siva Kumar
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv_androidFeatureList.setHasFixedSize(true)
        rv_androidFeatureList.layoutManager = LinearLayoutManager(this)
        rv_androidFeatureList.adapter = FeatureListAdapter(getFeatureList())
    }
}
