package Pessoas.teste;

import Pessoas.classes.Pessoa;

import java.util.Arrays;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa p = new Pessoa.PessoaBuilder("Douglas")
                .ultimoNome("Teixeira")
                .apelido("Doug")
                .idade(24)
                .criarPessoa();
        System.out.println(p);
    }
}
