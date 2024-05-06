package com.devsuperior.demo.entities;

public class Product {
    private long id;
    private String name;
    private Double price;

    private Department department;

    public Product(){
        //TODO: criamos um contrutor sem argumentos :anotar isso no github

    }

    public Product(long id, String name, Double price, Department department) {
        //TODO: (Anotar): Ele recebe os dados da classe na linha de cima aqui, e copia para
        // os atributos da classe .



        this.id = id;
        this.name = name;
        this.price = price;
        this.department = department;
        //TODO: (anotar): Tudo o que tem 'this' ele está priorizando o atributo do objeto, se não tiver
        // ele está acessando o argumento que chegou no metodo.
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
