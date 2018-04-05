package com.kotlin.android.apidemos

/**
 * @author Ramesh Siva Kumar
 */
data class Feature(val title: String, val description: String)

fun getFeatureList(): List<Feature> {
    return listOf(
                Feature("UIWidgets",
                        "UI Widgets/Controls demo using Kotlin"),
                Feature("MultiThreading",
                        "MultiThreading demo using Kotlin"
                        ),
                Feature("Data Storage",
                        "Data Storage demo using Kotlin"
                        ),
                Feature("Http Networking",
                        "Http Networking demo using Kotlin"
                        ),
                Feature("Application Components",
                        "Application Components demo using Kotlin"
                        ),
                Feature("Material Design",
                        "Material Design demo using Kotlin"
                        )
    )
}
