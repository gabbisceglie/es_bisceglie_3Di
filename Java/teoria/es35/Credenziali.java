class Credenziali {
    private String loginCorretto;
    private String passwordCorretta;

    public Credenziali(String loginCorretto, String passwordCorretta) {
        this.loginCorretto = loginCorretto;
        this.passwordCorretta = passwordCorretta;
    }

    public boolean verifica(String login, String password) {
        return loginCorretto.equals(login) && passwordCorretta.equals(password);
    }
}