package com.kotlin.android.apidemos

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

/**
 * @author Ramesh Siva Kumar
 */
class FeatureListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv_androidFeatureList.setHasFixedSize(true)
        rv_androidFeatureList.layoutManager = LinearLayoutManager(this)
        val featureListAdapter =  FeatureListAdapter(getFeatureList(this))
        rv_androidFeatureList.adapter = featureListAdapter

        featureListAdapter.onItemClick = {feature->
            val intent = Intent(this, FeatureDetailActivity::class.java)
            intent.putExtra("view", feature.title)
            startActivity(intent)
        }
    }
}
