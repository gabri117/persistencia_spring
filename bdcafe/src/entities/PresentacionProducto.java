package com.coderland.core.mth.common.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "presentacion_producto")
@Getter
@Setter
@AllArgsConstructor
public class PresentacionProducto {

    @Id
    @Column(name = "sku", nullable = false, length = 50)
    private String sku;

    @ManyToOne
    @JoinColumn(name = "id_tipo_cafe", nullable = false)
    private TipoCafe tipoCafe;

    @ManyToOne
    @JoinColumn(name = "id_categoria", nullable = false)
    private Categoria categoria;

    @Column(name = "descripcion_presentacion", nullable = false, length = 150)
    private String descripcionPresentacion;

    @Column(name = "precio_actual", nullable = false)
    private Double precioActual;

    @Column(name = "cantidad_inventario", nullable = false)
    private Integer cantidadInventario;
}
