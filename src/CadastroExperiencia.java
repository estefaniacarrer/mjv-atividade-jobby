import java.util.Date;

public class CadastroExperiencia {

    private String empresa;
    private Double salario;
    private boolean empregoAtual;
    private Date dataContratacao;
    private Date dataDesligamento;
    private RegimeContratacao regimeContratacao;

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public boolean isEmpregoAtual() {
        return empregoAtual;
    }

    public void setEmpregoAtual(boolean empregoAtual) {
        this.empregoAtual = empregoAtual;
    }

    public Date getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(Date dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public Date getDataDesligamento() {
        return dataDesligamento;
    }

    public void setDataDesligamento(Date dataDesligamento) {
        this.dataDesligamento = dataDesligamento;
    }

    public RegimeContratacao getRegimeContratacao() {
        return regimeContratacao;
    }

    public void setRegimeContratacao(RegimeContratacao regimeContratacao) {
        this.regimeContratacao = regimeContratacao;
    }
}


