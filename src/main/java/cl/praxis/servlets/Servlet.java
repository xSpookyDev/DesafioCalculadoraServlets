package cl.praxis.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        // Capturar los parámetros correctos desde el formulario
        String numero1Str = request.getParameter("numero1");
        String numero2Str = request.getParameter("numero2");
        String operacion = request.getParameter("operacion");

        try {
            // Convertir los parámetros a números
            double numero1 = Double.parseDouble(numero1Str);
            double numero2 = Double.parseDouble(numero2Str);

            out.print("<html>");
            out.print("<body>");
            out.print("<h1>Resultado de la Operación</h1>");
            
            // Ejecutar la operación seleccionada
            switch (operacion) {
                case "suma":
                    out.print("La suma es: " + (numero1 + numero2));
                    break;
                case "resta":
                    out.print("La resta es: " + (numero1 - numero2));
                    break;
                case "multiplicacion":
                    out.print("La multiplicación es: " + (numero1 * numero2));
                    break;
                case "division":
                    if (numero2 != 0) {
                        out.print("La división es: " + (numero1 / numero2));
                    } else {
                        out.print("No se puede dividir por cero.");
                    }
                    break;
                case "ordenar":
                    double[] numeros = {numero1, numero2};
                    Arrays.sort(numeros);
                    out.print("Los números ordenados son: " + numeros[0] + ", " + numeros[1]);
                    break;
                case "par_impar":
                    out.print(numero1 + " es " + (numero1 % 2 == 0 ? "par" : "impar"));
                    out.print("<br/>");
                    out.print(numero2 + " es " + (numero2 % 2 == 0 ? "par" : "impar"));
                    break;
                default:
                    out.print("Operación no válida.");
            }

            out.print("</body>");
            out.print("</html>");
        } catch (NumberFormatException e) {
            out.print("Por favor, ingrese números válidos.");
        } finally {
            out.close();
        }
    }
}
