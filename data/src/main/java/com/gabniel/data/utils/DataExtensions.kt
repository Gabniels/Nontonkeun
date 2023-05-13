package com.gabniel.data.utils

fun String?.replaceIfNull(replacementValue: String = ""): String {
    if (this == null)
        return replacementValue
    return this
}

fun Int?.replaceIfNull(replacementValue: Int = 0): Int {
    if (this == null)
        return replacementValue
    return this
}