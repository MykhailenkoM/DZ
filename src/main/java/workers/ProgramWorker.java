package workers;

import java.util.Scanner;

public class ProgramWorker {

    public static void main(String[] args) {

        String password;
        String proPassword = "Pro_password";
        String expPassword = "Exp_password";
        Scanner input = new Scanner(System.in);
        System.out.print("Пожалуйста, введите пароль: ");
        password = input.nextLine();

        if (password.equals(proPassword)) {
            ProDocumentWorker pw = new ProDocumentWorker();
            pw.openDocument();
            pw.editDocument();
            pw.saveDocument();

        }
        else if (password.equals(expPassword)) {
            ExpertDocumentWorker ew = new ExpertDocumentWorker();
            ew.openDocument();
            ew.editDocument();
            ew.saveDocument();
        }
        else {
            DocumentWorker dw = new DocumentWorker();
            dw.openDocument();
            dw.editDocument();
            dw.saveDocument();
        }

    }
}
