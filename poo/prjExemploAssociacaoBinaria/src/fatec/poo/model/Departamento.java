

package fatec.poo.model;

/**
 *
 * @author 0030481513011
 */
public class Departamento {
    private String Sigla;
    private String Nome;
    

    public Departamento(String Sigla, String Nome) {
        this.Sigla = Sigla;
        this.Nome = Nome;
    }
    
    public String getSigla() {
        return Sigla;
    }
    
    public String getNome() {
        return Nome;
    }
    
    
}
