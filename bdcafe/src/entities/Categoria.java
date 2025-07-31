package com.coderland.core.mth.common.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "categoria")
@Getter
@Setter
@AllArgsConstructor
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Integer idCategoria;

    @Column(name = "nombre_categoria", nullable = false, length = 100)
    private String nombreCategoria;
}
