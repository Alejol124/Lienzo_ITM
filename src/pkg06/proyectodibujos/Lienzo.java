package pkg06.proyectodibujos;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Lienzo extends javax.swing.JFrame {

    private Nodo trazoSeleccionado = null;
    private Trazos trazo;
    private Nodo trazoResaltado = null;
    private Point esquina1 = null;
    private Point esquina2 = null;
    int x1, x2;
    int y1, y2;
    public static ArrayList<Nodo> trazos;

    private boolean dibujarLinea = false, dibujarRectangulo = false, dibujarCirculo = false;
    private boolean primerClick = false, dibujandoLineaGuia = false;
    private boolean seleccionar = false;

    public Lienzo() {
        initComponents();
        //MI lista para guardar los nodos
        trazo = new Trazos();
        //MI lista para poder repintar el panel sin borrar todo 
        trazos = new ArrayList<>();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLienzo = new javax.swing.JPanel();
        tbHerramientas = new javax.swing.JToolBar();
        btnGuardar = new javax.swing.JButton();
        btnCargar = new javax.swing.JButton();
        btnSeleccionar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        cbTrazos = new javax.swing.JComboBox<>();
        tfCoordenadas = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlLienzo.setBackground(new java.awt.Color(153, 153, 153));
        pnlLienzo.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        pnlLienzo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pnlLienzoMouseMoved(evt);
            }
        });
        pnlLienzo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlLienzoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlLienzoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlLienzoLayout = new javax.swing.GroupLayout(pnlLienzo);
        pnlLienzo.setLayout(pnlLienzoLayout);
        pnlLienzoLayout.setHorizontalGroup(
            pnlLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1069, Short.MAX_VALUE)
        );
        pnlLienzoLayout.setVerticalGroup(
            pnlLienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 589, Short.MAX_VALUE)
        );

        tbHerramientas.setRollover(true);

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Guardar.png"))); // NOI18N
        btnGuardar.setToolTipText("Guardar");
        btnGuardar.setFocusable(false);
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        tbHerramientas.add(btnGuardar);

        btnCargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Cargar.png"))); // NOI18N
        btnCargar.setToolTipText("Cargar");
        btnCargar.setFocusable(false);
        btnCargar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCargar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });
        tbHerramientas.add(btnCargar);

        btnSeleccionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Seleccionar.png"))); // NOI18N
        btnSeleccionar.setToolTipText("Seleccionar Trazo");
        btnSeleccionar.setFocusable(false);
        btnSeleccionar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSeleccionar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });
        tbHerramientas.add(btnSeleccionar);

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Eliminar.png"))); // NOI18N
        btnEliminar.setToolTipText("Eliminar Trazo");
        btnEliminar.setFocusable(false);
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        tbHerramientas.add(btnEliminar);

        cbTrazos.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        cbTrazos.setMaximumRowCount(3);
        cbTrazos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Linea", "Rectangulo", "Circulo" }));
        cbTrazos.setToolTipText("Elegir tipo Trazo");
        cbTrazos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTrazosActionPerformed(evt);
            }
        });
        tbHerramientas.add(cbTrazos);

        tfCoordenadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCoordenadasActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Coordenadas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tbHerramientas, javax.swing.GroupLayout.DEFAULT_SIZE, 1127, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlLienzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfCoordenadas, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(tbHerramientas, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfCoordenadas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(pnlLienzo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void cbTrazosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTrazosActionPerformed

        String seleccion = (String) cbTrazos.getSelectedItem();
        dibujarLinea = seleccion.equals("Linea");
        dibujarRectangulo = seleccion.equals("Rectangulo");
        dibujarCirculo = seleccion.equals("Circulo");

    }//GEN-LAST:event_cbTrazosActionPerformed


    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        
        pnlLienzo.removeAll();
        pnlLienzo.repaint();
        String nombreArchivo = Archivo.elegirArchivo();
        if (!nombreArchivo.isEmpty()) {
            trazo.desdeArchivo(nombreArchivo);
            
            dibujarTrazosEnPanel();
        }
        trazo.limpiarListaTrazos();
    }//GEN-LAST:event_btnCargarActionPerformed


    private void pnlLienzoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlLienzoMouseMoved
        int x = evt.getX();
        int y = evt.getY();
        tfCoordenadas.setText("x = " + x + ". " + " y: " + y);
        //dibujar mi linea guia
        Graphics g = pnlLienzo.getGraphics();
        if (primerClick && dibujarLinea) {
            dibujandoLineaGuia = true;
            repaint();
            g.setColor(Color.red);
            g.drawLine(esquina1.x, esquina1.y, x, y);
        } else {
            dibujandoLineaGuia = false;
            dibujarTrazoLista();
        }
        if (primerClick && dibujarRectangulo) {
            dibujandoLineaGuia = true;
            repaint();
            x = Math.min(esquina1.x, evt.getX());
            y = Math.min(esquina1.y, evt.getY());
            int width = Math.abs(esquina1.x - evt.getX());
            int height = Math.abs(esquina1.y - evt.getY());
            g.setColor(Color.red);
            g.drawRect(x, y, width, height);
        } else {
            dibujandoLineaGuia = false;
            dibujarTrazoLista();
        }
        if (primerClick && dibujarCirculo) {
            dibujandoLineaGuia = true;
            repaint();
            int radio = (int) Math.sqrt(Math.pow(evt.getX() - esquina1.x, 2)
                    + Math.pow(evt.getY() - esquina1.y, 2));
            x = esquina1.x - radio;
            y = esquina1.y - radio;
            g.setColor(Color.red);
            g.drawOval(x, y, radio * 2, radio * 2);
        } else {
            dibujandoLineaGuia = false;
            dibujarTrazoLista();
        }
    }//GEN-LAST:event_pnlLienzoMouseMoved


    private void tfCoordenadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCoordenadasActionPerformed

    }//GEN-LAST:event_tfCoordenadasActionPerformed

    private void pnlLienzoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlLienzoMouseClicked
        if (seleccionar == false) {
            if (dibujarLinea) {
                if (!primerClick) {
                    esquina1 = evt.getPoint();
                    primerClick = true;
                } else {
                    esquina2 = evt.getPoint();
                    Graphics g = pnlLienzo.getGraphics();
                    g.setColor(Color.BLUE);
                    g.drawLine(esquina1.x, esquina1.y, esquina2.x, esquina2.y);
                    Nodo n = new Nodo(TipoTrazo.Linea, esquina1, esquina2);
                    trazo.agregar(n);
                    trazos.add(n);
                    primerClick = false;
                    esquina1 = null;
                    esquina2 = null;
                }

            } else if (dibujarRectangulo) {
                if (!primerClick) {
                    esquina1 = evt.getPoint();
                    primerClick = true;
                } else {
                    esquina2 = evt.getPoint();
                    int x = Math.min(esquina1.x, esquina2.x);
                    int y = Math.min(esquina1.y, esquina2.y);
                    int width = Math.abs(esquina1.x - esquina2.x);
                    int height = Math.abs(esquina1.y - esquina2.y);

                    Graphics g = pnlLienzo.getGraphics();
                    g.setColor(Color.BLUE);
                    g.drawRect(x, y, width, height);
                    Nodo n = new Nodo(TipoTrazo.Rectangulo, esquina1, esquina2);
                    trazo.agregar(n);
                    trazos.add(n);
                    primerClick = false;
                    esquina1 = null;
                    esquina2 = null;
                }
            } else if (dibujarCirculo) {
                if (!primerClick) {
                    esquina1 = evt.getPoint();
                    primerClick = true;
                } else {
                    esquina2 = evt.getPoint();

                    int radio = (int) Math.sqrt(Math.pow(esquina2.x - esquina1.x, 2)
                            + Math.pow(esquina2.y - esquina1.y, 2));
                    int x = esquina1.x - radio;
                    int y = esquina1.y - radio;

                    Graphics g = pnlLienzo.getGraphics();
                    g.setColor(Color.RED);
                    g.drawOval(x, y, radio * 2, radio * 2);
                    Nodo n = new Nodo(TipoTrazo.Circulo, esquina1, esquina2);
                    trazo.agregar(n);
                    trazos.add(n);
                    primerClick = false;
                    esquina1 = null;
                    esquina2 = null;
                }
            }
        }
        if (seleccionar) {
            Point mousePosition = evt.getPoint();
            Nodo trazoClick = encontrarTrazoCercano(mousePosition);

            if (trazoSeleccionado != null) {
                trazoSeleccionado.setResaltado(false);
            }
            if (trazoClick != null) {
                trazoClick.setResaltado(true);
                trazoSeleccionado = trazoClick;
                repaint();
                
            }
        }
    }//GEN-LAST:event_pnlLienzoMouseClicked


    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        JFileChooser fileChooser = new JFileChooser();

        int seleccion = fileChooser.showSaveDialog(this);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            java.io.File archivo = fileChooser.getSelectedFile();
            String nombreArchivo = archivo.getAbsolutePath();

            Trazos trazosTemporales = new Trazos();

            Nodo temp = trazo.cabeza;
            while (temp != null) {
                trazosTemporales.agregar(new Nodo(temp.getTrazo(), temp.getInicio(), temp.getFin()));
                temp = temp.siguiente;
            }

            if (trazosTemporales.guardar(nombreArchivo)) {
                JOptionPane.showMessageDialog(null, "Los datos fueron guardados exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo guardar los datos");
            }
            trazosTemporales.limpiarListaTrazos();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
      
        if (trazoSeleccionado != null) {
            trazo.eliminar(trazoSeleccionado);
            trazos.remove(trazoSeleccionado);
            repaint();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        seleccionar = !seleccionar;
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    private void pnlLienzoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlLienzoMouseExited

    }//GEN-LAST:event_pnlLienzoMouseExited

    private void dibujarTrazosEnPanel() {
        Graphics g = pnlLienzo.getGraphics();
        g.setColor(Color.BLUE);
        Nodo nodo = trazo.cabeza;
        if (trazo.cabeza != null) {
            while (nodo != null) {
                TipoTrazo tipoTrazo = nodo.getTrazo();
                Point inicio = nodo.getInicio();
                Point fin = nodo.getFin();
                switch (tipoTrazo) {
                    case Linea:
                        g.drawLine(inicio.x, inicio.y, fin.x, fin.y);
                        break;
                    case Rectangulo:
                        int x = Math.min(inicio.x, fin.x);
                        int y = Math.min(inicio.y, fin.y);
                        int width = Math.abs(inicio.x - fin.x);
                        int height = Math.abs(inicio.y - fin.y);
                        g.drawRect(x, y, width, height);
                        break;
                    case Circulo:
                        int radio = (int) Math.sqrt(Math.pow(fin.x - inicio.x, 2) + Math.pow(fin.y - inicio.y, 2));
                        int xCirculo = inicio.x - radio;
                        int yCirculo = inicio.y - radio;
                        g.drawOval(xCirculo, yCirculo, radio * 2, radio * 2);
                        break;
                }
                nodo = nodo.siguiente;
            }
        }
    }

    private double distanciaPuntoALinea(Point lineaInicio, Point lineaFin, Point punto) {
        double lineaLongitud = lineaInicio.distance(lineaFin);
        double u = ((punto.x - lineaInicio.x) * (lineaFin.x - lineaInicio.x) + (punto.y - lineaInicio.y) * (lineaFin.y - lineaInicio.y)) / (lineaLongitud * lineaLongitud);
        Point proyeccion = new Point((int) (lineaInicio.x + u * (lineaFin.x - lineaInicio.x)), (int) (lineaInicio.y + u * (lineaFin.y - lineaInicio.y)));
        double distancia = punto.distance(proyeccion);
        return distancia;
    }

    private void dibujarTrazoLista() {
        Graphics g = pnlLienzo.getGraphics();
        
        for (Nodo dibujos : trazos) {
            if (dibujos.isResaltado()) {
                Graphics2D gd = (Graphics2D) g;
                g.setColor(Color.YELLOW);
                gd.setStroke(new BasicStroke(4));
            } else {
                g.setColor(Color.BLUE);
                ((Graphics2D) g).setStroke(new BasicStroke(1));
            }
            switch (dibujos.getTrazo()) {
                case Linea:
                    // g.setColor(Color.BLUE);
                    g.drawLine(dibujos.inicio.x, dibujos.inicio.y, dibujos.fin.x, dibujos.fin.y);
                    break;
                case Rectangulo:
                    //g.setColor(Color.BLUE);
                    int x = Math.min(dibujos.inicio.x, dibujos.fin.x);
                    int y = Math.min(dibujos.inicio.y, dibujos.fin.y);
                    int width = Math.abs(dibujos.inicio.x - dibujos.fin.x);
                    int height = Math.abs(dibujos.inicio.y - dibujos.fin.y);
                    g.drawRect(x, y, width, height);
                    break;
                case Circulo:
                    //g.setColor(Color.BLUE);
                    int radio = (int) Math.sqrt(Math.pow(dibujos.fin.x - dibujos.inicio.x, 2) + Math.pow(dibujos.fin.y - dibujos.inicio.y, 2));
                    int xCirculo = dibujos.inicio.x - radio;
                    int yCirculo = dibujos.inicio.y - radio;
                    g.drawOval(xCirculo, yCirculo, radio * 2, radio * 2);
                    break;
            }
        }
    }

    private boolean puntoDentroDeLinea(Point punto, Nodo linea) {
        double distancia = distanciaPuntoALinea(punto, linea.inicio, linea.fin);
        return distancia < 5;
    }

    private boolean puntoDentroDeRectangulo(Point punto, Nodo rectangulo) {
        Rectangle bounds = new Rectangle(rectangulo.inicio);
        bounds.add(rectangulo.fin);
        return bounds.contains(punto);
    }

    private boolean puntoDentroDeCirculo(Point punto, Nodo circulo) {
        double distancia = circulo.inicio.distance(punto);
        int tolerancia = 100;
        return Math.abs(distancia - Math.sqrt(Math.pow(circulo.fin.x - circulo.inicio.x, 2) + Math.pow(circulo.fin.y - circulo.inicio.y, 2))) < tolerancia; 
    }

    private Nodo encontrarTrazoCercano(Point mousePosition) {
        Nodo trazoCercano = null;
        double distanciaMinima = Double.MAX_VALUE;
        for (Nodo temp : trazos) {
            double distancia = distanciaPuntoALinea(temp.getInicio(), temp.getFin(), mousePosition);
            if (distancia < 5 && distancia < distanciaMinima) {
                distanciaMinima = distancia;
                trazoCercano = temp;
            }
        }
        return trazoCercano;
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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Lienzo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lienzo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lienzo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lienzo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lienzo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JComboBox<String> cbTrazos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel pnlLienzo;
    private javax.swing.JToolBar tbHerramientas;
    private javax.swing.JTextField tfCoordenadas;
    // End of variables declaration//GEN-END:variables
}
