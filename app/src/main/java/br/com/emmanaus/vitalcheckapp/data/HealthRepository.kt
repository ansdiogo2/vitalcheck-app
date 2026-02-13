package br.com.emmanaus.vitalcheckapp.data

import kotlinx.coroutines.flow.Flow

class HealthRepository(private val dao: SymptomDao) {

    // Fluxo de sinais vitais simulados
    fun getVitalSignsStream(): Flow<VitalSigns> = getVitalSignsStreamMock()

    // Inserir sintoma no banco
    suspend fun insertSymptom(symptom: SymptomEntry) {
        dao.insertSymptom(symptom)
    }

    // Consultar histórico de sintomas
    fun getAllSymptoms(): Flow<List<SymptomEntry>> {
        return dao.getAllSymptoms()
    }

    // Mock dos sinais vitais
    private fun getVitalSignsStreamMock(): Flow<VitalSigns> = getVitalSignsStream()
}
