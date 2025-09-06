package cms.user;

public abstract class User {
    protected int id;
    protected String nome;
    protected String email;
    protected String password;

    public User(int id, String nome, String email, String password) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.password = password;
    }

    // Getters comuns
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

   
}
