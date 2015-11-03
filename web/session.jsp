<jsp:useBean id="biblioteca" class="Biblioteca.layout"></jsp:useBean>
    
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <script>
            $(document).ready(function () {
                $("#validar").click(function () {
                    $mensagem_retorno = '';
                    if($("#email").val() == ""){
                        $mensagem_retorno+=" O Email não pode ser vazio <br>";
                    }
                    if($("#senha").val() == ""){
                        $mensagem_retorno+=" A Senha não pode ser vazia ";
                    }
                    
                    if($mensagem_retorno != ""){
                        alert($mensagem_retorno);
                        return false;
                    }else{
                        return true;
                    }
                    
                });






            });

        </script>
    </head>
    <body>
        <%
        biblioteca.SetDiv("za");
        out.print(biblioteca.GetDiv());
        
        if(session.getAttribute("nome") == "null"){
            out.print("esta vazio");
        }else{
            out.print("esta Cheio");
            out.print(session.getAttribute("nome"));
        }
        
            
        %>
        <div>TODO write content</div>
        <form action="usuario" method="post">
            <label>E-mail</label><input type="text" name="email" id="email">
            <label>Senha</label><input type="text" name="senha"  id="senha">
            <input type="submit" value="Enviar" id="validar">
        </form>
        
        
        
        
    </body>
</html>
