# VitalCheck App

MOC test ao VITAL CHECK

## 📱 Visão Geral
O **VitalCheck** é um diário de saúde inteligente que permite:
- Registrar sintomas manualmente.
- Acompanhar dados vitais simulados (frequência cardíaca e passos).
- Consultar histórico de sintomas salvos localmente.

Este projeto foi desenvolvido como um **MVP em Kotlin/Android**, utilizando arquitetura **MVVM** e bibliotecas do Android Jetpack.

---

## 🏗️ Decisões Arquiteturais
Optei pela arquitetura **MVVM** por oferecer separação clara de responsabilidades entre UI, lógica de apresentação e dados. Essa escolha facilita manutenção, testes e escalabilidade, além de ser um padrão amplamente adotado em projetos Android modernos.

---

## 🎯 Visão de Produto
O VitalCheck foi concebido como um diário de saúde inteligente.  
Evoluções futuras incluem:
- Exibição do histórico de sintomas diretamente na interface.
- Suporte à internacionalização via `strings.xml`.
- Gráficos interativos para acompanhar tendências de frequência cardíaca e passos ao longo do tempo.

---

## 📚 Gestão de Dependências
As principais bibliotecas utilizadas foram:
- **Room**: persistência local de sintomas.
- **Coroutines + Flow**: operações assíncronas e reatividade.
- **Lifecycle ViewModel**: gerenciamento de estado da UI.
- **Kotlin**: linguagem principal.

Cada escolha foi feita para garantir simplicidade, robustez e alinhamento com boas práticas do ecossistema Android.

---

## ⚙️ Instruções de Execução
1. Clone o repositório:
   ```bash
   git clone https://github.com/ansdiogo2/vitalcheck-app.git

2. Abra no Android Studio (API mínima 26).

3. Compile e rode em um emulador ou dispositivo Android.

4. Não há necessidade de chave de API, pois os dados vitais são simulados localmente.


## 📂 Organização de Pastas


ui/ → telas (Activities ou Compose Screens).

viewmodel/ → lógica de apresentação (DashboardViewModel).

data/ → persistência com Room (DAO, Database, Repository).

domain/ → modelos (SymptomEntry, VitalSigns).


## 🌱 Uso Ético de IA


Agentes de IA foram utilizados apenas para acelerar tarefas repetitivas e geração de boilerplate.
Todo o código foi revisado manualmente, garantindo clareza, segurança e responsabilidade.
O uso de IA foi feito de forma ética, sem comprometer a autoria ou a qualidade técnica.


## 🚀 Trabalhos Futuros


Implementar lista de sintomas na UI (RecyclerView ou Compose LazyColumn).

Internacionalização completa via strings.xml.

Testes unitários e instrumentados para DAO e fluxo de dados.

Injeção de dependência com Hilt.

Visualização gráfica dos dados vitais (gráficos interativos).

Integração futura com sensores reais ou APIs de saúde.


