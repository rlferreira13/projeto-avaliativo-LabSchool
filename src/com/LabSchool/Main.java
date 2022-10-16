package src.com.LabSchool;

import src.com.LabSchool.cli.Menu;

public class Main {
    public static void main(String[] args) throws ErrodeInput {
        try {
            Menu.MenuPrincipal();
        } catch (Exception e) {
            throw new ErrodeInput();
        }
    }
}