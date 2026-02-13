# VitalCheck App

## 📱 Visão Geral
O VitalCheck é um diário de saúde inteligente que permite registrar sintomas e acompanhar dados vitais simulados (frequência cardíaca e passos).

---

## 🏗️ Decisões Arquiteturais
- **MVVM**: escolhido pela simplicidade e integração com Android Jetpack.
- Separação em camadas:
    - `ui/` → telas e interação com usuário.
    - `viewmodel/` → lógica de apresentação.
    - `data/` → persistência com Room e mock de sensores.
    - `domain/` → modelos de negócio.

---

## 📚 Dependências
- **Room**: persistência local de sintomas.
- **Coroutines + Flow**: para operações assíncronas e streaming de dados vitais.
- **Lifecycle ViewModel**: gerenciamento de estado da UI.

---

## ⚙️ Instruções de Execução
1. Clone o repositório:
   ```bash
   git clone https://github.com/ansdiogo2/vitalcheck-app.git
