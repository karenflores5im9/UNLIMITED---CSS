package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css.css\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <ul>\n");
      out.write("            <li><a href=\"index.jsp\">Inicio</a></li>\n");
      out.write("            <li><a href=\"#news\">Empresas</a></li>\n");
      out.write("            <li><a href=\"\">Productos</a></li>\n");
      out.write("            <li style=\"float:right\" class=\"active\"><a href=\"sobreunlimited.jsp\"><img src=\"UNLIMITED.jpg\" width=\"50px\" height=\"50px\"></a></li>  \n");
      out.write("        </ul>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <table align=\"center\">\n");
      out.write("            <th>\n");
      out.write("                <form action=\"registrarusuarios.jsp\" method=\"get\">\n");
      out.write("                    <input type=\"submit\" name=\"botonRegistro\" value=\"Crear cuenta\" class=\"noo\">\n");
      out.write("                </form>\n");
      out.write("            </th>\n");
      out.write("            <th>\n");
      out.write("                <form action=\"IniciarSesion.jsp\" method=\"get\">\n");
      out.write("                    <input type=\"submit\" name=\"botonLogin\" value=\"Iniciar Sesión\" class=\"noo\">\n");
      out.write("                </form>\n");
      out.write("            </th>\n");
      out.write("            <th>\n");
      out.write("                <form action=\"Administracion.jsp\" method=\"get\">\n");
      out.write("                    <input type=\"submit\" name=\"botonAdmin\" value=\"Administración\" class=\"noo\">\n");
      out.write("                </form>\n");
      out.write("            </th>\n");
      out.write("        </table>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
