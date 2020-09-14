/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooproyecto;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Usuario
 */
public class GUIPrincipal extends javax.swing.JFrame {

    Arquero arqueroGUI = new Arquero();
    Guerrero guerreroGUI = new Guerrero();
    Mago magoGUI = new Mago();
    Healer healerGUI = new Healer();
    Enemigo enemigoGUI;
    int EnemigoRandom = (int) (Math.random() * 3);
    int turno = 1;
    static boolean win;
    static boolean def;

    public void actualizarBarras(JLabel barra, int valorActual, int valorMaximo) {
        if (valorActual <= 0) {
            barra.setText("~~~~~~~~~~");
        } else if (valorActual < 0.1 * valorMaximo) {
            barra.setText("█~~~~~~~~~");
        } else if (valorActual < 0.2 * valorMaximo) {
            barra.setText("██~~~~~~~~");
        } else if (valorActual < 0.3 * valorMaximo) {
            barra.setText("███~~~~~~~");
        } else if (valorActual < 0.4 * valorMaximo) {
            barra.setText("████~~~~~~");
        } else if (valorActual < 0.5 * valorMaximo) {
            barra.setText("█████~~~~~");
        } else if (valorActual < 0.6 * valorMaximo) {
            barra.setText("██████~~~~");
        } else if (valorActual < 0.7 * valorMaximo) {
            barra.setText("███████~~~");
        } else if (valorActual < 0.8 * valorMaximo) {
            barra.setText("████████~~");
        } else if (valorActual < 0.9 * valorMaximo) {
            barra.setText("█████████~");
        } else if (valorActual >= 0.9 * valorMaximo) {
            barra.setText("██████████");
        }
    }

    public void actualizarNumeros(JLabel numero, int valorActual, int valorMaximo) {
        if (valorActual < 0) {
            numero.setText("0/" + String.valueOf(valorMaximo));
        } else {
            numero.setText(String.valueOf(valorActual) + "/" + String.valueOf(valorMaximo));
        }
    }

    public void terminarTurno() {
        actualizarNumeros(lblVidaANum, arqueroGUI.getVida(), arqueroGUI.getVidaMaxima());
        actualizarNumeros(lblFlechaANum, arqueroGUI.getRecurso(), arqueroGUI.getRecursoMaximo());
        actualizarNumeros(lblVidaGNum, guerreroGUI.getVida(), guerreroGUI.getVidaMaxima());
        actualizarNumeros(lblStaminaGNum, guerreroGUI.getRecurso(), guerreroGUI.getRecursoMaximo());
        actualizarNumeros(lblVidaMNum, magoGUI.getVida(), magoGUI.getVidaMaxima());
        actualizarNumeros(lblManaMNum, magoGUI.getRecurso(), magoGUI.getRecursoMaximo());
        actualizarNumeros(lblVidaHNum, healerGUI.getVida(), healerGUI.getVidaMaxima());
        actualizarNumeros(lblManaHNum, healerGUI.getRecurso(), healerGUI.getRecursoMaximo());
        actualizarNumeros(lblVidaENum, enemigoGUI.getVida(), enemigoGUI.getVidaMaxima());
        actualizarNumeros(lblTurnoENum, turno, 3);

        actualizarBarras(lblVidaABarra, arqueroGUI.getVida(), arqueroGUI.getVidaMaxima());
        actualizarBarras(lblFlechaABarra, arqueroGUI.getRecurso(), arqueroGUI.getRecursoMaximo());
        actualizarBarras(lblVidaGBarra, guerreroGUI.getVida(), guerreroGUI.getVidaMaxima());
        actualizarBarras(lblStaminaGBarra, guerreroGUI.getRecurso(), guerreroGUI.getRecursoMaximo());
        actualizarBarras(lblVidaMBarra, magoGUI.getVida(), magoGUI.getVidaMaxima());
        actualizarBarras(lblManaMBarra, magoGUI.getRecurso(), magoGUI.getRecursoMaximo());
        actualizarBarras(lblVidaHBarra, healerGUI.getVida(), healerGUI.getVidaMaxima());
        actualizarBarras(lblManaHBarra, healerGUI.getRecurso(), healerGUI.getRecursoMaximo());
        actualizarBarras(lblVidaEBarra, enemigoGUI.getVida(), enemigoGUI.getVidaMaxima());
        actualizarBarras(lblTurnoEBarra, turno, 3);

        if (enemigoGUI.getVida() <= 0) {
            //txtResumenTurno.setText("¡VICTORIA!");
            def = false;
            win = true;
            VictoriaDerrota mostrar = new VictoriaDerrota();
            mostrar.setVisible(true);
            this.dispose();
        } else if (!btnArquero.isEnabled() && !btnGuerrero.isEnabled()
                && !btnMago.isEnabled() && !btnHealer.isEnabled()) {
            //txtResumenTurno.setText("¡DERROTA!");
            win = false;
            def = true;
            VictoriaDerrota mostrar = new VictoriaDerrota();
            mostrar.setVisible(true);
            this.dispose();
        } else {
            txtResumenTurno.setText(txtResumenTurno.getText() + "\nQueda " + (3 - turno) + " "
                    + "turno(s) para el ataque especial\nde " + enemigoGUI.getNombre() + " ¡Cuidado!");
        }
    }

