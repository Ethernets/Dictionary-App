package com.example.dictionaryapp.feature_dictionary.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.dictionaryapp.feature_dictionary.data.local.entity.WordInfoEntity

@Dao
interface WordInfoDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertWordInfos(wordInfos: List<WordInfoEntity>)

    @Query("DELETE FROM word_info WHERE word in (:words)")
    suspend fun deleteWordInfos(words: List<String>)

    @Query("SELECT * FROM word_info WHERE word LIKE '%' || :word || '%'")
    suspend fun getWordInfos(word: String): List<WordInfoEntity>
}