/*
  * @autor Sosa Estrada María Fernanda y Vega Corona Yazmin María
  * @date 05/09/2017
 */
package Serverlets;
import java.io.IOException;
import Servicio.Servicio;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet(name = "Emai", urlPatterns = {"/Email"})
public class Email extends HttpServlet {
    //serverlet que ejecuta clases y regresa un mensaje
    Servicio servicio = null;
     
    public void init(ServletConfig config)throws ServletException{
        servicio = new Servicio();
    }
     
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String message = servicio.doLogin(email,password);
        response.getWriter().write(message);
    }
}

