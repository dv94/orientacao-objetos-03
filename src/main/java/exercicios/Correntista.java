package exercicios;

public class Correntista {
    private Integer codigo;
    private String nome;
    private String email;
    private Integer telefone;


    public Correntista(Integer codigo, String nome, String email, Integer telefone){
        setCodigo(codigo);
        setNome(nome);
        setEmail(email);
        setTelefone(telefone);
    }

    public String getCodigoCliente(){
        return this.codigo +","+ this.nome +","+ this.email +","+ this.telefone;
    }


    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        if(codigo <= 0){
            throw new IllegalArgumentException ("O código tem que ser maior que");
        }
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }
}
