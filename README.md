## 📌 Resumo das partes essenciais da Entidade Order

- **`@Entity`**  
  → Transforma a classe em uma **entidade JPA** que será persistida no banco de dados.  

- **`@Table(name = "TBL_ORDER")`**  
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


## 🗂️ OrderRepository

```java
package com.bn.crud.repositories;

import com.bn.crud.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}

## 🔎 Explicação das partes essenciais

### `public interface OrderRepository`
- Define um **repositório** para a entidade `Order`.  
- É uma **interface**, não uma classe concreta.  

### `extends JpaRepository<Order, Long>`
- `JpaRepository` é uma **interface genérica** do Spring Data JPA.  
- **`Order`** → entidade que será manipulada.  
- **`Long`** → tipo da chave primária (ID).  
- Fornece métodos prontos de **CRUD**:
  - `findAll()` → buscar todos  
  - `findById()` → buscar por ID  
  - `save()` → salvar ou atualizar  
  - `deleteById()` → deletar por ID  

### 🧬 Herança
- O `OrderRepository` **herda** os métodos da interface `JpaRepository`.  

### 🌀 Abstração
- Não há implementação explícita.  
- O **Spring Data JPA** gera a implementação em tempo de execução (**proxy dinâmico**).  
