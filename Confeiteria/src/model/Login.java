package model;

public class Login {
    private static int idCliente;
    private static String email;

    public static int getIdCliente() {
        return idCliente;
    }

    public static void setIdCliente(int idCliente) {
        Login.idCliente = idCliente;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        Login.email = email;
    }
}
