
public class DadosCSV {

    public String gerarCabecalho() {
        StringBuilder cabecalho = new StringBuilder();
        cabecalho.append("NOME | ");
        cabecalho.append("CPF | ");
        cabecalho.append("DATA NASC. | ");
        cabecalho.append("SEXO | ");
        cabecalho.append("LOGADOURO | ");
        cabecalho.append("NUMERO | ");
        cabecalho.append("COMPLEMENTO | ");
        cabecalho.append("BAIRRO | ");
        cabecalho.append("CIDADE | ");
        cabecalho.append("ESTADO | ");
        cabecalho.append("E-MAIL | ");
        cabecalho.append("TELEFONE | ");
        cabecalho.append("CELULAR | ");
        cabecalho.append("WHATSAPP | ");
        cabecalho.append("PROFISSAO | ");
        cabecalho.append("EMPRESA | ");
        cabecalho.append("SALARIO | ");
        cabecalho.append("EMPREGO ATUAL | ");
        cabecalho.append("PRETENSAO SALARIAL MINIMA | ");
        cabecalho.append("PRETENSAO SALARIAL MAXIMA | ");
        cabecalho.append("HABILIDADES").append("\n");

        return String.valueOf(cabecalho);
    }

        public String criarConteudo (Cadastro cadastro){
            StringBuilder conteudoCSV = new StringBuilder();

        conteudoCSV.append(cadastro.getNome()).append(";");
        conteudoCSV.append(cadastro.getCpf()).append(";");
        conteudoCSV.append(cadastro.getDataNascimento()).append(";");
        conteudoCSV.append(cadastro.getSexo()).append(";");
        conteudoCSV.append(cadastro.getEndereco().getLogradouro()).append(";");
        conteudoCSV.append(cadastro.getEndereco().getNumero()).append(";");
        conteudoCSV.append(cadastro.getEndereco().getComplemento()).append(";");
        conteudoCSV.append(cadastro.getEndereco().getBairro()).append(";");
        conteudoCSV.append(cadastro.getEndereco().getCidade()).append(";");
        conteudoCSV.append(cadastro.getEndereco().getEstado()).append(";");
        conteudoCSV.append(cadastro.getEmail()).append(";");
        conteudoCSV.append(cadastro.getTelefone()).append(";");
        conteudoCSV.append(cadastro.getCelular().getNumero()).append(";");
        conteudoCSV.append(cadastro.getCelular().isWhatsapp()).append(";");
        conteudoCSV.append(cadastro.getProfissao().getNome()).append(";");
        conteudoCSV.append(cadastro.getCadastroExperiencia().getEmpresa()).append(";");
        conteudoCSV.append(String.format("%.2f", cadastro.getCadastroExperiencia().getSalario())).append(";");
        conteudoCSV.append(cadastro.getCadastroExperiencia().isEmpregoAtual()).append(";");
        conteudoCSV.append(String.format("%.2f",cadastro.getPretensaoSalarial().getValorMinimo())).append(";");
        conteudoCSV.append(String.format("%.2f",cadastro.getPretensaoSalarial().getValorMaximo())).append(";");
        conteudoCSV.append(cadastro.getHabilidades()).append(";");
        conteudoCSV.append("\n");

            return String.valueOf(conteudoCSV);
        }

    }

//    String path = "C:\\Projetos\\Java_MJV\\mjv-atividade-jobby\\";
//    Path caminhoArquivo = Paths.get(path + "\\cadastro.csv");
//        try {
//        Files.write(caminhoArquivo, conteudoCSV.toString().getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
//    } catch (Exception e) {
//        System.err.println("Erro encontrado!" + e);
//    }

