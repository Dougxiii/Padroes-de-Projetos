package Pessoas.classes;

    public class Pessoa {
        private String nome;
        private String ultimoNome;
        private String apelido;
        private int idade;

        private Pessoa(String nome, String ultimoNome, String apelido, int idade) {
            this.nome = nome;
            this.ultimoNome = ultimoNome;
            this.apelido = apelido;
            this.idade = idade;
        }

        @Override
        public String toString() {
            return "Pessoa{" +
                    "nome='" + nome + '\'' +
                    ", ultimoNome='" + ultimoNome + '\'' +
                    ", apelido='" + apelido + '\'' +
                    ", idade=" + idade +
                    '}';
        }

        public static class PessoaBuilder{
            private String nome;
            private String ultimoNome;
            private String apelido;
            private int idade;

            public PessoaBuilder(String nome) {
                this.nome = nome;
            }
            public PessoaBuilder nome(String nome){
                this.nome = nome;
                return this;
            }

            public PessoaBuilder ultimoNome(String ultimoNome){
                    this.ultimoNome = ultimoNome;
                    return this;
            }

            public PessoaBuilder apelido(String apelido){
                    this.apelido = apelido;
                    return this;
            }

            public PessoaBuilder idade(int idade){
                    this.idade = idade;
                    return this;
            }

            public Pessoa criarPessoa(){
                return new Pessoa(nome, ultimoNome, apelido, idade);
            }



        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getUltimoNome() {
            return ultimoNome;
        }

        public void setUltimoNome(String ultimoNome) {
            this.ultimoNome = ultimoNome;
        }

        public String getApelido() {
            return apelido;
        }

        public void setApelido(String apelido) {
            this.apelido = apelido;
        }

        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }
    }


}
