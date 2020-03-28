import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class EsempioBuffer extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
        response.setContentType("text/html");
        PrintWriter output = response.getWriter();
        // crea una pagina HTML e la invia al client
        StringBuffer buffer = new StringBuffer();
        buffer.append("<HTML><HEAD>");
		
        buffer.append("<TITLE>Secondo esempio di servlet</TITLE>");
        buffer.append("</HEAD><BODY bgcolor=\"white\">");
        buffer.append("<h1>Buongiorno, questa è la seconda servlet!</h1>");
        buffer.append("</BODY></HTML>");
        output.println( buffer.toString() );
        output.close(); //chiusura del PrintWriter stream
    }
}