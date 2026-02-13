package br.com.emmanaus.vitalcheckapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

class DashboardViewModel(
    private val repository: HealthRepository
) : ViewModel() {

    // Fluxo de sinais vitais
    val vitalSignsFlow: Flow<VitalSigns> = repository.getVitalSignsStream()

    // Histórico de sintomas
    val symptomsFlow: Flow<List<SymptomEntry>> = repository.getAllSymptoms()

    // Função para salvar sintoma
    fun saveSymptom(description: String) {
        viewModelScope.launch {
            repository.insertSymptom(SymptomEntry(description = description))
        }
    }
}
