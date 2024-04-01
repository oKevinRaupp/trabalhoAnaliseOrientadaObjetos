package kevBank;
public class Cliente {
    private String nome;
    private String sobreNome;
    private String cpf;
    private Conta conta;

    public Cliente(String nome, String sobreNome, String cpf, Conta conta) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.cpf = cpf;
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }  
}
