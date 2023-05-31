# Accenture-Server

# Software Requirements

## Mandatory requirements

### Functional Requirements

- [ ] If the Company entity is from Paraná, do not allow registering an underage (birthdate attribute less than 18) Person Supplier.

- [ ] The accenture-service system must validate the cep attribute using the api.

### Organizational Requirements

- [x] The accenture-service system must be implemented in the Java language.

- [ ] The accenture-service system must use a SQL Server database.

- [ ] The accenture-service system must CRUD the entities Company and Supplier.

- [x] The ER Diagram must contain a Company entity with at least the attributes cep, cnpj and name.

- [x] The ER Diagram must contain a Supplier entity with at least the attributes cep, cnpj/cpf, mail and name.

- [x] The ER Diagram must admit that the Company entity has more than one Supplier.

- [x] The ER Diagram must admit that the Supplier entity has more than one Company.

- [ ] In the accenture-service system the cnpj and cpf attributes must be a single value.

- [ ] In the accenture-service system if the Supplier entity has the cpf attribute (Person), it is also necessary to register the rg and birthdate attributes.

## Added Requirements

### Functional Requirements

- [ ] The accenture-service system must automatically create Company, Supplier and Person entities.

# Considerações sobre o desenvolvimento

[Diagramas utilizados para modelar o servidor](https://github.com/andyboli/accenture-service/tree/main/static)
O desenvolvimento foi realizado com base no curso de Java oferecido pela Trybe, o curso foi iniciado no dia 12 de abril, dois dias antes do início do Projeto (dia 15 de abril), essa foi minha primeira experiência com Java.
Já desenvolvi outras apis que foram deployadas, um bom exemplo é o projeto [bolicommerce-server
](https://github.com/andyboli/bolicommerce-server).
