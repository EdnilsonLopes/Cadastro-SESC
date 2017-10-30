package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("    <title>ViaCEP Webservice</title>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("\n");
      out.write("    <!-- Adicionando Javascript -->\n");
      out.write("    <script type=\"text/javascript\" >\n");
      out.write("    \n");
      out.write("    function limpa_formulário_cep() {\n");
      out.write("            //Limpa valores do formulário de cep.\n");
      out.write("            document.getElementById('rua').value=(\"\");\n");
      out.write("            document.getElementById('bairro').value=(\"\");\n");
      out.write("            document.getElementById('cidade').value=(\"\");\n");
      out.write("            document.getElementById('uf').value=(\"\");\n");
      out.write("            document.getElementById('ibge').value=(\"\");\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function meu_callback(conteudo) {\n");
      out.write("        if (!(\"erro\" in conteudo)) {\n");
      out.write("            //Atualiza os campos com os valores.\n");
      out.write("            document.getElementById('rua').value=(conteudo.logradouro);\n");
      out.write("            document.getElementById('bairro').value=(conteudo.bairro);\n");
      out.write("            document.getElementById('cidade').value=(conteudo.localidade);\n");
      out.write("            document.getElementById('uf').value=(conteudo.uf);\n");
      out.write("            document.getElementById('ibge').value=(conteudo.ibge);\n");
      out.write("        } //end if.\n");
      out.write("        else {\n");
      out.write("            //CEP não Encontrado.\n");
      out.write("            limpa_formulário_cep();\n");
      out.write("            alert(\"CEP não encontrado.\");\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("        \n");
      out.write("    function pesquisacep(valor) {\n");
      out.write("\n");
      out.write("        //Nova variável \"cep\" somente com dígitos.\n");
      out.write("        var cep = valor.replace(/\\D/g, '');\n");
      out.write("\n");
      out.write("        //Verifica se campo cep possui valor informado.\n");
      out.write("        if (cep != \"\") {\n");
      out.write("\n");
      out.write("            //Expressão regular para validar o CEP.\n");
      out.write("            var validacep = /^[0-9]{8}$/;\n");
      out.write("\n");
      out.write("            //Valida o formato do CEP.\n");
      out.write("            if(validacep.test(cep)) {\n");
      out.write("\n");
      out.write("                //Preenche os campos com \"...\" enquanto consulta webservice.\n");
      out.write("                document.getElementById('rua').value=\"...\";\n");
      out.write("                document.getElementById('bairro').value=\"...\";\n");
      out.write("                document.getElementById('cidade').value=\"...\";\n");
      out.write("                document.getElementById('uf').value=\"...\";\n");
      out.write("                document.getElementById('ibge').value=\"...\";\n");
      out.write("\n");
      out.write("                //Cria um elemento javascript.\n");
      out.write("                var script = document.createElement('script');\n");
      out.write("\n");
      out.write("                //Sincroniza com o callback.\n");
      out.write("                script.src = '//viacep.com.br/ws/'+ cep + '/json/?callback=meu_callback';\n");
      out.write("\n");
      out.write("                //Insere script no documento e carrega o conteúdo.\n");
      out.write("                document.body.appendChild(script);\n");
      out.write("\n");
      out.write("            } //end if.\n");
      out.write("            else {\n");
      out.write("                //cep é inválido.\n");
      out.write("                limpa_formulário_cep();\n");
      out.write("                alert(\"Formato de CEP inválido.\");\n");
      out.write("            }\n");
      out.write("        } //end if.\n");
      out.write("        else {\n");
      out.write("            //cep sem valor, limpa formulário.\n");
      out.write("            limpa_formulário_cep();\n");
      out.write("        }\n");
      out.write("    };\n");
      out.write("\n");
      out.write("    </script>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("    <!-- Inicio do formulario -->\n");
      out.write("      <form method=\"get\" action=\".\">\n");
      out.write("        <label>Cep:\n");
      out.write("        <input name=\"cep\" type=\"text\" id=\"cep\" value=\"\" size=\"10\" maxlength=\"9\"\n");
      out.write("               onblur=\"pesquisacep(this.value);\" /></label><br />\n");
      out.write("        <label>Rua:\n");
      out.write("        <input name=\"rua\" type=\"text\" id=\"rua\" size=\"60\" /></label><br />\n");
      out.write("        <label>Bairro:\n");
      out.write("        <input name=\"bairro\" type=\"text\" id=\"bairro\" size=\"40\" /></label><br />\n");
      out.write("        <label>Cidade:\n");
      out.write("        <input name=\"cidade\" type=\"text\" id=\"cidade\" size=\"40\" /></label><br />\n");
      out.write("        <label>Estado:\n");
      out.write("        <input name=\"uf\" type=\"text\" id=\"uf\" size=\"2\" /></label><br />\n");
      out.write("        <label>IBGE:\n");
      out.write("        <input name=\"ibge\" type=\"text\" id=\"ibge\" size=\"8\" /></label><br />\n");
      out.write("      </form>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("    </html>\n");
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
