package Automóvel;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CadastroServlet")
public class CadastroServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String modelo = request.getParameter("modelo");
        String marca = request.getParameter("marca");
        Integer anoFabricacao = Integer.parseInt(request.getParameter("anoFabricacao"));

        Carro carro = new Carro();
        
        carro.setModelo(modelo);
        carro.setMarca(marca);
        carro.setAnoFabricacao(anoFabricacao);

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>Sucesso</title></head>");
        out.println("<body>");
        out.println("<h1>Dados cadastrados com sucesso!</h1>");
        out.println("<ul>");
        out.println("<li><span class='field-label'>Modelo:</span> " + carro.getModelo() + "</li>");
        out.println("<li><span class='field-label'>Marca:</span> " + carro.getMarca() + "</li>");
        out.println("<li><span class='field-label'>Ano de Fabricação:</span> " + carro.getAnoFabricacao() + "</li>");
        out.println("</ul>");
        out.println("<a href='index.html'>Voltar para a página inicial</a>");
        out.println("</body>");
        out.println("</html>");
    }
}
