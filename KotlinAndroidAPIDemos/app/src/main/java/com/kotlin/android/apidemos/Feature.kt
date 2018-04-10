package com.kotlin.android.apidemos

import android.content.Context

/**
 * @author Ramesh Siva Kumar
 */
data class Feature(val title: String, val description: String)

fun getFeatureList(context: Context): List<Feature> {
    return listOf(
                Feature( context.getString(R.string.ui_widgets),
                        context.getString(R.string.ui_widgets_desc)),
                Feature(context.getString(R.string.multi_threading),
                        context.getString(R.string.multi_threading_desc)
                        ),
                Feature(context.getString(R.string.data_storage),
                        context.getString(R.string.data_storage_desc)
                        ),
                Feature(context.getString(R.string.http_networking),
                        context.getString(R.string.http_networking_desc)
                        ),
                Feature(context.getString(R.string.app_components),
                        context.getString(R.string.app_components_desc)
                        ),
                Feature(context.getString(R.string.material_design),
                        context.getString(R.string.material_design_desc)
                        )
    )
}
