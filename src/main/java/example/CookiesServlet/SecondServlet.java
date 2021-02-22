package example.CookiesServlet;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

public class SecondServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response){
        try{

            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            Cookie[] ck =request.getCookies();
            out.print("Hello "+ck[0].getValue());

            out.close();

        }catch(Exception e){System.out.println(e);}
    }


}
