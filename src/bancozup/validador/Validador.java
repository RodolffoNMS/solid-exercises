package bancozup.validador;

public class Validador {
    public static boolean validarEmail(String email) {
        return email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
    }

    public static boolean validarTelefone(String telefone) {
        return telefone.matches("^\\+?[1-9][0-9]{7,14}$");
    }

    public static boolean validarCPF(String cpf) {
        // Implementar validação de CPF
        return cpf.matches("\\d{11}");
    }
}