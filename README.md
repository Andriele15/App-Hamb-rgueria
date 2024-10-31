# **APP SIRI CASCUDO**

> Um aplicativo Android simples para simular um app de uma hamburgueria.

## 📱 Descrição

O **APP SIRI CASCUDO** permite ao usuário se cadastrar e explorar um menu de uma hamburgueria fictícia inspirada na animação do Bob Esponja. O App também apresenta funções com um banco de dados, validações de dados e
e buttons funcionais.

## 🔧 Funcionalidades

- [x] Entrada de dados (nome, telefone, email e senha)
- [x] Banco de dados para salvar os usuários
- [x] Interface simples e intuitiva

## 🚀 Tecnologias Utilizadas

- [x] **Android Studio** (Koala | 2024.1.2)
- [x] **Java** para desenvolvimento
- [x] **ConstraintLayout** para interface responsiva
- [x] **TextView** e **EditText** para entrada e exibição de dados
- [x] **Button**   para executar o app.
- [x] **LinearLayout**   para a responsividade.
- [ ] **ScrollView**   para a responsividade.

## 🛠️ Como Rodar o Projeto

Siga os passos abaixo para rodar o projeto localmente:

1. Clone este repositório:

    ```bash
    git clone https://github.com/Andriele15/App-Hamburgueria.git

    ```

2. Abra o projeto no Android Studio.
3. Compile e execute o projeto em um emulador ou dispositivo físico.

## 📂 Estrutura do Projeto

```bash
├── app
│ ├── src
│ │ ├── main
│ │ │ ├── java/br/ulbra/myapplication
│ │ │ │ ├── MainActivity.java # Atividade principal
│ │ │ │ ├── CadastroActivity.java # Atividade para a tela de cadastro
│ │ │ │ ├── CatalogoActivity.java # Atividade para tela de catálogo
│ │ │ │ ├── DBHelper.java # Atividade para o banco
│ │ │ ├── res
│ │ │ │ ├── layout
│ │ │ │ │ ├── activity_main.xml # Layout da tela principal
│ │ │ │ │ ├── activity_cadastro.xml # Layout da tela de cadastro
│ │ │ │ │ ├── activity_catalogo.xml # Layout da tela da tela de catálogo
│ │ │ │ └── values
│ │ │ │ ├── strings.xml # Strings usadas no app
│ │ │ │ ├── colors.xml # Cores definidas no projeto
│ └── build.gradle # Configuração do Gradle
└── README.md # Este arquivo
```
 
## 🎨 Design e Prototipagem
 
A interface do app foi criada usando **ConstraintLayout** para manter a responsividade em diferentes tamanhos de tela.
 
O design é minimalista e fácil de usar, com foco na simplicidade.
 
 ## 🖥️ Telas do Aplicativo

1. **Tela Principal**
 
Na tela principal, o usuário insere seu o login, para entrar no catálogo de menu, se ele não tiver um cadstro poderá fazer um.
 
![login](https://github.com/user-attachments/assets/2a3715b3-53a9-4fb3-859d-2e416cfbe1ca)

2. **Tela De Cadastro**
 
Na tela de cadastro, o usuário insere informações como nome, telefone, email e uma senha, para cadastrar é apenas apertar o botão que você será mandado para tela de catálogo do menu.

![cadastro](https://github.com/user-attachments/assets/34a4c52c-222f-4954-8fb8-90f57705447e)

3. **Tela De Catálogo**
 
Na tela de catálogo, o usuário poderá ver as opções do catálogo que estão em dispostas em um LinearLayout(horizontal).

![menu](https://github.com/user-attachments/assets/9393ba9d-094a-4558-a2ca-ccfe2600cfe0)

E por fim poderá fazer o pedido via Whatssap, apertando o bottão.

![menu2](https://github.com/user-attachments/assets/a5610da9-56bb-4665-aafc-9fa137fb8459)

## 👨‍💻 Desenvolvedores –

**Andriele Pacheco** - Desenvolvedor - [GitHub](https://github.com/Andriele15)
 
 ## 📄 Licença
 
Este projeto está licenciado sob os termos da licença MIT. 
Para mais
detalhes, veja o arquivo [LICENSE](LICENSE).
