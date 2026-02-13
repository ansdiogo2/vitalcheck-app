package br.com.emmanaus.vitalcheckapp.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.viewModels
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class DashboardActivity : ComponentActivity() {

    private val viewModel: DashboardViewModel by viewModels {
        DashboardViewModelFactory(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val tvHeartRate = findViewById<TextView>(R.id.tvHeartRate)
        val tvSteps = findViewById<TextView>(R.id.tvSteps)
        val etSymptom = findViewById<EditText>(R.id.etSymptom)
        val btnSave = findViewById<Button>(R.id.btnSaveSymptom)

        // Coletar dados vitais
        lifecycleScope.launch {
            viewModel.vitalSignsFlow.collectLatest { vitals ->
                tvHeartRate.text = "Heart Rate: ${vitals.heartRate}"
                tvSteps.text = "Steps: ${vitals.steps}"
            }
        }

        // Salvar sintoma
        btnSave.setOnClickListener {
            val description = etSymptom.text.toString()
            if (description.isNotBlank()) {
                viewModel.saveSymptom(description)
                etSymptom.text.clear()
            }
        }
    }
}
