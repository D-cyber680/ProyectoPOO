package principal;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.AbstractListModel;
import java.awt.Button;
import java.awt.Canvas;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.border.BevelBorder;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GameModes extends JFrame {

    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    GameModes frame = new GameModes();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public GameModes() {
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 626, 476);
        contentPane = new JPanel();
        contentPane.setBackground(Color.DARK_GRAY);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("MODOS DE JUEGO");
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setFont(new Font("Nirmala UI", Font.BOLD, 22));
        lblNewLabel.setBounds(200, 14, 204, 53);
        contentPane.add(lblNewLabel);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(341, 77, 239, 64);
        contentPane.add(scrollPane);

        JLabel description = new JLabel("");
        description.setFont(new Font("Tahoma", Font.PLAIN, 12));
        description.setForeground(new Color(204, 204, 204));
        description.setBounds(10, 303, 570, 112);

        JList list = new JList();
        list.setSelectedIndex(0);
        list.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                int listindex = list.getSelectedIndex();
                System.out.println("The value selected was: " + listindex);
                if (listindex == 0) {
                    description.setText("<html> Prueba tus conocimientos para resolver operaciones  aritmeticas con ejercicios que te llevaran al limite Cuanto mas rapido los resuelvas mayor sera tu puntuacion.</html>");
                } else if (listindex == 1) {
                    description.setText("<html>�Resuelve tantos ejercicios como puedas! cada ejercicio es mas dificil que el anterior. Tres fallos y te quedas fuera. </html>");

                } else if (listindex == 2) {
                    description.setText("Math Rush contra otra persona. Por turnos, con 2 min para cada jugador.");
                }
            }
        });
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        scrollPane.setViewportView(list);
        list.setBackground(new Color(255, 255, 255));
        list.setForeground(new Color(0, 153, 0));
        list.setFont(new Font("Lucida Console", Font.PLAIN, 18));
        list.setModel(new AbstractListModel() {
            String[] values = new String[]{"Entrenamiento", "Math Rush"};

            public int getSize() {
                return values.length;
            }

            public Object getElementAt(int index) {
                return values[index];
            }
        });

        JButton btnNewButton = new JButton("Comenzar!");

        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int listindex = list.getSelectedIndex();
                if (listindex == 0) {
                    System.out.println("Entrenamiento");
                    TrainingMode training = new TrainingMode();
                    training.setVisible(true);
                } else if (listindex == 1) {
                    System.out.println("MathRush");
                    MathRushMode mathrush = new MathRushMode();
                    mathrush.setVisible(true);

                } else if (listindex == 2) {
                    System.out.println("1 vs 1");

                }
            }
        });
        btnNewButton.setBackground(Color.ORANGE);
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
        btnNewButton.setBounds(341, 151, 239, 45);
        contentPane.add(btnNewButton);
        contentPane.add(description);
    }
}
