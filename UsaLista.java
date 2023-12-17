public class UsaLista{
    public static void main(String[] args){
        ListaSimple lista = new ListaSimple();
        //Se muestran las listas que se van a llamar
        lista.insertaPrimerNodo("H");
        lista.insertaAntesPrimerNodo("R");
        lista.insertaAlFinal("O");
        lista.insertaEntreNodos("Z", "O");
        //Imprime lista
        lista.imprimir();
        //Aquí se coloca una referencia
        String Buscado = "H";
        Node nodoBuscado = lista.buscarcontenido(Buscado);
        if(nodoBuscado != null){//Mostrar en pantalla si el nodo se encontró o no
            System.out.println("El nodo se ha encontrado");
        }else{
            System.out.println("El nodo no se encontró");
        }
        //Cambiar nodos
        //Coloqué otras letras para ver si funcionaba
        lista.cambiarNodo("A", "O");
        System.out.println("Cambiar Nodo [ O ] por [ A ]");
        lista.imprimir();
        lista.insertarnodoDespues("V", "Z");
        System.out.println("Insertar Nodo [ V ] después de [ Z ]");
        lista.imprimir();
    }
}
