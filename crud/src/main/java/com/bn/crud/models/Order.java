package com.bn.crud.models;

import jakarta.persistence.*;

// Define que esta classe será mapeada como uma entidade do JPA (vai virar uma tabela no BD)
@Entity
// Nome da tabela no banco de dados que será criada ou usada
@Table(name = "TBL_ORDER")
public class Order {

    // Identificador único da entidade (chave primária)
    @Id
    // Define que o ID será gerado automaticamente pelo banco (auto-incremento)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Colunas simples da tabela
    private String address;
    private Double latitude;
    private Double longitude;

    // Construtor vazio (obrigatório pelo JPA)
    public Order(){
    }

    // Getters e Setters: permitem acessar e modificar os atributos de forma controlada
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

}
