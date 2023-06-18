
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)  {

        Cadastro cadastro1 = new Cadastro();
        cadastro1.setNome("Joao Paulo");
        cadastro1.setCpf("333-444-888-87");
        cadastro1.setDataNascimento(LocalDate.of(2000, 12, 03));
        cadastro1.setSexo(Sexo.MASCULINO);
        Endereco endereco1 = new Endereco();
        endereco1.setLogradouro("Rua: Joaquim Alves Ferreira");
        endereco1.setNumero("408");
        endereco1.setComplemento("Bloco3, Ap126");
        endereco1.setBairro("Vila Silva");
        endereco1.setCidade("Araraquara");
        endereco1.setEstado("SP");
        cadastro1.setEmail("joaopaulo00@teste.com");
        cadastro1.setTelefone(1735564444L);
        Celular celular1 = new Celular();
        celular1.setNumero(17988886666L);
        celular1.setWhatsapp(true);
        Profissao profissao1 = new Profissao();
        profissao1.setNome("Agronomo");
        CadastroExperiencia experiencia1 = new CadastroExperiencia();
        experiencia1.setEmpresa("Plantar");
        experiencia1.setSalario(2500.00);
        experiencia1.setEmpregoAtual(true);
        PretensaoSalarial pretensao1 = new PretensaoSalarial();
        pretensao1.setValorMinimo(3000.00);
        pretensao1.setValorMaximo(4000.00);
        List<String> listaHabilidades = new ArrayList();
        listaHabilidades.add("Lideranca");
        listaHabilidades.add("Trabalho em equipe");
        cadastro1.setHabilidades(String.valueOf(listaHabilidades));

        cadastro1.setEndereco(endereco1);
        cadastro1.setCelular(celular1);
        cadastro1.setProfissao(profissao1);
        cadastro1.setCadastroExperiencia(experiencia1);
        cadastro1.setPretensaoSalarial(pretensao1);


        DadosCSV criar = new DadosCSV();
        String path = "C:\\Projetos\\Java_MJV\\mjv-atividade-jobby\\";
        Path caminhoArquivo = Paths.get(path, "cadastro.csv");
        try {
            String cabecalho = criar.gerarCabecalho();
            String conteudo = criar.criarConteudo(cadastro1);
            Files.write(caminhoArquivo, cabecalho.getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            Files.write(caminhoArquivo, conteudo.getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (Exception e) {
            System.err.println("Erro encontrado: " + e);
        }

    }
}
