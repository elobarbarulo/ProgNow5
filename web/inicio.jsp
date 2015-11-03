<jsp:useBean id="definitivo" class="Biblioteca.padrao"></jsp:useBean>
<%@ include file="/includes/_head.jsp" %>
<%@ include file="/includes/_menu_topo.jsp" %>
<%@ include file="/includes/_menu_topo_conteudo.jsp" %>


<%
    String pagina = request.getParameter("pagina");
    if (pagina == null) {
%>
    <jsp:include page="<%="includes/site-inicio.jsp"%>"/>
<%
    }else{
    %>
    <jsp:include page="<%="includes/"+pagina+".jsp"%>"/>
    <%
    }    
%>

<%@ include file="/includes/_rodape.jsp" %>