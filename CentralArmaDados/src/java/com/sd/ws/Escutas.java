
package com.sd.ws;

public class Escutas {
    
    private String tipo;
    private String nomeEscuta;
    private String nomeCeluda;
    private String dados;
   
    
    public void setTipo(String tipo)
    {
        this.tipo=tipo;
    }
    
    public void setNomeEscuta(String nomeEscuta)
    {
        this.nomeEscuta=nomeEscuta;
    }
    public void setNomeCeluda(String nomeCeluda)
    {
        this.nomeCeluda=nomeCeluda;
    }
    public void setDados(String dados)
    {
        this.dados=dados;
    }
    
    public String getTipo()
    {
        return this.tipo;
    }
    
    public String getNomeEscuta()
    {
        return this.nomeEscuta;
    }
    
    public String getNomeCeluda()
    {
        return this.nomeCeluda;
    }
    public String getDados()
    {
        return this.dados;
    }

}
