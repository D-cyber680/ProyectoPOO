package principal;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import static principal.Menu.clip;
import static principal.Menu.ruta;
import static principal.Menu.mute;

public class Opciones extends javax.swing.JFrame {

    FondoPanel fondo = new FondoPanel();
    
    public Opciones() {
        this.setContentPane(fondo); //Se inicialisa el fondo.
        initComponents();
        BFondo.setIcon(setIcono("/resources/FondoB.JPG", BFondo));
        BFondo.setPressedIcon(setIconoPresionado("/resources/FondoB2.JPG", BFondo, 10, 10));
        BEstadisticas.setIcon(setIcono("/resources/ModoB.JPG", BEstadisticas));
        BEstadisticas.setPressedIcon(setIconoPresionado("/resources/ModoB2.JPG", BEstadisticas, 10, 10));
        BMusica.setIcon(setIcono("/resources/MusicaB.JPG", BMusica));
        BMusica.setPressedIcon(setIconoPresionado("/resources/MusicaB2.JPG", BMusica, 10, 10));
        BOpciones.setIcon(setIcono("/resources/OpcionesB3.JPG", BOpciones));
        BRegresar.setIcon(setIcono("/resources/RegresarB.JPG", BRegresar));
        BRegresar.setPressedIcon(setIconoPresionado("/resources/RegresarB2.JPG", BRegresar, 10, 10));
        
        this.setLocationRelativeTo(null); // Pantalla en medio
        this.setExtendedState(6); // Pantalla completa
        if(mute==0)
        sonido("Opciones");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelOpcs = new FondoPanel();
        BOpciones = new javax.swing.JButton();
        BEstadisticas = new javax.swing.JButton();
        BMusica = new javax.swing.JButton();
        BFondo = new javax.swing.JButton();
        BRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Matematificador");
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(760, 900));

        BMusica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BMusicaActionPerformed(evt);
            }
        });

        BFondo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BFondoActionPerformed(evt);
            }
        });

        BRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelOpcsLayout = new javax.swing.GroupLayout(PanelOpcs);
        PanelOpcs.setLayout(PanelOpcsLayout);
        PanelOpcsLayout.setHorizontalGroup(
            PanelOpcsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelOpcsLayout.createSequentialGroup()
                .addContainerGap(150, Short.MAX_VALUE)
                .addGroup(PanelOpcsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(BRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BEstadisticas, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        PanelOpcsLayout.setVerticalGroup(
            PanelOpcsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOpcsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BEstadisticas, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelOpcs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelOpcs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRegresarActionPerformed
        clip.stop();
        Menu Menu = new Menu();
        this.setVisible(false);
        Menu.setVisible(true);
    }//GEN-LAST:event_BRegresarActionPerformed

    private void BMusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BMusicaActionPerformed
       Musica Musica = new Musica();
       Musica.setVisible(true);
    }//GEN-LAST:event_BMusicaActionPerformed

    private void BFondoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BFondoActionPerformed
       Fondos Fondos = new Fondos();
       Fondos.setVisible(true);
    }//GEN-LAST:event_BFondoActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Opciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Opciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Opciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Opciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Opciones().setVisible(true);
            }
        });
    }

    public Icon setIcono(String url, JButton boton) {
        ImageIcon icon = new ImageIcon(getClass().getResource(url));

        int ancho = boton.getWidth();
        int alto = boton.getHeight();

        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        return icono;
    }

    public Icon setIconoPresionado(String url, JButton boton, int ancho, int altura) {
        ImageIcon icon = new ImageIcon(getClass().getResource(url));
        int width = boton.getWidth() - ancho;
        int height = boton.getHeight() - altura;

        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));

        return icono;
    }

    class FondoPanel extends JPanel {

        private Image imagen;

        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/resources/FondoP2.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);

            setOpaque(false);

            super.paint(g);
        }
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("resources/Icono.png"));
        return retValue;
    }
    
    public void sonido(String archivo){
        try{
            clip=AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(getClass().getResourceAsStream(ruta + archivo + ".wav")));
            clip.loop(50);
        }catch(Exception e){
    }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BEstadisticas;
    private javax.swing.JButton BFondo;
    private javax.swing.JButton BMusica;
    private javax.swing.JButton BOpciones;
    private javax.swing.JButton BRegresar;
    private javax.swing.JPanel PanelOpcs;
    // End of variables declaration//GEN-END:variables
}
