package io.github.agamenonjunior.montadora.todos;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_todo")
public class TodoEntity {

    private  Integer id;

    private String descricao;

    private  Boolean concluido;

}
