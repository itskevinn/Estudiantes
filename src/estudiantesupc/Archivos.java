package estudiantesupc;

import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Archivos {

    public static void escribirEnTexto(ArrayList<Estudiante> lista) {
        FileWriter archivo;
        PrintWriter escritor = null;
        try {
            archivo = new FileWriter("D:/EstudiantesParcial.txt");
            escritor = new PrintWriter(archivo);
            for (Estudiante p : lista) {
                escritor.println(p.getCodigo() + "--;--" + p.getNombre() + "--;--" + String.valueOf(p.getSisben()) + "--;--" + String.valueOf(p.getPromedio()) + "--;--" + String.valueOf(p.getEdad()));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo realizar la accion" + "   (Excepcion: " + e.getMessage() + ")");
        } finally {
            escritor.close();
        }
    }

    public static void escribirEstudiantes(ArrayList<Estudiante> lista) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream("D:/estudiantes.kev"));
            escritor.writeObject(lista);
            escritor.close();
        } catch (Exception e) {
        }
    }

    public static ArrayList<Estudiante> leerEstudiantes() {
        ArrayList<Estudiante> lista = new ArrayList<>();
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream("D:/estudiantes.kev"));
            lista = (ArrayList<Estudiante>) lector.readObject();
            lector.close();
        } catch (Exception e) {
        }
        return lista;
    }

    public static ArrayList<Estudiante> leerEnTexto() {
        ArrayList<Estudiante> lista = new ArrayList<>();
        File archivo;
        FileReader lector;
        BufferedReader lectorComodo;
        Estudiante estudiante;
        try {
            archivo = new File("D:/EstudiantesParcial.txt");
            lector = new FileReader(archivo);
            lectorComodo = new BufferedReader(lector);
            String linea;
            while ((linea = lectorComodo.readLine()) != null) {
                String datos[] = linea.split("--;--");
                estudiante = new Estudiante();
                estudiante.setCodigo(datos[0]);
                estudiante.setNombre(datos[1]);
                estudiante.setEdad(Integer.valueOf(datos[4]));
                estudiante.setSisben(Float.valueOf(datos[2]));
                estudiante.setPromedio(Float.valueOf(datos[3]));
                lista.add(estudiante);
            }
            lectorComodo.close();
            lector.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo realizar " + e.getMessage());
        }
        return lista;
    }

    public static ArrayList<Estudiante> leerBinario() {
        ArrayList<Estudiante> lista = new ArrayList<>();
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream("D:/estudiantesBeneficiados.kev"));
            lista = (ArrayList<Estudiante>) lector.readObject();
            lector.close();
        } catch (Exception e) {
        }
        return lista;
    }

    public static void escribirBinario(ArrayList<Estudiante> lista) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream("D:/estudiantesBeneficiados.kev"));
            escritor.writeObject(lista);
            escritor.close();
        } catch (Exception e) {
        }
    }

    public static ArrayList<Estudiante> leerBinarioNo() {
        ArrayList<Estudiante> lista = new ArrayList<>();
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream("D:/estudiantesnoBeneficiados.kev"));
            lista = (ArrayList<Estudiante>) lector.readObject();
            lector.close();
        } catch (Exception e) {
        }
        return lista;
    }

    public static void escribirBinarioNo(ArrayList<Estudiante> lista) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream("D:/estudiantesnoBeneficiados.kev"));
            escritor.writeObject(lista);
            escritor.close();
        } catch (Exception e) {
        }
    }
}

/*  public static void escribirTextoaBinario(ArrayList<Persona> persona, String direccionArchivodeTextoALeer, String direccionArchivoBinarioAEscribir, String corte) {
        File archivo;
        FileReader lector;
        BufferedReader lectorComodo;
        Persona personaObjeto;
        try {
            archivo = new File(direccionArchivodeTextoALeer);
            lector = new FileReader(archivo);
            lectorComodo = new BufferedReader(lector);
            String linea;
            while ((linea = lectorComodo.readLine()) != null) {
                String[] datos = linea.split(corte);
                personaObjeto = new Persona();
                personaObjeto.setIdentificacion(datos[0]);
                personaObjeto.setNombre(datos[1]);
                personaObjeto.setEdad(Integer.valueOf(datos[2]));
                personaObjeto.setTelefono(Integer.valueOf(datos[3]));
                persona.add(personaObjeto);
            }
            lectorComodo.close();
            lector.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo realizar esta accion texto" + "(Excepción:    " + e.getMessage() + ")");
        }
        ObjectOutputStream escritor;
        try {
            escritor = new ObjectOutputStream(new FileOutputStream(direccionArchivoBinarioAEscribir));
            escritor.writeObject(persona);
            escritor.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo realizar esta accion binaria" + "(Excepción: " + e.getMessage() + ")");
        }
    }

    public static ArrayList<Persona> leerBinario() {
        ArrayList<Persona> lista = new ArrayList<>();
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream("D:/Keiinerp/Personas.kev"));
            lista = (ArrayList<Persona>) lector.readObject();
            lector.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo realizar la operacion" + "(Excepción: " + e.getMessage() + ")");
        }
        return lista;
    }

 */
 /*
    public static void escribirTexto(ArrayList<Persona> lista) {
        FileWriter ever;
        PrintWriter escritor = null;
        try {
            ever = new FileWriter("D:/ever.txt");
            escritor = new PrintWriter(ever);
            for (Persona persona : lista) {
                escritor.println(persona.getNombre() + "," + persona.getIdentificacion() + "," + persona.getEdad() + "," + persona.getTelefono());
                escritor.close();
            }
        } catch (Exception e) {
        }
    }

    public static ArrayList<Persona> leerTexto() {
        ArrayList<Persona> lista = new ArrayList<>();
        File ever;
        FileReader leer;
        BufferedReader leercomodo;
        Persona perso;
        try {
            ever = new File("D:/ever.txt");
            leer = new FileReader(ever);
            leercomodo = new BufferedReader(leer);
            String line;
            while ((line = leercomodo.readLine()) != null) {
                String datos[] = line.split(",");
                perso = new Persona();
                perso.setNombre(datos[0]);
                perso.setIdentificacion(datos[1]);
                perso.setEdad(Integer.valueOf(datos[2]));
                perso.setTelefono(Integer.valueOf(datos[3]));
                lista.add(perso);
            }
            leercomodo.close();
            leer.close();
        } catch (Exception e) {
        }
        return lista;
    }

}
 */
