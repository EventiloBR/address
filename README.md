# EventiloBR · Address

🎉 Bem-vindo ao repositório **Address**, um dos serviços que compõem o ecossistema **EventiloBR** — uma plataforma pensada para facilitar a organização de eventos sociais, culturais e corporativos.

---

## 🚀 Sobre o Projeto

Este projeto tem como objetivo:

- ✅ Cadastrar endereços de usuários e empresas
- ✅ Gerenciar endereços de forma eficiente
- ✅ Integrar com outros serviços do EventiloBR

---

## 🛠️ Tecnologias Utilizadas

- Java 21+
- Spring Boot
- Gradle
- PostgresSQL
- Flyway
- Docker

---

## 📦 Como executar o projeto localmente

> Requisitos:
- Java 17+
- Gradle (ou use o `gradlew`)
- Docker (se o projeto incluir serviços externos)

```bash
# Clone o repositório
git clone https://github.com/EventiloBR/[nome-do-repositorio].git

# Acesse a pasta do projeto
cd [nome-do-repositorio]

# Execute o projeto
./gradlew bootRun
```

> Para rodar com Docker (caso exista um docker-compose.yml):

```bash
docker-compose up --build
```

---

## 🧱 Estrutura do Projeto

````bash
src/
├── main/
│ ├── java/
│ │ └── com/eventilobr/address/
│ │ │ ├── application/
│ │ │ │ ├── address/ # UseCases de Address
│ │ │ │ ├── city/ # UseCases de City
│ │ │ │ ├── neighborhood/ # UseCases de Neighborhood
│ │ │ │ └── state/ # UseCases de State
│ │ │ ├── domain/
│ │ │ │ ├── entity/ # Entidades do domínio
│ │ │ │ └── exception/ # Exceções personalizadas
│ │ │ ├── infrastructure/
│ │ │ │ ├── controller/
│ │ │ │ │ ├── impl/ # Implementações dos controllers
│ │ │ │ │ ├── request/ # DTOs de entrada
│ │ │ │ │ ├── response/ # DTOs de saída
│ │ │ │ │ └── AddressController.java
│ │ │ │ ├── repository/ # Interfaces para persistência
│ │ │ │ ├── security/ # Configurações de segurança
│ │ │ │ ├── service/ 
│ │ │ │ │ ├── impl/ # Implementação das services
│ │ │ │ │ └── AddressService.java
│ │ └── AddressApplication.java
│ └── resources/ # Arquivos de configuração (application.yml, etc.)
└── test/ # Testes automatizados   
````

---

## 📄 Licença
Este projeto está licenciado sob a MIT License.

## 📬 Contato
GitHub: [EventiloBR](https://github.com/EventiloBR)
