// package br.com.fiap.Challengesprint3.services;

// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;
// import org.springframework.transaction.annotation.Transactional;

// import br.com.fiap.Challengesprint3.models.Estado;
// import br.com.fiap.Challengesprint3.repository.EstadoRepository;

// @Service
// public class EstadoService {
    
//     @Autowired
//     EstadoRepository estadoRepository;

//     public List<Estado> listAll() {
//         return estadoRepository.findAll();
//     }

//     @Transactional
//     public void save(Estado estado) {
//         estadoRepository.save(estado);
//     }

//     public void remove(Long id) {
//         estadoRepository.deleteById(id);
//     }

// }
