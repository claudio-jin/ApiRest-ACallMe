# Enterprise-Claudio-Challenge.pt3

Turma: 2TDSH
<br/>
<br/>
Grupo:<br/>
Daniel Augusto - RM88397<br/>
Guilherme Arevalo - RM89072<br/>
Cláudio Jin - RM88249<br/>
João Henrique - RM88822<br/>

<br/>
Link Backend: https://github.com/Polaris-Fiap/Enterprise-Claudio-Challenge.pt3<br/>
link Frontend: https://github.com/Polaris-Fiap/frontend-clg<br/>
link video: https://www.youtube.com/watch?v=9KJefRAuzHQ<br/>
<br/>
especialistaPj

```

{
    "nomeEspecialista" : "teste",
    "email" : "etc222@hotmail.com2",
    "senha" : "33sgks",
    "dtNascimento" : "22/01/2000",
    "telefoneDDD" : 11,
    "telefone" : 11231,
    "descricaoSobre" : "neurologista formado na usp",
    "valorConsulta" : 100.00,
    "tipoEspecialidade" : "neurocirurgiao",
    "tipo" : "PJ",
    "genero" : {
        "nomeGenero" : "Masculino"
    },
    "cnpj" : 11111,
    "cnpjDigito" : 12,
    "razaoSocial" : "soso"
}

```


especialistapf
```

{
    "nomeEspecialista": "teste",
    "email": "etc222@hotmail.com2",
    "senha" : "33sgks",
    "dtNascimento" : "22/01/2000",
    "telefoneDDD" : 11,
    "telefone" : 11231,
    "descricaoSobre" : "neurologista formado na usp",
    "valorConsulta" : 100.00,
    "tipoEspecialidade" : "neurocirurgiao",
    "tipo": "PJ",
    "genero" : {
        "nomeGenero" : "Masculino"
    },
    "cpf" : 2123,
    "digitoCpf" : 9
}

```


Paciente

```

{
    "nomePaciente" : "claudio",
    "email" : "claudio@hotmail.com",
    "dtNascimento" : "01/01/2000",
    "cpf" : 111222333,
    "digitoCpf" : 44,
    "telefoneDDD" : 11,
    "telefone" : 111222333,
    "estadoCivil" : "solteiro",
    "profissao" : "comerciante",
    "genero" : {
        "nomeGenero" : "masculino"
    },
    "endereco" : {
        "cep" : 12345678,
        "complemento" : "loja",
        "nomeRua" : "Av paulista",
        "numeroRua" : 35,
        "bairro" : {
            "nomeBairro" : "Santana",
            "cidade" : {
                "nomeCidade" : "sao paulo",
                "siglaCidade" : "sp",
                "estado" : {
                    "nomeEstado" : "Sao pualo estado",
                    "siglaEstado" : "SP"
                }
            }
        }
    }
}


```

Especialista pf com endereço
```

{
    "nomeEspecialista" : "segundo Especialista pf",
    "email" : "etc222@hotmail.com2",
    "senha" : "33sgks",
    "dtNascimento" : "22/01/2000",
    "telefoneDDD" : 11,
    "telefone" : 11231,
    "descricaoSobre" : "neurologista formado na usp",
    "valorConsulta" : 100.00,
    "tipoEspecialidade" : "neurocirurgiao",
    "tipo" : "PJ",
    "genero" : {
        "nomeGenero" : "Masculino"
    },
    "endereco" : {
        "cep" : 12345678,
        "complemento" : "loja",
        "nomeRua" : "Av paulista",
        "numeroRua" : 35,
        "bairro" : {
            "nomeBairro" : "Santana",
            "cidade" : {
                "nomeCidade" : "sao paulo",
                "siglaCidade" : "sp",
                "estado" : {
                    "nomeEstado" : "Sao pualo estado",
                    "siglaEstado" : "SP"
                }
            }
        }
    },
     "cpf" : 2123,
    "digitoCpf" : 9
    
}


```



Especialista pj com endereço

```

{
    "nomeEspecialista" : "teste",
    "email" : "etc222@hotmail.com2",
    "senha" : "33sgks",
    "dtNascimento" : "22/01/2000",
    "telefoneDDD" : 11,
    "telefone" : 11231,
    "descricaoSobre" : "neurologista formado na usp",
    "valorConsulta" : 100.00,
    "tipoEspecialidade" : "neurocirurgiao",
    "tipo" : "PJ",
    "genero" : {
        "nomeGenero" : "Masculino"
    },
    "endereco" : {
        "cep" : 12345678,
        "complemento" : "loja",
        "nomeRua" : "Av paulista",
        "numeroRua" : 35,
        "bairro" : {
            "nomeBairro" : "Santana",
            "cidade" : {
                "nomeCidade" : "sao paulo",
                "siglaCidade" : "sp",
                "estado" : {
                    "nomeEstado" : "Sao pualo estado",
                    "siglaEstado" : "SP"
                }
            }
        }
    },
    "cnpj" : 11111,
    "cnpjDigito" : 12,
    "razaoSocial" : "soso"
    
}


```

