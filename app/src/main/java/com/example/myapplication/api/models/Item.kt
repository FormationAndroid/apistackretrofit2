package com.example.myapplication.api.models


import com.example.myapplication.api.models.Owner
import com.google.gson.annotations.SerializedName

data class Item(
    @SerializedName("accepted_answer_id")
    val acceptedAnswerId: Int,
    @SerializedName("answer_count")
    val answerCount: Int,
    @SerializedName("content_license")
    val contentLicense: String,
    @SerializedName("creation_date")
    val creationDate: Int,
    @SerializedName("is_answered")
    val isAnswered: Boolean,
    @SerializedName("last_activity_date")
    val lastActivityDate: Int,
    @SerializedName("last_edit_date")
    val lastEditDate: Int,
    val link: String,
    val owner: Owner,
    @SerializedName("question_id")
    val questionId: Int,
    val score: Int,
    val tags: List<String>,
    val title: String,
    @SerializedName("view_count")
    val viewCount: Int
)