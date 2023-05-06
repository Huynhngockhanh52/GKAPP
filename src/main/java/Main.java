import org.jdesktop.animation.timing.Animator;

import controller.LoginController;
import view.LoginFrame;

public class Main {
    public static void main(String[] args) {
    //        java.awt.EventQueue.invokeLater(new Runnable() {
    //            public void run() {
    //                new LoginApp();
    //            }
    //        });
        LoginFrame LoginView = new LoginFrame();
        LoginController View = new LoginController(LoginView);
        View.showLogin();

    }
}