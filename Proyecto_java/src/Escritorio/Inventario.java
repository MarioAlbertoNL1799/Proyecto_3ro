/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Escritorio;

/**
 *
 * @author manl_
 */
public class Inventario extends javax.swing.JFrame {

    /**
     * Creates new form Compras
     */
    public Inventario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg_tipo = new javax.swing.ButtonGroup();
        bg_presentacion = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable_articulos = new javax.swing.JTable();
        jp_Articulo = new javax.swing.JPanel();
        jb_eliminar_articulo = new javax.swing.JButton();
        jb_modificar_articulo = new javax.swing.JButton();
        jb_nuevo_articulo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jp_Descripcion = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jta_especificaciones = new javax.swing.JTextArea();
        jl_especificaciones = new javax.swing.JLabel();
        jtf_codigo = new javax.swing.JTextField();
        jl_codigo = new javax.swing.JLabel();
        jrb_Herramienta = new javax.swing.JRadioButton();
        jrb_material = new javax.swing.JRadioButton();
        jl_tipo = new javax.swing.JLabel();
        jl_nombre = new javax.swing.JLabel();
        jtf_nombre = new javax.swing.JTextField();
        jl_cantidad = new javax.swing.JLabel();
        jtf_cantidad = new javax.swing.JTextField();
        jl_unidad_medida = new javax.swing.JLabel();
        jcb_unidad_medida = new javax.swing.JComboBox<>();
        jl_presentación = new javax.swing.JLabel();
        jrb_liquido = new javax.swing.JRadioButton();
        jrb_liquido1 = new javax.swing.JRadioButton();
        jb_guardar = new javax.swing.JButton();
        jb_cancelar = new javax.swing.JButton();
        jp_busqueda = new javax.swing.JPanel();
        jl_Inventario = new javax.swing.JLabel();
        jl_Tipo = new javax.swing.JLabel();
        jcb_clase = new javax.swing.JComboBox<>();
        jb_aceptar = new javax.swing.JButton();
        jcb_filas = new javax.swing.JComboBox<>();
        jb_ok = new javax.swing.JButton();
        jtf_buscar_especifico = new javax.swing.JTextField();
        jb_salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtable_articulos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Tipo", "Nombre", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtable_articulos);

        jb_eliminar_articulo.setText("Eliminar Artículo");

        jb_modificar_articulo.setText("Modificar Artículo");

        jb_nuevo_articulo.setText("Nuevo Artículo");

        jLabel2.setText("Artículo");

