package view;

import UI.layout.swing.GradientBackgroundPanel;
import UI.layout.Login;
import controller.DashBoardController;
import entity.User;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;

public class LoginFrame extends JFrame {
    Login loginLayout;
    public LoginFrame(){
        initComponent();
    }
    public void initComponent(){
        setSize(1000,600);
        setTitle("Medicine App");
        setLayout(new MigLayout("insets 0 0 0 0", "[]0[]", "push[center][center]push"));

        GradientBackgroundPanel first = new GradientBackgroundPanel();
        first.setLayout(new MigLayout("wrap", "push[center]push", "push[]10[]push"));
        first.setMinimumSize(new Dimension(695,600));
        first.setPreferredSize(new Dimension(695,600));
        first.setMaximumSize(new Dimension(695,600));
        JLabel nameApp = new JLabel("MEDICINE MANAGER APP");
        nameApp.setFont(new Font("Calibri", 1, 50));
        nameApp.setHorizontalAlignment(SwingConstants.CENTER);
        first.add(nameApp);

        JLabel desApp = new JLabel("Ứng dụng quản lý vật tư, thuốc của nhà thuốc");
        desApp.setSize(new Dimension());
        desApp.setFont(new Font("Calibri", 2, 18));
        desApp.setHorizontalAlignment(SwingConstants.CENTER);
        first.add(desApp);
        add(first, "w 50%");

        loginLayout = new Login();
        loginLayout.setBackground(new Color(248, 244, 202));
        add(loginLayout, "wrap");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //đóng khi cửa số đóng
        setLocationRelativeTo(null);
        setVisible(false);
    }
    private Image scaleImage(Image image, int w, int h) {
        Image scaled = image.getScaledInstance(w, h, Image.SCALE_SMOOTH);
        return scaled;
    }

    public User getUser() {
        return loginLayout.getUser();
    }

    public void ClickLoginBtn(ActionListener listener) {
        loginLayout.ClickLgBtn(listener);
    }

    public void EnterPassField(KeyAdapter a){
        loginLayout.EnterPField(a);
    }


    public void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }

}
