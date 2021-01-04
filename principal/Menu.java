package principal;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Menu extends javax.swing.JFrame {

    FondoPanel fondo = new FondoPanel();
    public static Clip clip; //Para seleccionar la musica pero depende del numero
    public static String ruta="/musica/";
    public static String musica ="Menu";
    public static int mute=0; //Para que se mute todo el sonido tiene que estar en 1
    public static int fondos=0; //Seleccionador de fondo
    
    public Menu() {
        this.setContentPane(fondo);
        initComponents();
        BJugar.setIcon(setIcono("/resources/JugarB.JPG", BJugar)); //Cada 2 es un icono en el boton osea este y el que esta justo abajo es para los botones osea este es para cuando esta normal
        BJugar.setPressedIcon(setIconoPresionado("/resources/JugarB2.JPG", BJugar, 10, 10)); // y este cuando esta precionado y asi con los demas botones
        BOpciones.setIcon(setIcono("/resources/OpcionesB.JPG", BOpciones));
        BOpciones.setPressedIcon(setIconoPresionado("/resources/OpcionesB2.JPG", BOpciones, 10, 10));
        BCreditos.setIcon(setIcono("/resources/CreditosB.JPG", BCreditos));
        BCreditos.setPressedIcon(setIconoPresionado("/resources/CreditosB2.JPG", BCreditos, 10, 10));
        BSalir.setIcon(setIcono("/resources/SalirB.JPG", BSalir));
        BSalir.setPressedIcon(setIconoPresionado("/resources/SalirB2.JPG", BSalir, 10, 10));
        this.setLocationRelativeTo(null); // Pantalla en medio
        this.setExtendedState(6); // Pantalla completa
        if(mute==0)
        sonido(musica);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelMenu = new FondoPanel();
        BJugar = new javax.swing.JButton();
        BOpciones = new javax.swing.JButton();
        BCreditos = new javax.swing.JButton();
        BSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Matematificador");
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(760, 900));

        BJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BJugarActionPerformed(evt);
            }
        });

        BOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOpcionesActionPerformed(evt);
            }
        });

        BCreditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCreditosActionPerformed(evt);
            }
        });

        BSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSalirActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/FMenu.png"))); // NOI18N

        javax.swing.GroupLayout PanelMenuLayout = new javax.swing.GroupLayout(PanelMenu);
        PanelMenu.setLayout(PanelMenuLayout);
        PanelMenuLayout.setHorizontalGroup(
            PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenuLayout.createSequentialGroup()
                .addContainerGap(179, Short.MAX_VALUE)
                .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(179, Short.MAX_VALUE))
            .addGroup(PanelMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelMenuLayout.setVerticalGroup(
            PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOpcionesActionPerformed
        clip.stop();
        Opciones Opciones = new Opciones();
        Opciones.setVisible(true);
        this.setVisible(false);
        Opciones.setVisible(true);
    }//GEN-LAST:event_BOpcionesActionPerformed

    private void BSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSalirActionPerformed
        System.exit(0); //Salida
    }//GEN-LAST:event_BSalirActionPerformed

    private void BJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BJugarActionPerformed
        GameModes GameModes = new GameModes();
        GameModes.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BJugarActionPerformed

    private void BCreditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCreditosActionPerformed
        Creditos Creditos = new Creditos();
        Creditos.setVisible(true);
        //clip.stop(); // Tambien desactiva este (comentario) para que no se pare la musica cuando quieras desactivar la musica de menu
        //sonido("Highlander (The One)");// XD al final me arepenti y lo quite jaja.
    }//GEN-LAST:event_BCreditosActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Menu().setVisible(true);
                
                File ruta = new File("src" + File.separator + "datos" + File.separator + "Datos.txt"); 
                
                try {
                    ruta.createNewFile();
                            } catch (IOException ex) {
                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    public Icon setIcono(String url, JButton boton) { //Este pone los iconos a los botones
        ImageIcon icon = new ImageIcon(getClass().getResource(url));

        int ancho = boton.getWidth();
        int alto = boton.getHeight();

        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        return icono;
    }

    public Icon setIconoPresionado(String url, JButton boton, int ancho, int altura) { //Este hace que se haga grande o chico al precionar el boton, osea cambia la animacion
        ImageIcon icon = new ImageIcon(getClass().getResource(url));
        int width = boton.getWidth() - ancho;
        int height = boton.getHeight() - altura;

        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));

        return icono;
    }

    class FondoPanel extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            if(fondos==0)
            imagen = new ImageIcon(getClass().getResource("/resources/FondoP.jpg")).getImage();
            if(fondos==1)
            imagen = new ImageIcon(getClass().getResource("/resources/To the moon.jpg")).getImage();
            if(fondos==2)
            imagen = new ImageIcon(getClass().getResource("/resources/totoro.png")).getImage();
            
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);

            setOpaque(false);

            super.paint(g);
        }
    }

    @Override
    public Image getIconImage() { //Para poner el icono. (Ojo en el JFrame cambiar la opcion de IconImage y le pones en Value y Propeti).
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("resources/Icono.png"));
        return retValue;
    }
    
    public void sonido(String archivo){
        try{
            clip=AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(getClass().getResourceAsStream(ruta + archivo + ".wav")));
            clip.loop(50);
        } catch(Exception e){
    }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BCreditos;
    private javax.swing.JButton BJugar;
    private javax.swing.JButton BOpciones;
    private javax.swing.JButton BSalir;
    private javax.swing.JPanel PanelMenu;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
