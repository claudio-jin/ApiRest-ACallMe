// package br.com.fiap.Challengesprint3.services;

// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;
// import org.springframework.transaction.annotation.Transactional;

// import br.com.fiap.Challengesprint3.models.Cidade;
// import br.com.fiap.Challengesprint3.repository.CidadeRepository;

// @Service
// public class CidadeService {
    
//     @Autowired
//     CidadeRepository cidadeRepository;

//     public List<Cidade> listAll() {
//         return cidadeRepository.findAll();
//     }

//     @Transactional
//     public void save(Cidade cidade) {
//         cidadeRepository.save(cidade);
//     }

//     public void remove(Long id) {
//         cidadeRepository.deleteById(id);
//     }

// }
