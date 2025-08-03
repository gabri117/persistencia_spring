package com.bdcafe.bdcafe.service;

import com.bdcafe.bdcafe.dto.CategoriaDTO;

import java.util.List;

public interface CategoriaService {
    CategoriaDTO createCategoria(CategoriaDTO categoriaDTO);
    CategoriaDTO getCategoriaById(Integer id);
    List<CategoriaDTO> getAllCategorias();
    CategoriaDTO updateCategoria(Integer id, CategoriaDTO categoriaDTO);
    void deleteCategoria(Integer id);
}
