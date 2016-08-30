
/**
 *
 * @author 0030481513020
 */
public class ContaTelefonica {
    private int Numero;
    private int Tipo;
    private int QntdPulsos;
    private int QntdInter;
    private int QntdServDesp;

    public void setNumero(int Num) {
        Numero = Num;
    }

    public void setTipo(int t) {
        Tipo = t;
    }

    public void setPulso(int Pulsos) {
        QntdPulsos = Pulsos;
    }

    public void setInterurbano(int Inter) {
        QntdInter = Inter;
    }

    public void setDespertador(int ServDesp) {
        QntdServDesp = ServDesp;
    }

    public int getNumero() {
        return Numero;
    }

    public int getTipo() {
        return Tipo;
    }

    public int getPulso() {
        return QntdPulsos;
    }

    public int getInterurbano() {
        return QntdInter;
    }

    public int getDespertador() {
        return QntdServDesp;
    }
    public double calcValorConta(){
        double ValorConta=0,Taxa, TotalPulsos=0,TotalInter,TotalServDesp;
        if (Tipo == 1){
            Taxa = 10.00;
        }
        else{
            Taxa = 15.00;
        }
        ValorConta += Taxa;
        if (QntdPulsos > 90){
            TotalPulsos = (QntdPulsos-90)*0.05;
        }
        ValorConta += TotalPulsos;
        TotalInter = 0.08 * 60 * QntdInter;
        ValorConta += TotalInter;
        TotalServDesp = 2 * QntdServDesp;
        ValorConta += TotalServDesp;
        return (ValorConta);
    }
    
}
