import java.util.ArrayList;

public class Actividad9801 {

    public int puntuacionPalabra(String word) {
        ArrayList <String> guardarLetras = new ArrayList<>();
        int puntuacion = 0;
        String palabra = word;
        int contador = 0;
        while (palabra.length()>contador){
            String letra = palabra.substring(contador, contador+1);
            guardarLetras.add(letra);
            contador++;
        }
        if (palabra.length()==0){
            puntuacion = -1;
        }
        else{
            for (String letra : guardarLetras){
                letra = letra.toLowerCase();
                if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u") || letra.equals("l") || letra.equals("n") || letra.equals("r") || letra.equals("s") || letra.equals("t") ){ 
                    puntuacion += 1;
                }
                if (letra.equals("d") || letra.equals("g")){ 
                    puntuacion += 2;
                }
                if (letra.equals("b") || letra.equals("c") || letra.equals("m") || letra.equals("p")){ 
                    puntuacion += 3;
                }
                if (letra.equals("f") || letra.equals("h") || letra.equals("v") || letra.equals("w") || letra.equals("y")){ 
                    puntuacion += 4;
                }
                if (letra.equals("k")){
                    puntuacion += 5;
                }
                if (letra.equals("j") || letra.equals("x")){
                    puntuacion += 8;
                }
                if (letra.equals("q") || letra.equals("z")){
                    puntuacion += 10;
                }
            }
        }
        return puntuacion;
    }
}