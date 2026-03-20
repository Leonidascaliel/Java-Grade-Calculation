//Autor Leonidas Caliel de Carvalho
public class Aluno {
    private int RA;
    private double ntPrv1, ntPrv2, ntTrab1, ntTrab2, mediaTrab, mediaProva;
    
    public void setRA (int ra){
        RA = ra;
    }
    
    public void setntPrv1 (double ntprv1){
        ntPrv1 = ntprv1;
    }
    
    public void setntPrv2 (double ntprv2){
        ntPrv2 = ntprv2;
    }
    
    public void setntTrab1 (double nttrab1){
        ntTrab1 = nttrab1;
    }
    
    public void setntTrab2 (double nttrab2){
        ntTrab2 = nttrab2;
    }
    
    public int getRA(){
        return (RA);
    }
    
    public double getntPrv1(){
        return (ntPrv1);
    }
    
    
    public double getntPrv2(){
        return (ntPrv2);
    }
    
    
    public double getntTrab1(){
        return (ntTrab1);
    }
    
    public double getntTrab2(){
        return (ntTrab2);
    }
    
    public double calcMediaProva(){
        return (0.75 * (ntPrv1 + 2 * ntPrv2)/3);
    }
    
    public double calcMediaTrab(){
        return (0.25 * (ntTrab1 + ntTrab2)/2);
    }
    
    public double calcMediaFinal(){
        return (calcMediaProva() + calcMediaTrab());
    }
}
