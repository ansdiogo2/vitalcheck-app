# vitalcheck-app

MOC test ao VITAL CHECK


## 📱 Visão Geral
O **VitalCheck** é um diário de saúde inteligente que permite:
- Registrar sintomas manualmente.
- Acompanhar dados vitais simulados (frequência cardíaca e passos).
- Consultar histórico de sintomas salvos localmente.

Este projeto foi desenvolvido como um **MVP em Kotlin/Android**, utilizando arquitetura **MVVM** e bibliotecas do Android Jetpack.

---

## 🏗️ Arquitetura
- **MVVM (Model-View-ViewModel)**: separação clara entre UI, lógica de apresentação e dados.
- **Camadas**:
    - `ui/` → telas (Activities ou Compose Screens).
    - `viewmodel/` → lógica de apresentação (DashboardViewModel).
    - `data/` → persistência com Room (DAO, Database, Repository).
    - `domain/` → modelos (`SymptomEntry`, `VitalSigns`).

---

## 📚 Dependências
- **Room**: persistência local de sintomas.
- **Coroutines + Flow**: operações assíncronas e streaming de dados vitais.
- **Lifecycle ViewModel**: gerenciamento de estado da UI.
- **Kotlin**: linguagem principal.

---

## ⚙️ Instruções de Execução
1. Clone o repositório:
   ```bash
   git clone https://github.com/ansdiogo2/vitalcheck-app.git
