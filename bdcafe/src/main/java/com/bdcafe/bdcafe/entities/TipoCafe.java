package com.bdcafe.bdcafe.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tipo_cafe")
@Getter
@Setter
@AllArgsConstructor
public class TipoCafe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_cafe")
    private Integer idTipoCafe;

    @Column(name = "nombre_tipo_cafe", nullable = false, length = 100)
    private String nombreTipoCafe;
}
