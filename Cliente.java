

public class Cliente {
    private String nome;
    private String genero;
    private String CPF;

    public Cliente(String nome, String cpf, String genero) {
        this.CPF = cpf;
        this.genero = genero;
        this.nome = nome;
    }

    // Getter para o atributo nome
    public String getNome() {
        return nome;
    }

    // Setter para o atributo nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para o atributo genero
    public String getGenero() {
        return genero;
    }

    // Setter para o atributo genero
    public void setGenero(String genero) {
        this.genero = genero;
    }

    // Getter para o atributo cpf
    public String getCpf() {
        return CPF;
    }

    // Setter para o atributo cpf
    public void setCpf(String cpf) {
        this.CPF = cpf;
    }

   
}