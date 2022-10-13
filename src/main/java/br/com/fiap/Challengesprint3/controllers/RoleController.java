// package br.com.fiap.Challengesprint3.controllers;

// import java.util.List;

// import javax.validation.Valid;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

// import br.com.fiap.Challengesprint3.models.RoleModel;
// import br.com.fiap.Challengesprint3.service.CreateRoleUserService;


// @RestController
// @RequestMapping("/api/role")
// public class RoleController {
    
//     @Autowired
//     CreateRoleUserService service;

//     @PostMapping
//     public ResponseEntity<RoleModel> create(@RequestBody @Valid RoleModel role) {
//         service.createRole(role);
//         return ResponseEntity
//                     .status(HttpStatus.CREATED)
//                     .body(role);
//     }

//     @GetMapping
//     public List<RoleModel> getRoles() {
//         return service.getRoles();
//     }

// }
