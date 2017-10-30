package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class preCadUsuario_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("﻿<!DOCTYPE html>\n");
      out.write("<html lang=\"pt-br\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("        <title>Pré-Cadastro de Associado (Usuário) - SESC</title>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div id=\"main\" class=\"container\">\n");
      out.write("            <hl><img src=\"img/sescLogo.png\"></hl>\n");
      out.write("            <hr/>\n");
      out.write("            <h3 class=\"page-header\">Pré-Cadastro de Associado</h3>\n");
      out.write("            <hr />\n");
      out.write("            <form action=\"ServletCadUsuario\">\n");
      out.write("                <div class=\"row\"> <!-- Pessoal -->\n");
      out.write("                    <div class=\"form-group col-md-5\">\n");
      out.write("                        <label for=\"lbCpf\">CPF</label>\n");
      out.write("                        <input type=\"text\" name=\"cpf\" class=\"form-control\" \n");
      out.write("                               onkeyup=\"somenteNumeros(this)\" id=\"cpf\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-group col-md-7\">\n");
      out.write("                        <label for=\"lbNome\">NOME</label>\n");
      out.write("                        <input type=\"text\" name=\"nome\" class=\"form-control\" id=\"nome\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-group col-md-4\">\n");
      out.write("                        <label for=\"lbDtNascimento\">DATA DE NASCIMENTO</label>\n");
      out.write("                        <input type=\"text\" name=\"dtNascimento\" class=\"form-control\" id=\"dtNascimento\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-group col-md-3\">\n");
      out.write("                        <label for=\"lbSexo\">SEXO</label>\n");
      out.write("                        <input type=\"text\" name=\"sexo\" class=\"form-control\" id=\"sexo\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-group col-md-5\">\n");
      out.write("                        <label for=\"lbStCivil\">ESTADO CIVIL</label>\n");
      out.write("                        <input type=\"text\" name=\"stCivil\" class=\"form-control\" id=\"stCivil\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <hr />\n");
      out.write("\n");
      out.write("                <div class=\"row\"> <!-- Endereço -->\n");
      out.write("                    <div class=\"form-group col-md-2\">\n");
      out.write("                        <label for=\"lbCep\">CEP</label>\n");
      out.write("                        <input name=\"cep\" type=\"text\" id=\"cep\" value=\"\" size=\"10\" maxlength=\"9\"\n");
      out.write("                               onkeyup=\"somenteNumeros(this)\"\n");
      out.write("                               onblur=\"pesquisacep(this.value);\"  class=\"form-control\"/>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-group col-md-6\">\n");
      out.write("                        <label for=\"lbEndereco\">ENDEREÇO</label>\n");
      out.write("                        <input name=\"endereco\" type=\"text\" id=\"endereco\" size=\"60\"\n");
      out.write("                               class=\"form-control\" disabled/>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-group col-md-4\">\n");
      out.write("                        <label for=\"lbComplemento\">COMPLEMENTO</label>\n");
      out.write("                        <input type=\"text\" name=\"complemento\" class=\"form-control\" \n");
      out.write("                              class=\"form-control\" id=\"complemento\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-group col-md-3\">\n");
      out.write("                        <label for=\"lbBairro\">BAIRRO</label>\n");
      out.write("                       <input name=\"bairro\" type=\"text\" id=\"bairro\" size=\"40\" \n");
      out.write("                              class=\"form-control\" disabled/>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-group col-md-1\">\n");
      out.write("                        <label for=\"lbUF\">UF</label>\n");
      out.write("                        <input name=\"uf\" type=\"text\" id=\"uf\" size=\"2\" \n");
      out.write("                               class=\"form-control\" disabled/>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-group col-md-4\">\n");
      out.write("                        <label for=\"lbCidade\">CIDADE</label>\n");
      out.write("                        <input name=\"cidade\" type=\"text\" id=\"cidade\" size=\"40\" \n");
      out.write("                               class=\"form-control\" disabled/>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-group col-md-4\">\n");
      out.write("                        <label for=\"lbHabitacao\">HABITAÇÃO</label>\n");
      out.write("                        <input type=\"text\" name=\"habitacao\" class=\"form-control\" id=\"habitacao\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <hr />\n");
      out.write("\n");
      out.write("                <div class=\"row\"> <!-- Outros -->\n");
      out.write("                    <div class=\"form-group col-md-6\">\n");
      out.write("                        <label for=\"lbNomePai\">NOME DO PAI</label>\n");
      out.write("                        <input type=\"text\" name=\"nomePai\" class=\"form-control\" id=\"nomePai\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-group col-md-6\">\n");
      out.write("                        <label for=\"lbNomeMae\">NOME DA MÃE</label>\n");
      out.write("                        <input type=\"text\" name=\"nomeMae\" class=\"form-control\" id=\"nomeMae\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-group col-md-3\">\n");
      out.write("                        <label for=\"lbRG\">RG</label>\n");
      out.write("                        <input type=\"text\" name=\"rg\" \n");
      out.write("                               onkeyup=\"somenteNumeros(this)\" class=\"form-control\" id=\"rg\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-group col-md-2\">\n");
      out.write("                        <label for=\"lbOrgEmissor\">EMISSOR</label>\n");
      out.write("                        <input type=\"text\" name=\"emissor\" class=\"form-control\" id=\"orgEmissor\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-group col-md-4\">\n");
      out.write("                        <label for=\"lbNaturalidade\">NATURALIDADE</label>\n");
      out.write("                        <input type=\"text\" name=\"naturalidade\" class=\"form-control\" id=\"naturalidade\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group col-md-3\">\n");
      out.write("                        <label for=\"lbNacionalidade\">NACIONALIDADE</label>\n");
      out.write("                        <input type=\"text\" name=\"nacionalidade\" class=\"form-control\" id=\"nacionalidade\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-group col-md-5\">\n");
      out.write("                        <label for=\"lbProfissao\">PROFISSÃO</label>\n");
      out.write("                        <input type=\"text\" name=\"profissao\" class=\"form-control\" id=\"profissao\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group col-md-3\">\n");
      out.write("                        <label for=\"lbRenda\">RENDA MENSAL</label>\n");
      out.write("                        <input type=\"text\" name=\"renda\" class=\"form-control\" \n");
      out.write("                               onkeyup=\"somenteNumeros(this)\" id=\"renda\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group col-md-4\">\n");
      out.write("                        <label for=\"lbGrauIntrucao\">GRAU DE INSTRUÇÃO</label>\n");
      out.write("                        <input type=\"text\" name=\"grauInstrucao\" class=\"form-control\" id=\"grauIntrucao\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <hr />\n");
      out.write("\n");
      out.write("                <div class=\"row\"> <!-- Contato -->\n");
      out.write("                    <div class=\"form-group col-md-3\">\n");
      out.write("                        <label for=\"lbTelefoneCel\">TELEFONE CELULAR</label>\n");
      out.write("                        <input type=\"text\" name=\"celular\" class=\"form-control\"\n");
      out.write("                               onkeyup=\"somenteNumeros(this)\" id=\"telCelular\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-group col-md-2\">\n");
      out.write("                        <label for=\"lbResidencial\">RESIDENCIAL</label>\n");
      out.write("                        <input type=\"text\" name=\"residencial\" class=\"form-control\"\n");
      out.write("                               onkeyup=\"somenteNumeros(this)\" id=\"telResidencial\">\n");
      out.write("                    </div> \n");
      out.write("\n");
      out.write("                    <div class=\"form-group col-md-2\">\n");
      out.write("                        <label for=\"lbComercial\">COMERCIAL</label>\n");
      out.write("                        <input type=\"text\" name=\"comercial\" class=\"form-control\"\n");
      out.write("                               onkeyup=\"somenteNumeros(this)\" id=\"telComercial\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-group col-md-5\">\n");
      out.write("                        <label for=\"lbEmail\" form=\"inputEmail\">E-MAIL</label>\n");
      out.write("                        <input type=\"email\" name=\"email\" class=\"form-control\" id=\"email\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <hr />\n");
      out.write("                <div id=\"actions\" class=\"row\">\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <a href=\"index.jsp\" class=\"btn btn-secondary\">Cancelar</a>\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary\" onclick=\"UsuarioDAO\"\n");
      out.write("                                >Proximo >></button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("            <div> \n");
      out.write("                <footer>\n");
      out.write("                    <hr >\n");
      out.write("                </footer>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- jQuery (necessario para os plugins Javascript do Bootstrap) -->\n");
      out.write("        <script src=\"js/funcoes.js\"></script>\n");
      out.write("        <script src=\"js/jquery.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    </body>\n");
      out.write("\n");
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
