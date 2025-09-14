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