    public Icon setIconoL(String url, JLabel label) {
        ImageIcon icon = new ImageIcon(getClass().getResource(url));

        int ancho = label.getWidth();
        int alto = label.getHeight();

        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));

        return icono;
    }

    public void reactivarElementos() {
        btnArquero.setEnabled(false);
        btnGuerrero.setEnabled(false);
        btnMago.setEnabled(false);
        btnHealer.setEnabled(false);
        if (arqueroGUI.getVida() > 0 && arqueroGUI.getRecurso() > 0) {
            btnArquero.setEnabled(true);
        }
        if (guerreroGUI.getVida() > 0 && guerreroGUI.getRecurso() > 0) {
            btnGuerrero.setEnabled(true);
        }
        if (magoGUI.getVida() > 0 && magoGUI.getRecurso() > 0) {
            btnMago.setEnabled(true);
        }
        if (healerGUI.getVida() > 0 && healerGUI.getRecurso() > 0) {
            btnHealer.setEnabled(true);
        }
        btnArquero.setForeground(Color.BLACK);
        btnGuerrero.setForeground(Color.BLACK);
        btnMago.setForeground(Color.BLACK);
        btnHealer.setForeground(Color.BLACK);
        btnAtaqueNormal.setVisible(false);
        btnAtaqueEspecial.setVisible(false);
        btnCancelar.setVisible(false);
    }

    public GUIPrincipal() {
        switch (EnemigoRandom) {
            case 0:
                enemigoGUI = new Hydra();
                break;
            case 1:
                enemigoGUI = new Demogorgon();
                break;
            case 2:
                enemigoGUI = new PerroInfernal();
                break;
        }
        initComponents();
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.WHITE);
        Login usuario = new Login();
        lblUser.setText(usuario.user);
        terminarTurno();
        lblEnemigo.setText(enemigoGUI.getNombre());
        if (EnemigoRandom == 0) {
            lblenemigoIco.setIcon(setIconoL("/imagenes/hydra.gif", lblenemigoIco));
        } else if (EnemigoRandom == 1) {
            lblenemigoIco.setIcon(setIconoL("/imagenes/demogorgon.gif", lblenemigoIco));
        } else if (EnemigoRandom == 2) {
            lblenemigoIco.setIcon(setIconoL("/imagenes/cerberus.gif", lblenemigoIco));
        }
        lblArqI.setIcon(setIconoL("/imagenes/arquero2.gif", lblArqI));
        lblGueI.setIcon(setIconoL("/imagenes/guerrero.gif", lblGueI));
        lblHeaI.setIcon(setIconoL("/imagenes/healer.gif", lblHeaI));
        lblMagI.setIcon(setIconoL("/imagenes/mago.gif", lblMagI));

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
        lblVidaABarra = new javax.swing.JLabel();
        lblFlechaABarra = new javax.swing.JLabel();
        lblVidaGBarra = new javax.swing.JLabel();
        lblStaminaGBarra = new javax.swing.JLabel();
        lblManaHBarra = new javax.swing.JLabel();
        lblManaMBarra = new javax.swing.JLabel();
        lblVidaHBarra = new javax.swing.JLabel();
        lblVidaMBarra = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnArquero = new javax.swing.JButton();
        btnGuerrero = new javax.swing.JButton();
        btnMago = new javax.swing.JButton();
        btnHealer = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnAtaqueNormal = new javax.swing.JButton();
        btnAtaqueEspecial = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblVidaANum = new javax.swing.JLabel();
        lblFlechaANum = new javax.swing.JLabel();
        lblVidaGNum = new javax.swing.JLabel();
        lblStaminaGNum = new javax.swing.JLabel();
        lblVidaMNum = new javax.swing.JLabel();
        lblManaMNum = new javax.swing.JLabel();
        lblVidaHNum = new javax.swing.JLabel();
        lblManaHNum = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResumenTurno = new javax.swing.JTextArea();
        lblEnemigo = new javax.swing.JLabel();
        lblVidaEBarra = new javax.swing.JLabel();
        lblTurnoEBarra = new javax.swing.JLabel();
        lblIcoUser = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        lblenemigoIco = new javax.swing.JLabel();
        lblTurnoENum = new javax.swing.JLabel();
        lblVidaENum = new javax.swing.JLabel();
        lblHeaI = new javax.swing.JLabel();
        lblArqI = new javax.swing.JLabel();
        lblGueI = new javax.swing.JLabel();
        lblMagI = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1148, 810));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblVidaABarra.setForeground(new java.awt.Color(240, 0, 0));
        lblVidaABarra.setText("██████████");
        lblVidaABarra.setToolTipText("");

        lblFlechaABarra.setForeground(new java.awt.Color(192, 192, 192));
        lblFlechaABarra.setText("██████████");

        lblVidaGBarra.setForeground(new java.awt.Color(240, 0, 0));
        lblVidaGBarra.setText("██████████");

        lblStaminaGBarra.setForeground(new java.awt.Color(0, 240, 0));
        lblStaminaGBarra.setText("██████████");

        lblManaHBarra.setForeground(new java.awt.Color(0, 0, 240));
        lblManaHBarra.setText("██████████");

        lblManaMBarra.setForeground(new java.awt.Color(0, 0, 240));
        lblManaMBarra.setText("██████████");

        lblVidaHBarra.setForeground(new java.awt.Color(240, 0, 0));
        lblVidaHBarra.setText("██████████");

        lblVidaMBarra.setForeground(new java.awt.Color(240, 0, 0));
        lblVidaMBarra.setText("██████████");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVidaABarra)
                    .addComponent(lblFlechaABarra)
                    .addComponent(lblVidaGBarra)
                    .addComponent(lblStaminaGBarra)
                    .addComponent(lblVidaMBarra)
                    .addComponent(lblManaMBarra)
                    .addComponent(lblVidaHBarra)
                    .addComponent(lblManaHBarra))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(lblVidaABarra)
                .addGap(18, 18, 18)
                .addComponent(lblFlechaABarra)
                .addGap(101, 101, 101)
                .addComponent(lblVidaGBarra)
                .addGap(18, 18, 18)
                .addComponent(lblStaminaGBarra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addComponent(lblVidaMBarra)
                .addGap(27, 27, 27)
                .addComponent(lblManaMBarra)
                .addGap(105, 105, 105)
                .addComponent(lblVidaHBarra)
                .addGap(18, 18, 18)
                .addComponent(lblManaHBarra)
                .addGap(53, 53, 53))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btnArquero.setText("Arquero");
        btnArquero.setPreferredSize(new java.awt.Dimension(75, 23));
        btnArquero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArqueroActionPerformed(evt);
            }
        });

        btnGuerrero.setText("Guerrero");
        btnGuerrero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuerreroActionPerformed(evt);
            }
        });

        btnMago.setText("Mago");
        btnMago.setPreferredSize(new java.awt.Dimension(75, 23));
        btnMago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMagoActionPerformed(evt);
            }
        });

        btnHealer.setText("Healer");
        btnHealer.setPreferredSize(new java.awt.Dimension(75, 23));
        btnHealer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHealerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnArquero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuerrero)
                    .addComponent(btnHealer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(btnArquero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124)
                .addComponent(btnGuerrero)
                .addGap(148, 148, 148)
                .addComponent(btnMago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                .addComponent(btnHealer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btnAtaqueNormal.setText("Ataque Normal");
        btnAtaqueNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtaqueNormalActionPerformed(evt);
            }
        });

        btnAtaqueEspecial.setText("Ataque Especial");
        btnAtaqueEspecial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtaqueEspecialActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAtaqueEspecial, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addComponent(btnAtaqueNormal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnAtaqueNormal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(btnAtaqueEspecial)
                .addGap(42, 42, 42)
                .addComponent(btnCancelar)
                .addGap(55, 55, 55))
        );

        btnAtaqueNormal.setVisible(false);
        btnAtaqueEspecial.setVisible(false);
        btnCancelar.setVisible(false);

        lblVidaANum.setBackground(new java.awt.Color(255, 255, 255));
        lblVidaANum.setText("VidaArquero");

        lblFlechaANum.setText("FlechasArquero");

        lblVidaGNum.setText("VidaGuerrero");

        lblStaminaGNum.setText("StaminaGuerrero");

        lblVidaMNum.setText("VidaMago");

        lblManaMNum.setText("ManaMago");

        lblVidaHNum.setText("VidaHealer");

        lblManaHNum.setText("ManaHealer");

        txtResumenTurno.setEditable(false);
        txtResumenTurno.setColumns(20);
        txtResumenTurno.setRows(5);
        jScrollPane1.setViewportView(txtResumenTurno);

        lblEnemigo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblEnemigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEnemigo.setText("Enemigo");

        lblVidaEBarra.setForeground(new java.awt.Color(240, 0, 0));
        lblVidaEBarra.setText("█████████");

        lblTurnoEBarra.setForeground(new java.awt.Color(240, 240, 0));
        lblTurnoEBarra.setText("█████████");
        lblTurnoEBarra.setToolTipText("Turnos que quedan para que el enemigo haga su ataque especial");

        lblIcoUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/control-de-juego (1).png"))); // NOI18N

        lblUser.setFont(new java.awt.Font("Trebuchet MS", 2, 21)); // NOI18N

        lblTurnoENum.setBackground(new java.awt.Color(255, 255, 255));
        lblTurnoENum.setText("TurnoEnemigo");
        lblTurnoENum.setToolTipText("Turnos que quedan para que el enemigo haga su ataque especial");

        lblVidaENum.setBackground(new java.awt.Color(255, 255, 255));
        lblVidaENum.setText("VidaEnemigo");

        lblHeaI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblArqI.setBackground(new java.awt.Color(255, 255, 255));
        lblArqI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblGueI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblMagI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblIcoUser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblArqI, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGueI, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMagI, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHeaI, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVidaANum)
                    .addComponent(lblFlechaANum)
                    .addComponent(lblStaminaGNum)
                    .addComponent(lblManaMNum)
                    .addComponent(lblVidaHNum)
                    .addComponent(lblManaHNum)
                    .addComponent(lblVidaMNum)
                    .addComponent(lblVidaGNum)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(77, 77, 77)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(lblEnemigo, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblenemigoIco, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblVidaEBarra)
                                        .addGap(58, 58, 58)
                                        .addComponent(lblVidaENum))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblTurnoEBarra)
                                        .addGap(58, 58, 58)
                                        .addComponent(lblTurnoENum))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIcoUser)
                    .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblArqI, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(lblGueI, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(lblMagI, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(lblHeaI, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(lblVidaANum)
                        .addGap(16, 16, 16)
                        .addComponent(lblFlechaANum)
                        .addGap(136, 136, 136)
                        .addComponent(lblStaminaGNum)
                        .addGap(156, 156, 156)
                        .addComponent(lblManaMNum)
                        .addGap(106, 106, 106)
                        .addComponent(lblVidaHNum)
                        .addGap(16, 16, 16)
                        .addComponent(lblManaHNum))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(360, 360, 360)
                        .addComponent(lblVidaMNum))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(lblVidaGNum))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(lblEnemigo)
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblenemigoIco, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblVidaEBarra)
                                    .addComponent(lblVidaENum))
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTurnoEBarra)
                                    .addComponent(lblTurnoENum))))
                        .addGap(93, 93, 93)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtaqueEspecialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtaqueEspecialActionPerformed
        if (btnArquero.isEnabled()) {
            enemigoGUI.recibirDaño(arqueroGUI.ataqueEspecial());
            if (turno == 3) {
                arqueroGUI.recibirDaño(enemigoGUI.ataqueEspecial());
                turno = 0;
            } else {
                arqueroGUI.recibirDaño(enemigoGUI.ataque());
            }
            txtResumenTurno.setText("El Arquero hace Lluvia de Flechas\ncausando " + arqueroGUI.getDamage()
                    + " de daño \ny recibe " + enemigoGUI.getDamage() + " de daño");
        } else if (btnGuerrero.isEnabled()) {
            enemigoGUI.recibirDaño(guerreroGUI.ataqueEspecial());
            if (turno == 3) {
                guerreroGUI.recibirDaño(enemigoGUI.ataqueEspecial());
                turno = 0;
            } else {
                guerreroGUI.recibirDaño(enemigoGUI.ataque());
            }
            txtResumenTurno.setText("El Guerrero hace Legado de Popeye\ncausando " + guerreroGUI.getDamage()
                    + " de daño \ny recibe " + enemigoGUI.getDamage() + " de daño");
        } else if (btnMago.isEnabled()) {
            enemigoGUI.recibirDaño(magoGUI.ataqueEspecial());
            if (turno == 3) {
                magoGUI.recibirDaño(enemigoGUI.ataqueEspecial());
                turno = 0;
            } else {
                magoGUI.recibirDaño(enemigoGUI.ataque());
            }
            txtResumenTurno.setText("El Mago hace Bola de Fuego\ncausando " + magoGUI.getDamage()
                    + " de daño \ny recibe " + enemigoGUI.getDamage() + " de daño");
        } else if (btnHealer.isEnabled()) {
            healerGUI.recibirDaño(-(healerGUI.ataqueEspecial()));
            magoGUI.recibirDaño(-(healerGUI.ataqueEspecial()));
            guerreroGUI.recibirDaño(-(healerGUI.ataqueEspecial()));
            arqueroGUI.recibirDaño(-(healerGUI.ataqueEspecial()));
            if (turno == 3) {
                healerGUI.recibirDaño(enemigoGUI.ataqueEspecial());
                turno = 0;
            } else {
                healerGUI.recibirDaño(enemigoGUI.ataque());
            }
            txtResumenTurno.setText("El Healer cura a todos lo Aliados\n " + healerGUI.getDamage()
                    + " de vida y \nrecibe " + enemigoGUI.getDamage() + " de daño");
        }
        turno++;
        reactivarElementos();
        terminarTurno();
    }//GEN-LAST:event_btnAtaqueEspecialActionPerformed

    private void btnAtaqueNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtaqueNormalActionPerformed
        if (btnArquero.isEnabled()) {
            enemigoGUI.recibirDaño(arqueroGUI.ataque());
            if (turno == 3) {
                arqueroGUI.recibirDaño(enemigoGUI.ataqueEspecial());
                turno = 0;
            } else {
                arqueroGUI.recibirDaño(enemigoGUI.ataque());
            }
            txtResumenTurno.setText("El Arquero hace un ataque normal \ncausando " + arqueroGUI.getDamage()
                    + " de daño y \nrecibe " + enemigoGUI.getDamage() + " de daño");
        } else if (btnGuerrero.isEnabled()) {
            enemigoGUI.recibirDaño(guerreroGUI.ataque());
            if (turno == 3) {
                guerreroGUI.recibirDaño(enemigoGUI.ataqueEspecial());
                turno = 0;
            } else {
                guerreroGUI.recibirDaño(enemigoGUI.ataque());
            }
            txtResumenTurno.setText("El Guerrero hace un ataque normal \ncausando " + guerreroGUI.getDamage()
                    + " de daño y \nrecibe " + enemigoGUI.getDamage() + " de daño");
        } else if (btnMago.isEnabled()) {
            enemigoGUI.recibirDaño(magoGUI.ataque());
            if (turno == 3) {
                magoGUI.recibirDaño(enemigoGUI.ataqueEspecial());
                turno = 0;
            } else {
                magoGUI.recibirDaño(enemigoGUI.ataque());
            }
            txtResumenTurno.setText("El Mago hace un ataque normal \ncausando " + magoGUI.getDamage()
                    + " de daño y \nrecibe " + enemigoGUI.getDamage() + " de daño");
        } else if (btnHealer.isEnabled()) {
            enemigoGUI.recibirDaño(healerGUI.ataque());
            if (turno == 3) {
                healerGUI.recibirDaño(enemigoGUI.ataqueEspecial());
                turno = 0;
            } else {
                healerGUI.recibirDaño(enemigoGUI.ataque());
            }
            txtResumenTurno.setText("El Healer hace un ataque normal \ncausando " + healerGUI.getDamage()
                    + " de daño y \nrecibe " + enemigoGUI.getDamage() + " de daño");
        }
        turno++;
        reactivarElementos();
        terminarTurno();


    }//GEN-LAST:event_btnAtaqueNormalActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        reactivarElementos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuerreroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuerreroActionPerformed
        btnGuerrero.setForeground(Color.red);
        btnArquero.setEnabled(false);
        btnMago.setEnabled(false);
        btnHealer.setEnabled(false);
        btnAtaqueNormal.setVisible(true);
        btnAtaqueEspecial.setText("Legado de Popeye");
        btnAtaqueEspecial.setVisible(true);
        btnCancelar.setVisible(true);
    }//GEN-LAST:event_btnGuerreroActionPerformed

    private void btnArqueroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArqueroActionPerformed
        btnArquero.setForeground(Color.red);
        btnGuerrero.setEnabled(false);
        btnMago.setEnabled(false);
        btnHealer.setEnabled(false);
        btnAtaqueNormal.setVisible(true);
        btnAtaqueEspecial.setText("Lluvia de Flechas");
        btnAtaqueEspecial.setVisible(true);
        btnCancelar.setVisible(true);

    }//GEN-LAST:event_btnArqueroActionPerformed

    private void btnHealerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHealerActionPerformed
        btnHealer.setForeground(Color.red);
        btnArquero.setEnabled(false);
        btnGuerrero.setEnabled(false);
        btnMago.setEnabled(false);
        btnAtaqueNormal.setVisible(true);
        btnAtaqueEspecial.setText("Curar Aliados");
        btnAtaqueEspecial.setVisible(true);
        btnCancelar.setVisible(true);
    }//GEN-LAST:event_btnHealerActionPerformed

    private void btnMagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMagoActionPerformed
        btnMago.setForeground(Color.red);
        btnArquero.setEnabled(false);
        btnGuerrero.setEnabled(false);
        btnHealer.setEnabled(false);
        btnAtaqueNormal.setVisible(true);
        btnAtaqueEspecial.setText("Bola de Fuego");
        btnAtaqueEspecial.setVisible(true);
        btnCancelar.setVisible(true);
    }//GEN-LAST:event_btnMagoActionPerformed

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
            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIPrincipal().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArquero;
    private javax.swing.JButton btnAtaqueEspecial;
    private javax.swing.JButton btnAtaqueNormal;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuerrero;
    private javax.swing.JButton btnHealer;
    private javax.swing.JButton btnMago;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblArqI;
    private javax.swing.JLabel lblEnemigo;
    private javax.swing.JLabel lblFlechaABarra;
    private javax.swing.JLabel lblFlechaANum;
    private javax.swing.JLabel lblGueI;
    private javax.swing.JLabel lblHeaI;
    private javax.swing.JLabel lblIcoUser;
    private javax.swing.JLabel lblMagI;
    private javax.swing.JLabel lblManaHBarra;
    private javax.swing.JLabel lblManaHNum;
    private javax.swing.JLabel lblManaMBarra;
    private javax.swing.JLabel lblManaMNum;
    private javax.swing.JLabel lblStaminaGBarra;
    private javax.swing.JLabel lblStaminaGNum;
    private javax.swing.JLabel lblTurnoEBarra;
    private javax.swing.JLabel lblTurnoENum;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel lblVidaABarra;
    private javax.swing.JLabel lblVidaANum;
    private javax.swing.JLabel lblVidaEBarra;
    private javax.swing.JLabel lblVidaENum;
    private javax.swing.JLabel lblVidaGBarra;
    private javax.swing.JLabel lblVidaGNum;
    private javax.swing.JLabel lblVidaHBarra;
    private javax.swing.JLabel lblVidaHNum;
    private javax.swing.JLabel lblVidaMBarra;
    private javax.swing.JLabel lblVidaMNum;
    private javax.swing.JLabel lblenemigoIco;
    private javax.swing.JTextArea txtResumenTurno;
    // End of variables declaration//GEN-END:variables
}