consulta sem especialistas e pacientes

```

{
    "valorConfirmado" : 150.00,
    "dtConsulta" : "22/06/2000"
}


```

prontuario json sem especialista e pacientes

```

{
    "indentificacao" : "prontuario numero tal",
    "queixaPrincipal" : "dores de cabeça",
    "hda" : "nenhuma",
    "historicoMedico" : "queda de bike",
    "antecedenteFamiliar" : "varias quedas",
    "habitos" : "tomar café"
}

```

Paciente c/endereco c/consulta c/prontuario e especialistas

```

    {
        "nomePaciente" : "claudio",
        "email" : "claudio@hotmail.com",
        "dtNascimento" : "01/01/2000",
        "cpf" : 111222333,
        "digitoCpf" : 44,
        "telefoneDDD" : 11,
        "telefone" : 111222333,
        "estadoCivil" : "solteiro",
        "profissao" : "comerciante",
        "genero" : {
            "nomeGenero" : "masculino"
        },
        "endereco" : {
            "cep" : 12345678,
        "complemento" : "loja",
        "nomeRua" : "Av paulista",
        "numeroRua" : 35,
        "bairro" : {
            "nomeBairro" : "Santana",
            "cidade" : {
                "nomeCidade" : "sao paulo",
                "siglaCidade" : "sp",
                "estado" : {
                    "nomeEstado" : "Sao pualo estado",
                    "siglaEstado" : "SP"
                }
            }
        }
        },
        "consulta" : [
            {
                "valorConfirmado" : 150.00,
                "dtConsulta" : "22/06/2000",
                "espePf" : {
                    "nomeEspecialista" : "segundo Especialista pf",
                        "email" : "etc222@hotmail.com2",
                        "senha" : "33sgks",
                        "dtNascimento" : "22/01/2000",
                        "telefoneDDD" : 11,
                        "telefone" : 11231,
                        "descricaoSobre" : "neurologista formado na usp",
                        "valorConsulta" : 100.00,
                        "tipoEspecialidade" : "neurocirurgiao",
                        "tipo" : "PJ",
                        "genero" : {
                            "nomeGenero" : "Masculino"
                        },
                        "endereco" : {
                            "cep" : 12345678,
                            "complemento" : "loja",
                            "nomeRua" : "Av paulista",
                            "numeroRua" : 35,
                            "bairro" : {
                                "nomeBairro" : "Santana",
                                "cidade" : {
                                    "nomeCidade" : "sao paulo",
                                    "siglaCidade" : "sp",
                                    "estado" : {
                                        "nomeEstado" : "Sao pualo estado",
                                        "siglaEstado" : "SP"
                                    }
                                }
                            }
                        },
                        "cpf" : 2123,
                        "digitoCpf" : 9
                },
                "prontuario" : {
                    "indentificacao" : "prontuario numero tal",
                    "queixaPrincipal" : "dores de cabeça",
                    "hda" : "nenhuma",
                    "historicoMedico" : "queda de bike",
                    "antecedenteFamiliar" : "varias quedas",
                    "habitos" : "tomar café"
                }
            },
            {
                "valorConfirmado" : 200.00,
                "dtConsulta" : "22/06/2000",
                "espePj": {
                    "nomeEspecialista" : "teste",
                    "email" : "etc222@hotmail.com2",
                    "senha" : "33sgks",
                    "dtNascimento" : "22/01/2000",
                    "telefoneDDD" : 11,
                    "telefone" : 11231,
                    "descricaoSobre" : "neurologista formado na usp",
                    "valorConsulta" : 100.00,
                    "tipoEspecialidade" : "neurocirurgiao",
                    "tipo" : "PJ",
                    "genero" : {
                        "nomeGenero" : "Masculino"
                    },
                    "endereco" : {
                        "cep" : 12345678,
                        "complemento" : "loja",
                        "nomeRua" : "Av paulista",
                        "numeroRua" : 35,
                        "bairro" : {
                            "nomeBairro" : "Santana",
                            "cidade" : {
                                "nomeCidade" : "sao paulo",
                                "siglaCidade" : "sp",
                                "estado" : {
                                    "nomeEstado" : "Sao pualo estado",
                                    "siglaEstado" : "SP"
                                }
                            }
                        }
                    },
                    "cnpj" : 11111,
                    "cnpjDigito" : 12,
                    "razaoSocial" : "soso"
                },
                "prontuario" : {
                    "indentificacao" : "prontuario numero dois",
                    "queixaPrincipal" : "dores nas costas",
                    "hda" : "nenhuma",
                    "historicoMedico" : "queda de bike",
                    "antecedenteFamiliar" : "varias quedas",
                    "habitos" : "tomar café"
                }
            }
        ]
    }

```



