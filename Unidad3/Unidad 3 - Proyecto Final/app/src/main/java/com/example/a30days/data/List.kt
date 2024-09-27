
package com.example.a30days.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.a30days.R


data class List(
    @DrawableRes val imageResourceId: Int,
    @StringRes val title: Int,
    @StringRes val description: Int,
    @StringRes val day: Int
)

val list = listOf(
    List(R.drawable.a1, R.string.title1, R.string.description1, R.string.day1),
    List(R.drawable.a2, R.string.title2, R.string.description2, R.string.day2),
    List(R.drawable.a3, R.string.title3, R.string.description3, R.string.day3),
    List(R.drawable.a4, R.string.title4, R.string.description4, R.string.day4),
    List(R.drawable.a5, R.string.title5, R.string.description5, R.string.day5),
    List(R.drawable.a6, R.string.title6, R.string.description6, R.string.day6),
    List(R.drawable.a7, R.string.title7, R.string.description7, R.string.day7),
    List(R.drawable.a8, R.string.title8, R.string.description8, R.string.day8),
    List(R.drawable.a9, R.string.title9, R.string.description9, R.string.day9),
    List(R.drawable.a10, R.string.title10, R.string.description10, R.string.day10),
    List(R.drawable.a11, R.string.title11, R.string.description11, R.string.day11),
    List(R.drawable.a12, R.string.title12, R.string.description12, R.string.day12),
    List(R.drawable.a13, R.string.title13, R.string.description13, R.string.day13),
    List(R.drawable.a14, R.string.title14, R.string.description14, R.string.day14),
    List(R.drawable.a15, R.string.title15, R.string.description15, R.string.day15),
    List(R.drawable.a16, R.string.title16, R.string.description16, R.string.day16),
    List(R.drawable.a17, R.string.title17, R.string.description17, R.string.day17),
    List(R.drawable.a18, R.string.title18, R.string.description18, R.string.day18),
    List(R.drawable.a19, R.string.title19, R.string.description19, R.string.day19),
    List(R.drawable.a20, R.string.title20, R.string.description20, R.string.day20),
    List(R.drawable.a21, R.string.title21, R.string.description21, R.string.day21),
    List(R.drawable.a22, R.string.title22, R.string.description22, R.string.day22),
    List(R.drawable.a23, R.string.title23, R.string.description23, R.string.day23),
    List(R.drawable.a24, R.string.title24, R.string.description24, R.string.day24),
    List(R.drawable.a25, R.string.title25, R.string.description25, R.string.day25),
    List(R.drawable.a26, R.string.title26, R.string.description26, R.string.day26),
    List(R.drawable.a27, R.string.title27, R.string.description27, R.string.day27),
    List(R.drawable.a28, R.string.title28, R.string.description28, R.string.day28),
    List(R.drawable.a29, R.string.title29, R.string.description29, R.string.day29),
    List(R.drawable.a30, R.string.title30, R.string.description30, R.string.day30)
)
