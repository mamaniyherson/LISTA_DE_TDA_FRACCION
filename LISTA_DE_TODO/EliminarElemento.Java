@Override
public void eliminarElemento(object elementoaEliminar) {
    if (estaVacia()) {
        System.out.println("NO SE PUEDE ELIMINAR: " + elementoaEliminar + ", LA LISTA ESTA VACIA.");
        return;
    }
    if (cabeza.getDato().equals(elementoaEliminar)) {
        cabeza = cabeza.getEnlace();
        System.out.println("ELEMENTO: " + elementoaEliminar + ", ELIMINADO DE LA LISTA.");
        return;
    }
    Nodo auxNodo = cabeza;
    while (auxNodo.getEnlace() != null){
        if (auxNodo.getEnlace().getDato().equals(elementoaEliminar)){
            auxNodo.setEnlace(auxNodo.getEnlace().getEnlace());

            System.out.println("ELEMENTO: " + elementoaEliminar + ", ELIMINADO DE LA LISTA.");
            return;
            }
            auxNodo = auxNodo.getEnlace();
        }
        System.out.println("ELEMENTO: " + elementoaEliminar + ", NO SE ENCUENTRA EN LA LISTA.");

    }