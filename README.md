<h2>
  Projeto DSList - Java Spring
</h2>

## Sobre o Projeto

O **DSList** é uma aplicação desenvolvida como parte do curso *__Intensivão Java Spring__* oferecido pela [DevSuperior](https://devsuperior.com.br) e ministrado pelo professor Nélio Alves. O projeto foi desenvolvido durante uma semana intensiva e tem como objetivo criar uma API REST para gerenciamento de listas de games, utilizando boas práticas e tecnologias modernas.

O sistema permite:
- Listar todos os games cadastrados.
- Listar games por categorias (listas).
- Alterar a posição dos games em uma lista específica.

## Tecnologias Utilizadas

Este projeto foi construído utilizando as seguintes tecnologias e ferramentas:

- **Java 21** (versão mais recente LTS).
- **Spring Boot** (para simplificar a criação de APIs REST).
- **JPA / Hibernate** (para mapeamento objeto-relacional e persistência de dados).
- **Maven** (para gerenciamento de dependências e build do projeto).
- **Postman** (para teste de requisições).

## Diagrama de Classes
A estrutura do projeto segue o seguinte modelo de classes:

![Diagrama de Classes](https://github.com/MatheusPrudente/dslist/assets/80559882/8874bb22-4ac1-4ee0-a148-45ec73fef224)

## :bookmark_tabs: Documentação da API

### URL Base

```https
http://localhost:8080/h2-console
```

#### Obter Listagem dos Games Cadastrados

```https
  GET /games
```

#### Buscar Listagem dos Games Cadastrados Pelo Id

```https
  GET /games/{id}
```

| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `id` | `Long` | **Obrigatório**. Id do Game |


#### Obter Listagem das Listas de Games Cadastrados

```https
  GET /lists
```


#### Buscar Listagem das Listas de Games Cadastrados Pelo Id da Lista

```https
  GET /lists/{id}/games
```

| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `id` | `Long` | **Obrigatório**. Id da Lista de Game |


#### Mudar a posição do Game dentro de uma Lista de Game

```https
  POST /lists/{id}/replacement
```

| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `id` | `Long` | **Obrigatório**. Id da Lista de Game |
| `body` | `ReplacementDTO` | **Obrigatório**. Informações da posição de origem e posição destino |
