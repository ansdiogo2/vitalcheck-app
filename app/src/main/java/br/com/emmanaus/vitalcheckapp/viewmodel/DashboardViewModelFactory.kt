package br.com.emmanaus.vitalcheckapp.viewmodel

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.room.Room

class DashboardViewModelFactory(private val context: Context) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        val db = Room.databaseBuilder(
            context.applicationContext,
            AppDatabase::class.java,
            "vitalcheck-db"
        ).build()
        val repository = HealthRepository(db.symptomDao())
        return DashboardViewModel(repository) as T
    }
}
