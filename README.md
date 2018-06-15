## [Módulo 1: Linguagem de Programação Orientada a Objetos 1](https://aula-java.github.io/aulas/lpoo-1.html)

# Exercício Herança 1

1. Clone o projeto
2. Remova toda a repetição de código através do mecanismo de herança. Faça o teste unitário passar. 
3. Adicione o método abaixo na classe Gerente:
```
public String getNome() {
    return "Gerente " + nome;
}
```
  - Para funcionar, altere a visibilidade do atributo nome da superclasse de privado (private) para protegido (protected)
  - Corrija o teste unitário para que ele passe.
4. Crie uma classe Diretor que herda de Funcionario.
  - Adicione o método getNome que retorna "Diretor " + nome
  - Crie um TestCase de Diretor para verificar se o nome está correto.
