package Formularios;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.BorderLayout;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class FormMenuPrincipal extends javax.swing.JFrame {
        int xMouse;
        int yMouse;
    
    public FormMenuPrincipal() {
        initComponents();
        
        setLocationRelativeTo(null); //CENTRAR VENTANA PRINCIPAL
        this.setTitle("Menu Principal");
        
        FormInicio paginicio=new FormInicio();
        paginicio.setSize(1040, 640);
        paginicio.setLocation(0,0);
        contenido.removeAll();
        contenido.add(paginicio, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        btnVenta = new javax.swing.JButton();
        btnCompra = new javax.swing.JButton();
        btnProducto = new javax.swing.JButton();
        btnReporte = new javax.swing.JButton();
        btnUsuario = new javax.swing.JButton();
        Header = new javax.swing.JPanel();
        Cerrar = new javax.swing.JLabel();
        Title = new javax.swing.JPanel();
        contenido = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA DE VENTAS FIERROS COCHARCAS");
        setMaximumSize(new java.awt.Dimension(1280, 680));
        setMinimumSize(new java.awt.Dimension(1280, 680));
        setUndecorated(true);

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setMaximumSize(new java.awt.Dimension(1400, 700));
        Background.setMinimumSize(new java.awt.Dimension(1400, 700));
        Background.setPreferredSize(new java.awt.Dimension(1400, 700));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu.setBackground(new java.awt.Color(100, 135, 228));
        Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setBackground(new java.awt.Color(88, 119, 202));
        logo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        logo.setForeground(new java.awt.Color(255, 255, 255));
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Logito.png"))); // NOI18N
        logo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                logoMousePressed(evt);
            }
        });
        Menu.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 220, -1));

        btnVenta.setBackground(new java.awt.Color(100, 135, 228));
        btnVenta.setFont(new java.awt.Font("Nunito ExtraBold", 0, 16)); // NOI18N
        btnVenta.setForeground(new java.awt.Color(255, 255, 255));
        btnVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/nueva venta2.png"))); // NOI18N
        btnVenta.setText("Nueva Venta");
        btnVenta.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 15, 1, 1, new java.awt.Color(0, 0, 0)));
        btnVenta.setBorderPainted(false);
        btnVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVenta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnVenta.setIconTextGap(10);
        btnVenta.setMaximumSize(new java.awt.Dimension(127, 33));
        btnVenta.setMinimumSize(new java.awt.Dimension(127, 33));
        btnVenta.setOpaque(true);
        btnVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentaActionPerformed(evt);
            }
        });
        Menu.add(btnVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 240, 50));

        btnCompra.setBackground(new java.awt.Color(100, 135, 228));
        btnCompra.setFont(new java.awt.Font("Nunito ExtraBold", 0, 16)); // NOI18N
        btnCompra.setForeground(new java.awt.Color(255, 255, 255));
        btnCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/nueva compra2.png"))); // NOI18N
        btnCompra.setText("Nueva Compra");
        btnCompra.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 15, 1, 1, new java.awt.Color(0, 0, 0)));
        btnCompra.setBorderPainted(false);
        btnCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCompra.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCompra.setIconTextGap(10);
        btnCompra.setMaximumSize(new java.awt.Dimension(127, 33));
        btnCompra.setMinimumSize(new java.awt.Dimension(127, 33));
        btnCompra.setOpaque(true);
        btnCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompraActionPerformed(evt);
            }
        });
        Menu.add(btnCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 240, 50));

        btnProducto.setBackground(new java.awt.Color(100, 135, 228));
        btnProducto.setFont(new java.awt.Font("Nunito ExtraBold", 0, 16)); // NOI18N
        btnProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/producto.png"))); // NOI18N
        btnProducto.setText("Producto");
        btnProducto.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 15, 1, 1, new java.awt.Color(0, 0, 0)));
        btnProducto.setBorderPainted(false);
        btnProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProducto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnProducto.setIconTextGap(10);
        btnProducto.setMaximumSize(new java.awt.Dimension(127, 33));
        btnProducto.setMinimumSize(new java.awt.Dimension(127, 33));
        btnProducto.setOpaque(true);
        btnProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductoActionPerformed(evt);
            }
        });
        Menu.add(btnProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 240, 50));

        btnReporte.setBackground(new java.awt.Color(100, 135, 228));
        btnReporte.setFont(new java.awt.Font("Nunito ExtraBold", 0, 16)); // NOI18N
        btnReporte.setForeground(new java.awt.Color(255, 255, 255));
        btnReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/reporte2.png"))); // NOI18N
        btnReporte.setText("Reporte");
        btnReporte.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 15, 1, 1, new java.awt.Color(0, 0, 0)));
        btnReporte.setBorderPainted(false);
        btnReporte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReporte.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnReporte.setIconTextGap(10);
        btnReporte.setMaximumSize(new java.awt.Dimension(127, 33));
        btnReporte.setMinimumSize(new java.awt.Dimension(127, 33));
        btnReporte.setOpaque(true);
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });
        Menu.add(btnReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 240, 50));

        btnUsuario.setBackground(new java.awt.Color(100, 135, 228));
        btnUsuario.setFont(new java.awt.Font("Nunito ExtraBold", 0, 16)); // NOI18N
        btnUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/usuario.png"))); // NOI18N
        btnUsuario.setText("Usuarios");
        btnUsuario.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 15, 1, 1, new java.awt.Color(0, 0, 0)));
        btnUsuario.setBorderPainted(false);
        btnUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnUsuario.setIconTextGap(10);
        btnUsuario.setMaximumSize(new java.awt.Dimension(127, 33));
        btnUsuario.setMinimumSize(new java.awt.Dimension(127, 33));
        btnUsuario.setOpaque(true);
        btnUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioActionPerformed(evt);
            }
        });
        Menu.add(btnUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 240, 50));

        Background.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 800));

        Header.setBackground(new java.awt.Color(100, 135, 228));

        Cerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/X Blanco.png"))); // NOI18N
        Cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addGap(0, 1240, Short.MAX_VALUE)
                .addComponent(Cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Background.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 40));

        Title.setBackground(new java.awt.Color(255, 255, 255));
        Title.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                TitleMouseDragged(evt);
            }
        });
        Title.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TitleMousePressed(evt);
            }
        });

        javax.swing.GroupLayout TitleLayout = new javax.swing.GroupLayout(Title);
        Title.setLayout(TitleLayout);
        TitleLayout.setHorizontalGroup(
            TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        TitleLayout.setVerticalGroup(
            TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        Background.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 20));

        contenido.setBackground(new java.awt.Color(255, 255, 255));
        contenido.setMinimumSize(new java.awt.Dimension(1040, 640));

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1040, Short.MAX_VALUE)
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );

        Background.add(contenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 1040, 640));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TitleMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TitleMouseDragged
             int x = evt.getXOnScreen();
             int y = evt.getYOnScreen();
             this.setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_TitleMouseDragged

    private void TitleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TitleMousePressed
            xMouse = evt.getX();
            yMouse = evt.getY();
    }//GEN-LAST:event_TitleMousePressed

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CerrarMouseClicked

    private void logoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoMousePressed
                btnVenta.setBackground(new Color(100,135,228));
                btnCompra.setBackground(new Color(100,135,228));
                btnProducto.setBackground(new Color(100,135,228));
                btnReporte.setBackground(new Color(100,135,228));
                btnUsuario.setBackground(new Color(100,135,228));
                
                FormInicio paginicio=new FormInicio();
                paginicio.setSize(1040, 640);
                paginicio.setLocation(0,0);
        
                contenido.removeAll();
                contenido.add(paginicio, BorderLayout.CENTER);
                contenido.revalidate();
                contenido.repaint();
    }//GEN-LAST:event_logoMousePressed

    private void btnVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentaActionPerformed
                setColor(btnVenta);
                resetColor(btnCompra);
                resetColor(btnProducto);
                resetColor(btnReporte);
                resetColor(btnUsuario);

                FormVenta pag1 = new FormVenta();
                pag1.setSize(1040, 640);
                pag1.setLocation(0,0);

                contenido.removeAll();
                contenido.add(pag1, BorderLayout.CENTER);
                contenido.revalidate();
                contenido.repaint();
    }//GEN-LAST:event_btnVentaActionPerformed

    private void btnCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompraActionPerformed
                resetColor(btnVenta);
                setColor(btnCompra);
                resetColor(btnProducto);
                resetColor(btnReporte);
                resetColor(btnUsuario);
                
                FormCompra pag2 = new FormCompra();
                pag2.setSize(1040, 640);
                pag2.setLocation(0,0);

                contenido.removeAll();
                contenido.add(pag2, BorderLayout.CENTER);
                contenido.revalidate();
                contenido.repaint();
    }//GEN-LAST:event_btnCompraActionPerformed

    private void btnProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductoActionPerformed
                resetColor(btnVenta);
                resetColor(btnCompra);
                setColor(btnProducto);
                resetColor(btnReporte);
                resetColor(btnUsuario);
    }//GEN-LAST:event_btnProductoActionPerformed

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
                resetColor(btnVenta);
                resetColor(btnCompra);
                resetColor(btnProducto);
                setColor(btnReporte);
                resetColor(btnUsuario);

    }//GEN-LAST:event_btnReporteActionPerformed

    private void btnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioActionPerformed
                resetColor(btnVenta);
                resetColor(btnCompra);
                resetColor(btnProducto);
                resetColor(btnReporte);
                setColor(btnUsuario);
    }//GEN-LAST:event_btnUsuarioActionPerformed
    public void setColor(JToggleButton setColor){
        setColor.setBackground(new Color(88,119,202));
    }
    public void resetColor(JToggleButton resetColor){
        resetColor.setBackground(new Color(100,135,228));
    }
    public void setColor(JButton setColor){
        setColor.setBackground(new Color(88,119,202));
    }
    public void resetColor(JButton resetColor){
        resetColor.setBackground(new Color(100,135,228));
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            //UIManager.setLookAndFeel( new FlatMacLightLaf() );
            FlatMacLightLaf.setup();
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JLabel Cerrar;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel Title;
    private javax.swing.JButton btnCompra;
    private javax.swing.JButton btnProducto;
    private javax.swing.JButton btnReporte;
    private javax.swing.JButton btnUsuario;
    private javax.swing.JButton btnVenta;
    public static javax.swing.JPanel contenido;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables

}
