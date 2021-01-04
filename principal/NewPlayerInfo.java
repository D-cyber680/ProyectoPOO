package principal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.Window.Type;
import java.awt.Color;

public class NewPlayerInfo extends JFrame {

    private JPanel contentPane;
    private JTextField textField;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    NewPlayerInfo frame = new NewPlayerInfo();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public NewPlayerInfo() {
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 538, 438);
        contentPane = new JPanel();
        contentPane.setBackground(Color.DARK_GRAY);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("CREAR JUGADOR");
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 28));
        lblNewLabel.setBounds(123, 40, 265, 62);
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Nombre");
        lblNewLabel_1.setForeground(Color.LIGHT_GRAY);
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
        lblNewLabel_1.setBounds(61, 182, 85, 29);
        contentPane.add(lblNewLabel_1);

        textField = new JTextField();
        textField.setBounds(144, 181, 291, 29);
        contentPane.add(textField);
        textField.setColumns(10);

        JButton btnNewButton = new JButton("\u00A1A JUGAR!");
        btnNewButton.setBackground(Color.ORANGE);
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ImageIcon icon = new ImageIcon("src/NametagNew.png");
                int input = JOptionPane.showConfirmDialog(null, "�Estas seguro?", "Selecciona una opcion", JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE, icon);
                if (input == 0) { //Si
                    dispose(); //-> Cierra el Frame
                    GameModes frame = new GameModes();
                    frame.setVisible(true);
                }
            }
        });
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
        btnNewButton.setBounds(103, 293, 309, 37);
        contentPane.add(btnNewButton);
    }

}
