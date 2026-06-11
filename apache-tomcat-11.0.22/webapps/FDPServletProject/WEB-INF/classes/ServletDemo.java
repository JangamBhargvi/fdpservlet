import java.io.PrintWriter;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet("/life")
class ServletDemo extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("init(): servlet initialized");
    }
    @Override
   public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
                      throws ServletException, IOException {
       

        System.out.println("doGet(); processing client requeuest no");
        
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<body>");
        out.println("<h2>Hello! This is doGet() Method Demo</h2>");
        out.println("<p>Welcome to Java Servlet Programming</p>");
        out.println("<a href='index.html'>Go Back</a>");
        out.println("</body>");
        out.println("</html>");

        out.close();
    }
    public void destroy()
    {
        System.out.println("servlet destroy");
    }
}