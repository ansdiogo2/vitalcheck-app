package br.com.emmanaus.vitalcheckapp.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [SymptomEntry::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun symptomDao(): SymptomDao
}
