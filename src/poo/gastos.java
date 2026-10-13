package poo;

public class gastos{
    private String concepto;
    private double monto;
    private String categoria;


    public gastos(String concepto,double monto,String categoria){
        this.concepto=concepto;
        this.monto=monto;
        this.categoria=categoria;
    }
    public void setconcepto(String concepto){
        this.concepto=concepto;
    }
    public String getconcepto(){
        return concepto;
    }
    public void Setmonto(double monto){
        this.monto=monto;
    }
    public double getmonto(){
        return monto;
    }
    public void setcategoria(String categoria){
        this.categoria=categoria;
    }
    public String getcategoria(){
        return categoria;
    }
    
}
