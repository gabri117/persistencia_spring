package com.bdcafe.bdcafe.service.impl;

import com.bdcafe.bdcafe.dto.CategoriaDTO;
import com.bdcafe.bdcafe.entities.Categoria;
import com.bdcafe.bdcafe.repositories.CategoriaRepository;
import com.bdcafe.bdcafe.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public CategoriaDTO createCategoria(CategoriaDTO categoriaDTO) {
        Categoria categoria = new Categoria();
        categoria.setNombreCategoria(categoriaDTO.getNombreCategoria());
        Categoria saved = categoriaRepository.save(categoria);

        return mapToDTO(saved);
    }

    @Override
    public CategoriaDTO getCategoriaById(Integer id) {
        Categoria categoria = categoriaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Categoría no encontrada con id: " + id));
        return mapToDTO(categoria);
    }

    @Override
    public List<CategoriaDTO> getAllCategorias() {
        return categoriaRepository.findAll()
                .stream()
                .map(this::mapToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public CategoriaDTO updateCategoria(Integer id, CategoriaDTO categoriaDTO) {
        Categoria categoria = categoriaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Categoría no encontrada con id: " + id));
        categoria.setNombreCategoria(categoriaDTO.getNombreCategoria());
        Categoria updated = categoriaRepository.save(categoria);
        return mapToDTO(updated);
    }

    @Override
    public void deleteCategoria(Integer id) {
        Categoria categoria = categoriaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Categoría no encontrada con id: " + id));
        categoriaRepository.delete(categoria);
    }

    private CategoriaDTO mapToDTO(Categoria categoria) {
        CategoriaDTO dto = new CategoriaDTO();
        dto.setIdCategoria(categoria.getIdCategoria());
        dto.setNombreCategoria(categoria.getNombreCategoria());
        return dto;
    }
}
