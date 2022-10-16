package src.com.LabSchool;

public class ErrodeInput extends Exception {
    @Override
    public String getMessage() {
        return "Entrada inválida, digite apenas números.";
    }
}