        javax.swing.GroupLayout jp_ArticuloLayout = new javax.swing.GroupLayout(jp_Articulo);
        jp_Articulo.setLayout(jp_ArticuloLayout);
        jp_ArticuloLayout.setHorizontalGroup(
            jp_ArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_ArticuloLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jp_ArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jp_ArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jb_modificar_articulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jb_nuevo_articulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jb_eliminar_articulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jp_ArticuloLayout.setVerticalGroup(
            jp_ArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_ArticuloLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jb_nuevo_articulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jb_modificar_articulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jb_eliminar_articulo)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel3.setText("Descripción del artículo");

        jta_especificaciones.setColumns(20);
        jta_especificaciones.setRows(5);
        jta_especificaciones.setEnabled(false);
        jScrollPane2.setViewportView(jta_especificaciones);

        jl_especificaciones.setText("Especificaciones");

        jtf_codigo.setText("00");
        jtf_codigo.setEnabled(false);

        jl_codigo.setText("Código:");

        bg_tipo.add(jrb_Herramienta);
        jrb_Herramienta.setSelected(true);
        jrb_Herramienta.setText("Herramienta");
        jrb_Herramienta.setEnabled(false);

        bg_tipo.add(jrb_material);
        jrb_material.setText("Material");
        jrb_material.setEnabled(false);

        jl_tipo.setText("Tipo:");

        jl_nombre.setText("Nombre:");

        jtf_nombre.setText(" ");
        jtf_nombre.setEnabled(false);

        jl_cantidad.setText("Cantidad:");

        jtf_cantidad.setText("0");
        jtf_cantidad.setEnabled(false);

        jl_unidad_medida.setText("Unidad de medida:");
        jl_unidad_medida.setEnabled(false);

        jcb_unidad_medida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Metros", "Galones", "Kilogramos", "Mililigramos", "Litros", "Mililitros", "Piezas", " " }));
        jcb_unidad_medida.setEnabled(false);

        jl_presentación.setText("Presentación:");
        jl_presentación.setEnabled(false);

        bg_presentacion.add(jrb_liquido);
        jrb_liquido.setText("Sólido");
        jrb_liquido.setEnabled(false);

        bg_presentacion.add(jrb_liquido1);
        jrb_liquido1.setText("Líquido");
        jrb_liquido1.setEnabled(false);

        jb_guardar.setText("Guadar");
        jb_guardar.setEnabled(false);

        jb_cancelar.setText("Cancelar");
        jb_cancelar.setEnabled(false);

        javax.swing.GroupLayout jp_DescripcionLayout = new javax.swing.GroupLayout(jp_Descripcion);
        jp_Descripcion.setLayout(jp_DescripcionLayout);
        jp_DescripcionLayout.setHorizontalGroup(
            jp_DescripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_DescripcionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_DescripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_DescripcionLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jp_DescripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jp_DescripcionLayout.createSequentialGroup()
                                .addComponent(jrb_Herramienta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jrb_material)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                                .addComponent(jl_presentación)
                                .addGap(167, 167, 167))
                            .addGroup(jp_DescripcionLayout.createSequentialGroup()
                                .addGroup(jp_DescripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jp_DescripcionLayout.createSequentialGroup()
                                        .addComponent(jl_unidad_medida)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jcb_unidad_medida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jrb_liquido)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jrb_liquido1))
                                    .addGroup(jp_DescripcionLayout.createSequentialGroup()
                                        .addGroup(jp_DescripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jl_tipo)
                                            .addGroup(jp_DescripcionLayout.createSequentialGroup()
                                                .addComponent(jl_codigo)
                                                .addGap(18, 18, 18)
                                                .addComponent(jtf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jp_DescripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jp_DescripcionLayout.createSequentialGroup()
                                                .addGap(118, 118, 118)
                                                .addComponent(jl_cantidad)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jtf_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jp_DescripcionLayout.createSequentialGroup()
                                                .addGap(116, 116, 116)
                                                .addComponent(jl_nombre)
                                                .addGap(18, 18, 18)
                                                .addComponent(jtf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jp_DescripcionLayout.createSequentialGroup()
                                        .addComponent(jb_guardar)
                                        .addGap(18, 18, 18)
                                        .addComponent(jb_cancelar)))
                                .addGap(54, 54, 54)))
                        .addGroup(jp_DescripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_especificaciones))
                        .addGap(25, 25, 25))
                    .addGroup(jp_DescripcionLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jp_DescripcionLayout.setVerticalGroup(
            jp_DescripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_DescripcionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_DescripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jp_DescripcionLayout.createSequentialGroup()
                        .addGroup(jp_DescripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_codigo)
                            .addComponent(jtf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jl_tipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jp_DescripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jl_presentación)
                            .addGroup(jp_DescripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jrb_material)
                                .addComponent(jrb_Herramienta)))
                        .addGroup(jp_DescripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jp_DescripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jl_unidad_medida)
                                .addComponent(jcb_unidad_medida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jp_DescripcionLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jp_DescripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jrb_liquido)
                                    .addComponent(jrb_liquido1)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jp_DescripcionLayout.createSequentialGroup()
                        .addGroup(jp_DescripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_nombre)
                            .addComponent(jl_especificaciones))
                        .addGroup(jp_DescripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jp_DescripcionLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jp_DescripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtf_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jl_cantidad)))
                            .addGroup(jp_DescripcionLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_DescripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_guardar)
                    .addComponent(jb_cancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jl_Inventario.setText("Inventario");

        jl_Tipo.setText("Tipo:");

        jcb_clase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todo", "Herramientas", "Material" }));

        jb_aceptar.setText("Aceptar");

        jcb_filas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Buscar por fila", "Código", "Tipo", "Nombre", "Especificaciones", "Cantidad", "Unidad de medida", "Forma de presentación" }));

        jb_ok.setText("OK");

        jtf_buscar_especifico.setText("Busqueda especifica");

        jb_salir.setText("Salir");

        javax.swing.GroupLayout jp_busquedaLayout = new javax.swing.GroupLayout(jp_busqueda);
        jp_busqueda.setLayout(jp_busquedaLayout);
        jp_busquedaLayout.setHorizontalGroup(
            jp_busquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_busquedaLayout.createSequentialGroup()
                .addGroup(jp_busquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jp_busquedaLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jl_Tipo)
                        .addGap(18, 18, 18)
                        .addComponent(jcb_clase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jb_aceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                        .addComponent(jcb_filas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp_busquedaLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jl_Inventario)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtf_buscar_especifico, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jb_ok)
                .addGap(58, 58, 58)
                .addComponent(jb_salir)
                .addGap(24, 24, 24))
        );
        jp_busquedaLayout.setVerticalGroup(
            jp_busquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_busquedaLayout.createSequentialGroup()
                .addComponent(jl_Inventario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_busquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Tipo)
                    .addComponent(jcb_clase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_aceptar)
                    .addComponent(jcb_filas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_ok)
                    .addComponent(jtf_buscar_especifico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_salir))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jp_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jp_Descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jp_Articulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jp_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jp_Articulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jp_Descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bg_presentacion;
    private javax.swing.ButtonGroup bg_tipo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jb_aceptar;
    private javax.swing.JButton jb_cancelar;
    private javax.swing.JButton jb_eliminar_articulo;
    private javax.swing.JButton jb_guardar;
    private javax.swing.JButton jb_modificar_articulo;
    private javax.swing.JButton jb_nuevo_articulo;
    private javax.swing.JButton jb_ok;
    private javax.swing.JButton jb_salir;
    private javax.swing.JComboBox<String> jcb_clase;
    private javax.swing.JComboBox<String> jcb_filas;
    private javax.swing.JComboBox<String> jcb_unidad_medida;
    private javax.swing.JLabel jl_Inventario;
    private javax.swing.JLabel jl_Tipo;
    private javax.swing.JLabel jl_cantidad;
    private javax.swing.JLabel jl_codigo;
    private javax.swing.JLabel jl_especificaciones;
    private javax.swing.JLabel jl_nombre;
    private javax.swing.JLabel jl_presentación;
    private javax.swing.JLabel jl_tipo;
    private javax.swing.JLabel jl_unidad_medida;
    private javax.swing.JPanel jp_Articulo;
    private javax.swing.JPanel jp_Descripcion;
    private javax.swing.JPanel jp_busqueda;
    private javax.swing.JRadioButton jrb_Herramienta;
    private javax.swing.JRadioButton jrb_liquido;
    private javax.swing.JRadioButton jrb_liquido1;
    private javax.swing.JRadioButton jrb_material;
    private javax.swing.JTextArea jta_especificaciones;
    private javax.swing.JTable jtable_articulos;
    private javax.swing.JTextField jtf_buscar_especifico;
    private javax.swing.JTextField jtf_cantidad;
    private javax.swing.JTextField jtf_codigo;
    private javax.swing.JTextField jtf_nombre;
    // End of variables declaration//GEN-END:variables
}
