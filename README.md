# CadastroDeClientes
* Formulário de Cadastro de clientes contendo - Nome - E-mail - CPF ou CNPJ - Telefone - CEP - Logradouro - Número - Bairro - Cidade - Estado  * Listagem destes dados * Exclusão de algum item da lista
* Utilizei a técnica de desenvolvimento de sofware TDD (Test-Driven Development)(Desenvolvimento guiado por testes)
* Aqui estou usando os Design Patterns DTO que é um objeto que transporta dados entre processos para reduzir o número de chamadas de método. no caso criei o DTO FuncionarioForm para mandar os dados em um único formulário sem precisar acessar dois objetos (Funcionario e Endereco), também criei o FuncionárioView para criar a visualização dos dois objetos(Funcionario e Endereco) em uma única visualização.
* e Mapper para que é um objeto que estabelece uma comunicação entre dois objetos independentes. no caso criei o FuncionarioFormMapper que implementa a interface Mapper criada
* que basicamente recebe um "source" e retorna um "target", o FuncionarioFormMapper transforma um objeto do tipo FuncionarioForm em um do tipo Funcionario, o FuncionarioViewMapper
* transforma um objeto do tipo Funcionario em um do tipo FuncionarioView para criar a sua visualização ao usuário.
* Ambos os padrões servem para manter o encapsulamento da classe e manter o nível de coesão.
* em todo o código tento manter um nível alto de desacoplamento do código.
