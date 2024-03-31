package pkg06.proyectodibujos;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Trazos {

    public Nodo cabeza;
    
    public Trazos() {
        cabeza = null;
    }

    
    public void agregar(Nodo n) {

        if (n != null) {
            n.siguiente = null;
            if (cabeza == null) {
                cabeza = n;
              //  System.out.println("Se agregó el primer nodo. Cabeza: " + cabeza);
            } else {
                Nodo apuntador = cabeza;
                while (apuntador.siguiente != null) {
                    apuntador = apuntador.siguiente;
                }
                apuntador.siguiente = n;
               // System.out.println("Se agregó un nodo. Cabeza: " + cabeza);
            }
        }
    }

    public void imprimirNodos() {
        Nodo temp = cabeza;
        while (temp != null) {
            System.out.println("Tipo de trazo: " + temp.getTrazo() + ", Inicio: (" + temp.getInicio().x + ", " + temp.getInicio().y + "), Fin: (" + temp.getFin().x + ", " + temp.getFin().y + ")");
            temp = temp.siguiente;
        }
    }

    public int getLongitud() {
        int totalNodos = 0;
        //recorrer la lista completa
        Nodo apuntador = cabeza;
        while (apuntador != null) {
            apuntador = apuntador.siguiente;
            totalNodos++;
        }
        return totalNodos;
    }

    
    public boolean guardar(String nombreArchivo) {
        try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(nombreArchivo)))) {
            int totalFilas = getLongitud();
            if (totalFilas > 0) {
                String[] lineas = new String[totalFilas];
                Nodo n = cabeza;
                int fila = 0;
                while (n != null) {
                    lineas[fila] = n.trazo + ";" + n.inicio.x + "; " + n.inicio.y + ";" + n.fin.x + ";" + n.fin.y;
                    fila++;
                    n = n.siguiente;
                }

                for (String linea : lineas) {
                    out.println(linea);
                }
            }
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    public void limpiarListaTrazos() {
        cabeza = null;
    }

    public void desdeArchivo(String nombreArchivo) {
        limpiarListaTrazos();
        BufferedReader br = Archivo.abrirArchivo(nombreArchivo);
        if (br != null) {
            try {
                String linea = br.readLine();
                while (linea != null) {
                   // System.out.println("Línea leída: " + linea);
                    String[] partes = linea.split(";");
                    for (int i = 0; i < partes.length; i++) {
                        partes[i] = partes[i].trim(); 
                    }
                    //System.out.println("Partes: " + Arrays.toString(partes));
                    if (partes.length >= 5) {
                        TipoTrazo tipoTrazo = TipoTrazo.valueOf(partes[0]);
                        int xInicio = Integer.parseInt(partes[1]);
                        int yInicio = Integer.parseInt(partes[2]);
                        int xFin = Integer.parseInt(partes[3]);
                        int yFin = Integer.parseInt(partes[4]);
                        Point puntoInicio = new Point(xInicio, yInicio);
                        Point puntoFin = new Point(xFin, yFin);
                        Nodo nuevoNodo = new Nodo(tipoTrazo, puntoInicio, puntoFin);
                       
                        agregar(nuevoNodo);
                        Lienzo.trazos.add(nuevoNodo);
                    } else {
                        
                    }
                    linea = br.readLine();
                }
            } catch (IOException ex) {
               
            } finally {
                try {
                    br.close();
                } catch (IOException ex) {
                }
            }
        } else {
            System.out.println("No se pudo abrir el archivo.");
        }
    }

    public void eliminar(Nodo n) {
        if (n != null && cabeza != null) {
            //Buscar el nodo
            boolean encontrado = false;
            Nodo apuntador = cabeza;
            Nodo anterior = null;
            while (apuntador != null && !encontrado) {
                if (apuntador == n) {
                    encontrado = true;
                } else {
                    anterior = apuntador;
                    apuntador = apuntador.siguiente;
                }
            }
            if (encontrado) {
                if (anterior == null) {
                    cabeza = apuntador.siguiente;
                } else {
                    anterior.siguiente = apuntador.siguiente;
                }
            }
        }
    }
}
