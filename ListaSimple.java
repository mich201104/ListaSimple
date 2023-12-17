/**Buscar un nodo por el valor de su campo clave y devolver una referencia.
Buscar un nodo por su campo clave e insertar un nuevo nodo después de él.
Intercambiar un nodo por otro buscado.*/

public class ListaSimple{
	Node top;
        //Borré lo que estaba de más y corregí
	//Métodos para los casos de inserción de nodos
	public boolean insertaPrimerNodo(String dato){
		if (top == null) { //La lista no está vacía
			top = new Node();
			top.name = dato;
			top.next = null;
			return true;
		}
		else {
			return false;
		}
	}
	public void insertaAntesPrimerNodo(String nombre){
		Node temp; 
		temp = new Node ();
		temp.name = nombre;
		temp.next = this.top;
		this.top = temp;
		temp = null;
	}
	public void insertaAlFinal(String nombre){
		Node temp = new Node ();
		temp.name = nombre;
		temp.next = null;
		//Node temp2;
		Node temp2 = this.top;
		while (temp2.next != null)
			temp2 = temp2.next;
		temp2.next = temp;
		temp = null;
		temp2 = null;
	}
	public boolean insertaEntreNodos(String nombre, String buscado){
		Node temp = new Node();
		temp.name = nombre;
		Node temp2 = this.top;
		//boolean NodoNoEncontrado = true;
		while ( (temp2 != null) 
				&& temp2.name.equals(buscado) == false ) {	
		         temp2 = temp2.next;
		}
		if (temp2 != null){  //Nodo buscado se encontró
			temp.next = temp2.next;
			temp2.next = temp;
			temp = null;
			temp2 = null;
			return true;
		}
		else return false;
	} 
	public void imprimir(){
		for (Node temp = this.top; temp != null; temp = temp.next){
			System.out.print("[ " + temp.name + " ] -> ");
		}

		System.out.print("[X]\n"); 
	}
	public String toString(){
		String cadAux = "";
		for (Node temp = this.top; temp != null; temp = temp.next){
			cadAux += "[ " + temp.name + " ] -> ";
		}
		cadAux += "[X]\n"; 
		return cadAux;
	}
	//Métodos de borrado
	public void borrarPrimerNodo(){
		this.top = this.top.next;
	}
	//Borrar cualquier nodo que no sea el primero
	public boolean borrarCualquierNodo(String buscado){
		Node temp = this.top;
		while ( (temp != null) 
				&& temp.name.equals(buscado) == false ) {	
		         temp = temp.next;
		}
		if (temp != null){  //Nodo buscado se encontró
			temp.next = temp.next.next;
			temp = null;
			
			return true;
		}
		else return false;
	}
	//Código Requerido
	//Buscar el nodo
    public Node buscarcontenido(String contenido){
        Node temp = top;
        while(temp != null && !temp.name.equals(contenido)){
            temp = temp.next;
        }
        return temp; //regresa nulo si no se encontró el valor
    }
    //Se cambia el nodo por otro
    public boolean cambiarNodo(String nombre, String buscando){
        Node Nodonuevo = new Node();
        Nodonuevo.name = nombre;
        Node NodoAnterior = null;
        Node temp = top;
        while(temp != null && !temp.name.equals(buscando)){
            NodoAnterior = temp;
            temp = temp.next;
        }
        if(temp != null) {
            Nodonuevo.next = temp.next;
            temp.next = Nodonuevo; //Nodoanterior es nulo,se muestra el primer nod
            if(NodoAnterior != null){//El nodo anterior se conectará al nodo nuevo
                NodoAnterior.next = Nodonuevo; 
            }else{//De no ser así el nodo se vulve el primer nodo
                top = Nodonuevo;
            }
            return true; //Regresa 
        }else{
            System.out.println("El Nodo no se encontró");
            return false;
        }
    }
    //Colocar el Nodo nuevo
    public boolean insertarnodoDespues(String nombre, String buscando){
        Node nuevoNodo = new Node();
        nuevoNodo.name = nombre;
        Node temp = top;
        while(temp != null && !temp.name.equals(buscando)){
            temp = temp.next;
        }
        if(temp != null){//Conecta el Nodo nuevo al nodo encontrado
            nuevoNodo.next = temp.next; 
            temp.next = nuevoNodo; 
            return true;//Regresa y muestra que si se hizo lo requerido
        }else{
            System.out.println("El Nodo no se encontró");
            return false; //De no ser encontrado ,muestra que no se logró
        }
    }
}
