public class Listas {

    public static void main(String[] args) {
        ejercicio1();
    }

    public static void ejercicio1() {

        Nodo p = new Nodo();

        p.setValor((int)(Math.random() * 71) + 20);

        Nodo z = new Nodo();
        z = p;

        for (int x=1 ; x<5 ; x++){
            Nodo q = new Nodo();
            q.setValor((int)(Math.random() * 71) + 20);
            z.setSiguiente(q); // z en su campo siguiente apunte a q
            z=q; // z se va para donde esta q 

        }

        /*
        z = p;
        while (z.getSiguiente()!= null){
            System.out.println(z.getValor());
            z = z.getSiguiente();
        }
        System.out.println(z.getValor());
         */


        p.imprimir(p, z);

    }

}