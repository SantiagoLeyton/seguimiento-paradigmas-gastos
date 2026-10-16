package poo;

/**
 * Representa un gasto con su concepto, monto y categoría.
 */
public class gastos{
    private String concepto;
    private double monto;
    private String categoria;


    /**
     * Crea un gasto con la información proporcionada por el usuario.
     *
     * @param concepto descripción breve del gasto
     * @param monto valor monetario del gasto
     * @param categoria grupo al que pertenece el gasto
     */
    public gastos(String concepto,double monto,String categoria){
        this.concepto=concepto;
        this.monto=monto;
        this.categoria=categoria;
    }

    /** Actualiza el concepto del gasto. */
    public void setconcepto(String concepto){
        this.concepto=concepto;
    }

    /** Devuelve el concepto del gasto. */
    public String getconcepto(){
        return concepto;
    }

    /** Actualiza el monto del gasto. */
    public void Setmonto(double monto){
        this.monto=monto;
    }

    /** Devuelve el monto del gasto. */
    public double getmonto(){
        return monto;
    }

    /** Actualiza la categoría del gasto. */
    public void setcategoria(String categoria){
        this.categoria=categoria;
    }

    /** Devuelve la categoría del gasto. */
    public String getcategoria(){
        return categoria;
    }
    
}
