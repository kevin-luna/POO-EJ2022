package Tema1;

public class CadenaHumana {
    private NodoPersona inicio;
    private NodoPersona fin;
    private int numeroPersonas=0;


    public CadenaHumana(){
        inicio=fin=null;
    }

    public boolean estaVacia(){
        return inicio==null;
    }

    public void formarAlFinal(NodoPersona p){
        if(!estaVacia()){
            fin.setAtras(p);
            p.setAdelante(fin);
            fin=p;
        }else{
            inicio=fin=p;
        }
        numeroPersonas++;
    }

    public void formarAlInicio(NodoPersona p){
        if(!estaVacia()){
            inicio.setAdelante(p);
            p.setAtras(inicio);
            inicio=p;
        }else{
            inicio=fin=p;
        }
        numeroPersonas++;
    }

    public void mostrarCadenaInicioFin(){
        if(!estaVacia()){
            NodoPersona actual = inicio;
            while (actual!=null){
                System.out.println(actual.getNombre());
                actual=actual.getAtras();
            }
            return;
        }
        System.out.println("La cadena no tiene personas aún!");
    }

    public void mostrarCadenaFinInicio(){
        if(!estaVacia()){
            NodoPersona actual = fin;
            while (actual!=null){
                System.out.println(actual.getNombre());
                actual=actual.getAdelante();
            }
            return;
        }
        System.out.println("La cadena no tiene personas aún!");
    }

    public void formarAtrasDe(NodoPersona persona,NodoPersona atrasDe){
        if(!estaVacia()){
            if(atrasDe==this.fin) formarAlFinal(persona);

            NodoPersona actual = inicio;
            while (actual!=null){
                if(actual==atrasDe){
                    NodoPersona adelante = actual;
                    NodoPersona atras = actual.getAtras();
                    persona.setAdelante(adelante);
                    persona.setAtras(atras);
                    adelante.setAtras(persona);
                    atras.setAdelante(persona);
                }
                actual=actual.getAtras();
            }
        }
    }

    public int getNumeroPersonas(){
        return  numeroPersonas;
    }
}
