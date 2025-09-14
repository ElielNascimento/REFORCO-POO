# 🛒 CRUD de Pedidos (`Order`) - Spring Boot

![Spring Boot](https://img.shields.io/badge/Spring%20Boot-v3.2.0-green?logo=springboot)
![Java](https://img.shields.io/badge/Java-17-orange?logo=java)
![License](https://img.shields.io/badge/License-MIT-blue)

Este projeto é um **CRUD completo** de pedidos (`Order`) utilizando **Spring Boot**, seguindo boas práticas de arquitetura em camadas: **Entity → Repository → Service → Controller**.

---

## 📌 1️⃣ Entidade `Order`

- **`@Entity`**  
  → Transforma a classe em uma **entidade JPA** que será persistida no banco de dados.

- **`@Table(name = "TBL_ORDER")`** *(opcional)*  
  → Define o **nome da tabela** no banco (`TBL_ORDER`).

- **`@Id`**  
  → Identifica o atributo que será a **chave primária** da tabela.

- **`@GeneratedValue(strategy = GenerationType.IDENTITY)`**  
  → Define que o **ID será gerado automaticamente** pelo banco (auto-incremento).

- **Atributos (`address`, `latitude`, `longitude`)**  
  → Representam as **colunas** da tabela.

- **Construtor vazio**  
  → Obrigatório para o **JPA instanciar** a classe corretamente.

- **Getters e Setters**  
  → Encapsulam os atributos, garantindo **boas práticas de orientação a objetos**.

---

## 📌 2️⃣ Repository `OrderRepository`

- **Extende `JpaRepository<Order, Long>`**  
  → Herda métodos prontos como `findAll()`, `findById()`, `save()`, `deleteById()`.

- **`@Repository`** *(opcional)*  
  → Marca a interface como um **componente de persistência**, permitindo que o Spring injete onde necessário.

- **Não precisa implementar métodos manualmente**  
  → O Spring Data JPA gera a implementação automaticamente.

---

## 📌 3️⃣ Service `OrderService`

- **`@Service`**  
  → Define a classe como **serviço de negócio**, separando lógica do Controller.

- **Injeção do Repository (`@Autowired`)**  
  → Permite que o Service acesse o banco de dados através do Repository.

- **Método `listar()`**  
  → Retorna todos os pedidos (`findAll()` do repository).

- **Método `buscarPorId(Long id)`**  
  → Busca um pedido pelo ID, lança **RuntimeException** se não encontrado.

- **Método `criarOrder(Order order)`**  
  → Salva um novo pedido no banco (`save()`).

- **Método `atualizarOrder(Long id, Order orderAtualizado)`**  
  → Atualiza os atributos de um pedido existente e salva no banco.

- **Método `deletarOrder(Long id)`**  
  → Deleta o pedido existente pelo ID.

- **Boas práticas**  
  → Toda a lógica de validação e exceções fica centralizada no Service.

---

## 📌 4️⃣ Controller `OrderController`

- **`@RestController`**  
  → Define a classe como **endpoint REST**, retornando JSON.

- **`@RequestMapping("/orders")`**  
  → Define o **endpoint base** para todos os métodos do Controller.

- **Injeção do Service (`@Autowired`)**  
  → Permite que o Controller utilize os métodos do Service.

### Endpoints CRUD

| Método | Endpoint           | Descrição                 |
|--------|------------------|---------------------------|
| GET    | /orders           | Lista todos os pedidos    |
| GET    | /orders/{id}      | Busca pedido por ID       |
| POST   | /orders           | Cria um novo pedido       |
| PUT    | /orders/{id}      | Atualiza pedido existente |
| DELETE | /orders/{id}      | Deleta pedido             |

- **Exemplo de JSON para criar ou atualizar um pedido:**

```json
{
  "address": "Rua das Flores, 123",
  "latitude": -23.550520,
  "longitude": -46.633308
}
