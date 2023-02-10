package com.example.moviereviewapp.extension

fun Int.toAbbreviatedString(): String = when (this) {
    in 0..1_000 -> {
        this.toString()
    }

    in 1_000..1_000_000 -> {
        "${(this / 1_000F).toDecimalFormatString("#.#")}K"
    }

    else -> {
        "${(this / 1_000_000F).toDecimalFormatString("#.#")}M"
    }
}