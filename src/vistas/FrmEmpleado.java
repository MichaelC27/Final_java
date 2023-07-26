/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import controlador.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.UIManager;
import javax.swing.*;
import javax.swing.border.Border;

/**
 *
 * @author dbpan
 */
public class FrmEmpleado extends javax.swing.JFrame {

    String operacion = "";
    private JTextField[] textFieldsToStyle = new JTextField[6];

    /**
     * Creates new form FrmEmpleado
     */
    public FrmEmpleado() {
        initComponents();
        textFieldsToStyle[0] = txtBusqueda;
        textFieldsToStyle[1] = txtCedula;
        textFieldsToStyle[2] = txtNombre;
        textFieldsToStyle[3] = txtApellido;
        textFieldsToStyle[4] = txtFechaN;
        textFieldsToStyle[5] = txtTelefono;
        applyBottomBorderStyle();
        inhabilitar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBusqueda = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        Apellido = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtFechaN = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        Direccion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDireccion = new javax.swing.JTextArea();
        btnCalendar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(138, 213, 255));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/empleado_m.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Empleados");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Búsqueda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel1.setText("Ingrese Cedula del Usuario");

        txtBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBusquedaActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(102, 204, 255));
        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar))
                    .addComponent(jLabel1))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Empleado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel2.setText("Cédula");

        jLabel3.setText("Nombre");

        Apellido.setText("Apellido");

        jLabel4.setText("Fecha de Nacimiento");

        jLabel5.setText("Teléfono");

        Direccion.setText("Dirección");

        txtDireccion.setColumns(20);
        txtDireccion.setRows(5);
        jScrollPane1.setViewportView(txtDireccion);

        btnCalendar.setBackground(new java.awt.Color(102, 204, 255));
        btnCalendar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCalendar.setForeground(new java.awt.Color(255, 255, 255));
        btnCalendar.setText("...");
        btnCalendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalendarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(Direccion)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Apellido, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCedula, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtApellido, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(txtFechaN, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35)
                                        .addComponent(btnCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Apellido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFechaN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalendar))
                .addGap(24, 24, 24)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(Direccion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        btnGuardar.setBackground(new java.awt.Color(102, 204, 255));
        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCerrar.setBackground(new java.awt.Color(102, 204, 255));
        btnCerrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(102, 204, 255));
        btnEditar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnNuevo.setBackground(new java.awt.Color(102, 204, 255));
        btnNuevo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(btnNuevo)
                .addGap(67, 67, 67)
                .addComponent(btnEditar)
                .addGap(70, 70, 70)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(btnCerrar)
                .addGap(61, 61, 61))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap(64, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap(69, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 836, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnEditar)
                    .addComponent(btnGuardar)
                    .addComponent(btnCerrar))
                .addGap(33, 33, 33))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(117, 117, 117)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(43, 43, 43)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(91, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 private void applyBottomBorderStyle() {
        for (JTextField textField : textFieldsToStyle) {
            Border bottomBorder = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK);
            textField.setBorder(bottomBorder);
            textField.setCaretColor(Color.BLACK);
            textField.setSelectedTextColor(Color.BLACK);
        }
    }

    public void inhabilitar() {
        txtBusqueda.setEnabled(true);
        btnBuscar.setEnabled(true);
        txtCedula.setEnabled(false);
        txtTelefono.setEnabled(false);
        txtNombre.setEnabled(false);
        txtApellido.setEnabled(false);
        txtDireccion.setEnabled(false);
        txtDireccion.setBackground(new Color(244, 246, 247));
        txtDireccion.setForeground(new Color(244, 246, 247));
        txtFechaN.setEnabled(false);
        btnEditar.setEnabled(false);
        btnGuardar.setEnabled(false);
        btnCalendar.setEnabled(false);
        for (JTextField textField : textFieldsToStyle) {
            if (textField != null) { // Verificar que el textField no sea nulo
                if (!textField.isEnabled()) {
                    // Cambiar color de fondo y texto para campos inhabilitados
                    textField.setBackground(new Color(244, 246, 247));
                    textField.setForeground(Color.BLACK);
                } else {
                    // Restablecer colores originales para campos habilitados
                    textField.setBackground(Color.WHITE);
                    textField.setForeground(Color.BLACK);
                }
            }
        }
    }

    public void limpiar() {
        JTextField[] textFields = {txtCedula, txtNombre, txtTelefono, txtFechaN, txtApellido, txtBusqueda};

        for (JTextField textField : textFields) {
            textField.setText("");
        }
        txtDireccion.setText("");
    }
    private void txtBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBusquedaActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        Empleado obj = new Empleado();
        obj.setCedula(txtBusqueda.getText());

        obj = obj.buscar();
        if (txtBusqueda.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar una cedula");
            txtBusqueda.requestFocus();
        } else {
            if (obj != null) {
                btnNuevo.setEnabled(false);
                txtCedula.setText(obj.getCedula());
                txtNombre.setText(obj.getNombre());
                txtApellido.setText(obj.getApellido());
                txtFechaN.setText(obj.getFecha_nacimiento());
                txtTelefono.setText(obj.getNumero_telefono());
                txtDireccion.setText(obj.getDireccion());
                txtDireccion.setBackground(new Color(244, 246, 247));
                txtDireccion.setForeground(new Color(244, 246, 247));
                btnEditar.setEnabled(true);

            } else {
                limpiar();
                JOptionPane.showMessageDialog(rootPane, "No se encontro el usuario");
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCalendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalendarActionPerformed
        frmCalendar frm = new frmCalendar();
        frm.setVisible(true);
        frm.setTitle("Calendar");
        frm.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                // Obtener la fecha seleccionada del frmCalendar
                Date selectedDate = frm.getSelectedDate();
                // Convertir la fecha a un String con el formato deseado
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
                String fechaFormateada = dateFormat.format(selectedDate);
                // Establecer la fecha formateada en el campo de texto
                txtFechaN.setText(fechaFormateada);
            }
        });

    }//GEN-LAST:event_btnCalendarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        if (txtCedula.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "La cédula no puede estar vacía");
            txtCedula.requestFocus();
            txtCedula.setBorder(BorderFactory.createLineBorder(Color.RED));
        } else if (txtNombre.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "El nombre no puede estar vacío");
            txtNombre.requestFocus();
            txtNombre.setBorder(BorderFactory.createLineBorder(Color.RED));
        } else if (txtApellido.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "El apellido no puede estar vacío");
            txtApellido.requestFocus();
            txtApellido.setBorder(BorderFactory.createLineBorder(Color.RED));
        } else if (txtFechaN.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "La fecha de nacimiento no puede estar vacía");
            txtFechaN.requestFocus();
            txtFechaN.setBorder(BorderFactory.createLineBorder(Color.RED));
        } else if (txtDireccion.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "La dirección no puede estar vacía");
            txtDireccion.requestFocus();
            txtDireccion.setBorder(BorderFactory.createLineBorder(Color.RED));
        } else if (txtTelefono.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "El número de teléfono no puede estar vacío");
            txtTelefono.requestFocus();
            txtTelefono.setBorder(BorderFactory.createLineBorder(Color.RED));
        } else {
            Empleado obj_empleado = new Empleado();
            obj_empleado.setCedula(txtCedula.getText().trim());
            obj_empleado.setNombre(txtNombre.getText().trim());
            obj_empleado.setApellido(txtApellido.getText().trim());
            obj_empleado.setFecha_nacimiento(txtFechaN.getText().trim());
            obj_empleado.setDireccion(txtDireccion.getText().trim());
            obj_empleado.setNumero_telefono(txtTelefono.getText().trim());

            // Restablecer el borde a su apariencia normal (sin resaltar)
            txtCedula.setBorder(UIManager.getBorder("TextField.border"));
            txtNombre.setBorder(UIManager.getBorder("TextField.border"));
            txtApellido.setBorder(UIManager.getBorder("TextField.border"));
            txtFechaN.setBorder(UIManager.getBorder("TextField.border"));
            txtDireccion.setBorder(UIManager.getBorder("TextField.border"));
            txtTelefono.setBorder(UIManager.getBorder("TextField.border"));

            if (operacion.equals("nuevo")) {
                if (obj_empleado.insertar() > 0) {
                    limpiar();
                    JOptionPane.showMessageDialog(rootPane, "Se insertó satisfactoriamente el empleado");
                    inhabilitar();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "No se creó el empleado");
                }
            }

            if (operacion.equals("modificar")) {
                obj_empleado.setCedula(txtCedula.getText());

                if (obj_empleado.modificar() > 0) {
                    JOptionPane.showMessageDialog(rootPane, "Se modificó el registro");
                    inhabilitar();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "No se modificó el registro");
                }
                btnNuevo.setEnabled(true);
                limpiar();
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        frmMenu frm = new frmMenu();
        frm.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        operacion = "modificar";
        btnNuevo.setEnabled(false);
        btnEditar.setEnabled(false);
        btnGuardar.setEnabled(true);
        btnBuscar.setEnabled(false);
        txtBusqueda.setEnabled(false);
        txtTelefono.setEnabled(true);
        //txtFechaN.setEnabled(true);
        txtNombre.setEnabled(true);
        txtApellido.setEnabled(true);
        txtDireccion.setEnabled(true);
        txtDireccion.setBackground(Color.WHITE);
        txtDireccion.setForeground(Color.BLACK);
        btnCalendar.setEnabled(true);
        for (JTextField textField : textFieldsToStyle) {
            if (textField != null) { // Verificar que el textField no sea nulo
                if (!textField.isEnabled()) {
                    // Cambiar color de fondo y texto para campos inhabilitados
                    textField.setBackground(new Color(244, 246, 247));
                    textField.setForeground(Color.BLACK);
                } else {
                    // Restablecer colores originales para campos habilitados
                    textField.setBackground(Color.WHITE);
                    textField.setForeground(Color.BLACK);
                }
            }
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        limpiar();
        operacion = "nuevo";

        txtBusqueda.setEnabled(false);
        btnBuscar.setEnabled(false);
        txtCedula.setEnabled(true);
        txtTelefono.setEnabled(true);
        //txtFechaN.setEnabled(true);
        txtNombre.setEnabled(true);
        txtApellido.setEnabled(true);
        txtDireccion.setEnabled(true);
        
        btnEditar.setEnabled(false);
        btnGuardar.setEnabled(true);
        btnCalendar.setEnabled(true);
        for (JTextField textField : textFieldsToStyle) {
            if (textField != null) { // Verificar que el textField no sea nulo
                if (!textField.isEnabled()) {
                    // Cambiar color de fondo y texto para campos inhabilitados
                    textField.setBackground(new Color(244, 246, 247));
                    textField.setForeground(new Color(151, 154, 154));
                } else {
                    // Restablecer colores originales para campos habilitados
                    textField.setBackground(Color.WHITE);
                    textField.setForeground(Color.BLACK);
                }
            }
        }

    }//GEN-LAST:event_btnNuevoActionPerformed

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
            java.util.logging.Logger.getLogger(FrmEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Apellido;
    private javax.swing.JLabel Direccion;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCalendar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextArea txtDireccion;
    private javax.swing.JTextField txtFechaN;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
