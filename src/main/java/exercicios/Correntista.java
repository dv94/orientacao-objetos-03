package exercicios;

import jdk.dynalink.NamedOperation;

public class Correntista {
    private Integer codigo;
    private String nome;
    private String email;
    private String telefone;



    public Correntista(Integer codigo){
        this(codigo,"a", "a", "1");
    }

    public Correntista(Integer codigo, String nome){
        this(codigo, nome, "a", "1");
    }

    public Correntista(Integer codigo, String nome, String email){
        this(codigo, nome, email, "1");
    }

    public Correntista(Integer codigo, String nome, String email, String telefone){
        getCodigo(codigo);
        setNome(nome);
        setEmail(email);
        setTelefone(telefone);
    }

    public Correntista() {}

    public static Correntista criarComNome(Integer codigo, String nome){
        return new Correntista(codigo, nome);
    }

    public static Correntista criarComEmail(Integer codigo, String nome, String email){
        return new Correntista(codigo, nome, email);
    }

    public static Correntista criarComTelefone(Integer codigo, String nome, String telefone){
        return new Correntista(codigo, nome, telefone);
    }


    //--------------------------
    public String getCodigoCliente(){
        return this.codigo +","+ this.nome +","+ this.email +","+ this.telefone;
    }


    public Integer getCodigo(int i) {
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

    public String getEmail(String s) {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
