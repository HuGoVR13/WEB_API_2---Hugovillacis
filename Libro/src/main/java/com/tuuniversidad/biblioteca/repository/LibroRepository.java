package com.tuuniversidad.biblioteca.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;
import com.tuuniversidad.biblioteca.models.Libro;

@Repository
public class LibroRepository {
    private List<Libro> libros = new ArrayList<>();

    public LibroRepository(){
        libros.add(new Libro(1l, "El Principe", "Nicolas Maquiavelo", "Ariel", 1879));
        libros.add(new Libro(2l, "El Arte de la Guerra", "Sun Tzu", "Austral", 500));
        libros.add(new Libro(3l, "Mi lucha", "Adolf Hitler", "Mein Kampf", 1932));
        libros.add(new Libro(4l, "The Phantom Prince", "Elizabeth Kendalls", "ABRAMS US", 1989));
    }
    

    public List<Libro> findAll() {
        return libros;
    }

    public Optional<Libro> findById(Long id) {
        return libros.stream().filter(libro -> libro.getId().equals(id)).findFirst();
    }

    public void save(Libro libro) {
        libros.add(libro);
    }
}
