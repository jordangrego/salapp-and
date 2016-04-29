package br.com.salapp.android.dominio;

/**
 * Created by jordan.silva on 29/04/2016.
 */
public enum DominioSituacao {
    ATIVO(1,"Ativo"),
    INATIVO(2,"Inativo");

    private int codigo;
    private String nome;
    /**
     * @param codigo
     * @param nome
     */
    private DominioSituacao(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
