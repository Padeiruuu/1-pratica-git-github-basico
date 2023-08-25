public class Cliente {
    private String nome;
    private String cpf;
    private int idade;
    private String genero;

    public Cliente(String nome, String cpf, int idade, String genero) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length() > 0) {
            this.nome = nome;
        } else {
            System.out.println("Nome inválido");
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf.length() == 11) {
            this.cpf = cpf;
        } else {
            System.out.println("CPF inválido");
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade > 0) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida");
        }
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        if (genero.length() > 0) {
            this.genero = genero;
        } else {
            System.out.println("Gênero inválido");
        }
    }
}
