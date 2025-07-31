CREATE TABLE categoria (
    id_categoria SERIAL PRIMARY KEY,
    nombre_categoria VARCHAR(100) NOT NULL
);

CREATE TABLE tipo_cafe (
    id_tipo_cafe SERIAL PRIMARY KEY,
    nombre_tipo_cafe VARCHAR(100) NOT NULL
);

CREATE TABLE presentacion_producto (
    sku VARCHAR(50) PRIMARY KEY,
    id_tipo_cafe INT NOT NULL,
    id_categoria INT NOT NULL,
    descripcion_presentacion VARCHAR(150) NOT NULL,
    precio_actual DECIMAL(10,2) NOT NULL,
    cantidad_inventario INT NOT NULL,
    FOREIGN KEY (id_tipo_cafe) REFERENCES tipo_cafe(id_tipo_cafe),
    FOREIGN KEY (id_categoria) REFERENCES categoria(id_categoria)
);

CREATE TABLE cliente (
    id_cliente SERIAL PRIMARY KEY,
    nombre_completo VARCHAR(100) NOT NULL,
    correo_electronico VARCHAR(100) UNIQUE NOT NULL,
    direccion_envio TEXT NOT NULL
);

CREATE TABLE pedido (
    numero_orden SERIAL PRIMARY KEY,
    id_cliente INT NOT NULL,
    fecha TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    estado VARCHAR(50) NOT NULL,
    FOREIGN KEY (id_cliente) REFERENCES cliente(id_cliente)
);

CREATE TABLE detalle_pedido (
    id_detalle SERIAL PRIMARY KEY,
    numero_orden INT NOT NULL,
    sku VARCHAR(50) NOT NULL,
    cantidad INT NOT NULL,
    precio_vendido DECIMAL(10,2) NOT NULL,
    FOREIGN KEY (numero_orden) REFERENCES pedido(numero_orden),
    FOREIGN KEY (sku) REFERENCES presentacion_producto(sku)
);
