import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/JogoServlet")
public class JogoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int numero1 = Integer.parseInt(request.getParameter("numero1"));
        int numero2 = Integer.parseInt(request.getParameter("numero2"));
        int numero3 = Integer.parseInt(request.getParameter("numero3"));
        int numero4 = Integer.parseInt(request.getParameter("numero4"));
        int numero5 = Integer.parseInt(request.getParameter("numero5"));
 
        String pares = "";
        String impares = "";

        if (numero1 % 2 == 0) {
            pares += numero1 + ", ";
        } else {
            impares += numero1 + ", ";
        }

        if (numero2 % 2 == 0) {
            pares += numero2 + ", ";
        } else {
            impares += numero2 + ", ";
        }

        if (numero3 % 2 == 0) {
            pares += numero3 + ", ";
        } else {
            impares += numero3 + ", ";
        }

        if (numero4 % 2 == 0) {
            pares += numero4 + ", ";
        } else {
            impares += numero4 + ", ";
        }

        if (numero5 % 2 == 0) {
            pares += numero5 + ", ";
        } else {
            impares += numero5 + ", ";
        }

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>Resultados</title></head>");
        out.println("<body>");
        out.println("<h1>Números Pares e Ímpares</h1>");
        out.println("<p>Pares: " + pares + "</p>");
        out.println("<p>Ímpares: " + impares + "</p>");
        out.println("<a href='index.html'>Voltar para a página inicial</a>");
        out.println("</body>");
        out.println("</html>");
    }
}
