<jsp:useBean id="padrao" class="Biblioteca.padrao"></jsp:useBean>
<nav class="navbar navbar-default" role="navigation">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="<% out.print(padrao.getLinkPadrao());%>">Prognow</a>
        </div>
        <!--/.navbar-header-->
        <div class="navbar-collapse collapse" id="bs-example-navbar-collapse-1" style="height: 1px;">
            <ul class="nav navbar-nav">
                
                <!--
                <li class="dropdown">
                    <a href="<% out.print(padrao.getLinkPadrao());%>?pagina=eventos"><i class="fa fa-calendar"></i><span>Eventos</span></a>
                </li>
                -->

                <li class="dropdown">
                    <a href="<% out.print(padrao.getLinkPadrao());%>?pagina=site-cursos"><i class="fa fa-list"></i><span>Cursos Completos</span></a>
                </li>

                <li class="dropdown">
                    <a href="<% out.print(padrao.getLinkPadrao());%>?pagina=site-desenvolvedores"><i class="fa fa-users"></i><span>Desenvolvedores</span></a>
                </li>
                
                
                
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-user"></i><span>Entrar</span></a>
                    <ul class="dropdown-menu search-form">
                        <form>        
                            <input type="text" class="" name="E-mail" placeholder="E-mail">    
                            <input type="text" class="" name="Senha"  placeholder="Senha">   
                            <button type="submit" class="search-submit"><i class="fa fa-search"></i></button>
                        </form>
                    </ul>
                </li>
                
                <li class="dropdown">
                    <a href="<% out.print(padrao.getLinkPadrao());%>?pagina=site-contato"><i class="fa fa-envelope"></i><span>Contato</span></a>
                </li>

            </ul>
        </div>
        <div class="clearfix"> </div>
    </div>
    <!--/.navbar-collapse-->
</nav>