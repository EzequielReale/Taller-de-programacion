package D_Herencia.Ejer6;

public abstract class Figura {
    private String colorRelleno;
    private String colorLinea;
   
    public Figura(String unCR, String unCL){
        setColorRelleno(unCR);
        setColorLinea(unCL);
    }
    
    @Override
    public String toString(){
        String aux = "Perimétro: " +this.calcularPerimetro()+
                     " - Área: " + this.calcularArea() +
                     " - CR: "  + getColorRelleno() + 
                     " - CL: " + getColorLinea();             
             return aux;
       }

    
    public String getColorRelleno(){
        return colorRelleno;       
    }
    public void setColorRelleno(String unColor){
        colorRelleno = unColor;       
    }
    public String getColorLinea(){
        return colorLinea;       
    }
    public void setColorLinea(String unColor){
        colorLinea = unColor;       
    }
    
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
     
}
