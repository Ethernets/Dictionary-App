package com.example.dictionaryapp.feature_dictionary.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.dictionaryapp.feature_dictionary.domain.model.Meaning
import com.example.dictionaryapp.feature_dictionary.domain.model.WordInfo

@Entity(tableName = "word_info")
data class WordInfoEntity(
    val meanings: List<Meaning>,
    val phonetic: String,
    val word: String,
    @PrimaryKey val id: Int? = null
){
    fun toWordInfo() = WordInfo(
        meanings = meanings,
        phonetic = phonetic,
        word = word
    )
}