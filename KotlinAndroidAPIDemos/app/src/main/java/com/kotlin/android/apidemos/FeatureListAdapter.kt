package com.kotlin.android.apidemos

import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_feature_detail.view.*
import kotlinx.android.synthetic.main.feature_list_item.view.*

/**
 * @author Ramesh Siva Kumar
 */
class FeatureListAdapter(val features: List<Feature>) : RecyclerView.Adapter<FeatureListAdapter.FeatureListViewHolder>() {
    var onItemClick: ((Feature) -> Unit)? = null

    companion object {
        private val TAG = "FeatureListAdapter"
    }

    inner class FeatureListViewHolder(val card: View) : RecyclerView.ViewHolder(card) {
        init {
            card.setOnClickListener {
                onItemClick?.invoke(features[adapterPosition])
            }
        }
    }

    // Specifies the contents for the shown habit
    override fun onBindViewHolder(holder: FeatureListViewHolder?, index: Int) {
        if (holder != null) {
            val feature = features[index]
            holder.card.tv_feature_title.text = feature.title
            holder.card.tv_feature_description.text = feature.description

         }
    }

    // Create a new ViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FeatureListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.feature_list_item, parent, false)

        return FeatureListViewHolder(view)
    }

    override fun getItemCount() = features.size

}