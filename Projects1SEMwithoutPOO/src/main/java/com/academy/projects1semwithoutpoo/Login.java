package com.academy.projects1semwithoutpoo;

import javax.swing.JOptionPane;

public class Login {
    String sysUser, sysPassword, typeUser, typePassword;
    
    void LoginMethod(){
        sysUser = "TesteUser";
        sysPassword = "oi123";
        JOptionPane.showMessageDialog(null, "Bem vindo ao Sistema de verificação de usuários!");
        typeUser = JOptionPane.showInputDialog("Por favor, digite o usuário para a verificação:");
        typePassword = JOptionPane.showInputDialog("Por favor, digite a senha do usuário:");
        
        if (typeUser.equals(sysUser) && typePassword.equals(sysPassword)){
            JOptionPane.showMessageDialog(null, "Usuário e senha corretos. Bem vindo!");
        } else {
            JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos! Digite novamente.");
        }
    }
}
