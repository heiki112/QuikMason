/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2015-03-29 18:01:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class record_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/WEB-INF/tags/header.tag", Long.valueOf(1427652028384L));
    _jspx_dependants.put("/WEB-INF/views/init.jsp", Long.valueOf(1427652028393L));
    _jspx_dependants.put("/WEB-INF/tags/pageTemplate.tag", Long.valueOf(1427652028386L));
    _jspx_dependants.put("/WEB-INF/tags/menu.tag", Long.valueOf(1427652028385L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_nrtl_005fpageTemplate_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_nrtl_005fpageTemplate_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  nrtl:pageTemplate
    org.apache.jsp.tag.webpageTemplate_tag _jspx_th_nrtl_005fpageTemplate_005f0 = (new org.apache.jsp.tag.webpageTemplate_tag());
    _jsp_instancemanager.newInstance(_jspx_th_nrtl_005fpageTemplate_005f0);
    _jspx_th_nrtl_005fpageTemplate_005f0.setJspContext(_jspx_page_context);
    _jspx_th_nrtl_005fpageTemplate_005f0.setJspBody(new Helper( 0, _jspx_page_context, _jspx_th_nrtl_005fpageTemplate_005f0, null));
    _jspx_th_nrtl_005fpageTemplate_005f0.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_nrtl_005fpageTemplate_005f0);
    return false;
  }

  private boolean _jspx_meth_nrtl_005fheader_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  nrtl:header
    org.apache.jsp.tag.webheader_tag _jspx_th_nrtl_005fheader_005f0 = (new org.apache.jsp.tag.webheader_tag());
    _jsp_instancemanager.newInstance(_jspx_th_nrtl_005fheader_005f0);
    _jspx_th_nrtl_005fheader_005f0.setJspContext(_jspx_page_context);
    _jspx_th_nrtl_005fheader_005f0.setParent(_jspx_parent);
    _jspx_th_nrtl_005fheader_005f0.setJspBody(new Helper( 1, _jspx_page_context, _jspx_th_nrtl_005fheader_005f0, null));
    _jspx_th_nrtl_005fheader_005f0.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_nrtl_005fheader_005f0);
    return false;
  }

  private class Helper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public Helper( int discriminator, javax.servlet.jsp.JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public boolean invoke0( javax.servlet.jsp.JspWriter out ) 
      throws java.lang.Throwable
    {
      out.write("\r\n");
      out.write("\r\n");
      out.write("  ");
      if (_jspx_meth_nrtl_005fheader_005f0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <div ng-controller=\"RecordController\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("      <div class=\"col-sm-12\">\r\n");
      out.write("        <!-- Grid is placed here by angular.js -->\r\n");
      out.write("        <div class=\"gridStyle\" ng-grid=\"gridOptions\"></div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <form name=\"form\" class=\"css-form\" novalidate>\r\n");
      out.write("      <h2 id=\"addRecord\">Add/edit record</h2>\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("        <div class=\"col-sm-4\">\r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("            <label>Employees involved:</label>\r\n");
      out.write("            <ui-select multiple=\"true\" sortable=\"true\" ng-model=\"record.employees\" theme=\"bootstrap\" class=\"form-control\" title=\"Choose employees\">\r\n");
      out.write("              <ui-select-match placeholder=\"Select or search a employee in the list...\">{{$item.employeeName}}</ui-select-match>\r\n");
      out.write("              <ui-select-choices repeat=\"item in employeeList | filter: $select.search track by item.id\">\r\n");
      out.write("                <div ng-bind-html=\"item.employeeName | highlight: $select.search\"></div>\r\n");
      out.write("                <small ng-bind-html=\"item.kind | highlight: $select.search\"></small>\r\n");
      out.write("              </ui-select-choices>\r\n");
      out.write("            </ui-select>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("            <label>Projects involved:</label>\r\n");
      out.write("            <ui-select multiple=\"true\" sortable=\"true\" ng-model=\"record.projects\" theme=\"bootstrap\" class=\"form-control\" title=\"Choose projects\">\r\n");
      out.write("              <ui-select-match placeholder=\"Select or search a projects in the list...\">{{$item.projectName}}</ui-select-match>\r\n");
      out.write("              <ui-select-choices repeat=\"item in projectList | filter: $select.search track by item.id\">\r\n");
      out.write("                <div ng-bind-html=\"item.projectName | highlight: $select.search\"></div>\r\n");
      out.write("              </ui-select-choices>\r\n");
      out.write("            </ui-select>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-sm-4\">\r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("            <label for=\"inputDatepicker\">Date:</label>\r\n");
      out.write("            <div class=\"input-group\">\r\n");
      out.write("              <input id=\"inputDatepicker\" class=\"form-control\" type=\"text\" ng-model=\"record.date\" data-date-format=\"dd.MM.yyyy\" data-date-type=\"string\" bs-datepicker>\r\n");
      out.write("              <div class=\"input-group-addon\"><i class=\"icon-calendar\"></i></div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("            <label>Type:</label>\r\n");
      out.write("            <select ng-model=\"record.typeString\" class=\"form-control\" required ng-options=\"type as type for type in typeOptions\">\r\n");
      out.write("            </select>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-sm-4\">\r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("            <label>Content:</label>\r\n");
      out.write("            <textarea class=\"form-control\" ng-model=\"record.content\" required ng-maxlength=\"2000\" style=\"height: 108px;\"></textarea>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("        <div class=\"col-sm-12 text-center\">\r\n");
      out.write("          <button ng-click=\"update(record)\" class=\"btn btn-primary\">SAVE</button>\r\n");
      out.write("          <button ng-click=\"clear()\" class=\"btn btn-danger\">CLEAR</button>\r\n");
      out.write("          <a href=\"/record/export\" class=\"btn btn-link\">Export records</a>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </form>\r\n");
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      return false;
    }
    public boolean invoke1( javax.servlet.jsp.JspWriter out ) 
      throws java.lang.Throwable
    {
      out.write("\r\n");
      out.write("    <h1>Records</h1>\r\n");
      out.write("  ");
      return false;
    }
    public void invoke( java.io.Writer writer )
      throws javax.servlet.jsp.JspException
    {
      javax.servlet.jsp.JspWriter out = null;
      if( writer != null ) {
        out = this.jspContext.pushBody(writer);
      } else {
        out = this.jspContext.getOut();
      }
      try {
        Object _jspx_saved_JspContext = this.jspContext.getELContext().getContext(javax.servlet.jsp.JspContext.class);
        this.jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,this.jspContext);
        switch( this.discriminator ) {
          case 0:
            invoke0( out );
            break;
          case 1:
            invoke1( out );
            break;
        }
        jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,_jspx_saved_JspContext);
      }
      catch( java.lang.Throwable e ) {
        if (e instanceof javax.servlet.jsp.SkipPageException)
            throw (javax.servlet.jsp.SkipPageException) e;
        throw new javax.servlet.jsp.JspException( e );
      }
      finally {
        if( writer != null ) {
          this.jspContext.popBody();
        }
      }
    }
  }
}