package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import entity.User;
import func.UserFunc;
import view.DashBoardView;
import view.LoginFrame;

public class LoginController {
    private LoginFrame loginFrame;
    private UserFunc SignInAd = new UserFunc();
    private DashBoardView dbView;

    public LoginController(LoginFrame viewLogin){
        this.loginFrame = viewLogin;
        loginFrame.setVisible(true);
        viewLogin.ClickLoginBtn(new LoginListener());
        viewLogin.EnterPassField(new LoginEnter());
    }
    public void showLogin(){
        loginFrame.setVisible(true);
    }

    public void login(){
        User user = loginFrame.getUser();
        if (SignInAd.checkUser(user)) {
            loginFrame.setVisible(false);
            dbView = new DashBoardView();
            DashBoardController dashBoardController = new DashBoardController(dbView);
            dashBoardController.showDashView();
        } else {
            loginFrame.showMessage("username hoặc password không đúng!");
        }
    }

    class LoginListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            login();
        }
    }
    class LoginEnter extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                login();
            }
        }
    }
}
