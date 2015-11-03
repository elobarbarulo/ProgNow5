package Modelo;

public class C_Usuario {

    private String Nome;
    private String Email;
    private String Senha;
    private int Status;
    private int Tipo;
    
    public String getNome() {
        return this.Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int Status) {
        this.Status = Status;
    }
    public int getTipo() {
        return Tipo;
    }

    public void setTipo(int Tipo) {
        this.Tipo = Tipo;
    }
    
    
    public int Login (){
        String email = this.Email;
        String senha = this.Senha;
        int retorno = 0;
        
        if("vinicius".equals(email) && "erro".equals(senha) ){
            retorno = 0;
        }
        if("vinicius".equals(email) && "masters".equals(senha) ){
            retorno = 1;
            setTipo(1);
            setNome("Vinicius");
        }
        if("vinicius".equals(email) && "empresa".equals(senha) ){
            retorno = 2;
            setTipo(2);
            setNome("Vinicius");
        }
        if("vinicius".equals(email) && "usuario".equals(senha) ){
            retorno = 3;
            setTipo(3);
            setNome("Vinicius");
        }        
        //Cria a consulta para o DAO e pega o retorno 
        return retorno;
    }
    
}
