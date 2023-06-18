import java.time.LocalDate;

public class Cadastro {

    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private Sexo sexo;
    private Endereco endereco;
    private String email;
    private Long telefone;
    private Celular celular;
    private Profissao profissao;
    private CadastroExperiencia cadastroExperiencia;
    private PretensaoSalarial pretensaoSalarial;
    private String habilidades;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getTelefone() {
        return telefone;
    }

    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }

    public Celular getCelular() {
        return celular;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
    }

    public Profissao getProfissao() {
        return profissao;
    }

    public void setProfissao(Profissao profissao) {
        this.profissao = profissao;
    }

    public CadastroExperiencia getCadastroExperiencia() {
        return cadastroExperiencia;
    }

    public void setCadastroExperiencia(CadastroExperiencia cadastroExperiencia) {
        this.cadastroExperiencia = cadastroExperiencia;
    }

    public PretensaoSalarial getPretensaoSalarial() {
        return pretensaoSalarial;
    }

    public void setPretensaoSalarial(PretensaoSalarial pretensaoSalarial) {
        this.pretensaoSalarial = pretensaoSalarial;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }
}



