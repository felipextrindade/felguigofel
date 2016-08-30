/**
 *
 * @author 0030481513020
 */
public class Aluno {
    private int RA;
    private double NtPrv1;
    private double NtPrv2;
    private double NtTrab1;
    private double NtTrab2;
    
    public void setRA(int a){
        RA = a;
    }
    public void setNtPrv1(double b){
        NtPrv1 = b;
    }
    public void setNtPrv2(double c){
        NtPrv2 = c;
    }
    public void setNtTrab1(double d){
        NtTrab1 = d;
    }
    public void setNtTrab2(double e){
        NtTrab2 = e;
    }
    public int getRA(){
        return (RA);
    }
    public double getNtPrv1(){
        return(NtPrv1);
    }
    public double getNtPrv2(){
        return(NtPrv2);
    }
    public double getNtTrab1(){
        return(NtTrab1);
    }
    public double getNtTrab2(){
        return(NtTrab2);
    }
    public double calcMediaProva(){
        return (0.75*(NtPrv1+2*NtPrv2)/3);
    }
    public double calcMediaTrab(){
        return (0.25*(NtTrab1+NtTrab2)/2);
    }
    public double calcMediaFinal(){
        return (calcMediaProva()+calcMediaTrab());
    }
    public boolean isAprovado(){
        if (calcMediaFinal()>=6){
            return true;
        }
        else{
            return false;
        }
    }
}
