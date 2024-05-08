public class Cliente {
    private String nome;
    private String CPF;
    private String genero;
    private Conta conta;
    //private double saldo;

    public Cliente() {
        
    }

    public Cliente(String nome, String CPF, String genero) {
        this.nome = nome;
        this.CPF = CPF;
        this.genero = genero;
        this.conta = new Conta();
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

    public int getNumConta() {
    	return this.conta.getNumero();
    }
    
    public double getSaldoConta() {
    	return this.conta.getSaldo();
    }
    
    public void setNumConta(int proximoNumeroConta) {
    	this.conta.setNumConta(proximoNumeroConta);
    }
    
    // Setter para o atributo cpf
    public void setCpf(String cpf) {
        this.CPF = cpf;
    }

    public boolean deposito (double valor){
        if (!this.conta.depositar(valor)) {
            return false;
        }
        //this.conta.depositar(valor);
        return true;
    }

    public boolean saque (double valor){
        if (!this.conta.saque(valor)) {
        	return false;
        }
        //this.conta.saque(valor);
        return true;
    }
    

//    public Cliente criarConta() {
//        Scanner s = new Scanner(System.in);
//        System.out.println("Insira seu nome:");
//        String nome = s.nextLine();
//        System.out.println("Insira seu genero:");
//        String genero = s.nextLine();
//        System.out.println("Insira seu CPF:");
//        String CPF = s.nextLine();
//
//        return new Cliente(nome, genero, CPF);
//    }
}