public class Principal {
Package Pessoa;
class Aluno{
    private String nome;
    private Integer matricula;

    public String get_nome(){
        return nome;
    }
    public String set_nome(String nome){
        this.nome = nome;
        return null;
    }
    public Integer get_matricula(){
        return matricula;
    }
    public Integer set_matricula(Integer matricula){
        this.matricula = matricula;
        return matricula;
    }
}
class Professor{
    private String nome;
    private Integer cpf;

    public String get_nome(){
        return nome;
    }
    public String set_name(String nome) {
        this.nome = nome;
    }

    public Integer get_cpf() {
        return cpf;
    }

    public Integer set_cpf(Integer cpf) {
        this.cpf = cpf;
    }

}
Package Local;
class Universidade{
    private String nome;
    private String endereco;

    public String get_nome(){
        return nome;
    }
    public String set_nome(String nome){
        this.nome = nome;
        return null;
    }
    public String get_endereco(){
        return endereco;
    }
    public String set_endereco(String endereco){
        this.endereco = endereco;
        return endereco;
    }

}


}
